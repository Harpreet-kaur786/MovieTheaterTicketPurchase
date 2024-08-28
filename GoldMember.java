/**
 * Program Name: Create movie membership accounts that will allow members to purchase movie tickets, earn points, and access VIP privileges. 
 * Programmer: Harpreet kaur
 * Date: 14-08-2024
 * Purpose: This class represents a Gold membership, offering additional VIP privileges and benefits.
 */

import java.util.Scanner;  // Getting password inout from user


/** Step 1:
 * GoldMember is a subclass of SilverMember and implements VIPPrivilege.
 * Representing members with a Gold rank, offering discounts, points, and VIP privileges.
 */
public class GoldMember extends SilverMember implements VIPPrivilege {
  
     private boolean validCredentials ;


 /** Step 2:
     * Constructor for GoldMember with default benefits.
     * Sets discount rate to 25% and points rate to 2.0.
     * Starts with 50 bonus points.
     * @param memberName The name of the member.
     */

    public GoldMember(String memberName)
{
        super(memberName,0.25, 2.0); // call parent class
        this.validCredentials= false;

        //Bonus point for GoldMember
        addPoints(50);
    }

        /** Step 3:
     * Constructor to initialize all details for GoldMember.
     * Sets discount rate to 25% and points rate to 2.0.
     * Starts with 50 bonus points. 
     * @param memberName, @param nextMovie, @param theaterType 
     * @param showHour, @param showMinutes, @param snack 
     */

    public GoldMember(String memberName, String nextMovie, String theaterType,int showHour, int showMinutes, String snack)
    {
        super(memberName,nextMovie,theaterType,showHour,showMinutes, snack, 0.25, 2.0);
        this.validCredentials= false;
        addPoints(50);
    }

  
     /** Step 4:
     * Returns the membership rank.
     * @return String "Gold".
     */
    @Override
    public String returnMembershipRank()
  {
    String Mmebership = "Gold";
    return Mmebership;
  }
      
    
     /** Step 5:
     * Get details about the member, including VIP privileges.
     * @return String member's details and VIP privileges.
     */
     @Override
     public String getMemberDetails()
 {
       return super.getMemberDetails() + "and VIP privalegies";
  }

     
    /** Step 6:
     * Allows access to the VIP lounge if the correct password is entered.
     * Prompts the user for a password.
     */
    @Override
    public void accessVIPLounge()
{
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your password : ");
    int Password = input.nextInt();
    
    if(Password== PASSWORD){        // If password correct
        this.validCredentials= true;   // Set validCredentials to "true".
        System.out.println("Access Granted !");

    }
    else{
        System.out.println(" No Access Granted !");
    }
}


    // Step 7: Allows the purchase of alcohol if valid credentials have been entered.
    @Override
    public String purchaseAlcohol(){
    if(validCredentials){
        setSnacks("Alchoal");
        return "Enjoy your beverage.";
    }else{
        System.out.println(" Beverage cannot be purchased because no valid password has been entered. ");
    }
    return null;
}
}

