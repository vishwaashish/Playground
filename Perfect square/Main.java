import math
n = int(input())
x= math.sqrt(n)
if x-math.floor(x) == 0:
  print('YES')
else:
  print('NO')