public abstract class Price {
   public abstract int getPriceCode();
   public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented){
      boolean bonus = ((this.getPriceCode() == Movie.NEW_RELEASE) &&
         daysRented > 1);
      
      if (bonus)
        return 2;
      else
        return 1;
   }
}