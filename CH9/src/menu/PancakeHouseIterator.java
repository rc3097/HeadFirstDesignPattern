package menu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseIterator implements Iterator<MenuItem> {
	ArrayList<MenuItem> menuItems;
	int pos = 0;
	
	public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}
	@Override
	public boolean hasNext() {
		if (pos<menuItems.size()) return true;
		return false;
	}
	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		return menuItems.get(pos++);
	}
	
}
