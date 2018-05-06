import java.util.*;
import java.util.Stack;
import java.util.LinkedList;


public class Recursivequeue {


    public static void main(String[] args) {
        Integer[] data = {47, 32, 59, 62, 21};
        recursion(data);

    }

    public static LinkedList<Integer> recursion(Integer[] d) {
        int n = d.length;
        LinkedList<Integer> quizList = new LinkedList<>();

        if (n == 0) {
            System.out.println();
        } else {
            for (Integer q : d) {//add elements resursively
                quizList.add(q);
            }

        }
        System.out.println("queue before removing:" + quizList);
        System.out.println("queue after removing:");

        for (Integer q : d) {
            System.out.print(quizList.removeLast() + " ");// remove element recursively from the back
        }
        return quizList;


    }
}
