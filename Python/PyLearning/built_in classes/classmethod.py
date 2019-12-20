class fruit:
    def sayhi(self):
        print("Hi, I'm a fruit")


fruit.sayhi = classmethod(fruit.sayhi)
fruit.sayhi()
