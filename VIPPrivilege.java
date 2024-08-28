/**
 * Program Name: Create movie membership accounts that will alow members to purchase movie rickets, earn points,and access VIP privileges. 
 * Programmer: Harpreet kaur
 * Date: 14-08-2024
 * Purpose: This interface defines VIP privileges for Gold members, including access to a VIP lounge and alcohol purchase.
 */

public interface VIPPrivilege {
    //Password for the verification of beverages
    int PASSWORD = 1786;


   // method to access VIP lounge

    void accessVIPLounge();

    //Method to access Alcohol purchase
    String purchaseAlcohol();
}

