public class TrappingWater {
    public static void main(String[] args) {
        int[] a={3,4,5,1,7,2,6,5,4,1};

        int leftMax=0 , rightMax=0;
        int l=0, r=a.length-1;
        int ans=0;
        while(l <= r){
            if(a[l]<=a[r]){
                if(a[l]>=leftMax){
                    leftMax=a[l];
                } else{
                    ans += leftMax-a[l];
                }
                l++;

            } else {
                if(a[r]>=rightMax){
                    rightMax=a[r];

                } else {
                    ans +=rightMax-a[r];
                }
                r--;
            }
            
        }
        System.out.print(ans);
    }
    
}
