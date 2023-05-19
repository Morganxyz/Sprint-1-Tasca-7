
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MiAnot_Main {


    public static void main(String[] args) {

        serializacionJson();
    }


    @MiAnot(ruta = "sicars.json")
    public static void serializacionJson() {

            Sicar[]  llistaSicar = new Sicar [5];


            llistaSicar[0] = new Sicar("Krüger", 95);
            llistaSicar[1] = new Sicar("Jason", 89);
            llistaSicar[2] = new Sicar("LeatherFace", 82);
            llistaSicar[3] = new Sicar("Pennywise", 92);
            llistaSicar[4] = new Sicar("Jack", 87);

            try {
                ObjectOutputStream pathSortida = new ObjectOutputStream(new FileOutputStream("sicars.json"));
                pathSortida.writeObject(llistaSicar);
                pathSortida.close();

                ObjectInputStream pathEntrada = new ObjectInputStream(new FileInputStream( "sicars.json"));
                Sicar [] sicars = (Sicar[]) pathEntrada.readObject();
                pathEntrada.close();

                for(Sicar s : sicars){
                    System.out.println(s);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }


