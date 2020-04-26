import nltk
from nltk.stem import PorterStemmer

porter = PorterStemmer()


words = ['fish', 'fishing']
for word in words:
    print(f"{word}: {porter.stem(word)}")

print("\n")
words = ['game', 'gaming', 'gamed', 'games']
for word in words:
    print(f"{word}: {porter.stem(word)}")


