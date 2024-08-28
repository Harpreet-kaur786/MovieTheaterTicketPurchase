    /*
     * Program Name: Create movie membership accounts that will allow members to 
     * purchase movie tickets, earn points, and access VIP privileges. 
     * Programmer: Harpreet Kaur
     * Date: 14-08-2024
     * Purpose: This class represents a MovieMembership with general attributes and behaviors for different membership types.
     */
      
     /* Step 1:
      * Abstract class representing MovieMembership.
      * Contains member details and methods.
      */
       public abstract class MovieMembership {
    
            private String memberName;
            private String nextMovie;
            private String theaterType;
            private int showHour;
            private int showMinutes; 
            private String snack;
            private int moviePoints;

     /** Step2:
     * Constructor to initialize member name.
     * Other properties are set to default values.
     * Points are initialized to 0.
     * @param memberName The name of the member.
     */

      public MovieMembership(String member)
   {
           this.memberName = member;
           nextMovie= "unknown";
           theaterType="";
           showHour= 0;
           showMinutes=0;
           snack = "unknown";
           moviePoints=0;
  }

       /**Step 3:
     * Constructor to initialize all member details.
     * @param memberName, @param nextMovie, @param theaterType
     * @param showHour, @param showMinute , @param snack 
     */

      public MovieMembership(String memberName, String nextMovie, String theaterType, int showHour, int showMinute, String snack)
      {
        this.memberName= memberName;
        this.nextMovie= nextMovie;
        this.theaterType= theaterType;
    
        this.showHour=showHour;
        this.showMinutes= showMinute;
        this.snack= snack;
       
      }

      /** Step4:
     * Gets the Membername name, NextMovie,Points, Snacks, TheaterType
     * @return memberName, @return nextMovie.
     * @return moviePoints, @return snack.
     * @return theaterType.
     */
      public String getMembername()
      {
        String  MemberName = memberName;
         return MemberName;
      }

      public String getNextMovie()
      {
        String Movie= nextMovie;
        return Movie;
      }
      
      public int getPoints()
      {
        int Points= moviePoints;
        return Points;
      }

      public String getSnacks()
      {
        String Snacks = snack;
        return Snacks;
      }

      public String getTheaterType()
      {
        String Theater = theaterType;
        return Theater;
      }

      
      /** Step 5:
     * Sets the NextMovie, Snacks,TheatreType, ShowTime
     * @param nextMovie, @param snack.
     * @param theaterType, @param showHour, showMinute
     */
      public void setNextMovie(String nextMovie)
      {
         this.nextMovie= nextMovie;
      }
      
      public void setSnacks(String snack)
      {
        this.snack= snack;
      }
      public void setTheatreType(String theaterType)
      {
        this.theaterType =theaterType;
      }
      public void setShowTime(int showHour, int showMinute)
      {
        this.showHour= showHour;
        this.showMinutes= showMinute;       
        
      }

      //Step 6: Method to display show time in HH:MM  format

      public String displayShowTime()
      {
        String timeString = String.format("%02d:%02d", showHour, showMinutes);
        return timeString;
      }

      // Step 7: Method to add points into member's account

      public void addPoints(int moviePoints)
      {
              this.moviePoints += moviePoints;
      }


      // Step 8: Abstract methods to be implemented by the subclasses.
      public abstract String getMemberDetails();
      public abstract String returnMembershipRank();
      public abstract void printMemberBenefits();
      public abstract void purchaseMovieticket(double ticketPrice, String nextMovie, String theaterType, int showMinute, int showHour, String snack);

    }


  