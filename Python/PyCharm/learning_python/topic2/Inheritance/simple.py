# Generalization => when going from specific to general. i.e apple => Fruit
# Specialization => when going from general to specific. i.e Fruit => apple
# The use of arrows to indicate Generalization and Specialization is UML (Unified Modeling Language) convention.

# In this case, Fruit can be called as Supper, Parent, or Base classes; all the same.
# And apple is the Sub, Child, or Derived classes; all mean the same.

# Types of Inheritance:
# 1. Single
# 2. Multilevel
# 3. Hybrid
# 4. multiple
# 5. Hierarchical

class Fruit:
    pass

class Apple(Fruit):
    pass

print(issubclass(Apple, Fruit))
