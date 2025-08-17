public class Credit_Card extends WaysForMoney{
     public long credit_card;
     public int amount;

       Credit_Card(long credit_card , int amount){
            this.credit_card = credit_card;
            this.amount = amount;
       }
        @Override
         public void DisplayInfo(){
           String converter = String.valueOf(credit_card);
           String hiding = "*******" + converter.substring(converter.length() - 5);
           System.out.println("Credit Card: " + hiding);
            System.out.println("Amount: " + amount);
        }
}
