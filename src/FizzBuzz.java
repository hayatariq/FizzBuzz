/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {

                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }
            i++;
        }
    }

    public static void doFizzBuzz(int i) {

        if (i % 3 == 0 && i % 5 == 0) {

            System.out.println("Fizz Buzz");

        } else if (i % 3 == 0) {

            System.out.println("Fizz");

        } else if (i % 5 == 0) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);
        }
    }
}
