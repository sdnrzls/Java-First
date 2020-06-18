package day04;

public class Song {

	int year;
	String country;
	String name;
	String music;
	
	//생성자
	public Song(int year,String country,String name,String music) {
		this.year = year;
		this.country = country;
		this.name = name;
		this.music = music;
	}
	
	public void show(){
		System.out.println(year+ "년 "+ country +" 국적의 "+ name +" 가 부른 "+music);
		
	}
}
