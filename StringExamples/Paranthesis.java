package StringExamples;

import java.util.Stack;

public class Paranthesis {
    public  static void main(String st[]) {
       // System.out.print(isValid("(("));
        System.out.print(isValidUsingStack(")(){}"));
        System.out.print(isValidWith(")(){}("));
    }

    static boolean isValid(String s) {
        boolean val = false;

        char roundOpen = '('; int roundOpenCount  = 0;
        char roundClose = ')';   int roundCloseCount = 0;
        char curlyOpen = '{';    int  curlyOpenCount = 0;
        char curlyClose = '}';  int  curlyCloseCount =0;

        char squaredOpen = '['; int   squaredOpenCount  =0;
        char squareClose = ']';   int squareCloseCount = 0;

        if(s.length() == 1) {
            return false;
        }
        for(int i=0; i< s.length() ;i++) {

            if(s.charAt(i) == roundOpen){
                roundOpenCount ++;
            }
            if( s.charAt(i) == roundClose){
                roundCloseCount ++;
            }
            if(s.charAt(i) == curlyOpen){
                curlyOpenCount++;
            }
            if ( s.charAt(i) == curlyClose){
                curlyCloseCount++;
            }
            if(s.charAt(i) == squaredOpen) {
                squaredOpenCount++;
            }
            if(s.charAt(i) == squareClose){
                squareCloseCount++;
            }

            if(roundOpenCount == roundCloseCount){
                val = true;
            }
            if(curlyOpenCount == curlyCloseCount){
                val = true;
            }
            if(squaredOpenCount == squareCloseCount){
                val = true;
            }

        }

        return val;
    }

    static boolean isValidUsingStack(String s) {
        Stack st = new Stack();

        if(s.length() == 1) {
            return false;
        }
        for(char c: s.toCharArray()) {

            switch (c) {
                case '(' : st.push('('); break;
                case '{' : st.push('{'); break;
                case '[' : st.push('['); break;
                case ')':  if(!st.empty()  &&  st.peek().equals('('))  {
                    st.pop();}
                    break;
                case '}':  if(st.peek().equals('{'))  {
                    st.pop();}
                    break;
                case ']':  if(st.peek().equals('['))  {
                    st.pop();}
                    break;
            }
        }
        return st.isEmpty();
    }

    public static boolean isValidWith(String s) {
        Stack<Character> bracket = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': bracket.push(c); break;
                case '{': bracket.push(c); break;
                case '[': bracket.push(c); break;
                case ')': if (bracket.empty() || bracket.peek()!='(') return false; else bracket.pop(); break;
                case '}': if (bracket.empty() || bracket.peek()!='{') return false; else bracket.pop(); break;
                case ']': if (bracket.empty() || bracket.peek()!='[') return false; else bracket.pop(); break;
                default: ;
            }
        }
        return bracket.isEmpty();
    }
}
