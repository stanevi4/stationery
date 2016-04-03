package by.grodno.staneuski;

import java.util.Comparator;

public class SortedByPrice implements Comparator<StationeryAccessories> {

	@Override
	public int compare(StationeryAccessories item1, StationeryAccessories item2) {

		int price1 = item1.getCost();
		int price2 = item2.getCost();

		if (price1 > price2) {
			return 1;
		} else if (price1 < price2) {
			return -1;
		} else {
			return 0;
		}
	}

}
