package day04;

public class Song {

	int year;
	String country;
	String name;
	String music;
	
	//������
	public Song(int year,String country,String name,String music) {
		this.year = year;
		this.country = country;
		this.name = name;
		this.music = music;
	}
	
	public void show(){
		System.out.println(year+ "�� "+ country +" ������ "+ name +" �� �θ� "+music);
		
	}
}
