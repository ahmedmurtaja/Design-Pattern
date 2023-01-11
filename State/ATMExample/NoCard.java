package State.ATMExample;

public class NoCard implements IATMState {
    ATMmachine atmMachine;

    public NoCard(ATMmachine atMmachine) {
        this.atmMachine = atMmachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Inserting Card");
        atmMachine.setATMState(atmMachine.getHasCardState());
        
    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't enter a card");
        
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You didn't enter a card");
        
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You didn't enter a card");
        
    }

}
