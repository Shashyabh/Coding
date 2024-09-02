package interview;

public class Test1 {
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target=13;
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int sum=arr[s]+arr[e];
            if(sum==target){
                System.out.println(s+" "+e);
                break;
            }
            else if(sum<target){
                s++;
            }
            else {
                e--;
            }
        }
    }
}
