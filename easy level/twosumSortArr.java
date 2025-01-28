public class twosumSortArr {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int target=9;
        int l=0 , r=a.length-1;
        while(l<r)
    {
        if(a[l]+a[r]==target){
            System.out.println(l+" "+r);
            break;
        }else{
            if(a[l]+a[r] > target){
                r--;
            }else{
                l++;
        }
    }}
}
}
