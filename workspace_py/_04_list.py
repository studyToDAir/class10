a = []
a = list()
print( type(a) )

b = [1, 2, 3]
print(b)
print(b[ len(b)-1 ])
print(b[ -1 ])

c = [0,1,2,3,4,5,6,7,8,9]
print( c[1:5] )

print( c[1:] )
print( c[:5] )
print( c[1:100] )

print( c[5:2] )
print( c[:] )

d = [10,20,30]
e = b + d
print(e)

f = b * 3
print(f)

g = [1,2,3,4,5]
del g[2]
print(g)

g = [1,2,3,4,5]
g.append(6)
print(g)

h = [2345,546,2345,3124,34]
h.sort() # 오름차순
print(h)

h.reverse()
print(h)

i = [1,2,3,4]
j = i.pop() # 마지막 값 제거 후 반환
print(i, j)

k = [1,2,3,4]
k.insert(2, 100)
k.insert(20, 200)
k.insert(2, [500, 600])
print(k)






