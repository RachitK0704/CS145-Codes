//Rachit Khandelwal
//CS141
//02/05/2023
//Assignment 1
//Display a calendar current and requested by user, ask the user input for what month and date needs to be displayed.

import java.util.Scanner; 
import java.util.Calendar;

public class RKCalendar1 { //Begin class and main method
   public static void main(String[] args) { 
      Scanner input = new Scanner(System.in); 
      Calendar Current = Calendar.getInstance();
      
      System.out.println("What date are you looking at? Enter in MM/DD form");
      String word = input.next();
      
      char m1 = word.charAt(0);
      char m2 = word.charAt(1);
      char d1 = word.charAt(3);
      char d2 = word.charAt(4);
      
      if (m1 == '0') { // begin if/else
         System.out.println("\t\t\t\t\t\t\t\t\t\t" + m2);
      } else {
         System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + m1 + m2);
      } 
      
      int begin = 1;
      int end = 7;     
      // Begin for loop
      for (int i = 1; i <= 5; i++) { 
         line1();
         dateLine(begin, end);
         spacing();
         spacing();
         spacing();
         spacing();                  
         begin = begin + 7;
         end = end + 7;
      } 
      // Begin if/else
      line1();
      if (m1 == '0') {
         System.out.println("Month: " + m2);
      } else {
         System.out.println("Month: " + m1 +m2);
      }  
      
      if (d1 == '0') {
         System.out.println("Day: " + d2);
      } else {
         System.out.println("Day: " +d1 + d2);
      }   
      
         drawMonth(Current.get(Calendar.MONTH)+1);
         System.out.println("Month: "+(Current.get(Calendar.MONTH)+1));
        System.out.println("Day: "+Current.get(Calendar.DATE));
     } // end of main method
      //line method
      public static void line1() { 
      for (int i = 1; i <= 64; i++) {
      System.out.print("=");
      } 
      System.out.println();
      return;
   }
   
   public static void dateLine(int begin, int end) { // begin of dateLine method
      for (int i = begin; i <= end; i++) { //begin of for loop
         if (i>9) { // begin of if else
            System.out.print("|" + i + "      ");
         } else {
            System.out.print("|" + i + "       ");
         } 
      } 
      System.out.println("|");
      return;
   }  
         // Begin spacing method
   public static void spacing() { 
      for (int i = 1; i <= 7; i++) { 
         System.out.print("|        ");
      } 
      System.out.println("|");
      return;
   } 
   
   public static void drawMonth(int month) { // begin of drawMonth method
      System.out.println("                               "+month);           
         for(int i =0; i < 5;i++) {
            System.out.println("+==============================================================+");
            for(int j =1; j < 6;j++) {
               for(int k =0; k < 8;k++) {
                  if (j == 1 && k < 7) {
                     System.out.printf("|%-8d", ((7 * i) + 1) + k); 
                  } else {
                     System.out.printf("|%-8s", "");
                  }
               }
                  System.out.println();
               }
            }
                System.out.println("+==============================================================+");
      } 
} 