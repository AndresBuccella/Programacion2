package empresa_agricola;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Cultivo cult = new Cultivo("Palmera");
		Enfermedad enf1 = new Enfermedad("Sarasa");
		enf1.addSintoma("ronquidos");
		enf1.addSintoma("apnea");
		enf1.addSintoma("ojota");
		cult.addEnfermedad(enf1);
		
		ProdQuim prod = new ProdQuim("bala");
		prod.addSintomaQueTrato("ronquidos");
		prod.addSintomaQueTrato("apnea");
		prod.addSintomaQueTrato("ojota");
		
		EmpresaAgricola a = new EmpresaAgricola();
		a.addCultivo(cult);
		a.addProductoQuimico(prod);
		ArrayList<ProdQuim> s = a.prodTratanEnf(enf1);
		
		for(ProdQuim producto : s) {
			System.out.println(producto);
		}
	}

}
