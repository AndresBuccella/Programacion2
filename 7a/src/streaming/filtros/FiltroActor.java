package streaming.filtros;

import streaming.Pelicula;

public class FiltroActor extends Filtro{
    private String actor;
    public FiltroActor(String actor) { this.actor = actor; }
    public boolean cumple(Pelicula p){
        return p.containsActor(this.actor);
    }
    public String getActor(){
        return this.actor;
    }

    public boolean equals(Object o){
        FiltroActor f = (FiltroActor) o;
        return this.actor.equals(f.actor);
    }
}
