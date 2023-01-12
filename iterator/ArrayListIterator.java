package iterator;

import java.util.ArrayList;

public class ArrayListIterator implements IIterator {
    protected ArrayList<MenuItems> menuItems;
    int position = 0;

    public ArrayListIterator(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>menuItems.size() || menuItems.get(position) == null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItems menuItem =menuItems.get(position);
        position++;
        return menuItem;
    }
    
    
}
