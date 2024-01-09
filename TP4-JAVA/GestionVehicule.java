import java.io.*;

public class GestionVehicule {

    public static void main(String[] args) throws IOException {

        // Déclaration
        Voiture v1 = Voiture.creeVoiture(2012, Carburant.DIESEL);
        Voiture v2 = Voiture.creeVoiture(2013, Carburant.GAZ);
        Voiture v3 = Voiture.creeVoiture(2019, Carburant.ESSENCE);

        Camion c1 = Camion.creeCamion(2012, Carburant.DIESEL);
        Camion c2 = Camion.creeCamion(2013, Carburant.GAZ);
        Camion c3 = Camion.creeCamion(2019, Carburant.ESSENCE);

        v1.replieLeToit();

        // Affichafe du matricule
        System.out.println("Matriculle de v1 : " + v1.getmatriculle());
        System.out.println("Matriculle de v2 : " + v2.getmatriculle());
        System.out.println("Matriculle de v3 : " + v3.getmatriculle());

        System.out.println("Matriculle de c1 : " + c1.getmatriculle());
        System.out.println("Matriculle de c2 : " + c2.getmatriculle());
        System.out.println("Matriculle de c3 : " + c3.getmatriculle());

        // Ajouter le catburant
        v1.addCarburant(20) ;
        v2.addCarburant(26) ;
        v3.addCarburant(25) ;

        c1.addCarburant(20) ;
        c2.addCarburant(26) ;
        c3.addCarburant(25) ;

        // Sérialisation
        FileOutputStream f1 = new FileOutputStream("garage");
        ObjectOutputStream O = new ObjectOutputStream(f1);

        O.writeObject(v1);
        O.writeObject(v2);
        O.writeObject(v3);

        O.writeObject(c1);
        O.writeObject(c2);
        O.writeObject(c3);

        // Affichage
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        // JVM: Portabilité et sécurité

        O.close();
        f1.close();

    }

}

/* Pour la désérialisation (Qui sera fait dans une autre machine où on a envoyé les données)
*
* FileInputStream f2 = new FileInputStream("garage");
* ObjectInputStream O2 = new ObjectInputStream(f2);
*
* V1 = (Voiture)O2.readObject();
* V2 = (Voiture)O2.readObject();
*
* f2.close();
* O2.close();
*
*  */

