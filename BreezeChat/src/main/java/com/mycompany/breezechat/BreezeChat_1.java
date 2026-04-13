/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.breezechat;
import java.util.Scanner;




public class BreezeChat {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello, BreezeChat Application");
            //Start the user management operations
            System.out.println("USer Management System");
            System.out.println("1. Register");
            System.out.println("2. Login ");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            String choice =scanner.nextLine();
            switch (choice){
                case "1":
                    registerUser(scanner);
                    break;
                case "2":
                    login(scanner);
                case "3":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please select 1,2,or 3..");
                    
            }}
    }
       
        //Register a new user
        private static void registerUser(Scanner scanner){
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Username successfully captured!");
        //Username validation
         while(true){
             System.out.print("Enter new username (min 5 chars/_only):");
             username = scanner.nextLine().trim();
             if(!username.matches("[A-Z_]{5}")){
                 System.out.print("Username must contain at least on underscore(_) and be no longer than 5 characters"); 
                 break;
             } 
             
        System.out.println("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("password successfully captured!");
        //Password Validation
            while(true){
            System.out.print("Enter new password (min 8 chars, must contain upper, lower, digit, special char):");
             password = scanner.nextLine();
                 boolean validPassword = true;
             if(!validPassword);
             System.out.print("Passwors Invalid");
             break;
        }
        System.out.println("Enter contact: ");
        String contact = scanner.nextLine();
        System.out.println("Contact number successfully added");
       
        //User Login
       static void login(Scanner scanner){
         System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Welcome" +username + "it is great to see you again");
       System.out.println("Enter password: ");
       String password = scanner.nextLine();
       System.out.println("password successfully captured!");
       System.out.println("Enter contact: ");
       String contact = scanner.nextLine();
       System.out.println("Contact number successfully added");
       if (validate(username,password)){
           System.out.print("Login successful");
       }else{
           System.out.print("Can't login, Invalid username or password");
       }
       }

    private static boolean validate(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  
   
         
       
       
        