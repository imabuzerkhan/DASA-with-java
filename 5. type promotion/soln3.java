/*
 * ** : Enter cost of 3 items from the user (using oat data type) - a pencil, a pen and
*an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

*/


import java.util.*;
public class soln3{
  public static void main (String args[]){
    Scanner sc= new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float totalamt = pencil + pen + eraser ;
   float gst = 0.18f ;
   float AmountGst = totalamt * gst ;
   System.out.println("the amount pencil is : " + pencil );
   System.out.println("the amount pen is : " + pen );
   System.out.println("the amount eraser is : " + eraser );
   System.out.println("the gst amount is  : " + AmountGst );
   System.err.println("the cost of all things included gst is:" +  totalamt + AmountGst );




  }
}