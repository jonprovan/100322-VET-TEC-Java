package com.skillstorm;

public class Problem1
{
   public static void main(String args[])
   {
      try{
         m1();
      }catch(IndexOutOfBoundsException e){
         System.out.println("1");
         throw new NullPointerException();
      }catch(NullPointerException e){
         System.out.println("2");
         return;
      }catch (Exception e) {
         System.out.println("3");
      }finally{
         System.out.println("4");
      }
      System.out.println("END");
   }
   // IndexOutOfBoundsException is a subclass of RuntimeException.
   static void m1()
   {
      System.out.println("m1 Starts");
      throw new IndexOutOfBoundsException( "Big Bang " );
   }
}