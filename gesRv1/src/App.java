import entities.Rv;
import services.RvService;

public class App {
    public static void main(String[] args) {
        RvService rvService = new RvService();
        RvVue rvVue = new RvVue();

        int choix;
        do {
            choix = rvVue.afficherMenu();
            switch (choix) {
                case 1:
                    Rv nouveauRv = rvVue.saisirRv();
                    rvService.ajouterRv(nouveauRv);
                    break;
                case 2:
                    rvVue.afficherListeRv(rvService.getListeRv());
                    break;
                case 3:
                    rvVue.afficherRvParEtat(rvService.getListeRv());
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        } while (choix != 4);
    }
}
