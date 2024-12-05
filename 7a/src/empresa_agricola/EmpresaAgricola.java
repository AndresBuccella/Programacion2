package empresa_agricola;

import java.util.ArrayList;

public class EmpresaAgricola {

	private ArrayList<ProdQuim> productosQuimicos;
	private ArrayList<Cultivo> cultivos;
	
	public EmpresaAgricola() {
		this.productosQuimicos = new ArrayList<>();
		this.cultivos = new ArrayList<>();
	}
	

	public void addProductoQuimico(ProdQuim prod) {
		if(!this.productosQuimicos.contains(prod)) {
			this.productosQuimicos.add(prod);
		}
	}
	public void addCultivo(Cultivo cultivo) {
		if(!this.cultivos.contains(cultivo)) {
			this.cultivos.add(cultivo);
		}
	}
	
	public ArrayList<ProdQuim> prodTratanEnf(Enfermedad enf){
		ArrayList<ProdQuim> aux = new ArrayList<>();
		
		for(ProdQuim producto : this.productosQuimicos) {
			if(enf.meMata(producto)) {
				aux.add(producto);
			}
		}
		
		return aux;
	}
	
	public ArrayList<ProdQuim> getListaProdQuimQSoluc(Enfermedad enf, Cultivo cult){
		ArrayList<ProdQuim> aux = new ArrayList<>();
		
		for(ProdQuim producto : this.productosQuimicos) {
			if((!producto.prohibidoEn(cult)) && (cult.meSirve(producto))) {
				aux.add(producto);
			}
		}
		return aux;
	}
}
