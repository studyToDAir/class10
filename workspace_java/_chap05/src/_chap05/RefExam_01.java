package _chap05;

public class RefExam_01 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		System.out.println(a +", "+ b);
		
		b = 12;
		System.out.println(a +", "+ b);
		
		String name = "최민수";
		// = 오른쪽이 먼저 실행 됨
		// "최민수"를 힙heap 영역에 할당하면 번지 획득
		// 스택stack 영역의 변수 name에 번지 저장
		
		System.out.println(name);
		// name이 가르키는 번지에 값을 가져온다
		
		
		System.out.println(a == b);
		// ==, != 은 무조건 stack의 값을 비교한다
		
		String name2 = new String("최민수");
		System.out.println(name2);
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		// String 값 비교는 무조건 equals()를 사용하자!
		
		String name3 = "최민수";
		System.out.println(name == name3);
		// String의 경우 값이 같으면 번지를 재활용 하는 경우도 있다
		// 그래도 equals() 씁시다!!
		
		String name4 = "최"+"민수";
		System.out.println(name == name4);
		// "최"따로 "민수"따로 heap에 생기고 
		// 더한 결과 따로 생김 (그런데 String이라서 주소 재활용)
		
		String name5 = name;
		System.out.println("name5: "+ name5);
		System.out.println(name5 == name);
		name = "다른걸로";
		System.out.println("after name5: "+ name5); // 최민수
		System.out.println(name5 == name); // false
		
//		int c = null;
		// 기본 타입에는 null을 넣을 수 없다
		
		// null : 참조하는 주소가 없는 상태
		String addr = "천안";
		System.out.println("addr == null : "+ (addr == null));
		System.out.println("addr != null : "+ (addr != null));
		
		String addr2 = ""; // null 아님
		System.out.println("addr2 == null : "+ (addr2 == null));
		
		addr = null;
		// "천안"과 연결이 끊어지고 
		// "천안"은 참조하고 있는 변수가 없어서
		// garbage collector(가베지 컬렉터, gc)가 지워버린다
		
		System.out.println("addr + \"abc\" : "+ (addr + "abc"));
		// 출력 할 때만 "null"이라는 글씨로 바뀐다
		
		// addr이 null이라서 
		// NullPointerException 발생
//		if(addr.equals(addr2)) {
//			System.out.println("같다");
//		}

		System.out.println(addr2.equals(addr));
		
		if(addr != null) { // 방어 코딩
			System.out.println(addr.equals(addr2));
		} else {
			System.out.println("addr이 null");
		}
		
		// 비교 전략
		// 1.
		if(addr.equals("천안")) {}
		// addr이 null 일 수 있다
		// 방어 코딩 필요
	
		// 2.
		if("천안".equals(addr)) {}
		// 무조건이라서 방어 코딩 필요없음
		
		
	}

}
