package CompaniaDeEnvios;

public class EnvioSimple extends EnvioAbstracto{

    private String remitente;
    private String destinatario;
    private Double peso;

    public EnvioSimple(String remitente, String destinatario, Double peso){
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public void setRemitente(String remitente){
        this.remitente = remitente;
    }

    public String getRemitente(){
        return this.remitente;
    }

    public Double getPeso(){
        return this.peso;
    }

    public void setPeso(Double peso){
        this.peso = peso;
    }

    public String getDestinatario(){
        return this.destinatario;
    }
    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;
    }

    public String toString(){
        return  "\n" +
                "Origen: " + this.getRemitente() +
                ", Destino: " + this.getDestinatario() +
                ", NumeroTracking: " + this.getNumeroTracking() +
                ", Peso: " + this.getPeso();
    }
}
