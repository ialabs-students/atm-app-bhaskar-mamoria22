

public class AtmDeposit {
int tt;
int fh;
int th;
int hh;
int i;

public String AtmDeposit(int money){
	//while(money>0) {
		if(money>=2000) {
		tt=money/(2000);
		money=money%2000;
		}
		if(money>=500 && money<2000) {
			fh=money/(500);
			money=money%500;
		}
	    if(money>200 && money<500) {
			th=money/(200);
			money=money%200;
		}
		if(money >=100 && money<200) {
			hh=money/(100);
			money=money%100;
		}
		
//	}
	String a= "2000: "+tt+"  500: "+fh+"  200: "+th+"  100: "+hh;
    return a;
}
}
