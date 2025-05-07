tup = (1, 3, 6, 7, 9, 43, 45, 78, 90, 100)
i = 0
value = int(input("Enter a value to find: "))

found = False
while i < len(tup):
    if tup[i] == value:
        print(f"Value found at index: {i}")
        found = True
        break
    i += 1

if not found:
    print("Value not found")
