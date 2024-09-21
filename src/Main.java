import Entities.Creme;
import Entities.Gelule;
import Entities.Medicaments;
import Entities.Sirop;

public class Main {
    public static void main(String[]args) {
        //Medicament selectionnée par l'utilisateur sans la méthode Scanner
        String typeMedicament = "Gelule" ;

        Medicaments medicaments;
        //choix de medicaments
        switch (typeMedicament) {
            case "Gelule" :
                medicaments = new Gelule("Gelule naturelle" , 5000);
                break;
            case "Sirop" :
                medicaments = new Sirop("Sirop naturelle" , 7000);
                break;
            case "Creme" :
                medicaments = new Creme("Creme naturelle" , 4000);
                break;
            default:
                System.out.println("Medicaments inconnus");
                return;
        }

        //affichage
        medicaments.AfficherDetails();
    }
}