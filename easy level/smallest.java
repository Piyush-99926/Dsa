public class smallest {
    public static void main(String[] args) {
        int[] a={4,2,6,3,1};
        int smallest=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<a[smallest]){
                smallest=i;
            }
        }
        System.out.println("Smallest element is "+a[smallest]);
    }
}
