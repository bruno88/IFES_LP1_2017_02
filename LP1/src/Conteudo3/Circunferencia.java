package Conteudo3;

public class Circunferencia extends FiguraGeometrica implements Desenhavel {
	private double raio;
	
	public Circunferencia(double area, double perimetro, 
			double raio) {
		super(area, perimetro);
		this.raio = raio;

	}

	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

	

	@Override
	public void fazNada(boolean valido) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desenha() {
		System.out.println("Desenhei um Circunferencia : \n"
				+ "Area = " +	this.raio);

	}

	
}
