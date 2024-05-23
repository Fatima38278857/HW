public class Main {
    public static void main(String[] args) {


        example(10, 0);

    }

    public static void example(int dividend, int divider) {
        try {
            int divisionOperation = dividend / divider;

        } catch (ArithmeticException e) {
            System.err.println("Ошибка: делить на 0 нельзя");
        }

    }
}


        