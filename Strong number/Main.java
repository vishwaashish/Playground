
num = int(input())
temp = num
rev = 0
while num:
  i=1
  fact = 1
  r = num % 10
  while (i <= r):
    fact = fact * i
    i +=1
  rev = rev + fact
  num = num//10
if(rev==temp):
    print("Yes")
else:
    print("No")