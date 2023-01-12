package iterator;

public class PancakeHouseMenu {
    MenuItems[] menuItems;
    int numberOfItems = 0;

    public PancakeHouseMenu(MenuItems menuItems[]) {
        this.menuItems = menuItems;
    }

    // create iterator
    public IIterator createIterator() {
        return new ArrayIterator(menuItems);
    }
    
    
}
