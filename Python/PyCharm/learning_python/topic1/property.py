class Song:
    def __init__(self, title):
        self.title = title

    def show_title(self):
        print(f"I'm listening to {self.title}")

    def get_title(self):
        return self._title

    def set_title(self, title):
        self._title = title.upper()

    title = property(get_title, set_title)


title1 = Song("The Shape of You")
title1.show_title()


# With Syntactic Sugar
class Song:
    def __init__(self, title):
        self.title = title

    def show_title(self):
        print(f"I'm listening to {self.title}")

    @property
    def title(self):
        return self._title

    @title.setter
    def title(self, title):
        self._title = title.upper()


title1 = Song("Mere Sanam")
title1.show_title()
