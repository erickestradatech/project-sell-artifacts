package modelo;

public class Cliente {

    private String cli_cod;
    private String cli_nom;
    private double cli_tel;
    private double cli_ruc;
    private String cli_dir;

    public String getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(String cli_cod) {
        this.cli_cod = cli_cod;
    }

    public String getCli_nom() {
        return cli_nom;
    }

    public void setCli_nom(String cli_nom) {
        this.cli_nom = cli_nom;
    }

    public double getCli_tel() {
        return cli_tel;
    }

    public void setCli_tel(double cli_tel) {
        this.cli_tel = cli_tel;
    }

    public double getCli_ruc() {
        return cli_ruc;
    }

    public void setCli_ruc(double cli_ruc) {
        this.cli_ruc = cli_ruc;
    }

    public String getCli_dir() {
        return cli_dir;
    }

    public void setCli_dir(String cli_dir) {
        this.cli_dir = cli_dir;
    }
}
