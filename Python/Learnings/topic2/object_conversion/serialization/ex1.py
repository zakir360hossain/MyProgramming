import pickle

# Name and age
employees = dict([('Robert', 34), ('William', 55), ('Anderson', 20)])

SAT_scores = [1000, 1224, 1312, 1564, 1345, 9067, 1354, 1476, 1444]

# Serializing the two objects from python form to file form (.pkl extension in this case)
serialized_data = open("../ex1_data.pkl", 'wb')  # wb => write binary
pickle.dump(employees, serialized_data, pickle.HIGHEST_PROTOCOL)
pickle.dump(SAT_scores, serialized_data, pickle.HIGHEST_PROTOCOL)
serialized_data.close()
