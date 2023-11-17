package mostenireierarhica;
public class Persoana {
    private String nume;
    private String prenume;

    public Persoana(){};

    public Persoana(String nume , String prenume){
        this.nume=nume;
        this.prenume=prenume;
    }
    //override
    public void Descriere(){
        System.out.println("introdu numele , prenumele");
    }

    //overloading
    public void id(String atribut1){
        System.out.println("Eu sunt : " + atribut1);
    }
    public void id(String atribut1, String atribut2){
        System.out.println("Eu sunt : " + atribut1 + " , " +  atribut2);
    }
    public void id(String atribut1, String atribut2, String atribut3){
        System.out.println("Eu sunt : " + atribut1 + " , " +  atribut2 + " , " +  atribut3);
    }
    public void id(String atribut1, String atribut2, String atribut3, String atribut4){
        System.out.println("Eu sunt : " + atribut1 + " , " +  atribut2 + " , " +  atribut3+ " , " +  atribut4);
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return "Persoana{" + '\n' +
                "nume = " + nume + '\n' +
                "prenume = " + prenume + '\n' +
                '}';
    }
}
