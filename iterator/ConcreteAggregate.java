package iterator;

public class ConcreteAggregate implements Aggregate {
    private Object[] items = new Object[10];
    private int total = 0;
    
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    public int count() {
        return total;
    }
    
    public Object get(int index) {
        return items[index];
    }
    
    public void add(Object item) {
        items[total++] = item;
    }
    
    public void remove(int index) {
        for (int i = index; i < total - 1; i++) {
            items[i] = items[i + 1];
        }
        total--;
    }

}
