package Unicap.Project.Grafos.distancia;

public class calculaDistancia {
	int[] distance;
    int[] ant;
    public calculaDistancia(int[] distance, int[] ant){
        this.distance = distance;
        this.ant = ant;
    }
    public int[] getAnt() {return ant;}
    public int[] getDistance() {return distance;}
}


