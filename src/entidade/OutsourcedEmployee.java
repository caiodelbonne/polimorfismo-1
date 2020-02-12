package entidade;

/*
 * o funcionario tercerizado 
 * recebe o mesmo valor por hora mais o acresc, de 110 % 
 * operação super no metodo sobrepoe da classe principal 
 */
public class OutsourcedEmployee extends Employee {

	private Double additionalCharge; // disp adicional

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public OutsourcedEmployee() {
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
