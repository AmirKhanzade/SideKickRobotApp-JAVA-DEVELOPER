public class Main{
    public static void main(String[] args){
        //If you do not want unwanted changes to the properties of a class or want to prevent access to a property
        // or method from outside the definition of the class,
        // you use the keyword private
        //Create an object of the class SideKick using the name sideKickObject
        sideKick sideKickObject=new sideKick();
        //try to access the property modeOfOperation using the sideKickObject,
        // from outside the SideKick class. You will receive an error message from IntelliJ.
        // When you run the main program, you will receive the error message: 
        //“modeOfOperation has private access”. Performing this task helps you to understand that when a property is protected by using private
        //The convention states that we should create a getter method for accessing the values and a setter method to change the values.
        //A getter and setter method should always be public to allow it to be accessed from outside the class. Do not make it private
        // create a getter method which returns the current value of modeOfOperation in sideKick class


        /*recharge the battry of yout objec*/
        sideKickObject.rechargeBattry();
        /*display the battry level */
        sideKickObject.displayBatteryLevel();
        /*Display the current value of the property "modeOfOperation"  */
        System.out.println("the current mode of operation is : "+sideKickObject.getmodeOfOperation());
        //Set the value of the property modeOfOperation to have a value of 3, using the setter method you created
        sideKickObject.setmodeOfOperation(1);
        // use the method takeAction() of the object sideKickObject, which you created 
        sideKickObject.takeAction();
        System.out.println("---------------------------------");

        //do othe operation modes
        sideKickObject.setmodeOfOperation(2);
        sideKickObject.takeAction();
        System.out.println("-------------------------------");

        sideKickObject.setmodeOfOperation(3);
        sideKickObject.takeAction();

    }
}