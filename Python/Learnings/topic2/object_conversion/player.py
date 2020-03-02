class Player:
    def __init__(self, ID, name, health, items):
        self.ID = ID
        self.name = name;
        self.health = health
        self.items = items

    def __str__(self):
        return f"ID: {self.ID}\nName: {self.name}\nHealth: {self.health}\nItems: {self.items}"

