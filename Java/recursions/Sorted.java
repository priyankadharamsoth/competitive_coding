public class Sorted{
    public static boolean check(int arr[]){
        if ((arr.length == 0 ) || (arr.length == 1)){
            return true;
        }
        else{
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] >= arr[i+1]){
                    return false; 
                }
             
            }
            return true;
    }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        System.out.println(check(arr));

    }
}