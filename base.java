public class formulaire {
    private String nom;
    private String date;

    public String getNom() {
        return nom;
    }
    public String getDate() {
        return date;
    }
}

public class formulaire_dentiste extends formulaire {
    private String nom_dentiste;
    public String getNomD() {
        return nom_dentiste;
    }
}

public static void main(String[] args) {
    formulaire f, f2, f3;
    formulaire_dentiste fd;
    String nom = f.getNom();
    String nompatient = fd.getNom();
    String nomdentiste = fd.getNomD();
}