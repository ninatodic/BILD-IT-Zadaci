package zadaci_21_02_2017;

public class Tip {
	private double billAmount;
	private double tipPrecentage;
	
	public Tip(double tipAmount, double tipPrecentage){
		this.billAmount = tipAmount;
		this.tipPrecentage = tipPrecentage;
	}

	// getters and setters
	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double tipAmount) {
		this.billAmount = tipAmount;
	}

	public double getTipPrecentage() {
		return tipPrecentage;
	}

	public void setTipPrecentage(double tipPrecentage) {
		this.tipPrecentage = tipPrecentage;
	}
	
	// method that returns bill with tip
	public double returnBillWithTip (){
		return billAmount + returnTipAmount(billAmount, tipPrecentage);
	}
	
	// method that returns tip amount
	public double returnTipAmount (double billAmount, double tipPrecentage){
		return billAmount*tipPrecentage/100;
	}
}
