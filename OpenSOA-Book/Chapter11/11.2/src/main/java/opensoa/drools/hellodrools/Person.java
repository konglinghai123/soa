package opensoa.drools.hellodrools;

import java.util.ArrayList;

public class Person {

	private String name;
	private String gender;
	private int age;
	private ArrayList<String> interests;
	private String favoriteInterest;
	private int homeZip;
	private String salutation;
	
	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public int getHomeZip() {
		return homeZip;
	}

	public void setHomeZip(int homeZip) {
		this.homeZip = homeZip;
	}

	public String getFavoriteInterest() {
		return favoriteInterest;
	}

	public void setFavoriteInterest(String favoriteInterest) {
		this.favoriteInterest = favoriteInterest;
	}

	public Person(String name, int age, String gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	public Person(String name, int age, String gender, ArrayList<String> interests) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.interests = interests;
	}
	
	public ArrayList<String> getInterests() {
		return interests;
	}

	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
