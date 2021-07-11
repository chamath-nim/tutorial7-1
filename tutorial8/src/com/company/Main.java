package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String reply,secondreply;
        do {
            System.out.println("Enter a player number");
            System.out.println("1. Dawid Malan");
            System.out.println("2. Aaron Finch");
            System.out.println("3. Babar Azam");
            System.out.println("4. Devon Conway");
            System.out.println("5. Virat Kohli");
            System.out.println("6. Lokesh Rahul");
            System.out.println("7. Glenn Maxwell");
            System.out.println("8. Rassie van der Dussen");
            System.out.println("9. Evin Lewis");
            System.out.println("10. Martin Guptill");
            System.out.print("Enter a player number : ");
            int optionnum = sc.nextInt();
            menu object = new menu(optionnum);
            do {
                System.out.println("Enter 1 to get batting average : ");
                System.out.println("Enter 2 to view details : ");
                System.out.println("Enter 3 to get best performance : ");
                int option = sc.nextInt();
                sc.nextLine();
                switch (option) {
                    case 1:
                        object.getbattingaverage();
                        break;
                    case 2:
                        object.viewplayerdetails();
                        break;
                    case 3:
                        object.getbestperformance();
                        break;
                }
                System.out.println("if you want to use a another method, enter 'c' : ");
                System.out.println("If you want another player's data, enter 'e'");
                secondreply = sc.nextLine();
            }while(!secondreply.equalsIgnoreCase("e"));
            System.out.println("If you want to continue, enter 'c' or if you want to exit, enter 'e'");
            reply = sc.nextLine();
        }while(!reply.equalsIgnoreCase("e"));
    }
}
