import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Check check = new Check();
        int k = check.validateOperationString(input);

        if (k == 1)
            check.RomeToArab();

        Calculator calculator = new Calculator(Integer.parseInt(check.num1), check.operation, Integer.parseInt(check.num2));
        int result = calculator.calculate();



        if (k == 1)
            System.out.println(ArabToRome.RomanNumerals(result));
        else
            System.out.println(result);

    }


}
