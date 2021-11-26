package com.PhoneBook;

import java.io.*;
import java.util.*;

public class SortUser extends Main {
    public void sortid() throws IOException, ClassNotFoundException {
        ois = new ObjectInputStream(new FileInputStream(file));
        al = (ArrayList<User>) ois.readObject();
        ois.close();

        if (file.isFile()) {

            al.sort(new Comparator<User>() {
                public int compare(User u1, User u2) {
                    return u1.Id - u2.Id;
                }
            });

            System.out.println("---------------------------------------------------------------------------------------");
            li = al.listIterator();
            while (li.hasNext())
                System.out.println((li.next()).toString());
            System.out.println("---------------------------------------------------------------------------------------");
        } else {
            System.out.println("File not Exists....!");
        }
    }

    public void sort_pno() {
        if (file.isFile()) {

            al.sort(new Comparator<User>() {
                public int compare(User u1, User u2) {
                    return u1.phNo.compareTo(u2.phNo);
                }
            });

            System.out.println("---------------------------------------------------------------------------------------");
            li = al.listIterator();
            while (li.hasNext())
                System.out.println((li.next()).toString());
            System.out.println("---------------------------------------------------------------------------------------");
        } else {
            System.out.println("File not Exists....!");
        }
    }

    public void sort_name() {
        if (file.isFile()) {

            al.sort(new Comparator<User>() {
                public int compare(User u1, User u2) {
                    return u1.name.compareTo(u2.name);
                }
            });

            System.out.println("---------------------------------------------------------------------------------------");
            li = al.listIterator();
            while (li.hasNext())
                System.out.println((li.next()).toString());
            System.out.println("---------------------------------------------------------------------------------------");
        } else {
            System.out.println("File not Exists....!");
        }
    }
}
