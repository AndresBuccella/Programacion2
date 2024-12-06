package empresa_agricola;

import java.util.ArrayList;

public class ProdQuim {
	
	private String nombre;
	private ArrayList<Cultivo> noUsarEn;
	private ArrayList<String> sintomasQueTrato;
	
	public ProdQuim(String nombre) {
		this.nombre = nombre;
		this.noUsarEn = new ArrayList<>();
		this.sintomasQueTrato = new ArrayList<>();
	}

	public boolean tratoSintoma(String sintoma) {
		return (sintomasQueTrato.contains(sintoma));
	}
	
	public void addSintomaQueTrato(String sintoma) {
		if(!this.sintomasQueTrato.contains(sintoma)) {
			this.sintomasQueTrato.add(sintoma);			
		}
	}
	
	public boolean prohibidoEn(Cultivo cult) {
		return this.noUsarEn.contains(cult);
	}
	
	public void addPlantaProhibida(Cultivo cult) {
		if(!this.noUsarEn.contains(cult)) {
			this.noUsarEn.add(cult);			
		}
	}
	
	public String toString() {
		return this.getNombre();
	}

	public String getNombre() {
		return nombre;
	}

	public ProdQuim esEfectivo(){
		return null;
	}
}
