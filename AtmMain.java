import java.util.Scanner;

public class AtmMain {
private static final Boolean True = null;
private int Money;

public AtmMain(int money) {
	super();
	Money = money;
}

public int getMoney() {
	return Money;
}

public void setMoney(int money) {
	Money = money;
}
public static void main(String[] args) {
	AtmDeposit a1=new AtmDeposit();
	int TotalAmount=0;
	AtmWithdrawl a3 = new AtmWithdrawl();
	String b;
	do{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter \n 1. For Deposit \n 2. For Withdrawl \n");
	int q=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Amount: ");
	int q1=Integer.parseInt(sc.nextLine());
	TotalAmount=q1+TotalAmount;
	AtmMain a2=new AtmMain(q1);
	if(q==1) {
		System.out.println(a1.AtmDeposit(a2.getMoney())+" = "+TotalAmount);
}
	else {System.out.println(a3.AtmWithdrawl(a2.getMoney(),TotalAmount));}
	
  System.out.println("Do 1"
  		+ "wnt to continue | press q ??\n ");
  b= sc.nextLine();

	  }while(b!="q");
}
}
