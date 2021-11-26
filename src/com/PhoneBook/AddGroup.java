package com.PhoneBook;

import java.io.*;
import java.util.*;

public class AddGroup extends Main{
    Scanner s = new Scanner(System.in);
    static int g_family=0;
    static int g_friend=0;
    static int g_work=0;
    static int g_other=0;
    static int g_nogroup=0;
    public void add(File file) throws ClassNotFoundException, IOException{
        if (file.isFile()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ArrayList<User> al = (ArrayList<User>) ois.readObject();
            ois.close();
            int n_family=0;
            int n_friend=0;
            int n_work=0;
            int n_other=0;
            int n_nogroup=0;
            for (User u : al) {
                if (u.group.equals("family") ) {
                    n_family++;
                }
                if (u.group.equals("friend") ) {
                    n_friend++;
                }
                if (u.group.equals("work") ) {
                    n_work++;
                }
                if (u.group.equals("others") ) {
                    n_other++;
                }
                if (u.group.equals("nogroup") ) {
                    n_nogroup++;
                }
            }
            g_family = n_family;
            g_friend = n_friend;
            g_nogroup = n_nogroup;
            g_other = n_other;
            g_work = n_work;
            DisplayUser.Groups();
            System.out.println("select the group");
            String find = s.nextLine();

            if (file.isFile()) {



                System.out.println("-------------------------------------");
                for(User u : al)
                    //while (li.hasNext())
                    if(u.group.equals(find))
                    {
                        //System.out.println("bss");
                        System.out.println((u.name).toString());
                    }

                System.out.println("-------------------------------------");
            } else {
                System.out.println("File not Exists....!");
            }
        }






    }
}
