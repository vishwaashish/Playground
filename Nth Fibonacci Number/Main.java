
def fibo(n):
    l=[0,1]
    for i in range(2,n+1):
      l.append(l[i-2] + l[i-1])
    return l[0:n]



n= int(input())
x = fibo(n)
print(x[n-1])