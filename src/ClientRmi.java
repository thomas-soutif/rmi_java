import Interfaces.AnnuaireInterface;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClientRmi {


    public static void main(String[] args) {

        try {


            String adrServeur = "10.203.9.88";
            Registry registre = LocateRegistry.getRegistry(adrServeur);
            Interfaces.AnnuaireInterface stub = (AnnuaireInterface) registre.lookup("annuaire");
            Scanner sc = new Scanner(System.in);
            String user;
            while(true){

            user = sc.nextLine();
            System.out.println(stub.getEmail(user) + stub.getPhoneNumber(user));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
