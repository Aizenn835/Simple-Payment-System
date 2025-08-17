 import java.util.Scanner;

public class Main {
     static void padding(String name , int paddingconsole){
             int width = name.length();
             int paddingwidth;

              paddingwidth = (paddingconsole - width) / 2;
                for(int i = 0; i < paddingwidth; i++){
                     System.out.print(" ");
                }
          System.out.println(name);
     }
     public static void main(String[] args)throws InterruptedException{
             Scanner scanner = new Scanner(System.in);

             int paddingconsole = 50;

          System.out.println("===== Payment System =====");
          System.out.println("Choose Payment Method");
          System.out.println("[1] Credit Card");
          System.out.println("[2] Gcash");
          System.out.println("[3] Paypal");

          System.out.println();

          System.out.print("Please Enter your choice: ");
          char choice = scanner.next().charAt(0);

              scanner.nextLine();

                if (choice == '3'){
                     padding("========================" , paddingconsole);
                     padding("Paypal Payment" , paddingconsole);
                     padding("========================" , paddingconsole);


                     System.out.println("Processing Paypal Payment..");
                     Thread.sleep(3000);

                     System.out.print("Enter your email: ");
                     String EmailPay = scanner.nextLine();

                     System.out.print("Enter amount to pay: ");
                     int amount_Pay = scanner.nextInt();

                        Paypal pay = new Paypal(amount_Pay , EmailPay);
                        System.out.print("Processing payment please wait.");
                        try{
                              for(int i = 0; i < 3; i++){
                                   Thread.sleep(1000);
                                   System.out.println(".");
                              }
                             System.out.println("\n");
                        }catch(InterruptedException f ){
                             System.out.println("Something went wrong please try again.");
                        }

                        pay.DisplayInfo();
                        System.out.println();
                        System.out.println("Successfully paid using Paypal.");

                }
                 else if(choice == '1'){
                      padding("========================" , paddingconsole);
                      padding("Credit Card Payment" , paddingconsole);
                      padding("========================" , paddingconsole);

                     System.out.println("Processing Credit Card Payment...");
                     Thread.sleep(3000);

                     System.out.print("Enter Credit Card Number: ");
                     Long creditcard = scanner.nextLong();

                     System.out.print("Enter exact amount to be paid: ");
                     int exactamount = scanner.nextInt();

                     Credit_Card card = new Credit_Card(creditcard , exactamount);
                     System.out.print("Processing payment please wait");
                       try{
                             for(int i = 0; i < 3; i++){
                                  Thread.sleep(1000);
                                  System.out.print(".");
                             }
                            System.out.println("\n");
                       }catch(InterruptedException W){
                            System.out.println("Something went wrong please try again later.");
                       }
                      card.DisplayInfo();
                     System.out.println();
                     System.out.println("Successfully Paid using Credit Card.");
                }else if(choice == '2'){
                     padding("========================" , paddingconsole);
                     padding("Gcash Payment" , paddingconsole);
                     padding("========================" , paddingconsole);

                     System.out.println("Processing Gcash payment..");
                     Thread.sleep(3000);

                     System.out.print("Enter gcash number: ");
                     long gcash = scanner.nextLong();

                     System.out.print("Enter amount to be paid: ");
                     int amount = scanner.nextInt();

                      Gcash cash = new Gcash(gcash , amount);
                     System.out.print("Processing payment please wait");
                     try {
                          for(int i = 0; i < 3;i++){
                               Thread.sleep(3000);
                               System.out.print(".");
                          }
                          System.out.println("\n");

                     }catch(InterruptedException Q){
                          System.out.println("Something went wrong please try again later.");
                     }
                     cash.DisplayInfo();
                     System.out.println();
                     System.out.println("Successfully Paid using Gcash.");
                }
     }

}
