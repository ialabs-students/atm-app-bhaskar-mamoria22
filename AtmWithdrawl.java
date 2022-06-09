
public class AtmWithdrawl {
String w;
	public String AtmWithdrawl(int money,int currentbalance) {
		if(currentbalance>=money) {
		AtmDeposit a1=new AtmDeposit();
		String w1=a1.AtmDeposit(money);
		int avabalance=currentbalance-money;
		w=w1+" Total Balance: "+(avabalance);
		}
		else if (currentbalance<money || money==0 || money <0 ) {
			w="Incorrect or insufficient funds";
		}
		return w;
	}
}
