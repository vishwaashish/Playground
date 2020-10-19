n = int(input())
temp = n
sum1 = 0
for i in range(1,n):
  if n % i == 0:
    sum1 += i
if temp == sum1:
  print("Yes")
else:
  print("No")