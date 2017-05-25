#!/usr/bin/python
# to remove the new line after print use end=""
print ("Hello, Python!", end="")
#appending strings
first_string="I AM TITASH"
new_string=first_string+"  Titash loves dancing"
print("%s %s %s" %('This is a new formatting of string',first_string,new_string) )

#list concepts
friend_list=["Titash","Hitesh","Ankur","Anrita"]
grocery_list=["tomato","potato","eggs","fresh foods"]

print(grocery_list,grocery_list[2])
to_do_list=["Eat heathy","Sing well","Study hard","Make better friends","Set new goals"]
print(to_do_list[0])
#multiple lists in one list
new_list=[grocery_list,to_do_list,friend_list]
print(new_list)
print(new_list[2][1])

grocery_list.insert(2,"BANANA")
print("After insertion", grocery_list)
grocery_list.remove("BANANA")
print("After deletion", grocery_list)

del grocery_list[3]


#Sort a list
print("sorted friend list")
friend_list.sort()
print(friend_list)
print(len(friend_list))
print(max(to_do_list))
print(min(to_do_list))