public class Sort {
    public static void main(String[] args) {
        int[] a={5,2,7,3,4,8,1};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;


                }
            }
            
        }
        System.out.println("Sorted array is ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + "");
        }
    }
}
