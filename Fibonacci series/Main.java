x = int(input())
a=0
b=1
i=1
sum = 0
temp=0
while(i<=x):
  print(sum,end=" ")
  a = b
  b=sum
  sum = a+b
  
  i += 1

  