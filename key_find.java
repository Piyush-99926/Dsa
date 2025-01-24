public class key_find{
    public static void main(String [] args){
        int [] arr = { 2,5,3,6,7};
        int key = 6;
        int res =-1;
        for (int i=0; i<arr.length;i++){
            if(arr[i]==key){
                res=i;
                break;
            }


        }
        if(res==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at "+ res);
        }
    
    }
}
// output: key found at 3