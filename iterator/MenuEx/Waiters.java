package iterator.MenuEx;

public class Waiters {

    Menu dinnerMenu = new DinnerMenu();

    public void printMenu() {
        Iterator dinnerIterator = dinnerMenu.createIterator();
        System.out.println("Dinner Menu");
        while(dinnerIterator.hasNext()) {
            MenuItem menuItem = (MenuItem) dinnerIterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
        }
    }
    public static void main(String[] args) {
        Waiters waiters = new Waiters();
        waiters.printMenu();
    }
}
