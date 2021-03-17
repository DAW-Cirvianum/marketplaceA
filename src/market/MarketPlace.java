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
        int comptadorProviders=0;







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
                    System.out.println("Seller (S) or Buyer (B) Provider (P) ?");
                    String type = sc.nextLine();
                    if(type.equalsIgnoreCase("S")){
                        listUsers[comptadorUsers] = new Seller(userName,pass);
                        System.out.println("Usuari Venedor creat correctament");
                        //assignar a un Provider
                        if(comptadorProviders>0){
                            MyLib.mostraProviders(listProviders,comptadorProviders);
                            System.out.print("Provider: ");
                            int fila = sc.nextInt()-1;
                            sc.nextLine();
                            listUsers[comptadorUsers].setProvider(listProviders[fila]);
                            comptadorUsers++;
                        }else{
                            System.out.println("No es pot assignar provider ja que no n'hi ha cap.");
                        }




                    }else if (type.equalsIgnoreCase("b")){
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
                        listUsers[comptadorUsers++].addAddressToUserList(a);

                      }else if(type.equalsIgnoreCase("p")){
                        System.out.print("ID Fiscal: ");
                        String idProvider = sc.nextLine();
                        System.out.println("Nom :");
                        String nomProvider = sc.nextLine();
                        System.out.println("Adreça fiscal: ");
                        String addressProvider = sc.nextLine();
                        listProviders[comptadorProviders++] = new Provider(idProvider,nomProvider, new Address(addressProvider));



                    }

                    break;

                case 2:

                    //login

                    break;





            }

        }



    }
}
