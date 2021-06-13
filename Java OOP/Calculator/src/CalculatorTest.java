
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator x=new Calculator();
		x.setOperandOne(10.5);
		x.setOperation("*");
		x.setOperandTwo(10.8);
		x.performOperation();
		x.getResults();
	}

}
