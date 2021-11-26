package com.PhoneBook;

import java.util.*;
import java.io.*;

public class SearchUser extends Main{
    static Scanner s = new Scanner(System.in);
    public static void Search(File file) throws IOException, ClassNotFoundException {
        if (file.isFile()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<User> al = (ArrayList<User>) ois.readObject();
            ois.close();
            boolean found = false;
            System.out.println("Enter contact name to Search : ");
            String name = s.nextLine();
            name = name.toLowerCase();
            System.out.println("-------------------------------------");
            for (User u : al) {
                if (u.name.toLowerCase().contains((name))){
                    System.out.println(u);
                    found = true;
                }
            }
            if (!found)
                System.out.println("Record Not Found...!");
            System.out.println("-------------------------------------");
        } else {
            System.out.println("File not Exists....!");
        }
    }

//    public static void SearchForDelete(File file, ArrayList<User> al, int id) throws IOException {
//        boolean found = false;
//        ListIterator<User> li = al.listIterator();
//        while (li.hasNext()) {
//            User u = li.next();
//            if (u.Id == id) {
//                li.remove();
//                found = true;
//            }
//        }
//        if(found) {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
//            oos.writeObject(al);
//            oos.close();
//            System.out.println("Record Deleted Successfully....!");
//        }else{
//            System.out.println("Record Not Found...!");
//        }
//        System.out.println("-------------------------------------");
//    }

    public static int SearchForUpdate(ArrayList<User> al, String name){
        ArrayList<Integer> availableIds = new ArrayList<>();
        for (User u : al) {
            if (u.name.toLowerCase().contains(name.toLowerCase())) {
                availableIds.add(u.Id);
            }
        }

        if (availableIds.size() == 1) {
            return availableIds.get(0);
        } else {
            System.out.println(availableIds);
            System.out.println("Which " + name.toUpperCase() + " you want to update ?");
            return s.nextInt();
        }
    }

    public static int check(String group) throws Exception{
        List<String> list=new ArrayList<String>();
        list.add("family");
        list.add("friend");
        list.add("work");
        list.add("others");
        list.add("nogroup");
        if(list.contains(group))
        {

            return 1;
        }
        else
        {

            return 0;
        }

    }

    public static void check(int id) throws Exception{
        if (file.isFile()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<User> al = (ArrayList<User>) ois.readObject();
            ois.close();

            if (file.isFile()) {





                for(User u : al)
                    //while (li.hasNext())
                    if(u.Id==id)
                    {
                        //System.out.println("bss");
                        System.out.println("Id already Exists...");
                        DisplayUser.Display(file);
                        Main.main(null);
                    }


            } else {
                System.out.println("File not Exists....!");

            }            }        }      }
