import unittest


def mod3(x):
    return x % 3


class Test(unittest.TestCase):
    def test(self):
        self.assertEqual(mod3(3.5), 0.5)


unittest
