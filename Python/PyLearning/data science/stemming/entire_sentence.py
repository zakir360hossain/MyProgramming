import nltk
from nltk.tokenize import word_tokenize
porter = nltk.stem.PorterStemmer()

sentence = 'I am enjoying writing this tutorial; I love to write and I have written 226 words so far. I wrote more' \
           'than you did; I am a writer'

words = word_tokenize(sentence)
for word in words:
    print(f"{word}: {porter.stem(word)}")
