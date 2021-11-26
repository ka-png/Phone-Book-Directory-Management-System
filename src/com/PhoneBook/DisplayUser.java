package com.PhoneBook;

import java.util.*;
import java.io.*;

public class DisplayUser extends AddUser{
    public static void Display(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1;
        if(file.isFile()){
            ois1 = new ObjectInputStream(new FileInputStream(file));
            ArrayList<User> al = (ArrayList<User>) ois1.readObject();
            ois1.close();
            System.out.println("|=====================================  MY CONTACTS  ======================================|");
            System.out.println("|------------------------------------------------------------------------------------------|");
            for (User user : al){
                System.out.println(user.toString());
            }
            System.out.println("L__________________________________________________________________________________________⅃");
            System.out.println("                                                    ");
            System.out.println("                                                    ");

        }else{
            System.out.println("File not Exists....!");
        }
    }

    public static void DisplayMainScreen(){
        System.out.println("\t\t\t\t\t+----------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t|                  PHONE BOOK MANAGEMENT SYSTEM                        |");
        System.out.println("\t\t\t\t\t+----------------------------------------------------------------------+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t _______________________________");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 1.Create a contact            |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 2.Display all contacts        |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 3.Search                      |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 4.Delete contacts             |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 5.Edit contacts               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 6.Sort contacts               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 7.Contact groups              |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|                               |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| 0.Exit application            |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|_______________________________|");
        System.out.println("                                 ");
        System.out.println("                                 ");
    }

    public static void DisplaySortMenu(){
        System.out.println("\t\t\t\t\t\t ___________________________________________________");
        System.out.println("\t\t\t\t\t\t|                                                  |");
        System.out.println("\t\t\t\t\t\t|                 1.SORT By Id                     |");
        System.out.println("\t\t\t\t\t\t|                 2.SORT By PhoneNo                |");
        System.out.println("\t\t\t\t\t\t|                 3.SORT By Name                   |");
        System.out.println("\t\t\t\t\t\t|__________________________________________________|");
    }

    public static void DisplayGroups(){
        System.out.println("Select a group :");
        System.out.println("+__________+    +__________+    +_________+    +__________+    +___________+");
        System.out.print("| 1.family |    ");
        System.out.print("| 2.friend |    ");
        System.out.print("| 3.work  |    ");
        System.out.print("| 4.others |    ");
        System.out.println("| 0.nogroup |   ");
        System.out.println("+¯¯¯¯¯¯¯¯¯¯+    +¯¯¯¯¯¯¯¯¯¯+    +¯¯¯¯¯¯¯¯¯+    +¯¯¯¯¯¯¯¯¯¯+    +¯¯¯¯¯¯¯¯¯¯¯+");
    }

    public static void Groups(){
        System.out.println(" _____________");
        System.out.println("|             |");
        System.out.println("| GROUPS:     |");
        System.out.println("| family  ("+AddGroup.g_family+") |");
        System.out.println("| friend  ("+AddGroup.g_friend+") |");
        System.out.println("|  work   ("+AddGroup.g_work+") |");
        System.out.println("| others  ("+AddGroup.g_other+") |");
        System.out.println("| nogroup ("+AddGroup.g_nogroup+") |");
        System.out.println("|_____________|");
    }
}
