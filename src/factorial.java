public class factorial {


    public static long fact (int n){
            long result;
        if (n==1){
            result =1;
        }
        else{
            result=  n*fact(n-1);//complete the factorial operation //
        }
        return result;

    }
    public static void main(String [] args){

        System.out.println( "factorial of 4 is "+ fact(4));
        System.out.println( "factorial of 7 is "+ fact(7));
        System.out.println( "factorial of 22 is "+ fact(22));


    }

}
