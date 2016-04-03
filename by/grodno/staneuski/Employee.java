package by.grodno.staneuski;

import java.util.ArrayList;

public class Employee {
	
	private String name;
	private String position;
	private ArrayList<StationeryAccessories> workspace;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
}
