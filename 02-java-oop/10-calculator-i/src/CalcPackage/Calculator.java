package CalcPackage;

public class Calculator implements java.io.Serializable{
    private String operation;
	private double one;
	private double two;
	private double result;
	
	public void setOperandOne(double one) {
		this.one = one;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setOperandTwo(double two) {
		this.two = two;
	}
	
	public void preformOperation() {
		if (operation.equals("+")) {
			result = one + two;
		}
		else if (operation.equals("-")) {
			result = one - two;
		}
		
	}
	
	public void getResults() {
		System.out.println(result);
	}

}
