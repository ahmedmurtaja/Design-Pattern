package State.ATMExample;

public class NoCash implements IATMState {
    ATMmachine atmMachine;

    public NoCash(ATMmachine atMmachine) {
        this.atmMachine = atMmachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
        
    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered == 1234)
        {
            System.out.println("Correct");
            atmMachine.setATMState(atmMachine.getHasCorrectPinState());
        }
        else
        {
            System.out.println("Wrong");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
       
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
        
    }

}
