public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

  public double getCharge() {
    return _movie.getCharge(_daysRented);
   }

   public int getFrequentRenterPoints() {
      boolean bonus = ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
         this.getDaysRented() > 1);
      
      if (bonus)
        return 2;
      else
        return 1;
   }
}