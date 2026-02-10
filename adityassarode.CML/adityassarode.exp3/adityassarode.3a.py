#Aditya Sarode

'''3a. Write a Python program to demonstrate the use of list comprehensions
for data manipulation.'''




numbers = [1,2,3,4,5,6,7,8,9,10]

squares = [x*x for x in numbers]

even_numbers = [x for x in numbers if x % 2 == 0]

greater_than_five = ["Number: " + str(x) for x in numbers if x > 5]

print("Original numbers:", numbers)
print("Squares of numbers:", squares)
print("Even numbers:", even_numbers)
print("Numbers greater than five:", greater_than_five)
