/**
 * Program Name:Create movie membership accounts that will allow members to
   purchase movie tickets, earn points, and access VIP privileges. 
 * Programmer: Harpreet kaur
 * Date: 14-08-2024
 * Purpose:The MovieMembershipTest simulates a membership system to evaluate benefits, test functionality, analyze behavior, and optimize offers effectively.
 */

public class MovieMembershipTest {
    public static void main( String[] args) {
        // Step 1: Create three movie membership objects
        SilverMember mySilver = new SilverMember("James Kelly", "Sonic The Hedgehog", "standard",14,30, "gummy bears");
        GoldMember myGold = new GoldMember("Richie Rich","Wolf on Wall Street", "standard",18,45,"popcorn");
        IMAXMember myIMAX = new IMAXMember("David Stu", "March of the Penguins", "IMAX", 10, 0, "nachos");

        // Step 2: Create an array of type MovieMembership
        MovieMembership[] movieMembershipArray = new MovieMembership[3];
        movieMembershipArray[0] = mySilver;
        movieMembershipArray[1] = myGold;
        movieMembershipArray[2] = myIMAX;

        // Step 3: Traverse through every element of the movieMembershipArray
        for (MovieMembership member : movieMembershipArray) {
            System.out.println("Member Name: " + member.getMembername());
            System.out.println("Member Rank: " + member.returnMembershipRank());
            System.out.println("Points : " + member.getPoints());
            System.out.println("Next Movie: " + member.getNextMovie());
            System.out.println("Theatre Type: " + member.getTheaterType());
            System.out.println("Showtime: " + member.displayShowTime());
            System.out.println("Snack: " + member.getSnacks());
            System.out.println(member.getMemberDetails());
            member.printMemberBenefits();
            System.out.println();
        }

        // Step 4: Purchase a movie ticket for each member
        for (MovieMembership member : movieMembershipArray) {
            member.purchaseMovieticket(6.99, "The Matrix 4 ", " standard ", 11, 25, " Sour Keys ");
            System.out.println(member.getMemberDetails());
            System.out.println();
        }

        // Step 5: Invoke accessVIPLounge() for myGold
        myGold.accessVIPLounge();

        // Step 6: Invoke purchaseAlcohol() for myGold and print the result
        System.out.println(myGold.purchaseAlcohol());
        System.out.println(myGold.getMemberDetails());
        System.out.println();

        // Step 7: Purchase a ticket for mySilver
        mySilver.purchaseMovieticket(7.89, "Suicide Squad", "standard", 14, 25, "Smarties");

        // Step 8: Purchase a ticket for myGold
        myGold.purchaseMovieticket(15.98, "The Big Short", "standard", 13, 50, "Kitkat");

        // Step 9: Purchase a ticket for myIMAX
        myIMAX.purchaseMovieticket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");

        // Step 10: Call getMemberDetails() for all three objects and print
        for (MovieMembership member : movieMembershipArray) {
            System.out.println(member.getMemberDetails());
       
        }
    }
}

