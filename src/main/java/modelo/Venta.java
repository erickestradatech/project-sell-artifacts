package modelo;

public class Venta {

    private int nro_pro;
    private String cli_cod;
    private String art_cod;
    private int meses;

    public int getNro_pro() {
        return nro_pro;
    }

    public void setNro_pro(int nro_pro) {
        this.nro_pro = nro_pro;
    }

    public String getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(String cli_cod) {
        this.cli_cod = cli_cod;
    }

    public String getArt_cod() {
        return art_cod;
    }

    public void setArt_cod(String art_cod) {
        this.art_cod = art_cod;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
}
