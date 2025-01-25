public class leader {
    public static void main(String[] args) {
        // right side leader is the element which is greater than  the current elements to its right
        int[] a={3,2,5,4,8,6,9};
        int largest=Integer.MIN_VALUE;
        for(int i=a.length-1;i>=0;i--){
            if(a[i]>largest){
                largest=a[i];
                System.out.print(a[i] + " ");
            }

        }
        
    }
    
}
