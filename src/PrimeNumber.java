import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number : ");

        int num = myObj.nextInt();
        int i,count=0;
        for(i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println(num + " is a " +"Prime number");
            }
            else
            {
                System.out.print("Not a prime number");
            }
        }



    }
