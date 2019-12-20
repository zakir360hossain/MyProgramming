print(all({'he', ' she', 'they'}))  # => True, no empty value
print(all({'', ' she', 'they'}))  # => False, one empty value

if all({'he', ' she', 'they'}):
    print("True")
