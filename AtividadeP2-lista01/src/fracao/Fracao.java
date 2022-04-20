/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fracao;

/**
 *
 * @author Renat
 */
public  class Fracao implements Comparable<Fracao> {
	private int num;
	private int den;
 
	public Fracao() {
		this.num = 0;
		this.den = 1;
	}
 
	public Fracao(int num) {
		this.num = num;
		this.den = 1;
	}
 
	public Fracao(int num, int den) {
		this.num = num;
		if (den != 0) {
			this.den = den;
		} else {
			this.den = 1;
		}
	}
 
	public Fracao somar(Fracao f) {
		int den = FuncoesMatematicas.mmc(this.den, f.den);
		int num = den / this.den * this.num + den / f.den * f.num;
		// Fracao result = new Fracao(num, den);
		// return result;
		return new Fracao(num, den);
	}
 
	public Fracao subtrair(Fracao f) {
		// exemplo da lógica implementada: 5 - 2 => 5 + (-2)
		return this.somar(new Fracao(-f.num, f.den));
	}
 
	@Override
	public String toString() {
		// return "(" + this.num + ", " + this.den + ")";
		return String.format("(%d/%d = %.2f)", this.num, this.den,
			(double) this.num / (double) this.den);
	}
 
	public double toDouble() {
		return (double) this.num / (double) this.den;
	}
 
	@Override
	public int compareTo(Fracao f) {
		if (this.toDouble() < f.toDouble()) {
			return -1;
		} else if (this.toDouble() > f.toDouble()) {
			return 1;
		} else {
			return 0;
		}
	}

//        @Override
//    public int compareTo(Fracao f) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}