public class SwapwithoutThrdvar {
    public static void main(String[] args) {
        int x=20,y=30;
        System.out.println("Before Swap");
        System.out.println("x="+x);
        System.out.println("y="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swap");
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
}
