package market;

import jdk.swing.interop.SwingInterOpUtils;
import market.lib.MyLib;
import market.model.*;

import java.awt.*;
import java.util.Scanner;

public class MarketPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User[] listUsers = new User[1000];
        int comptadorUsers = 0;
        Provider[] listProviders = new Provider[1000];


        boolean buclePpal = true;
        while(buclePpal){
            MyLib.mostraMenuPpal();
            System.out.print("Opció: ");
            int opcio = sc.nextInt();
            sc.nextLine();
            switch (opcio){
                case 0:
                    System.out.println("Bye Bye!!!!");
                    buclePpal = false;
                    break;
                case 1:
                    System.out.println("Username: ");
                    String userName = sc.nextLine();
                    System.out.println("Password: ");
                    String pass = sc.nextLine();
                    System.out.println("Seller (S) or Buyer (B) ?");
                    String type = sc.nextLine();
                    if(type.equalsIgnoreCase("S")){
                        listUsers[comptadorUsers] = new Seller(userName,pass);
                        System.out.println("Usuari Venedor creat correctament");
                    }else{
                        System.out.print("Nom complert: ");
                        String fullName = sc.nextLine();
                        System.out.print("Mail: ");
                        String mail = sc.nextLine();
                        listUsers[comptadorUsers]  = new Buyer(userName,pass,fullName,mail);
                        System.out.print("Introdueix adreça complerta: ");
                        String fullAddress = sc.nextLine();
                        System.out.print("Identificador per l'adreça: ");
                        String refAddress = sc.nextLine();
                        Address a = new Address(refAddress,fullAddress);
                        listUsers[comptadorUsers].addAddressToUserList(a);
                      }
                    comptadorUsers++;



            }

        }



    }
}
