package BossCoder.Array;

public class SecondMax {
    public static void main(String[] args) {
        int arr[]={2,2,2};
        int max=-1;
        int secMax=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            } else if (arr[i]<max) {
                if(arr[i]>secMax){
                    secMax=arr[i];
                }
            }
        }
        System.out.println(secMax);
    }
}
