public class SumofDigit {
    public static void main(String[] args) {
        int n = 2314;
        System.out.println(Digit(n));
    }
    public static int Digit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
