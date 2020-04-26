import java.util.*;
import java.io.*;
import java.lang.*;
public class MultipleBalanced{
    static String isBalanced(String str){
        if(str.isEmpty()){
            return "Balanced";
        }
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return "Not Balanced";
                }
                char la = st.peek();
                if(ch==')'&&la=='('||ch=='}'&&la=='{'||ch==']'&&la=='['){
                    st.pop();
                }
                else{
                    return "Not Balanced";
                }
            }
        }
        if(st.isEmpty()){
            return "Balanced";
        }
        else{
            return "Not Balanced";
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String str = sc.next();
            System.out.println(isBalanced(str));
        }
    }
}