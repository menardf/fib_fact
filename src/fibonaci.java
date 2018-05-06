public class fibonaci {

    public static int fibo (int n){
        int result;
        if (n==0){
            return 0;
        }
        else if(n==1||n==2) {
            return 1;
        }
        else {
            result =fibo(n-1)+fibo(n-2); //complete the fibonaci operation//
        }
        return result ;

}
    public static void main(String [] args){

        System.out.println( "fibonaci of 5 is "+ fibo(5));
        System.out.println( "fibonaci of 7 is "+ fibo(7));
        System.out.println( "fibonaci of  of 14 is "+ fibo(14));


    }

}
