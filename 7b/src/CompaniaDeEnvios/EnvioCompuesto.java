package CompaniaDeEnvios;

import java.util.ArrayList;

public class EnvioCompuesto  extends EnvioAbstracto{

    private ArrayList<EnvioAbstracto> envios;

    public EnvioCompuesto() {
        envios = new ArrayList<EnvioAbstracto>();
    }

    public void addEnvio(EnvioAbstracto e) {
        if(!envios.isEmpty()){
            if (envios.contains(e) || !this.getCiudadDestino().equals(e.getCiudadDestino())) {
                return;
            }
            e.setNumeroTracking(this.getNumeroTracking());
        }else {
            this.setNumeroTracking(e.getNumeroTracking());
        }
        envios.add(e);
    }

    @Override
    public void setNumeroTracking(int numTrack) {
        super.setNumeroTracking(numTrack);
        for (EnvioAbstracto e : envios) {
            e.setNumeroTracking(numTrack);
        }
    }

    public Double getPeso(){
        Double result = 0.0;
        for (EnvioAbstracto e : envios) {
            result += e.getPeso();
        }
        return result;
    }

    public String getRemitente(){
        if (!this.envios.isEmpty())
            return this.envios.get(0).getRemitente();
        return "";
    }

    public String getDestinatario(){
        if (!this.envios.isEmpty())
            return this.envios.get(0).getDestinatario();
        return "";
    }

    @Override
    public String toString() {
        return "\n[Comp]: " + "Peso total: " + this.getPeso() + this.envios.toString() + "\n";
    }

    public static void main(String[] args) {
        EnvioCompuesto ec3 = new EnvioCompuesto();
        ec3.setCiudadDestino("Tandil");
        EnvioCompuesto ec1 = new EnvioCompuesto();
        ec1.setCiudadDestino("Tandil");
        EnvioCompuesto ec2 = new EnvioCompuesto();
        ec2.setCiudadDestino("Tandil");
        EnvioSimple es1 = new EnvioSimple("Andres", "Pablo", 10.0);
        es1.setNumeroTracking(12);
        es1.setCiudadDestino("Tandil");
        EnvioSimple es2 = new EnvioSimple("Andres2", "Pablo2", 10.0);
        es2.setNumeroTracking(13);
        es2.setCiudadDestino("Tandil");
        EnvioSimple es3 = new EnvioSimple("Andres3", "Pablo3", 10.0);
        es3.setNumeroTracking(14);
        es3.setCiudadDestino("Tandil");
        EnvioSimple es4 = new EnvioSimple("Marcos", "Esteban", 10.0);
        es4.setNumeroTracking(15);
        es4.setCiudadDestino("Tandil");
        EnvioSimple es5 = new EnvioSimple("Marcos2", "Esteban2", 10.0);
        es5.setNumeroTracking(16);
        es5.setCiudadDestino("Tandil");
        EnvioSimple es6 = new EnvioSimple("Marcos3", "Esteban3", 10.0);
        es6.setNumeroTracking(17);
        es6.setCiudadDestino("Olavarria");
        ec3.addEnvio(ec1);
        ec3.addEnvio(ec2);
        ec3.addEnvio(ec2);
        ec1.addEnvio(es1);
        ec1.addEnvio(es2);
        ec1.addEnvio(es3);
        ec2.addEnvio(es4);
        ec2.addEnvio(es4);
        ec2.addEnvio(es5);
        ec2.addEnvio(es6);
        System.out.println(ec3);
    }
}
