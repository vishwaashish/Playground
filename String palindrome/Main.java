n = input()
temp = n
if temp == n[::-1]:
  print('{} is a palindrome'.format(n))
else:
  print('{} is not a palindrome'.format(n))
  