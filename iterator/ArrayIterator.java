package iterator;

public class ArrayIterator implements IIterator {
   protected MenuItems[] menuItems;
    int position = 0;

    public ArrayIterator(MenuItems menuItems[]) {
        this.menuItems = menuItems;
    }



    @Override
    public boolean hasNext() {
        if(position > menuItems.length /*out of bound */ || menuItems[position] == null /* there is no items */)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        MenuItems menuItem = menuItems[position]; // get the current item
        position++; // increment the position
        // or replce the two lines with 
       // return menuItems[position++];
        return menuItem;
    }
    
    
}
