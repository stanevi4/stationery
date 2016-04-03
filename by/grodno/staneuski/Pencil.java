package by.grodno.staneuski;

public class Pencil extends StationeryAccessories {
	
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void printCharacteristics() {
		System.out.println("Print paper characteristics:");
		System.out.println("Name: " + this.getName());
		System.out.println("Manufacturer: " + this.getManufacturer());
		System.out.println("Color: " + this.getColor());
		System.out.println("Cost: " + this.getCost());
	}
}
