l=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
x = input()
y= int(input())

if x.islower():
  ind = l.index(x)
  sum = ind + y
  if sum<26:
    print(l[sum])
  else:
    sum = sum - 25
    print(l[sum-1])
else:
  x= x.lower()
  ind = l.index(x)
  sum = ind + y
  if sum<26:
    print(l[sum].upper())
  else:
    sum = sum - 25
    print(l[sum-1].upper())
  