package empresa_agricola;

import java.util.ArrayList;

public class Cultivo {

	private String nombre;
	private ArrayList<Enfermedad> enfermedadesFrecuentes;
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermedadesFrecuentes = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void addEnfermedad(Enfermedad enf) {
		if (!this.enfermedadesFrecuentes.contains(enf)) {
			this.enfermedadesFrecuentes.add(enf);			
		}
	}
	
	public boolean meSirve(ProdQuim quimico) {
		if (!quimico.prohibidoEn(this)) {
			for(int i = 0; i<this.enfermedadesFrecuentes.size(); i++) {
				if (this.enfermedadesFrecuentes.get(i).meMata(quimico)) {
					return true;
				}
			}			
		}
		return false;
	}
	
	public boolean equals(Object o) {
		try {
			Cultivo otroCult = (Cultivo) o;
			return (this.getNombre().equals(otroCult.getNombre()));
		}catch(Exception e) {
			return false;
		}
	}
}
