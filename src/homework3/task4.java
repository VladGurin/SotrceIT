package homework3;

public class task4 {
    public static void main(String[] args) {
        for (int i = 10; i <=99 ; i++) {
           if (i%4 == 0 && i%6 != 0) {
               System.out.println("Divide on 4 and doesn't divade on 6 : " + i);
           }
        }

    }
}
