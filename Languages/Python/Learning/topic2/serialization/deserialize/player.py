import pickle

with  open("../player_data.pkl", "rb") as inputFile:
    data = pickle.load(inputFile)

print(data)
