import pandas as pd
import numpy as np
from sklearn.linear_model import LogisticRegression
import cloudpickle as pkl

def slicing(data, ratio):
    np.random.seed(1)
    # Basic slicing
    shuffled = np.random.permutation(len(data))
    test_set_size = int(len(data)*ratio) # size data for the test
    test_indices = shuffled[:test_set_size] # index from row 1 up to row test-_size, the last one is exclusive
    train_indices = shuffled[test_set_size:] # index from rwo test_size to last.
    return data.iloc[train_indices], data.iloc[test_indices] # extracting rows using iloc(imaginary), instead of loc,          method when the indices are unknown.


if __name__ == "__main__":
    df = pd.read_csv('data.csv')
    train, test = slicing(df, 0.2) # 20% for test and 80% for train
    # Converting the data to numpy array
    input_train = train[['Fever', 'Myalgia', 'Age', 'Rhinorrhea', 'Dyspnea']].to_numpy()
    input_test = test[['Fever', 'Myalgia', 'Age', 'Rhinorrhea', 'Dyspnea']].to_numpy()
    output_train = train[['Covid_Prob']].to_numpy().reshape(2400, -1)
    output_test = test[['Covid_Prob']].to_numpy().reshape(599, -1)

    classifier = LogisticRegression()
    classifier.fit(input_train, output_train)


    file = open("model.pkl", 'wb')
    pkl.dump(classifier, file)
    file.close()


