public class ArrayLargesmall {
    public static void main(String[] args) {
        int arr[]={10,25,0,05,15,45,99,};
        int large=arr[0];
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr [i]>large)
            {
                large=arr[i];
            }
            else if (arr [i]<small) {
                small = arr[i];
            }
        }
        System.out.println("large no " + large);
        System.out.println("small no " + small);
    }
}
