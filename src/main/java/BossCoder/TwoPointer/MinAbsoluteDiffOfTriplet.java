package BossCoder.TwoPointer;

public class MinAbsoluteDiffOfTriplet {
    public static void main(String[] args) {
        int arr1[]={ 1, 4, 5, 8, 10};
        int arr2[]={6, 9, 15 };
        int arr3[]={ 2, 3, 6, 6 };
        System.out.println(minAbsoluteDif(arr1,arr2,arr3));
    }

    public static int minAbsoluteDif(int arr1[],int arr2[],int arr3[]){

        int i=0,j=0,k=0;

        int ans=Integer.MAX_VALUE;

        while(i<arr1.length&& j<arr2.length&&k<arr3.length){
            int max=Math.max(Math.max(arr1[i],arr2[j]), arr3[k]);
            int min=Math.min(Math.min(arr1[i],arr2[j]), arr3[k]);

            ans=Math.min(ans,Math.abs(max-min));

            if(arr1[i]==min){
                i++;
            }
            else if(arr2[j]==min){
                j++;
            }
            else{
                k++;
            }

//            if(arr2[j]>arr1[i]&& arr2[j]>arr3[k]){
//                if(arr1[i]>arr3[k]){
//                    k++;
//                }
//                else{
//                    i++;
//                }
//            }
//            else if(arr2[j]>arr3[k]){
//                k++;
//            }
//            else if(arr2[j]>arr1[i]){
//                i++;
//            }
//            else{
//                j++;
//            }

        }
        return ans;
    }


}
