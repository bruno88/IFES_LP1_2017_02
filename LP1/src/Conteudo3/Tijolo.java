package Conteudo3;

public class Tijolo extends FiguraGeometrica implements Desenhavel{
	private double base, altura;
	
	public Tijolo(double base, double altura ) {
		super(10.1,20.2);
		this.base = base;
		this.altura = altura;

	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public void fazNada(boolean valido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desenha() {
		// TODO Auto-generated method stub
		
	}

	

	

	
}
