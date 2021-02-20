public class Check {
    String[] Arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String[] Rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] Op = {"+", "-", "*", "/"};

    public String num1;
    public String num2;
    public String operation;


    int validateOperationString (String operationString ) {
        try {
            String[] in = operationString.split(" ");
            int rome = 0;
            int arab = 0;
            int op = 0;


            for (String i : Arab) {
                if (i.equals(in[0])) arab += 1;

                if (i.equals(in[2])) arab += 1;

            }
            for (String i : Rome) {
                if (i.equals(in[0])) rome += 1;

                if (i.equals(in[2])) rome += 1;
            }
            for (String i : Op) {
                if (i.equals(in[1])) {
                    op++;
                }
            }

            num1 = in[0];
            num2 = in[2];
            operation = in[1];

            if (rome == 2 && op == 1) {
                return 1;
            }
            if (arab == 2 && op == 1) {
                return 2;
            }
            throw new Exception("Error Input!");
        } catch (Exception e) {
            System.out.println("Error!!!");
        }
        return 0;
    }

    void RomeToArab() {
        for (int i = 0; i < Rome.length; ++i) {
            if (Rome[i].equals(num1)) {
                num1 = Arab[i];
            }
            if (Rome[i].equals(num2)) {
                num2 = Arab[i];
            }
        }

    }

}
