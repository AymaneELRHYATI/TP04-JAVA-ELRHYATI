import java.io.*;

public class Parc {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f2 = new FileInputStream("garage1");
        ObjectInputStream O2 = new ObjectInputStream(f2);

        Voiture V1 = (Voiture)O2.readObject();
        Voiture V2 = (Voiture)O2.readObject();
        Voiture V3 = (Voiture)O2.readObject();

        Camion C1 = (Camion)O2.readObject();
        Camion C2 = (Camion)O2.readObject();
        Camion C3 = (Camion)O2.readObject();

       

        System.out.println(V1.toString());
        System.out.println(V2.toString());
        System.out.println(V3.toString());

        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(C3.toString());

        
        f2.close();
        O2.close();
        
    }

}
