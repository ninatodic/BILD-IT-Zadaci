package zadaci_16_03_2017;

public class Complex {
	private double a;
	private double b;

	public Complex() {
		a = 0;
		b = 0;
	}

	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Complex add(Complex n) {
		Complex result = new Complex();
		result.setA(this.getRealPart() + n.getRealPart());
		result.setB(this.getImaginaryPart() + n.getImaginaryPart());
		return result;
	}

	public Complex subtract(Complex n) {
		Complex result = new Complex();
		result.setA(this.getRealPart() - n.getRealPart());
		result.setB(this.getImaginaryPart() - n.getImaginaryPart());
		return result;
	}

	public Complex multiply(Complex n) {
		Complex result = new Complex();
		result.setA(this.getRealPart() * n.getRealPart() - this.getImaginaryPart() * n.getImaginaryPart());
		result.setB(this.getImaginaryPart() * n.getRealPart() + this.getRealPart() * n.getImaginaryPart());
		return result;
	}

	public Complex divide(Complex n) {
		Complex result = new Complex();
		result.setA((this.getRealPart() * n.getRealPart() + this.getImaginaryPart() * n.getImaginaryPart())
				/ (n.getRealPart() * n.getRealPart() + n.getImaginaryPart() * n.getImaginaryPart()));
		result.setB((this.getImaginaryPart() * n.getRealPart() - this.getRealPart() * n.getImaginaryPart())
				/ (n.getRealPart() * n.getRealPart() + n.getImaginaryPart() * n.getImaginaryPart()));
		return result;
	}
	
	public double abs(){
		return Math.sqrt(getRealPart()*getRealPart() + getImaginaryPart()*getImaginaryPart());
	}
	
	@Override
	public String toString(){
		if(getRealPart()==0){
			return getImaginaryPart() + "i";
		} else if(getImaginaryPart()==0){
			return getRealPart()+"";
		}else{
		return "(" + getRealPart() + " + " + getImaginaryPart() + "i)";
		}
	}
}
