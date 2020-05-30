import pickle

from topic2.serialization.player import Player

items = ['axe', 'sword', 'gun']
myOb = Player(1, "Jeff", 100.00, items)

with open("../player_data.pkl", 'wb') as outfile:
    pickle.dump(myOb, outfile, pickle.HIGHEST_PROTOCOL)
