package State.ATMExample;

public class HasPin implements IATMState {

    ATMmachine atmMachine;
    public HasPin(ATMmachine atMmachine) {
        this.atmMachine = atMmachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't enter more than one card");

        
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());        
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You already entered a pin");

        
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(atmMachine.getCashInMachine() >= cashToWithdraw)
        {
            System.out.println("You have withdrawn " +cashToWithdraw);
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - cashToWithdraw);
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        
    }
}

}
