
from flask import Flask, render_template, request
import cloudpickle as pkl

app = Flask(__name__)


file = open("model.pkl", "rb")
classifier = pkl.load(file)
file.close()


@app.route('/', methods=["GET", "POST"])

def hello():
    if request.method == "POST":
        myDict = request.form
        fever = int(myDict['fever'])
        age = int(myDict['age'])
        pain = int(myDict['pain'])
        runnyNose = int(myDict['runnyNose'])
        breathing = int(myDict['breathing'])
        # Inference
        feature = [fever, pain, age, runnyNose, breathing]
        # Fever=100, Myalgia = yes, age=22, Rhinorrhea = yes, Dyspnea = yes
        probability = classifier.predict_proba([feature]) # Returns a 2D array [a, b]. a being not having (classfier 0), b being having (classifier 1).
        negative = probability[0][0]
        positive = probability[0][1]
        print(positive)
        return render_template("show.html", estimatedProbability = round(positive*100))
    # return "Flaskies!" + str(positive)
    return render_template("index.html")

if __name__ == "__main__":
    app.run(debug=True)
    