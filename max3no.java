public class max {
    public static void main(String []args){
    int a=20;
    int b=39;
    int c=10;

    int max;
    if(a >= b && a >= c) {
            max = a;
        } else if(b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println("maximum is" + max);
}
}
