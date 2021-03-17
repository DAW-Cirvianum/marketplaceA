package market.lib;

import market.model.Provider;

public class MyLib {

    public static void mostraMenuPpal(){
        System.out.println("Menú Ppal");
        System.out.println("0 - Sortir");
        System.out.println("1 - Registre");
        System.out.println("2 - LogIn");
    }


    public static void mostraProviders(Provider[] listProviders, int comptadorProviders) {
        for(int i=0; i<comptadorProviders; i++){
            System.out.println((i+1)+" - "+listProviders[i].getName());
        }
    }
}
