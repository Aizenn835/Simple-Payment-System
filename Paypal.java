public class Paypal extends WaysForMoney{
       public int amount;
       public String email;
       Paypal(int amount , String email){
            this.amount = amount;
            this.email = email;
       }
          public void Email(){
              String hider = "********" + "gmail" + email.substring(email.length() - 4);

              System.out.println("Email: " + hider);

          }
       @Override
         public void DisplayInfo(){
           Email();
           System.out.println("Amount: " + amount );
       }
}
