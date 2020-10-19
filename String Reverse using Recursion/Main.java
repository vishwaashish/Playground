def rev(x):
  if len(x) == 1:
    return x
  else:
    return x[::-1]
  
  
  
x = input()
print(rev(x))