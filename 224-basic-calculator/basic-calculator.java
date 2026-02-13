class Solution {
    public int calculate(String s) {
        Stack<Integer> val= new Stack<>();
        Stack<Character> op=new Stack <>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
             int ascii=(int)ch;
            if(Character.isWhitespace(ch)) continue;
           if(Character.isDigit(ch))
           {
            int num=0;
            while(i<s.length() && Character.isDigit(s.charAt(i)))
            {
                num=num*10+(s.charAt(i)-'0');
                i++;
            }
            i--;
            val.push(num);
           }
            else if( ch =='(') op.push(ch);
           
            else if(ch ==')')
            {
                while(!op.isEmpty() && op.peek()!='(')
                {
                    int v2=val.pop();
                    int v1=val.pop();
                
                    if(op.peek()=='-') val.push(v1-v2);
                    else  if(op.peek()=='+') val.push(v1+v2);
                    else  if(op.peek()=='*') val.push(v1*v2);
                    else   val.push(v1/v2);
                    op.pop();
                }
                    op.pop();
            }
            else if (ch=='+' || ch=='-')
            {
                int j=i-1;
                while(j>=0 && Character.isWhitespace(s.charAt(j)))
                {
                    j--;

                }
                if(j<0 || s.charAt(j)=='(')
                {
                    val.push(0);
                }
               while(!op.isEmpty() && op.peek()!='(')
               {
                    int v2=val.pop();
                    int v1=val.pop();
       
                    if(op.peek()=='-') val.push(v1-v2);
                    else  val.push(v1+v2);
                    
                    op.pop();
               }
                    op.push(ch);
               }
             else   if(ch=='*'|| ch=='/')
               {
                
               while(!op.isEmpty() && op.peek()!='*' || op.peek()=='/')
                  {
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='*' ) val.push(v1*v2);
                    else val.push(v1/v2);
                    op.pop();
                   }
                    op.push(ch);
                    }
               }
                
        while(!op.isEmpty())  {
             int v2=val.pop();
            int v1=val.pop();
               if(op.peek()=='-') val.push(v1-v2);
                else   val.push(v1+v2);
                    op.pop(); }
        return val.peek();}}