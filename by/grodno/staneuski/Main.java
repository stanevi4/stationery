package by.grodno.staneuski;

public class Main {

	public static void main(String[] args) {
		
		//create objects
		Employee manager = new Employee();
		manager.setName("John Smith");
		manager.setPosition("Sales manager");

		PrintPaper printPaper = new PrintPaper();
		printPaper.setName("print paper A4");
		printPaper.setManufacturer("Belarus");
		printPaper.setCost(15);
		printPaper.setThickness(80);
		
		Pencil pencil = new Pencil();
		pencil.setName("auto pencil");
		pencil.setManufacturer("Poland");
		pencil.setCost(8);
		pencil.setColor("blue");
		
		Folder folderForPaper = new Folder();
		folderForPaper.setName("folder for paper A4 plastic");
		folderForPaper.setManufacturer("Russia");
		folderForPaper.setCost(12);
		folderForPaper.setFormat("A4");
		
		//use objects
		manager.addItem(printPaper);
		manager.addItem(pencil);
		manager.addItem(folderForPaper);
		
		manager.printList();
		
	}

}
