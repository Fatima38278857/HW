public class Main {
    public static void main(String[] args) {


        Main.numdr(10, 0);

        }
        public static void numdr(int numdr1, int numdr2){
        try {
            int numdr3 = numdr1/ numdr2;

        }catch (ArithmeticException e){
            System.err.println("Ошибка: делить на 0 нельзя");
        }

        }
    }


        