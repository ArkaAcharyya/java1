package ProblemSolving;

import java.util.Stack;

public class problem3 {
	public boolean isBalanced(String s) {
        // code here
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='['||c=='('||c=='{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                char ch=st.peek();
                if((ch=='(' && c==')')||(ch=='{' && c=='}')||(ch=='[' && c==']')) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
