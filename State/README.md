## State Design Pattern: 

- behavioural Design Pattern

- Definition : Stat Design Pattern is a Pattern Allows the Object to alter its behaviour when its internal State changes.

### What this mean?

- There is a Different  ``States`` for the Context , and State pattern solve the problem of altering the behaviour in runtime depending on its current State
- There is a Different ``Transactions`` to change your current state into another state 

### For Example :

in Our Book  ``Gumball Machine`` the ``states`` in that example : 

- Has Quarter 
- No Quarter
- Out of Gumballs
- Gumball Sold

``The Transaction`` or `` state transition ``:

- insert quarter 🪙
- eject quarter 
- turns crank 🎰
- dispense 
<hr>

### Here is the state Diagram(State Machine)

<div align="center">
<img src="https://www.oreilly.com/api/v2/epubs/0596007124/files/figs/web/394fig02.png.jpg">
</div>

### implementing state machine(without state dsign pattern) : 
1. First, gather up your states
2. Next, create an instance variable to hold the current state, and define values for each of the states

```java
final static int SOLD_OUT = 0;
final static int NO_QUARTER = 1;
final static int HAS_QUARTER = 2;
final static int SOLD = 3;
int state = SOLD_OUT;  // variable for the initial state we assume that the machine sold out until you filled it 
```
3. Now we gather up all the actions that can happen in the system ``transition``
4. Now we create a class that acts as the state machine. For each action, 
we create a method that uses conditional statements to determine 
what behavior is appropriate in each state. For instance, for the insert 
quarter action
```java
 public void insertQuarter() {
 if (state == HAS_QUARTER) {
 System.out.println(“You can’t insert another quarter”);
 } else if (state == SOLD_OUT) {
 System.out.println(“You can’t insert a quarter, the machine is sold out”);
 } else if (state == SOLD) {
 System.out.println(“Please wait, we’re already giving you a gumball”);
 } else if (state == NO_QUARTER) {
 state = HAS_QUARTER;
 System.out.println(“You inserted a quarter”);
 }
 }
```
[FULL CODE](/master/State/GumballMachine.java)
