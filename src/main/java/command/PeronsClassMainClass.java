package command;

/*Command Design Pattern:
* Advantage: Loose coupling in application, Disadvantage: End up with creating too many implementation classes
* allows us to achieve complete decoupling between the sender and the receiver. (A sender is an object that invokes an operation, and a receiver is an object that receives the request to execute a certain operation.
* TO implement Command Design Pattern:
* 1) Create Television class with on and off method
* 2) Create command interface with execute method
* 3) Create OnCommand class with television object and pass it to the class using constructor. This class extends command interface with it's execute method where we turn on the light with help of televsionObject.ON() method.
* 4) In the same way we can implement OffCommand Method
* 5) Create RemoteControl class that has private command object with resp. getter and setters. Create pressButton method which will execute the execute method under Command class.
* 6) In main method, Create an object of Television, RemoteControl and OnCommand/OffCommand Class(Pass television object in constructor.). set the command either on or off with the help of setCommand method inside RemoteControl class. Now, execute the method with pressButton() method.
 */

public class PeronsClassMainClass {

    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remoteControl = new RemoteControl();

        OnCommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();

        OffCommand offCommand = new OffCommand(television);
        remoteControl.setCommand(offCommand);
        remoteControl.pressButton();
    }
}
