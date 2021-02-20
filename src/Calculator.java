public class Calculator {
    public int a;
    public int b;
    public String op;

    int calculate() {
        int result = 0;
        switch (op) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                    result = a / b;
                break;
            case "*":
                result = a * b;
                break;

        }
        return result;
    }
    Calculator(int a, String op, int b) {
        this.a = a;
        this.b = b;
        this.op = op;

    }
}
