class ATM{
  double balance = 1000.00; 

  public double checkBal(){
    return balance;
  }
  public double withDraw(double amount){
    balance = balance - amount;
    return balance; 
  }
  public double deposit(double amount){
    balance = balance + amount;
    return balance; 
  }
}