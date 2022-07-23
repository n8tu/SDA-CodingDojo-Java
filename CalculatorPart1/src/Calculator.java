public class Calculator {
    private double operandOne;
    private double operandTwo;
    private char operation;

    private double result;

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void performOperation(){
        if(operation == '+'){
            result = operandOne + operandTwo;
        }else if(operation == '-'){
            result = operandOne - operandTwo;
        }else{
            System.out.println("Failed to recognize the operation");
        }
    }


}
