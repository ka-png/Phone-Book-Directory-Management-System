package com.PhoneBook;

import java.io.*;
import java.util.*;

public class UpdateUser extends Main {
    public void Update(File file) throws ClassNotFoundException, IOException {

        Scanner s1 = new Scanner(System.in);
//        Scanner s = new Scanner(System.in);
        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<User>) ois.readObject();
            ois.close();
            boolean found = false;
            DisplayUser.Display(file);
            System.out.print("Enter contact name to Update : ");
            String ContactName = s1.nextLine();
            System.out.println("-------------------------------------");
            int id = SearchUser.SearchForUpdate(al,ContactName);
            li = al.listIterator();
            while (li.hasNext()) {
                User u = li.next();
                if (u.Id == id) {
                    System.out.print("Enter New User Name : ");
                    String name = s1.nextLine();

                    System.out.print("Enter new Phone Number : ");
                    String phNo = s1.nextLine();

                    System.out.print("Enter City : ");
                    String city = s1.nextLine();

                    System.out.print("Enter Country : ");
                    String country = s1.nextLine();

                    DisplayUser.DisplayGroups();
                    System.out.println("select the group : ");
                    String group = s1.nextLine();
                    li.set(new User(id,name,phNo,city,country,group));
                    found = true;
                }
            }
            if (found) {
                oos = new ObjectOutputStream(new FileOutputStream(file));
                oos.writeObject(al);
                oos.close();
                System.out.println("Record Updated Successfully....!");
            } else {
                System.out.println("Record Not Found...!");
            }
            System.out.println("-------------------------------------");
        } else {
            System.out.println("File not Exists....!");
        }
    }
}

