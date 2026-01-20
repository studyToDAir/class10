package quiz.quiz0.문제;

public class MovieExam_q3 {

	public static void main(String[] args) {

		Movie m1 = new Movie();
		m1.title = "난다고래";
		
		m1.setTitle("고래난다");
		m1.setYear(2026);
		
		System.out.println(m1.title);
		String 제목 = m1.getTitle();
		System.out.println("오늘 볼 영화:"+ 제목);
		System.out.println("오늘 볼 영화:"+ m1.getTitle());
		
		m1.info();
	}

}
