package quiz.quiz0.문제;

public class Movie {

	String title;
	int year;

	void setTitle(String title) {
		this.title = title;
	}
	String getTitle(){
		return this.title;
	}
	
	int getYear() {
		return year;
	}
	void setYear(int year) {
		this.year = year;
	}
	
	void info() {
		System.out.println("제목 : "+ this.title);
		System.out.println("개봉년도 : "+ this.year);
	}
	
	String 속편정보() {
		return this.title + 2;
	}
	
	
}
