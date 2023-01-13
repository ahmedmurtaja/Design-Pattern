package iterator.MenuEx;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0; // the current position in the array

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
        
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position++];
        return menuItem;
    }

    @Override
    public void remove() {
        if(position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if(items[items.length -1 ] != null)
        {
            for(int i = position -1 ;i<(items.length -1);i++)
            {
                items[i] = items[i+1];
            }
            items[items.length -1 ] = null;
        }
        
    }
    
    
}
