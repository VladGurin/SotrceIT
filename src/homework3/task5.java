package homework3;

public class task5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200 ; i++) {
            if (i%17 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = " + sum );
    }
}
