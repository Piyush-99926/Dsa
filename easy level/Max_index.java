public class Max_index {
    public static void main(String[] args) {
        int[] arr={2,5,3,6,7};
        int max=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>arr[max]){
                max=i;
                break;
            }
        } 
        System.out.println("Max index is"+ max);
    }
}
