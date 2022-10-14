package part_11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3_Stack {

    public static void main(String[] args) {


        Stack st = new Stack();
        String expression = "((3+2)*2)+1)";

        System.out.println("expression = " + expression);

        try{
            for(int i=0; i<expression.length(); i++){
                char ch = expression.charAt(i);

                if(ch == '('){
                    st.push(ch + "");
                }else if(ch==')'){
                    st.pop();
                }
            }
            
            if(st.isEmpty()){
                System.out.println("괄호일치");
            }else{
                System.out.println("괄호 불일치");
            }

        }catch (EmptyStackException e){
            System.out.println("괄호 불일치");

        }


    }
}
