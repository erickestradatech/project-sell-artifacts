package modelo;

public class Artefactos_Clientes_Venta {

    private int nro_pro;
    private String cli_nom;
    private String art_nom;
    private double art_pre;
    private int meses;
    private double interes;

    private double cuota;

    public String calculaInteres() {

        if (meses == 6) {

            interes = 0.15;
        } else if (meses == 12) {

            interes = 0.25;
        } else {

            interes = 0.40;
        }
        return interes * 100 + "%";
    }

    public double calculaSaldo() {

        return art_pre * meses;

    }

    public double calculaCuota() {

        if (meses == 6) {

            cuota = (art_pre / meses) * 0.15;

        } else if (meses == 12) {

            cuota = (art_pre / meses) * 0.25;
        } else {

            cuota = (art_pre / meses) * 0.40;
        }

        return cuota;
    }

    public int getNro_pro() {
        return nro_pro;
    }

    public void setNro_pro(int nro_pro) {
        this.nro_pro = nro_pro;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public String getCli_nom() {
        return cli_nom;
    }

    public void setCli_nom(String cli_nom) {
        this.cli_nom = cli_nom;
    }

    public String getArt_nom() {
        return art_nom;
    }

    public void setArt_nom(String art_nom) {
        this.art_nom = art_nom;
    }

    public double getArt_pre() {
        return art_pre;
    }

    public void setArt_pre(double art_pre) {
        this.art_pre = art_pre;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

}
