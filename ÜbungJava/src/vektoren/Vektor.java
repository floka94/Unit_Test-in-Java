package vektoren;

public class Vektor {
	double x;
	double y;
	boolean istSpaltenvektor;
	
	public Vektor(boolean istSpaltenvektor, double x, double y) {
		this.x = x;
		this.y = y;
		this.istSpaltenvektor = istSpaltenvektor;
	}
	
	public Vektor add(Vektor v) throws VektorException {
		if (this.istSpaltenvektor != v.istSpaltenvektor) {
			throw new VektorException("Addition verboten!");
		}
		Vektor resultVektor = new Vektor(this.istSpaltenvektor, 0, 0);
		resultVektor.x = this.x + v.x;
		resultVektor.y = this.y + v.y;
		return resultVektor;
	}
	
	public Vektor scalarMult(double scalar) {
		Vektor resultVektor = new Vektor(this.istSpaltenvektor,0, 0);
		resultVektor.x = this.x * scalar;
		resultVektor.y = this.y * scalar;
		return resultVektor;
	}	
	
	@Override
	public boolean equals(Object obj) {
		Vektor that = (Vektor) obj;
		if (this.x == that.x && this.y == that.y) {
			return true;
		} else {
			return false;
		}
	}
}
