import java.util.*;
import java.util.Scanner;
public class queue {
    public   void queue(Integer n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);

    }

    public  void main(String [] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    queue(n);

    }
}


