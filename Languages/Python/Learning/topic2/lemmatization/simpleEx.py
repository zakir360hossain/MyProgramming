import nltk
from nltk.stem import WordNetLemmatizer
# nltk.download('wordnet')  Got done in the first run
lemmatizer = WordNetLemmatizer()

print(lemmatizer.lemmatize('dogs'))
