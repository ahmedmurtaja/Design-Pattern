package State.ATMExample;

// import java.util.Scanner;

public class HasCard implements IATMState {
    ATMmachine atmMachine;

    public HasCard(ATMmachine newATMMachine) {
        atmMachine = newATMMachine;
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
        System.out.println("Enter pin first");
    //     Scanner scanner = new Scanner(System.in);
    //     int pin = scanner.nextInt();
    //     scanner.close();
    //     insertPin(pin);
    //     if (atmMachine.getATMState() == atmMachine.getHasCorrectPinState()) {
    //         System.out.println("You have withdrawn " + cashToWithdraw);
    //         System.out.println("Your card is ejected");
    //         atmMachine.setATMState(atmMachine.getNoCardState());
            
    //     }
    //     else
    //     {
    //         System.out.println("You have not entered the correct pin");
    //         System.out.println("Your card is ejected");
    //         atmMachine.setATMState(atmMachine.getNoCardState());
    //     }
        
    // }
    }

}
