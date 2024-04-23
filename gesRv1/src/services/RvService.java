package services;

import entities.Rv;
import java.util.ArrayList;
import java.util.List;

public class RvService {
    private List<Rv> listeRv;

    public RvService() {
        this.listeRv = new ArrayList<>();
    }

    public void ajouterRv(Rv rv) {
        listeRv.add(rv);
    }

    public List<Rv> getListeRv() {
        return listeRv;
    }
}
