import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    ATM obj1 = new ATM();
    while(true){ 
      System.out.println("(1) Check Balance"); 
      System.out.println("(2) Withdraw Money"); 
      System.out.println("(3) Deposit Money"); 
      System.out.println("(4) Exit Program"); 
      Scanner option = new Scanner(System.in);
      int input = option.nextInt();
      switch(input){
        case 1:
          double checkBal_ = obj1.checkBal();
          System.out.println(checkBal_); 
          break;
        case 2: 
          System.out.println("How much do you want to withdraw?");
          Scanner withdrawl = new Scanner(System.in);
          double withdraw = withdrawl.nextDouble();
          double obj2 = obj1.withDraw(withdraw);
          if(obj2 < 0){
            obj1.deposit(withdraw);
            System.out.println("Insufficent Funds");
          } 
          else{
            System.out.println("Your new balance is " + obj2);
          break;
          }
        case 3:
          System.out.println("How much do you want to deposit?");
          Scanner dep = new Scanner(System.in);
          double depositt = dep.nextDouble();
          System.out.println("Your new balance is " + obj1.deposit(depositt));
          continue;
        case 4: 
          System.exit(0);
      }
    }
  }    
}