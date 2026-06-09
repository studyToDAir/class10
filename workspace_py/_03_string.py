a = 'hello'
b = "world"
c = '''세
개
짜리'''
d = """쌍
따옴
표
"""

'''
여러줄 주석
여러줄 주석
'''
print(a, b, c, d)
e = "1\n2\t34"
print(e)

print('문'+"자")
# print('문'+"자"+3)
print('문'+"자"+str(3))

print('-' * (3**3))

a = 'abcde'
print(a, len(a))

b = 26
c = "지금 온도는 "+ str(b) +"도 입니다"
print(c)

d = f"지금 온도는 {b}도 입니다"
print(d)
d = "지금 온도는 {0}도 입니다".format(b)
print(d)

e = '''
    <div>
        지금 온도는 <span>{b}</span>도 입니다
    </div>
'''
f = '기온 : %d' % b
print(f)

g = 'hobby'
print( g.count('b') )

print( g.find('b') )
print( g.index('b') )

print( g.find('c') )
# print( g.index('c') )

print( g.rfind('b') )

print( g.replace('b', 'c') ) # 모두 바꿔 줌

h = 'Life is too short'
i = h.split(' ')
print(i)
print(i[1])

print( 'a' in g )

