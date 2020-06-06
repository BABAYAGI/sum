/*
 * Class Name:    Sum
 *
 * Author: Darsan
 * Creation Date: Saturday, June 06 2020, 09:35 
 * Last Modified: Saturday, June 06 2020, 11:58
 * 
 * Class Description:
 *
 */

public class Sum
{
 public static void main(String[] args)

 {
  int total = 0;
  
  for(int i=0;i<args.length;i++)
  {
   int string2int = Integer.parseInt(args[i]);
   total = total + string2int;

  }
  System.out.println(total);     
      
   
 
      
}
}
