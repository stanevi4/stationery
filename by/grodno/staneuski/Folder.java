package by.grodno.staneuski;

public class Folder extends StationeryAccessories {
	
	private String format;
	
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void printCharacteristics() {
		System.out.println("Print paper characteristics:");
		System.out.println("Name: " + this.getName());
		System.out.println("Manufacturer: " + this.getManufacturer());
		System.out.println("Format: " + this.getFormat());
		System.out.println("Cost: " + this.getCost());
	}
}
