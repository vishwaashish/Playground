l=input()
x = l[::-1]

l2=[]

for i in x:
  if i not in l2:
    l2.append(i)

for i in l2:
  print(i,end="")
