a = ()
a = tuple()
print( type(a) )

b = (1,2,3)
print(b[0])

# b[0] = 5

c = (1, 2, 3)
c = 1, 2, 3
print( type(c), c )

d = (1,) # 단 하나의 값을 가지는 튜플의 경우 (값,)로 선언한다

e = (1, 2)
f = e[0]
g = e[1]
print(f,g)

f, g = 1, 2
print(f,g)

a = 1
b = 2
a, b = b, a
print(a, b)


# 회식1 = 70
# 회식2 = 30
# return 회식1, 회식2


