import math
n = int(input())
if n>1:
  for i in range(2,n):
    if n % i == 0:
    	print('0.00')
    	break
  else:
      print(round(math.sqrt(n),2))
      
else:
  print('0.00')