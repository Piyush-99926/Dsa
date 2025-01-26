public class moveZeroRight {
    public static void main(String[] args) {
        int[] a={0,1,0,3,12};
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]!=0){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                        break;

                    }

                }
                System.out.print(a[i]);

            }

        }
    }
    
}
