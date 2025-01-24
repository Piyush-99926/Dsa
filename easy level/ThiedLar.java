public class ThiedLar {
    public static void main(String[] args) {
        int [] a={5,2,7,3,4,8,1};
        int lar=0;
        int seclar=-1;
        int thir=-2;
        for(int i=0;i<a.length;i++){
            if(a[i]>a[lar]){
                thir=seclar;
                seclar=lar;
                lar=i;
            }else{
                if(a[i]<a[lar]){
                    if(seclar==-1 || a[i]>a[seclar]){
                        thir=seclar;
                        seclar=i;
                    }else{
                        if(a[i]<a[seclar]){
                            if(thir==-2 || a[i]>a[thir]){
                                thir=i;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Third largest element is "+a[thir]);
    }
}
