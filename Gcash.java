public  class Gcash extends WaysForMoney  {
       private long number;
       private int amount;

        Gcash(long number , int amount){
             this.number = number;
             this.amount = amount;
        }
         @Override
     public void DisplayInfo(){
               String converter = String.valueOf(number);
              String hiding = "*******" + converter.substring(converter.length() - 4);
            System.out.println("Gcash number: " + hiding);
             System.out.println("Amount: " + amount);
         }

}
