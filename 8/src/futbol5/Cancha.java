package futbol5;

public class Cancha {
    private int idCancha;
    private Double precioCancha;
    private String tipoCancha;

    public Cancha(int idCancha, Double precioCancha, String tipoCancha) {
        this.idCancha = idCancha;
        this.precioCancha = precioCancha;
        this.tipoCancha = tipoCancha;
    }

    public int getIdCancha() {
        return idCancha;
    }
    public void setIdCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    public Double getPrecioCancha() {
        return precioCancha;
    }
    public void setPrecioCancha(Double precioCancha) {
        this.precioCancha = precioCancha;
    }

    public String getTipoCancha() {
        return tipoCancha;
    }
    public void setTipoCancha(String tipoCancha) {
        this.tipoCancha = tipoCancha;
    }
}
