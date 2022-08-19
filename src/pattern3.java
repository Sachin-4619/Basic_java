public class pattern3 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            for(int k=0;k<i;k++){
                System.out.print("  ");
            }
            for(int l=5;l>i;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a=1;a<5;a++){
            for(int b=0;b<=a;b++){
                System.out.print("*");
            }
            for(int c=4;c>a;c--){
                System.out.print("  ");
            }
            for(int d=0;d<=a;d++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
