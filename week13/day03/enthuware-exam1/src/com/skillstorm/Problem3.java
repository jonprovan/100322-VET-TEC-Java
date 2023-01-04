package com.skillstorm;

public class Problem3
{
   public static void main(String args[])
   {
      try
      {
          if (args.length == 0) return;
          else throw new Exception("Some Exception");
      }
      catch(Exception e)
      {
          System.out.println("Exception in Main");
      }
      finally
      {
          System.out.println("The end");
      }
   }
}
