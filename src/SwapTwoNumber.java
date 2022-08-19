public class SwapTwoNumber {
    public static void main(String[] args) {
        int x = 10, y = 20 , temp;
        System.out.println("Before swap");
        System.out.println("x+=" + x);
        System.out.println("y+=" + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("after swap");
        System.out.println("x+=" + x);
        System.out.println("y+=" + y);

    }
}
