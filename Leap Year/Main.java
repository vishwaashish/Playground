x= int(input())
if x % 4 == 0:
  if (x % 100 == 0):
    if x % 400 ==0:
    	print("LEAP YEAR")
    else:
    	print("NOT LEAP YEAR")
  else: 
    print("LEAP YEAR")
else:
  print("NOT LEAP YEAR")

  