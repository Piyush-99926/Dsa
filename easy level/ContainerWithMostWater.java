public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] a={1,8,6,2,5,4,8,3,7};
        int max=0;
        int l=0;
        int r=a.length-1;

        while(l<r){
            int height=Math.min(a[l],a[r]);
            int distance=r-l;
            int area= height*distance;
            max=Math.max(area,max);

            if(a[l]<a[r]){
                l++;
            }else{r--;}

            
        }
        System.out.println(max);
        
    }
    
}
