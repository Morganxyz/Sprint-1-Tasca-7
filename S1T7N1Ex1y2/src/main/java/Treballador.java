public abstract class Treballador {

            private String nom;
            private String cognom;
            private double preuHora;

            private double sou;


            public Treballador(String nom,String cognom,double preuHora){
                this.nom = nom;
                this.cognom =  cognom;
                this.preuHora = preuHora;
            }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return this.cognom;
    }

    public double getSou(){
         return this.sou;
    }
    public void setSou(double sou){
                this.sou = sou;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }


    public double getPreuHora() {
        return this.preuHora;
    }

    public void setPreuHora(double preuHora) {
        this.preuHora = preuHora;
    }

        public abstract void calcularSou(int horesTreballades);

    public String toString(){
        return "El sou de " + this.nom + " " + this.cognom + " es de :" + this.sou + " Euros al mes/Servicio";
    }

}

