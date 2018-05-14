/**
 * Esta es la clase triangulo.
 * @author: Marcos Alcalá
 * @version: 1.1
 */
public class Triangulo_MAN extends FiguraGeometrica_MAN {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * Constructor.
     * @param tipoFigura
     * @param lado1
     * @param lado2
     * @param lado3
     */
	public Triangulo_MAN(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);
		lado1 = lado1;
		lado2 = lado2;
		lado3 = lado3;
	}

	/**
	 * Método perimeto
	 * @return la suma de los lados
	 */
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	/**
	 * @return el área del triangulo
	 */
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	
	
}
