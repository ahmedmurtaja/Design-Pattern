package State.ATMExample;

public class ATMmachine {
    // Context has a States
    // there is Has a relationship between Context and State
    IATMState hasCard; // using polymorphism to create a reference to the interface
    IATMState noCard;
    IATMState hasCorrectPin;
    IATMState atmOutOfMoney;

    IATMState atmState;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    // Constructor
    public ATMmachine() {
        // Create the states
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        // Set the initial state
        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    // set the state of the machine
    void setATMState(IATMState newATMState) {
        atmState = newATMState;
    }

    public IATMState getATMState()
    {
        return atmState;
    }

    // set the cash in the machine
    public void setCashInMachine(int newCashInMachine) {
        cashInMachine = newCashInMachine;
    }

    // get the cash in the machine
    public int getCashInMachine() {
        return cashInMachine;
    }
    public IATMState getHasCardState() {
        return hasCard;
    }
    public IATMState getNoCardState()
    {
        return noCard;
    }

    public IATMState getHasCorrectPinState() {
        return hasCorrectPin;
    }

    public IATMState getNoCashState() {
        return atmOutOfMoney;
    }

    public void insertCard()
    {
        atmState.insertCard();
    }

    public void ejectCard()
    {
        atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw)
    {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPIN(int pinEntered)
    {
        atmState.insertPin(pinEntered);
    }

    // now when we call any transaction method, it will call the method of the current state
    // for example, if the state is noCard, then the insertCard() method of the noCard state will be called


}
