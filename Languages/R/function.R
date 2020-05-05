# In defaluts, functions are positional matching.
# Must give keyword of args when passing values for params if order is not accounted.
# Can have defaults, but cannot be in arbitrary position. Has to be in right or left. And neglects when
#not left null.
# Support lazy evaluation.

# A basic function
sum = function(a, b) {
  c = a + b
  return(c)
}
sum(2, 3)
formals(sum) # Returns the params of a function

# R supports overloading. The function also has a default value for c.
sum = function(a, b, c = 1) {
  c = a + b + c
  return(c)
}
sum(2, 3)
sum
sum(2, 3, 4) # Default of c is changed.
sum

diff = function(a, b) {
  return(a - b)
}
diff(2, 3)
diff(b = 2, a = 3)

# Lazy eval
prod = function(a, b, c) {
  return(a * b)
}
prod(3, 4) # Valid, even one param is missing. Because param c is not used inside.
formals(prod) # c is still in the formal


# Returning multiple values in function with list
sum_prod = function(a, b) {
  sum = a + b
  prod = a * b
  result = list('sum' = sum, 'product' = prod)
  return(result)
}
sum_prod(2, 3)


# Lambda (inline) function
quotient = function(x, y) x / y
quotient(4, 2)
