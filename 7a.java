import java.util.*;

 
class stringBuffer
{
  
public static void main (String args[]) 
  {
    
Scanner sc = new Scanner (System.in);
    
System.out.println ("Menu:");
    
System.out.println ("=>Modify a string");	//perform operations using String   
    String str = "Nirma University";
    
System.out.println ("Choices:");
    
System.out.println ("1.Reverse the string");
    
System.out.println ("2.Replace within the string");
    
System.out.println ("3.Check the presence of substring");
    
System.out.println ("Enter your choice:");
    
int m2 = sc.nextInt ();
    
switch (m2)
      
      {
      
case 1:
	char rev[] = str.toCharArray ();
	
int l = str.length ();
	
for (int i = 0; i < l / 2; ++i)
	  
	  {
	    
char temp = rev[i];
	    
rev[i] = rev[l - i - 1];
	    
rev[l - i - 1] = temp;
	  
} 
 
str = String.valueOf (rev);	//converts array to string 
	System.out.println ("The reversed string is:" + str);
	
break;
      
case 2:
	str = str.replace ("Ni", "Ab");
	
System.out.println ("String after replacement of 'Ni' with 'Ab':" +
			     str);
	break;
      
case 3:
	boolean b = (str.contains ("uni") && str.contains ("rma"));
	if (b)
	  
System.out.
	    println
	    ("The string contains both substrings \"uni\" and  \"rma\"");
	
	else
	  
System.out.
	    println
	    ("The string does not contain both substrings \"uni\"  and \"rma\"");
	
break;
      
default:
	
System.out.println ("wrong input");
	
return;
      
}
    
 
System.out.println ();
    
System.out.println ("=>Modify a string buffer");	//perform operations on  String Buffer 
    StringBuffer s = new StringBuffer ("Nirma University");
    
System.out.println ("Choices:");
    
System.out.println ("1.Reverse the string buffer");
    
System.out.println ("2.Replace the string buffer");
    
System.out.println ("3.Check the presence of substring");
    
System.out.println ("Enter your choice:");
    
m2 = sc.nextInt ();
    
switch (m2)
      
      {
      
case 1:
	s.reverse ();		//reverse the string buffer using inbuilt function  System.out.println("The reversed string buffer is:"+s);  break; 
      case 2:
	
for (int i = 0; i < s.length (); ++i)
	  
	  {
	    
if (s.charAt (i) == 'N' && s.charAt (i + 1) == 'i')	//s.charAt() returns character  at the position 
	      {
		
s.replace (i, i + 2, "Ab");	//replaces the substring 
	      }
	  
}
	
System.out.println ("The replaced string buffer is:" + s);
	break;
      
case 3:
	
int f1 = 0, f2 = 0;
	
for (int i = 0; i < s.length () - 2; ++i)
	  
	{
	    
if (s.substring (i, i + 3) == "uni")	//checks if substring is present or not  f1++; 
	
	    if (s.substring (i, i + 3) == "rma")
	      
f2++;
	  
}
	
if (f1 == 1 && f2 == 1)
	  
	{
	    
System.out.
	      println ("The string buffer contains both the substrings");
	  }
	
	else
	  
System.out.println ("String buffer doesn't contain them");
	break;
      
default:
	System.out.println ("Wrong input");
      
}
  
 
}

}
