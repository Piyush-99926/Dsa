public class sec_Largest{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int largest=0;
        int seclargest=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                seclargest=largest;
                largest=i;
            }else{
                if(arr[i]<arr[largest]){
                    if(seclargest==-1 || arr[i]>arr[largest]){
                        seclargest=i;
                    }
                }

            }
            if(arr.length==-1) return;
        }
        System.out.println("Second largest ekement is "+arr[seclargest]);

    }

}