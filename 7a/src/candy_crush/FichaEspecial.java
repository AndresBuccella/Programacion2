package candy_crush;

public class FichaEspecial extends Ficha{

    public FichaEspecial(String nombre, int fortaleza, int espacio){
        super(nombre, fortaleza, espacio, 0);
        this.setPoderDeDestruccion(this.getPoderDeDestruccion());
    }

    @Override
    public int getPoderDeDestruccion(){
        return (int) this.getFortaleza() / this.getEspacio();
    }
}
