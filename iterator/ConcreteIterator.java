package iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;
    
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }
    
    @Override
    public boolean hasNext() {
        if (current < aggregate.count()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public Object next() {
        Object ret = aggregate.get(current);
        current++;
        return ret;
    }
    
    @Override
    public void remove() {
        aggregate.remove(current);
    }
}
    

