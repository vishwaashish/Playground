x= list(map(int,input().split()))
y= x[0]
z= x[1]

for i in range(y,z+1):
  if len(str(z)) < 2:
    print(i, end=" ")
  elif len(str(z)) < 3:
    print("{0:0=2d}".format(i) , end=" ")
  else:
    print("{0:0=3d}".format(i) , end=" ")