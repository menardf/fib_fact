import java.util.*;
import java.util.Stack;
import java.util.List;

public class recursiveStack {

    public static void main (String[] args){
    Integer [] data = {47,32,59,62,21};
    recursion(data);

    }

    public static Stack<Integer> recursion (Integer [] d ){
        int n = d.length;
        Stack<Integer> quizList = new Stack<>();

        if(n==0){
            System.out.println();
        }
        else {
            for(Integer q:d){  //the for each statement allow the recursion for adding the elements //
                quizList.push(q);
            }

        }
        System.out.println("stack before removing:" +quizList);
        System.out.println("stack after removing:");

    for(Integer q:d){
        System.out.print(quizList.pop()+" "); //allow the recursion for removing the element in order //
    }
       return quizList;
    }
}
