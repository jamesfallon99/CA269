public class Movie {
    public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;
   private String _title;
   public Price price;
   public Movie(String title, int priceCode) {
      _title = title;
       setPriceCode(priceCode);
      }
    public int getPriceCode() {
       return price.getPriceCode();
        }
    public void setPriceCode(int arg) {
       if (arg==CHILDRENS){
           price= new ChildrensPrice();
       }
       else if(arg==NEW_RELEASE){
           price= new NewReleasePrice();
       }
       else
           price = new RegularPrice();
       }
   public String getTitle (){
      return _title;
      }
   public double getCharge(int _daysRented){
       double thisAmount=0;
       if (price.getPriceCode()==REGULAR){
               thisAmount+=2;
               if( _daysRented>2){
                   thisAmount+= ( _daysRented-2)*1.5;
               }
       }
       
       else if (price.getPriceCode()==NEW_RELEASE){
               thisAmount+=  _daysRented*3;
       }
       else if (price.getPriceCode()==CHILDRENS){
               thisAmount+=1.5;
               if ( _daysRented>3){
                   thisAmount+= ( _daysRented-3)*1.5;
               }
       }
       return thisAmount;
   }
   public int getFrequentRenterPoints(int num){
       int points=1;
       if ((price.getPriceCode()==NEW_RELEASE)&&num>1){points++;}
       return points;
   }
}