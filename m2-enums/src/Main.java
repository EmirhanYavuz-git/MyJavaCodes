public class Main {

    public static void main(String[] args) {


        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);

        Currency[] currencies = Currency.values();

        for (Currency each : currencies) {
            System.out.println(each);
        }

        System.out.println("How to use siwtch-case with enums");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        calculate(MathOperations.ADD,3,1);

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.PENNY.ordinal()); //Index number of the constant in enum


    }


    private static void calculate(MathOperations operator, double a, double b){

        switch (operator){
            case ADD:
                System.out.println("result = " + (a + b));
                break;
            case SUBSTRACT:
                System.out.println("result = " + (a - b));
                break;
            case MULTIPLY:
                System.out.println("result = " + (a * b));
                break;
            case DIVIDE:
                System.out.println("result = " + (a / b));
                break;
        }
    }
}
