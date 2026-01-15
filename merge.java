public class merge {

    // public static void main(String args[]){

    // }
    public static void mergeSort(int []arr,int l,int r){
        if (l>=r)return;

        int mid =(l+r)/2;
        mergeSort(arr, l, mid);
    }

    public static void main(String[] args){
        int [] arr = {5,6,3,4,8}
    }
    
}
