x= list(map(int,input().split()))

i = max(x)
x.remove(i)
print(max(x))