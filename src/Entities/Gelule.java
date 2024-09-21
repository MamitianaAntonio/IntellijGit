package Entities;

public class Gelule extends Medicaments{
    public Gelule(String medicament, double price) {
        super(medicament, price);
    }
    @Override
    public void AfficherDetails(){
        super.AfficherDetails();
        System.out.println("Type : Gelule");
        System.out.println("Recommandation: Prendre avec un grand verre d'eau.");
    }
}
