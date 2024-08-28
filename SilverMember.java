  /*
     * Program Name:Create  movie membership accounts that will allow members to purchase
     * movie tickets earn points, and access VIP privilages. 
     * Programmer: Harpreet Kaur
     * Date: 14-08-2024
     * Purpose: This class represents a Silver  membership, providing specific benefits and extends MovieMembership
     */

     /**Step 1:
    * This class representings members who have silver rank and with discount rate,
    * which gives them discounts and points on movie tickets.
    */
    
    public class SilverMember extends MovieMembership {

         private double discountRate;
         private double pointsRate;

   /**Step 2:
     * Constructor for SilverMember with default discount and points rates.
     * @param memberName The name of the member.
     */

    public SilverMember(String memberName) {
        super(memberName);
        this.discountRate=0.1;
        this.pointsRate= 1.2;
    }

    /**Step 3:
     * Constructor for SilverMember with custom discount and points rates.
     * @param memberName, @param discountRate, @param pointsRate
     */

    public SilverMember(String memberName, double discountRate, double pointsRate)
    {
        super(memberName);
        this.discountRate= discountRate;
        this.pointsRate=pointsRate;

    }

    /**Step 4:
    *Constructor to initialize all the details for SilverMember
    * @param memberName, @param nextMovie, @param theaterType, @param showHour,
    * @param showMinutes, @param snack, @param discountRate, @param pointsRate 
    */
    public SilverMember(String memberName, String nextMovie, String theaterType, int showHour, int showMinutes, String snack)
    {
        super(memberName,nextMovie,theaterType,showHour,showMinutes, snack);
           this.discountRate= 0.1;
           this.pointsRate= 1.2;
    }    
    public SilverMember(String memberName, String nextMovie, String theaterType, int showHour,int showMinutes,String snack, double discountRate, double pointsRate)
    {
        super(memberName,nextMovie,theaterType,showHour,showMinutes, snack);
        this.discountRate= discountRate;
        this.pointsRate= pointsRate;

    }
     
     /** Step 5:
     * Get details about the member, including their points and next movie.
     * @return string  member's details as per the instructions
     */
    @Override
    public String getMemberDetails() {
      return "This membership card belongs to "+getMembername()+" They have "+getPoints()+" points."+"Their next movie is "+getNextMovie()+" at "+displayShowTime()+" with a "+getTheaterType()+" screening."+"They will be having "+getSnacks()+" as a snack."+" They have "+returnMembershipRank()+" membership." ;  
    } 
     
    
    /** Step 6:
     * Return the membership rank as a string.
     * @return String "Silver".
     */

    @Override
    public String returnMembershipRank() {
      String Mmebership = "Silver";
      return Mmebership; 
    }
 
     
     // Step 7: Print the benefits of being a Silver member, like discount and points rates.
     
    @Override
    public void printMemberBenefits() {
    System.out.println("Dicount rate = "+ (discountRate*100) + " %");
    System.out.println("Point gained per dollar = "+ pointsRate);    
    }
     

       /** Step 8:
     * The purchase of a movie ticket, applying discounts and earning points.
     * @param ticketPrice, @param nextMovie, @param theaterType
     * @param showHour, @param showMinutes, @param snack
     * Print details as per the instructions.
     */

    @Override
    public void purchaseMovieticket(double ticketPrice, String nextMovie, String theaterType,int showHour, int showMinutes, String snack) {
        setNextMovie(nextMovie);
        setTheatreType(theaterType);
        setShowTime(showHour, showMinutes);
        setSnacks(snack);
        double priceWithDiscount = ticketPrice * (1- discountRate);
        int pointEarned = (int)(ticketPrice*pointsRate);
        addPoints(pointEarned);
        System.out.println("Movie "+nextMovie+" has been purchased by "+getMembername()+" for "+priceWithDiscount+" and will be showing at "+displayShowTime()+" with "+theaterType+" screeing."+" They have earned "+pointEarned+" points")  ;
    }
  
 
    
 }

