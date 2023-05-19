public class TreballadorOnline extends Treballador{

       private final double TARIFAPLANA = 18.57d;
    public TreballadorOnline(String nom,String cognom, double preuHora){
        super(nom,cognom,preuHora);
    }

    @Override
    public void calcularSou(int horesTreballades) {

        super.setSou(horesTreballades * super.getPreuHora() + TARIFAPLANA);
    }

    @Deprecated
    @SuppressWarnings("Depracated")
    public void calcularSou(double horesTreballades){
        super.setSou(horesTreballades * super.getPreuHora() +  TARIFAPLANA);
    }
    @Deprecated
    @SuppressWarnings("Depracated")
    public void calcularSou(long horesTreballades){
        super.setSou(horesTreballades * super.getPreuHora() +  TARIFAPLANA);
    }


    public String toString(){
        return "El sou de " + super.getNom() + " " + super.getCognom()+ " es de :" + getSou() + " Euros al mes/Servicio";
    }
}

