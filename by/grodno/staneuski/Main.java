package by.grodno.staneuski;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		//create objects
		Employee manager = new Employee();
		manager.setName("John Smith");
		manager.setPosition("Sales manager");

		PrintPaper printPaper = new PrintPaper();
		printPaper.setName("print paper A4");
		printPaper.setManufacturer("Belarus");
		printPaper.setCost(11);
		printPaper.setThickness(80);
		
		Pencil pencil = new Pencil();
		pencil.setName("auto pencil");
		pencil.setManufacturer("Poland");
		pencil.setCost(8);
		pencil.setColor("blue");
		
		Pencil redPencil = new Pencil();
		redPencil.setName("red pencil");
		redPencil.setManufacturer("Poland");
		redPencil.setCost(8);
		redPencil.setColor("red");
		
		Folder folderForPaper = new Folder();
		folderForPaper.setName("folder for paper A4 plastic");
		folderForPaper.setManufacturer("Russia");
		folderForPaper.setCost(12);
		folderForPaper.setFormat("A4");
		
		//use objects
		manager.addItem(printPaper);
		manager.addItem(pencil);
		manager.addItem(redPencil);
		manager.addItem(folderForPaper);

		//sort
		 System.out.println("============ no sorted ==============");
		 manager.printList();
		 System.out.println("");
		 
		 System.out.println("========== sorted by name ===========");
		 Collections.sort(manager.getWorkspace(), new SortedByName());
		 manager.printList();
		 System.out.println("");
		 
		 System.out.println("========== sorted by price===========");
		 Collections.sort(manager.getWorkspace(), new SortedByPrice());
		 manager.printList();
		 System.out.println("");
		 
		 System.out.println("========== sorted by price and name===========");
		 Collections.sort(manager.getWorkspace(), new SortedByPriceName());
		 manager.printList();
		 System.out.println("");				
	}
}
