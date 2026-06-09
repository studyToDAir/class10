a = 10
b = 15

# 5 < a && a < 100
print(   5 < a < 100   )

if True :
    print(1)
    print(2)

    if False :
        print(3)
else :
    pass

if a < 5:
    print('5보다 작음')
elif a > 5:
 print('5보다 큼')
else :
   print('5임')

b = True
c = False
if b and c :
    print('and')
elif b or c :
    print('or')

if not c :
    print('not')

if 3 != 5 :
    print('3 != 5')

if not (3 == 5) :
    print('not (3 == 5)')

a = 3
# a = 0
# a = ''
# a = []
if a:
    print('참')
else :
    print('거짓')

month = int( input('월을 입력하세요 : ') )
print(month)

if 3 <= month <= 5:
    print('봄')
elif 6 <= month <= 8:
    print('여름')
elif 9 <= month <= 11:
    print('가을')
else :
    print('겨울')


# switch 없음
game = input('가위 바위 보 : ')
match game:
    case '가위':
        print('졌다')
    case '바위':
        print('이겼다')
    case '보':
        print('비김')
    case _ : # 와일드 카드
        print('뭐여 이게')

a = input('첫번째 :: ')
b = input('두번째 :: ')
# a와 b 중 큰 숫자 출력 또는 '같다'
if a > b :
    result = a
else :
    if b > a :
        result = b
    else :
        result = '같다'

result = a if a > b    else    b if b > a  else '같다'
result = a if a > b else b if b > a else '같다'
print(result)

