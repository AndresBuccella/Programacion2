package CompaniaDeEnvios;

public abstract class EnvioAbstracto {

    private int numeroTracking;
    private String ciudadDestino;

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setNumeroTracking(int numTrack){
        this.numeroTracking = numTrack;
    }
    public int getNumeroTracking(){
        return this.numeroTracking;
    }

    public abstract Double getPeso();
    public abstract String getDestinatario();
    public abstract String getRemitente();
}
