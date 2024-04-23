import entities.Rv;
import java.util.List;
import java.util.Scanner;

public class RvVue {
    private Scanner scanner = new Scanner(System.in);

    public int afficherMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Ajouter un rendez-vous");
        System.out.println("2. Afficher la liste des rendez-vous");
        System.out.println("3. Afficher les rendez-vous par état");
        System.out.println("4. Quitter");
        System.out.print("Votre choix : ");
        return scanner.nextInt();
    }

    public Rv saisirRv() {
        Rv rv = new Rv();
        System.out.print("Entrez l'ID du rendez-vous : ");
        rv.setId(scanner.next());
        // Saisie des autres attributs du rendez-vous (date, heure, spécialité, état)
        return rv;
    }

    public void afficherListeRv(List<Rv> listeRv) {
        System.out.println("=== Liste des rendez-vous ===");
        for (Rv rv : listeRv) {
            System.out.println(rv);
        }
    }

    public void afficherRvParEtat(List<Rv> listeRv) {
        // Afficher les rendez-vous selon leur état
    }
}
