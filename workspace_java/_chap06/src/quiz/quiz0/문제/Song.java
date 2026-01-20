package quiz.quiz0.문제;

public class Song {
	String title;		// 제목
	String singer;		// 가수명
	String albumName;	// 엘범명
	String lyrics;		// 가사
	int time;			// 시간(초 단위)
	
	void info() {
		System.out.println("제목: "+this.title);
	}
}
