package by.grodno.staneuski;

public abstract class StationeryAccessories {
	
	private String name;
	private String manufacturer;
	private int cost;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return String.format("%s %s $%s", name, manufacturer, cost);
	}

	public abstract void printCharacteristics();
}
