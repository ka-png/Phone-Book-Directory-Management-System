package com.PhoneBook;
import java.io.*;
import java.util.*;

class User implements Serializable {
    int Id;
    String name;
    String phNo;
    String city;
    String country;
    String group;

    User(int Id, String name, String phNo, String city, String country,String group){
        this.Id = Id;
        this.name = name;
        this.phNo = phNo;
        this.city = city;
        this.country = country;
        this.group=group;
    }
    public String toString(){
        return (" " +(Id) + "," + (name) + "," + (phNo) + "," + (city) + "," + (country)+ "," + (group));
    }
}

public class Main extends DisplayUser{
    public static ArrayList<User> al = new ArrayList<>();
    public static File file = new File("Data.txt");
    public static ObjectOutputStream oos;
    public static ObjectInputStream ois;
    public static ListIterator<User> li;
    public static void main(String[] args) throws Exception{
        int choice;
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        // ois will read the data of file and store all characters one by one.
        // al will store the all records in arraylist by reading ois
        if(file.isFile()){
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<User>)ois.readObject();
            ois.close();
        }
        do{
            DisplayMainScreen();
            System.out.print("Enter Your Choice : ");
            choice = s.nextInt();
            System.out.println("    ");

            switch(choice){
                case 1:
                    AddUser au = new AddUser();
                    au.Add(al);
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(al);
                    oos.close();
                    break;
                case 2:
                    Display(file);
                    break;
                case 3:
                    SearchUser.Search(file);
                    break;
                case 4:
                    DeleteUser del_u = new DeleteUser();
                    del_u.Delete(file);
                    break;
                case 5:
                    UpdateUser uu = new UpdateUser();
                    uu.Update(file);
                    break;
                case 7:
                    AddGroup a_group = new AddGroup();
                    a_group.add(file);
                    break;
                case 6:
                    do {
                        DisplaySortMenu();
                        System.out.print("Enter Your Choice : ");
                        choice = s.nextInt();

                        switch(choice) {
                            case 1:
                                SortUser si = new SortUser();
                                si.sortid();
                                choice=0;
                                break;
                            case 2:
                                SortUser s_pno = new SortUser();
                                s_pno.sort_pno();
                                choice=0;
                                break;
                            case 3:
                                SortUser s_name = new SortUser();
                                s_name.sort_name();
                                choice=0;
                                break;
                        }
                    }while(choice!=0);
                    choice=1;
            }
        }while(choice!=0);
        s.close();
        s1.close();
    }
}