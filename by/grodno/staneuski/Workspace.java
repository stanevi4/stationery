package by.grodno.staneuski;

import java.util.ArrayList;

public class Workspace {
	
	private ArrayList<StationeryAccessories> storage = new ArrayList<StationeryAccessories>();
	
	public ArrayList<StationeryAccessories> getStorage() {
		return storage;
	}
	public void setStorage(ArrayList<StationeryAccessories> storage) {
		this.storage = storage;
	}
	public void addToWorkspace(StationeryAccessories item){
		this.storage.add(item);
	}
	public void removeFromWorkspace(StationeryAccessories item){
		this.storage.remove(item);		
	}
	
	public int getSumm(){
		int summ = 0;
		for(StationeryAccessories item: storage){
			summ += item.getCost();
		}		
	return summ;
	}
}
