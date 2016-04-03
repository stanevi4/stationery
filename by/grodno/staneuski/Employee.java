package by.grodno.staneuski;

public class Employee {
	
	private String name;
	private String position;
	private Workspace workspace;
	
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
	public Workspace getWorkspace() {
		return workspace;
	}
	public void setWorkspace(Workspace workspace) {
		this.workspace = workspace;
	}
	
	public void addItem(StationeryAccessories item){
		this.workspace.addToWorkspace(item);
	}
	public void removeItem(StationeryAccessories item){
		this.workspace.addToWorkspace(item);
	}
	
	public void printList(){
		int i = 1;
		System.out.println(this.name + " workspace content:");
		for(StationeryAccessories item: workspace.getStorage()){
			System.out.print(i + ". ");
			System.out.println(item.toString());
			i++;
		}
	}
	public void printSumm(){
		int summ = workspace.getSumm();
		System.out.println("Summ = " + summ);
	}
}
