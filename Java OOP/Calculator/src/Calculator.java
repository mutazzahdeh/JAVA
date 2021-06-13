
public class Calculator {
private double OperandOne;
private double OperandTwo;
private String Operation;
private double  result=0;
public Calculator() {}

 public void setOperandOne(double x) {
	 this.OperandOne=x;
 }
 public void setOperandTwo(double x) {
	 this.OperandTwo=x;
 }
 public void setOperation(String x) {
	 this.Operation=x;
 }
 public void performOperation(){
	 if(this.Operation=="+")this.result=this.OperandOne+this.OperandTwo;
	 if(this.Operation=="*")this.result=this.OperandOne*this.OperandTwo;
	 if(this.Operation=="-")this.result=this.OperandOne-this.OperandTwo;
	 if(this.Operation=="/")this.result=this.OperandOne/this.OperandTwo;
 }
 public void getResults(){
	 System.out.print(this.result);
 }
 
}
