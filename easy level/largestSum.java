public class largestSum {
    public static void main(String[] args) {
        int[] a={-2,-3,4,-1,-2,1,5,-3};
        int cur;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            cur=+a[i];
            if(cur>max) max=cur;
            if(cur<0) cur=0;


        }
        System.out.println(max);
    }
    
}
