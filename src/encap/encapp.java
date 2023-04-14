package encap;

public class encapp {
private int balance, withdraw,PIN;
private String language;

public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public int getWithdraw() {
	return withdraw;
}
public void setWithdraw(int withdraw) {
	this.withdraw = withdraw;
}
public int getPIN() {
	return PIN;
}
public void setPIN(int pIN) {
	PIN = pIN;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public static encapp en=new encapp ();
public void setData(int a, int b, int c, String x) {
	en.setBalance(a);
	en.setWithdraw(b);
	en.setPIN(c);
	en.setLanguage(x);
}
public void getData() {
	en.getBalance();
	en.getWithdraw();
	
}
}
