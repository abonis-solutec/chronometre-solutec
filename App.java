public class App {
    public static void main(String[] args) {
        formulaire_dentiste fd = new formulaire_dentiste();
        fd.setNom("Le patient");
        String nompatient = fd.getNom();
        fd.setNomD("Marcel");
        String nomdentiste = fd.getNomD();
        System.out.println("\nNom du dentiste : " + nomdentiste);
        System.out.println("Nom du patient : " + nompatient);
    }
}