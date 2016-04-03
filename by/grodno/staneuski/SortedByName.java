package by.grodno.staneuski;

import java.util.Comparator;

public class SortedByName implements Comparator<StationeryAccessories> {

	@Override
	public int compare(StationeryAccessories item1, StationeryAccessories item2) {
		String name1 = item1.getName();
		String name2 = item2.getName();
				
		return name1.compareTo(name2);
	}

}
