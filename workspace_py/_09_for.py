a = ['a', 'b', 'c']
for b in a :
    print(b, end="")
print('-' * 30)
c = {
    'a': 1,
    'b': 2,
    'c': 3,
}
# 딕셔너리는 key로 반복 가능
for k in c:
    print(k, c[k], c.get(k))

for k, v in c.items() :
    print(f'k: {k}, v: {v}')

d = [1,2,3,4]
for i, data in enumerate(d):
    print(i, data)

r = range(5)
print(r)
print(list(r))

print('-' * 20)
for i in range(5):
    print(i)

print('-' * 20)
for i in range(3, 5):
    print(i)

print('-' * 20)
for i in range(1, 10):
    print(f'2x{i}={i*2}')

print('-' * 20)
for j in range(2, 10):
    print(f'-- {j} 단 --')
    for i in range(1, 10):
        print(f'{j}x{i}={j*i}')


for i in range(10) :
    print(i)
    if i == 30 :
        break
else :
    print('break 안 만났음')

print('-' * 20)

a = [i for i in range(5)]
print(a)

b = [i for i in range(5) if i % 2 == 0]
print(b)


print('-' * 20)
c = [   f'{j}x{i}={j*i}' 
        for j in range(2, 10) 
            for i in range(1, 10)]
print(c)

