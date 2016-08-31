
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) throws IOException {
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            String S="",result="";
            char c;
            System.out.println("Enter the large string");
            do
            {
            c=(char)br.read();
             S=S+c;
           }while(c!='q');

           char[] ch=S.toCharArray(); 
            int i,j;
            for(i=0,j=S.length()-2;i<S.length()/2&&j>=S.length()/2;i++,j--)
            {
                  if( ch[i]==(ch[j]))
                {
                        
                         result=result+ch[i];
                 }
                 else
                 break;
             }
            
             System.out.println("the result="+result);
            
        }
    }

