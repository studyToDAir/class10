
def 더하기(x, y):
    z = x + y
    return z
a = 더하기(1, 2)
print(a)

def div(x, y):
    return x / y

print(  div(10, 2)  )
print(  div(2, 10)  )

print(  div(y = 10, x = 2)  )

def 취업(연봉, 비데=True) :
    print(연봉, 비데)
취업(4000, False)

# def 취업(연봉, 비데) :
#     print(연봉, 비데)
# 취업(4000)

취업(4000)


a = 10
def change() :
    print(1, a)
    a = 100
    print(2, a)

# change()
# print(3, a)

def change2() :
    a = a + 1
# change2()
# print(a)

def change3() :
    global a # 필드의 a 값을 바꾸고 싶을 때 필수
    a = a + 1

change3()
print(a)

def change4() :
    b = a + 1   # 지역변수 a가 없는 경우 가져올 수 있다
    return b
print( 4, change4() )