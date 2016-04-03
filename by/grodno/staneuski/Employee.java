package by.grodno.staneuski;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	private String position;
	private List<StationeryAccessories> workspace = new ArrayList<StationeryAccessories>();
	
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
	
	public void addItem(StationeryAccessories item){
		this.workspace.add(item);
	}
	public void removeItem(StationeryAccessories item){
		this.workspace.remove(item);
	}
	
	public int getSumm(){
		int summ = 0;
		for(StationeryAccessories item: this.workspace){
			summ += item.getCost();
		}		
	return summ;
	}
	
	public void printList(){
		int i = 1;
		System.out.println("List of items " + this.name + ":");
		for(StationeryAccessories item: this.workspace){
			System.out.println(i + ". " + item.toString());
			i++;
		}
		int totalSumm = getSumm();
		System.out.println("");
		System.out.println("Total Summ = " + totalSumm);
	}
}
