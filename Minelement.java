public class Minelement {
    public static void main(String[] args) {
        int arr[]=new int[]{10,20,5,6,7};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("mininum element in the array="+min);
    }
}
        