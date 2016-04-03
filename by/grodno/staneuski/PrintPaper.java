package by.grodno.staneuski;

public class PrintPaper extends StationeryAccessories {
	
	private int thickness;

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	@Override
	public void printCharacteristics() {
		System.out.println("Print paper characteristics:");
		System.out.println("Name: " + this.getName());
		System.out.println("Manufacturer: " + this.getManufacturer());
		System.out.println("Thickness: " + this.getThickness());
		System.out.println("Cost: " + this.getCost());
	}
}
