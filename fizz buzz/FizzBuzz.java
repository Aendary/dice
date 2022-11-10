public class FizzBuzz {
    public static void main(String[] args) {
        int b = 3;
        int c = 5;
        for (int i = 1; i <= 100; i++)
            if (i == Math.round(i / c))
            System.out.println("fizzbuzz");
        else if (i == Math.round(b))
            System.out.println("fizz");
        else if (i == Math.round(c))
            System.out.println("buzz");
        else if (i == i)
            System.out.println(i);
    }
}