package entities;

public class Account {
	private int number;
	private String holder;
	private double money;
	
	public Account() {
		
	}
	
	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		
	}
	
	public Account(int number, String holder, double money) {
		super();
		this.number = number;
		this.holder = holder;
		this.money = money;
	}

	public int getNumber() {
		return number;
	}

	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getMoney() {
		return money;
	}

	public void depositMoney (double deposit) {
		money += deposit;
	}
	
	public void saqueMoney (double saque) {
		money -= saque - 5.00;
	}
	
	public String toString() {
		return "Account data:"
				+"\n" 
				+"Account: "
				+ number
				+", Holder: "
				+ holder
				+ ", Balance: $"
				+ money;
	}
	
	
	
	
	
	
	
	

}
