package CalcPackage;

public class CalculatorTest {

public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.setOperandOne(10.5);
		calculator.setOperation("+");
		calculator.setOperandTwo(5.2);
		calculator.preformOperation();
		calculator.getResults();
		
		calculator.setOperandOne(10.5);
		calculator.setOperation("-");
		calculator.setOperandTwo(5.2);
		calculator.preformOperation();
		calculator.getResults();
	}
}