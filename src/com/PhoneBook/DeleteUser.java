package com.PhoneBook;

import java.util.*;
import java.io.*;

public class DeleteUser extends Main {
    public void Delete(File file) throws ClassNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<User>)ois.readObject();
            ois.close();

            DisplayUser.Display(file);

            boolean found = false;
            System.out.print("Enter user-id to Delete : ");
            int id = s.nextInt();
            System.out.println("-------------------------------------");
            li = al.listIterator();
            while(li.hasNext()){
                User u = li.next();
                if(u.Id == id){
                    li.remove();
                    found = true;
                }
            }
            if(found){
                try{
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(al);
                    oos.close();
                }catch(Exception e){
                    e.printStackTrace();
                }

                System.out.println("Record Deleted Successfully....!");
            }
            else{
                System.out.println("Record Not Found...!");
            }
            System.out.println("-------------------------------------");
        }else{
            System.out.println("File not Exists....!");
        }
    }
}

