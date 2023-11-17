package mostenireierarhica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("alege ce vrei sa fii : ");
        System.out.println("Persoana , Taran , Angajat , Primar");
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        Persoana persoana = new Persoana();
        Taran taran = new Taran();
        Angajat angajat = new Angajat();
        Primar primar = new Primar();
        switch (s) {
            case "Persoana":
                persoana.id("persoana");
                persoana.Descriere();
                String name = scn.next();
                persoana.setNume(name);
                String prenume = scn.next();
                persoana.setPrenume(prenume);
                System.out.println(persoana);
                break;
            case "Taran":
                persoana.id("persoana" ,"taran");
                taran.Descriere();
                name = scn.next();
                taran.setNume(name);
                prenume = scn.next();
                taran.setPrenume(prenume);
                int campuri = scn.nextInt();
                taran.setCampuri(campuri);
                System.out.println(taran);
                break;
            case "Angajat":
                persoana.id("persoana" , "taran" , "angajat");
                angajat.Descriere();
                name = scn.next();
                angajat.setNume(name);
                prenume = scn.next();
                angajat.setPrenume(prenume);
                campuri = scn.nextInt();
                angajat.setCampuri(campuri);
                String specializare = scn.next();
                angajat.setSpecializare(specializare);
                System.out.println(angajat);
                break;
            case "Primar":
                persoana.id("persoana", "taran", "angajat", "primar");
                primar.Descriere();
                name = scn.next();
                primar.setNume(name);
                prenume = scn.next();
                primar.setPrenume(prenume);
                campuri = scn.nextInt();
                primar.setCampuri(campuri);
                specializare = scn.next();
                primar.setSpecializare(specializare);
                String mandat = scn.next();
                primar.setMandat(mandat);
                System.out.println(primar);
                break;

        }
    }
}
