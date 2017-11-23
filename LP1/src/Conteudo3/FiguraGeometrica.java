package Conteudo3;

public abstract class FiguraGeometrica {
	protected double area, perimetro;
	
	public FiguraGeometrica (double area, double perimetro) {
		this.area = area;
		this.perimetro = perimetro;
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public abstract void fazNada(boolean valido);
	
}
