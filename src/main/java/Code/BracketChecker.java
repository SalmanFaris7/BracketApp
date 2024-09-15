/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class BracketChecker {
    
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }
    public boolean check()
    {
        Stack s = new Stack(input.length());
        char b=' ';
        char ob =' ';
                for(int i =0;i<input.length();i++)
                {
                    b = input.charAt(i);                

                    switch(b)
                    {
                        case '(':
                        case '{':
                        case '[':
                            s.push(b);break;
                        case ')':
                        case '}':
                        case ']':
                            if(!s.isEmpty())
                            {
                                ob = s.pop();
                                if(((b == ')')&&(ob != '('))||((b == '}')&&(ob != '{'))||((b == ']')&&(ob != '[')))
                                {
                                    return false;
                                }
                                else
                                {
                                   break;
                                }
                             }
                            else
                                return false;
                      

                    }
                }
        if(s.isEmpty())
        {
                 return true;
        }
        else
                return false;

    }


  
    
}
