n1 = input()
n = int(n1)

le = len(n1)
temp = n
rev = 0
rem = 0
while n:
  rev = n%10
  rem = rem + rev ** le 
  n = n//10

if rem == temp:
  print('ARMSTRONG')
else:
  print('NOT AN ARMSTRONG')