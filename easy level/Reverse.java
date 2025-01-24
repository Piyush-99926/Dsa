public class Reverse {
    public static void main(String[] args) {
        int [] a={5,3,4,7,6,9,8,1,2};
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
        }
        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }

    }
}
