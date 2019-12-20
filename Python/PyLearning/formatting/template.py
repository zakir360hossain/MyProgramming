from string import Template

season1 = "Winter"
season2 = "Summer"
t1 = Template('Although I like $season1, but I prefer $season2.')
print(t1.substitute(season1=season1, season2=season2))


def main():
    cart = [dict(item='Coke', price=8, qty=2), dict(item='Cake', price=12, qty=1), dict(item='Fish', price=32, qty=4)]
    t2 = Template("$qty x $item = $price")
    total = 0
    print("Cart:")
    for data in cart:
        print(t2.substitute(data))
        total += data["price"]
    print("Total: $"+str(total))

main()

# With custom delimiter
class MyTemplate(Template):
    delimiter = '#'

def main():
    cart = [dict(item='Coke', price=8, qty=2), dict(item='Cake', price=12, qty=1), dict(item='Fish', price=32, qty=4)]
    t2 = MyTemplate("#qty x #item = #price")
    total = 0
    print("Cart:")
    for data in cart:
        print(t2.substitute(data))
        total += data["price"]
    print("Total: $"+str(total))

main()


