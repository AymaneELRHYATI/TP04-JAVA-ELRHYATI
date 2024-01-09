public class Vehicule {
    private static int matriculle = 0;
    private double prix;
    private int model;
    private double carburant;
    

    // Constructors
    public Vehicule () {};

    public Vehicule (int model){
        this.model=model;
        ++matriculle ; 
    }
    

    public int getmatriculle(){
        return matriculle ;
    } 

    public void setmatriculle(int matriculle){
         this.matriculle = matriculle ;
    }

    public double getprix(){
        return prix ;
    }

    public void setprix(double prix){
        this.prix = prix;
    }

    public int setmodel(){
        return model ;
    }
    public void setmodel(int model){
        this.model = model;
    }
    public double getCarburant() {
        return carburant;
    }

    public void setCarburant(double carburant) {
        this.carburant = carburant;
    }
    @Override
    public String toString() {
        return "Vehicule{" +
                "matriculle=" + matriculle +
                ", prix=" + prix +
                ", model=" + model +
                ", carburant=" + carburant +
                '}';
    }

}
