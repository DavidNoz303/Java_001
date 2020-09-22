package lesson_001;

public class Main {
    //Tochka vhoda v programu.
    public static void main(String[] args) {
//        System.out.println("Hello World !");
//        System.out.println(5 + 7);
//        System.out.println("Hello " + " World !");
//        System.out.println('a');
//        System.out.println("Hello\tWorld!");

//        int a = 5;
//        int b = 7;
//        int sum = a + b;
//        System.out.println("The sum of a and b : " +sum);
//        System.out.printf("%d + %d = %d\n", a, b, sum);
//        String s = "Java";

//        printHello();
//        printHello();
//
//        sumOfTwoNumbers(21, 21);

//        String[]En1 = {"cat", "table", "dog", "girl"};
//
//        counterOfWords(En1);

//        int temp = 30;
//        if (temp > 50) {
//            System.out.println("OVER BIG TEMPERATURE !!!!!!");
//        } else {
//            System.out.println("Good temperature :)");
//        }

        asd("שלום עולם !");

    }

    static void printHello() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }

    private static int sumOfTwoNumbers (int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

    private static int counterOfWords(String[]words) {
        int counter = 0;
        for (int i = 1; i <= words.length; i++) {
            counter++;
        }
        System.out.println("The number of words: " + counter);
        return counter;
    }

    private static String asd(String hello) {
        System.out.println(hello);
        return hello;
    }

}
