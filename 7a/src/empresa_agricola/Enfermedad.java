package empresa_agricola;

import empresa_agricola.ProdQuim;

import java.util.ArrayList;

public class Enfermedad {
	
	private String nombre;
	private ArrayList<String> sintomas;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.sintomas = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void addSintoma(String sintoma) {
		if(!this.sintomas.contains(sintoma)) {
			this.sintomas.add(sintoma);			
		}
	}

	public boolean meMata(ProdQuim quimico) {
		int sintomasTratados = 0;
		for(int i = 0; i<this.sintomas.size();i++) {
			if(quimico.tratoSintoma(this.sintomas.get(i))) {
				sintomasTratados++;
			}
		}
		return sintomasTratados == this.sintomas.size();
	}

	public String toString() {
		return this.getNombre();
	}
}
