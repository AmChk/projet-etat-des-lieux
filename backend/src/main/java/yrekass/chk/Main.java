package yrekass.chk;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Client client = new ClientBuilder()
                .nom("Chakib")
                .prenom("Amine")
                .phone("0741251214")
                .email("amine.chakib@gmail.com")
                .build();
        Responsable responsable = new ResponsableBuilder()
                .nom("Rekass")
                .prenom("Younes")
                .phone("0641251242")
                .email("yrekass@gmail.com")
                .build();
        Bien bien = new BienBuilder()
                .type("Appartement")
                .surface(50)
                .pieces(new ArrayList<>())
                .cp_eaux_av(25032)
                .cp_eaux_ap(29362)
                .cp_el_av(632514)
                .cp_el_ap(693325)
                //.client(client)
                .responsable(responsable)
                .build();

        System.out.println(bien.getType());
        System.out.println(client.getPrenom());
        //System.out.println("Client: " + bien.getClient().get().getNom());
        System.out.println("Client: " + bien.getClient().map(Client::getNom).orElse(null));
        System.out.println("Résponsable: " + bien.getResponsable().getNom());
    }
}