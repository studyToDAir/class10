package quiz.quiz0.문제;

public class SongExam_q2 {

	public static void main(String[] args) {

		Song s1 = new Song();
		s1.title = "Good Goodbye";
		s1.singer = "화사";
		s1.albumName = "Good Goodbye";
		s1.lyrics = "우아할꺼야";
		s1.time = 310;
		
		Song s2 = new Song();
		s2.title = "사랑하게 될 거야";
		
		System.out.println(s1.title);
		System.out.println(s2.title);
		
		s1.info();
		
	}

}
