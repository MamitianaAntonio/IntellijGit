package Entities;

public class Sirop extends Medicaments{
    public Sirop(String medicament, double price) {
        super(medicament, price);
    }
    @Override
    public void AfficherDetails(){
        super.AfficherDetails();
        System.out.println("Type : Sirop");
        System.out.println("Recommandation: Bien agiter avant de boire");
    }
}
