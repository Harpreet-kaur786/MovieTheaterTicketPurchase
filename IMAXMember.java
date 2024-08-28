/**
 * Program Name: create movie membership accounts that will allow members to
   purchase movie tickets, earn points, and access VIP privileges. 
 * Programmer: Harpreet kaur
 * Date: 14-08-2024
 * Purpose: This class represents an IMAX membership, providing specific benefits for IMAX screenings.
 */

public class IMAXMember extends MovieMembership {
   private double discountRate;
   private double pointsRate;

   
     /** Step 1:
     * Constructor for IMAXMember with default benefits.
     * Sets discount rate to 50% and points rate to 1.3.
     * Starts with 25 bonus points.
     * @param memberName The name of the member.
     */
   public IMAXMember(String memberName){
    super(memberName);
    this.discountRate= 0.5;
    this.pointsRate= 1.3;
    addPoints(25);  // Bonus points for IMAX members

   }
   
    /** Step2:
     * Constructor to initialize all details for IMAXMember.
     * Sets discount rate to 50% and points rate to 1.3.
     * Starts with 25 bonus points.
     * @param memberName, @param nextMovie, @param theaterType
     * @param showHour, @param showMinute, @param snack 
     */
   public IMAXMember(String memberName, String nextMovie, String theaterType,int showHour,int showMinute,String snack)
   {
    super(memberName, nextMovie, theaterType, showHour, showMinute, snack);
    this.discountRate= 0.5;
    this.pointsRate= 1.3;
    addPoints(25);
   }



    /**Step 3:
     * Returns the membership rank.
     * @return String "IMAX".
     */
   @Override
   public String returnMembershipRank()
   {
    return "IMAX";
   }


   /**Step 4:
     * Prints the member benefits, including discount rate and points rate.
     */
   @Override
   public void printMemberBenefits()
   {
    System.out.println("Discount point = " + (discountRate*100) + "%");
    System.out.println("Points gained per dollar =" + pointsRate);
   }


    //  Step 5: Get details about the member, including their points and next movie.
     
   @Override
   public String getMemberDetails(){
    return "This membership card belongs to "+getMembername()+" They have "+getPoints()+" points."+"Their next movie is "+getNextMovie()+" at "+displayShowTime()+" with a"+getTheaterType()+" screening."+"They will be having"+getSnacks()+" as a snack."+" They have "+returnMembershipRank()+" membership. " ;  
   }


       /** Step 6:
     * The purchase of a movie ticket, applying discounts and earning points.
     * @param ticketPrice, @param nextMovie, @param theaterType
     * @param showHour, @param showMinutes, @param snack
     * Print details as per the instructions.
     */

   public void purchaseMovieticket(double ticketPrice, String nextMovie, String theaterType, int showHour, int showMinute, String snack) {
        setNextMovie(nextMovie);
       setTheatreType(theaterType);
        setShowTime(showHour, showMinute);
        setSnacks(snack);
        double priceWithDiscount= ticketPrice;
       int pointEarned=0;
       if(theaterType.equals("IMAX")){
         priceWithDiscount = ticketPrice * (1- discountRate); //Calculate discounted price
         pointEarned = (int)(ticketPrice*pointsRate);  //Calculate earned points
        
       }
       addPoints(pointEarned);  // Add earned points to the member's account
         // Print out the purchase details
        System.out.println("Movie "+nextMovie+" has been purchased by "+getMembername()+" for "+priceWithDiscount+" and will be showing at "+displayShowTime()+" with "+theaterType+"screeing.They have earned "+pointEarned+" points")  ;
    }


    
}

