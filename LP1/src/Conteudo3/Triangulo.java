package Conteudo3;

public class Triangulo extends FiguraGeometrica implements Desenhavel {
	private double base, altura;
	
	public Triangulo(double area, double perimetro, 
			double base, double altura) {
		super(area, perimetro);
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
		System.out.println("Desenhei um Triangulo : \n"
				+ "base = " +	this.base +
				" altura = " +	this.altura);

	}

	
}
