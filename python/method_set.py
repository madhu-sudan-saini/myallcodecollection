collection = set()
collection.add(1)
collection.add(2)
collection.add(2)
collection.add("ajmer")
collection.add((4,5,6))

print(collection)

print(collection.remove(1))
print(collection)


print(collection.pop())
print(collection)

print(collection.clear())

print(type(collection))

print(len(collection))
