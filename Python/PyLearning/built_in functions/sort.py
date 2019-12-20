state = ['PA', 'MA', 'NJ', 'NY', 'TN', 'CA', 'DE', 'AL', 'AZ', 'AR']
print(sorted(state))
print(sorted(state, reverse=True))

fruit_and_price = {'Apple': 1.99, 'Banana': 0.99, 'Orange': 1.49, 'Cantaloupe': 3.99, 'Grapes': 0.39}
print(sorted(fruit_and_price.keys()))  # or just fruit_and_price, .keys() not needed
print(sorted(fruit_and_price.values()))
