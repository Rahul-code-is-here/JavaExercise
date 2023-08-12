
// array is circularly sorted or not
public class Conditonal {
    public static void circularlyRotated(int arr[],int n){
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i-1]>arr[i]){
                count=count+1;
            }
        }
        if (count==1 && arr[0]<arr[n-1]){
            System.out.println("array is not circularly rotated");
        }
        else {
            System.out.println("array is circularly rotated");
        }
    }
    public static void manin(String[] args){
        int arr[]= {23,34,45,12,17,19};
        int n=arr.length;
        circularlyRotated(arr,n);
    }
}
