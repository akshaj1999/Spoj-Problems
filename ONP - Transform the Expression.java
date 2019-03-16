import java.util.*;
 
class Demo
{
	public static void main(String[] args) 
	{ 
      Scanner cin = new Scanner(System.in);
      int t = cin.nextInt();
      cin.nextLine();
      while(t-->0)
      {
      	String str = cin.nextLine();
      	stack s = new stack(str);
      	System.out.println(s.To_postfix());
      }  
 
    } 
} 
 
 
class stack
{
  String str,answer;
  char arr[];
  int length;
  int top=-1;
  public stack(String str)
  {
  	length = str.length();
  	this.str = str;
  	arr = new char[length];
  	answer = "";
  }
  
  public void push(char c)
  {
  	this.arr[++top]=c;
  }
  
  public char peek()
  {
  	return this.arr[top];
  }
  
  public char pop()
  {
  	return this.arr[top--];
  }
 
  public boolean isEmpty()
  {
  	if(this.top ==-1)
  		return true;
  	else
  		return false;
  }
  public String To_postfix()
  {
   for(int i=0;i<length;i++)
   {
   	    char ch = str.charAt(i);
   	    int precedence = prece(ch);
   	    if(ch>='a' && ch<='z')
   	    {
   	    	answer+=ch;
   	    	continue;
   	    }
   	    else if(ch == '(')
   	    	push(ch);
   	    else if(ch == ')')
   	    {
   	    	while(!isEmpty() && peek()!='(')
   	    		answer+=pop();
   	    	if(!isEmpty() && peek()!='(')
   	    		return "Invalid Expression";
   	    	else
   	    		pop();
   	    }
   	    else
   	    {
   	    	while(!isEmpty() && prece(ch)<=prece(peek()))
   	    		answer+=pop();
   	    	push(ch);
   	    }
 
   }
   while(!isEmpty())
   	answer+=pop();
 
   return answer;
  }
  public int prece(char c)
  {
  	switch (c) 
        { 
        case '+':
            return 1; 
        case '-': 
            return 2; 
       
        case '*': 
        return 3;
        case '/': 
            return 4; 
       
        case '^': 
            return 5; 
        } 
        return -1; 
  }
} 