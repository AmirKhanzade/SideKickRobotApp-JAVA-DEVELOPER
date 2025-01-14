import java.util.Scanner;
public class sideKick {
    //Object of Scanner class to input values from the user
    Scanner input=new Scanner(System.in);
    // Make property modeOfOperation protected from outside access
    /**
     * Property to check the mode - default is cleaning
     * +-------------+---------------+
     * | Mode Value  | Action        |
     * +-------------+---------------+
     * |     1       |  Cleaning     |
     * |     2       |  Cooking      |
     * |     3       |  Re-charge    |
     * |  Others     | Not Supported |
     * +-------------+---------------+
     **/
    private int modeOfOperation;
    //charge of battery
    int chargeOfBattery;

    /** Constructor **/
    public sideKick(){
        // initial charge of battery is 0
        chargeOfBattery=0;
        // set default to cleaning or 1
        modeOfOperation=1;

    }
    //code for battery recharge
    public int getBattrycharge(){
        return chargeOfBattery;
    }
    public void setBattrycharge(int chargeOfBattery){
        this.chargeOfBattery=chargeOfBattery;

    }
    public void rechargeBattry(){
        System.out.println("plug in the socket...");
        for(int i=0;i<=100;i++){
            System.out.println(".");
            chargeOfBattery=i;


        }
        System.out.println("plug out the socket / fully charged");
    }
    public void displayBatteryLevel(){
        System.out.println("the battry level of the SideKick is "+chargeOfBattery);
    }
    // create a getter method which returns the current value of modeOfOperation
    public int getmodeOfOperation(){
        return modeOfOperation;
    }
    // mutator/setter method for modeOfOperation
    //A setter should always ensure that the value being assigned to a property is a valid value for the property,
    // with reference to the context of the class or program.
    public void setmodeOfOperation(int modeOfOperation){
        // If the value of the parameter being passed is not between 1 and 3, set it to 1. 
        if(!(modeOfOperation>=1&&modeOfOperation<=3)){
            modeOfOperation=1;
        }
        this.modeOfOperation=modeOfOperation; //this line is for update the new modeofoperation value
        //to ensure that the property's value is valid. Since the property's value can only be between 1 and 3,
        // if an invalid value such as 200 is sent,
        // you are preventing the value from representing an invalid value and setting it to a default value of 1. 	
    }
    public void takeAction(){
        switch(modeOfOperation){
            case 1:
                cleanHouse();
                System.out.println("cleaning is done");
                break;
            case 2:
                cookFood();
                System.out.println("Cooking is done");
                break;
            case 3:
                rechargeBattry();
                System.out.println("re charged is done");
                break;
            default:
                System.out.println("Not supported");
        }
    }
    //protect the method cleanHouse() from external access
    private  void cleanHouse() {
        System.out.println("Get the vacuum cleaner.....");
        System.out.println("Put the dust bag in vacuum.....");
        System.out.println("Go to Living room and clean.....");
        System.out.println("Go to bedroom and clean.....");
        System.out.println("Go to kitchen and clean.....");
        System.out.println("Go to bathroom and clean.....");
        System.out.println("Retrieve dust bag from vacuum cleaner and put in bin.....");
        System.out.println("Go back to Toni.....");
    }
    // implement the cooking method to enable SideKick to display the different tasks performed during cooking.
    // Protect the method from access from outside the class. Name this method cookFood().
    private void cookFood(){
        System.out.println(" Move to the kitchen");
        System.out.println("Get the vegetables");
        System.out.println("Cut the vegetables");
        System.out.println("Turn on the gas");
        System.out.println("Get the cooking pan and oil ready");
        System.out.println("cooke the food");
    }

}
