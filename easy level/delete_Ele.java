public class delete_Ele {
    public static void main(String[] args) {
        int a[]={2,5,3,6,7};
        int key=3;
        int res;
        int i=0;

        for(;i<a.length;i++){
            if(a[i]==key){
                break;
            }

        }
        if(i ==a.length){
            System.out.println("key not found");

        }else{
        for(int j=i;j<a.length-1;j++){
            a[j]=a[j+1];
           
        }}
        for (int k = 0; k < a.length - 1; k++) {
            System.out.print(a[k] + " ");
        }

    }
    
}
