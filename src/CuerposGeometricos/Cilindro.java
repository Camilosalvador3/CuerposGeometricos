package CuerposGeometricos;

public class Cilindro {

	public static void main(String[] args) {
		// Declaracion de variables
		float T, H;
		double Pbase, Abase, AreaLateral, AreaTotal, Volumen;
		
		//Datos de entrada
		H = 25;
		T = 5F;
		Pbase = 2*(Math.PI)*T*H;
		Abase = (Math.PI)*(Math.pow(T, 2));
		AreaLateral = Pbase * H;
		AreaTotal = AreaLateral + 2 * (Abase);
		Volumen = Abase * H;
		
		//Datos de salida
		System.out.println("Datos de Cilindro");
		System.out.println("1.Altura : " + H);
        System.out.println("2.Radio :"  + T);
        System.out.println("3.Perimetro de la base :"  + String.format("%.2f", Pbase));
        System.out.println("4.Area de la base :"  + String.format("%.2f", Abase));
        System.out.println("5.Area Lateral :"  + String.format("%.2f", AreaLateral));
        System.out.println("6.Area Total :"  + String.format("%.2f", AreaTotal));
        System.out.println("7.Volumen :"  + String.format("%.2f", Volumen));

	}

}
