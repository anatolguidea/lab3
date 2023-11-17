package mostenireierarhica;

public class Taran extends Persoana {
    private int campuri;
    public Taran(){}

    public Taran(String nume , String prenume , int campuri){
        super(nume , prenume );
        this.campuri=campuri;
    }

    @Override
    public void Descriere() {
        System.out.println("introdu numele , prenumele , numarul de campuri");
    }

    public int getCampuri() {
        return campuri;
    }

    public void setCampuri(int campuri) {
        this.campuri = campuri;
    }

    @Override
    public String toString() {
        return "Taran{" + '\n' +
                "nume = " + super.getNume() + '\n' +
                "prenume = " + super.getPrenume() + '\n' +
                "campuri=" + getCampuri() +
                '}';
    }
}
