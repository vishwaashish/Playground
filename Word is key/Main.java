l = ['break', 'case', 'continue', 'default', 'defer', 'else', 'for', 'func', 'goto', 'if', 'map', 'range', 'return', 'struct', 'type', 'var']
n= input()
if n in l:
  print('{} is a keyword'.format(n))
else:
   print('{} is not a keyword'.format(n))
