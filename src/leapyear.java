import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number : ");

        int num = myObj.nextInt();
        int a =num;
            if  (((a%4==0 && a%100!=0 || a%400==0 ))){
                System.out.print("Leap year");
            }
            else {
                System.out.println("Not leap year");
            }
            System.out.println();
        }
    }

