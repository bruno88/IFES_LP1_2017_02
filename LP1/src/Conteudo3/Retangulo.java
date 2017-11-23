package Conteudo3;

public class Retangulo extends FiguraGeometrica implements Desenhavel {
	private double ladoA, ladoB;
	
	public Retangulo(double area, double perimetro, 
			double ladoA, double ladoB) {
		super(area, perimetro);
		this.ladoA = ladoA;
		this.ladoB = ladoB;

	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	

	@Override
	public void fazNada(boolean valido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desenha() {
		System.out.println("Desenhei um Retangulo : \n"
				+ "Area = " +	getArea() +
				" Perímetro = " +	getPerimetro());

	}

	
}
