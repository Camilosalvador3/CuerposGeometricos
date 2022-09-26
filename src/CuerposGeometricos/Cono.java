package CuerposGeometricos;

public class Cono {

	public static void main(String[] args) {
		// Declaracion de variables
				float H, R, D;
				double G, Pbase, Abase, AreaLateral, AreaTotal, Volumen;
				double Hcuadrada, Rcuadrada;
				//Datos de entrada
				H = 60;
				R = 40;
				D = R + R;
				Hcuadrada = Math.pow(H, 2);
				Rcuadrada = Math.pow(R, 2);
				G = Math.sqrt(Hcuadrada + Rcuadrada);
				Pbase = Math.PI * D;
				Abase = Math.PI * (Math.pow(R, 2));
				AreaLateral = Pbase * G / 2;
				AreaTotal = AreaLateral + Abase;
				Volumen = Abase * H / 3;
				
				//Datos de salida
				System.out.println("Datos del cono :");
				System.out.println("1.Altura :"  + H);
				System.out.println("2.Radio :"  + R);
				System.out.println("3.Generatriz :"  + String.format("%.2f", G));
				System.out.println("4.Perimetro de la base :"  + String.format("%.2f", Pbase));
				System.out.println("5.Area de la base :"  + String.format("%.2f", Abase));
				System.out.println("6.Area Lateral :"  + String.format("%.2f" , AreaLateral));
				System.out.println("7.Area Total :"  + String.format("%.2f" , AreaTotal));
				System.out.println("8.Volumen :"  + String.format("%.2f" , Volumen));	

	}

}
