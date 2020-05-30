import pickle

# Deserializing the objects from data.pkl file form to python form

inputFile = open("../ex1_data.pkl", 'rb')  # rb => read binary
employees2 = pickle.load(inputFile)
score2 = pickle.load(inputFile)

print(employees2)
print(score2)
