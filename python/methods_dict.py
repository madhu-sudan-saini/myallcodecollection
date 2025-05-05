student={
    "name" : "karan ",
    "subject" :{
        "chem" :97,
        "math" :98,
        "phy" :95
    }
}
print(student.keys())
print(len(student.keys()))

print(student.values())
print(len(student.values()))

print(student.items())

print(student.get("name"))

new_dict={"name" :"rahul" ,"age" :20}

student.update(new_dict)
print(student)
