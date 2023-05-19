

public class TreballadorPresencial extends Treballador{

       private static double benzina = 40d;

    public TreballadorPresencial(String nom,String cognom, double preuHora){
        super(nom,cognom,preuHora);
    }


    @Override
    public void calcularSou(int horesTreballades) {

        super.setSou(horesTreballades * super.getPreuHora() +  benzina);
 }

    @Deprecated
    @SuppressWarnings("Depracated")
    public void calcularSou(double horesTreballades){
        super.setSou(horesTreballades * super.getPreuHora() +  benzina);
    }
    @Deprecated
    @SuppressWarnings("Depracated")
    public void calcularSou(long horesTreballades){
        super.setSou(horesTreballades * super.getPreuHora() +  benzina);
    }


    public String toString(){
        return "El sou de " + super.getNom() + " " + super.getCognom() + " es de :" + super.getSou() + " Euros al mes/Servicio";
    }
    }




