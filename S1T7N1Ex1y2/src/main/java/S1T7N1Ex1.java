import java.util.LinkedList;

public class S1T7N1Ex1 {


    public static void main(String[] args){


            LinkedList<Treballador> llistaTreballadors = new LinkedList<>();

            int horesT1 = 2;
            int horesT2 = 7;
            int horesT3 = 3;

            TreballadorOnline t1 = new TreballadorOnline("Freddy","Krüger",6666.66);
            TreballadorPresencial t2 = new TreballadorPresencial("Jason","Vorhees",1313.13);
            TreballadorPresencial t3 = new TreballadorPresencial("Jeff Burr","Leatherface",8787.87);

            llistaTreballadors.add(t1);
            llistaTreballadors.add(t2);
            llistaTreballadors.add(t3);



            t1.calcularSou(35.45d);//Métodos obsoletos
            t2.calcularSou(85.87d);//Métodos obsoletos
            t3.calcularSou((87874987897l));//metodos obsoletos
            t1.calcularSou(8789789788l); //metodos obsoletos


            for(Treballador t : llistaTreballadors){
                  t.calcularSou(horesT1);
                  t.calcularSou(horesT2);
                  t.calcularSou(horesT3);
            }

            for(Treballador x : llistaTreballadors){
                   System.out.println(x.toString());
            }



    }
}
