public class whileloop
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    int i = 0;
    int k = 20;
    
    public void run() {
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        }
        
        i = 0;
        do {
            System.out.println("k is " + k + " but is greater than 5");
            k--;
        } while (k > 5);
        
        i = 10;
        do {
            System.out.println("a is " + a + " but is less than 10 and b is "
            + b + " but is less than or equal to 20");
            a++;
        } while (a < 10 && b <= 20);
    }
    
    public static void main(String[] args)
    {        
        whileloop wl = new whileloop();
        wl.run();
    }
}