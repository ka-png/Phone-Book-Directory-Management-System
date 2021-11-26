package com.PhoneBook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddUser {
    public void Add(ArrayList<User> al) throws Exception{
        Scanner s = new Scanner(System.in);
        System.out.println("___________________________________________________");
        System.out.print("Enter User Id: ");
        int id = s.nextInt();
        SearchUser.check(id);
        s.nextLine();
        System.out.print("Enter User Name: ");
        String name = s.nextLine();
        System.out.print("Enter User Phone Number : ");
        String phNo = s.nextLine();
        System.out.print("Enter User City : ");
        String city = s.nextLine();
        System.out.print("Enter User Country : ");
        String country = s.nextLine();
        DisplayUser.DisplayGroups();
        System.out.print("Enter group name: ");
        String group = s.nextLine();
        int l=SearchUser.check(group);
        if(l==1)
        {
            al.add(new User(id,name,phNo,city,country,group));
        }
        else
        {
            System.out.println("enter valid group");
        }
    }
}

