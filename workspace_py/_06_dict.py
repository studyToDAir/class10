a = {}
a = dict()
print( type(a) )

b = {
    '이름': '민수',
    '주소': '천안',
    '스킬': {
        '공격': '꿀주먹', 
        '방어': '고백',
        'java': '상'
    }
}
print(b)

# print(  b.이름  )
print(  b['이름']  )
print(  b.get('이름')  )

# print(  b['나이']  )
print(  b.get('나이')  )

print(  b.get('나이', 0)  )

b['나이'] = 81
print(b)

c = b.keys()
print(c)
# print(c[0])
print(list(c)[0])

d = b.values()
print(d)

e = b['스킬'].keys()
print(e)

f = b.items()
print(f)

print(  '여친' in b   ) # key가 있는가
