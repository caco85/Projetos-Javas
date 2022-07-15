package Unicap.Project.Grafos.Model;

public class Adjacente {
    int vertice, pesoAdj;
    public Adjacente(int v, int p)
    {
    	vertice = v;
    	pesoAdj = p;
    }
    public int getVertex() { 
    	return vertice; }
    public int getPesoAdj() { 
    	return pesoAdj; }
}