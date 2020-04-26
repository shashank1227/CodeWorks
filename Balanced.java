import java.util.*;
import java.io.*;
import java.lang.*;
public class Balanced{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String str=sc.nextLine();
        if(str.isEmpty()){
                System.out.println("@BALANCED@");
            }
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            if(ch==')'||ch=='}'||ch==']'){
                if(stack.isEmpty()){
                    System.out.println("!NOT BALANCED!");
                    return;
                }
                char last = stack.peek();
                if((last=='('&&ch==')')||(last=='{'&&ch=='}')||(last=='['&&ch==']')){
                    stack.pop();
                }
                else{
                    System.out.println("!NOT BALANCED!");
                    return;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("@BALANCED@");
        }
        else{
            System.out.println("!NOT BALANCED!");
        }
    }
}