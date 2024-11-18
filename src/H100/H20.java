package H100;

import java.util.ArrayList;

public class H20 {
    public static void main(String[] args) {
        System.out.println(isValid("[)"));
        //([)]

    }

    public static  boolean isValid(String s) {
        ArrayList<Character> chars = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            if("({[".contains(s.charAt(i)+"")){
                chars.add(s.charAt(i));
            }else{
                if(chars.size()<=0) return false;
                if(s.charAt(i)==')'){
                    if(chars.getLast() =='('){
                        chars.removeLast();
                        continue;
                    }else{
                        return false;
                    }
                }
                if(s.charAt(i)==']'){
                    if(chars.getLast() =='['){
                        chars.removeLast();
                        continue;
                    }else{
                        return false;
                    }
                }
                if(s.charAt(i)=='}'){
                    if(chars.getLast() =='{'){
                        chars.removeLast();
                        continue;
                    }else{
                        return false;
                    }
                }

            }


        }
        return chars.size()==0;

    }
}
