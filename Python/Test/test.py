fruits = list(("Banana", "Papaya", "Pineapple"))
fruits.append("Apple")
fruits.append(1)
print("Length of the list:",len(fruits))
print("Type of the list:",type(fruits))
print(fruits)

str = "abcddcbaa"
reverseStr = ""
for i in range(len(str)-1,-1,-1):
    reverseStr += str[i]

print("Palindrome" if str == reverseStr else "Not a palindrome")

num = 121

temp = num
result = 0
while temp > 0:
    result *= 10
    result += temp%10
    temp //= 10
print(result)
print("Number palindrome" if num == result else "Not a number palindrome")