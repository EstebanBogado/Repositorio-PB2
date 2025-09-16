package ar.edu.unlam.alumno.pb2.holaMundo;

public class HolaMundo {

	private double doble;
	private int entero;

	public HolaMundo() {

	}

	public void setDoble(double doble) {
		this.doble = doble;
	}

	public void setEntero(int entero) {
		this.entero = entero;
	}

	public double getDoble() {
		return doble;
	}

	public int getEntero() {
		return entero;
	}

//***************************************//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo! ");

		int[] fibonacci = new int[8];
		int n = 0;
//		int n1 = 1;
// 		serie fibonacci: 0, 1, 1, 2, 3, 5, 8, 13
		fibonacci[0] = n;

//		for (int i = 1; i < 8; i++) {
//			fibonacci[i] = fibonacci[i - 1] + n1;
//			n1 = fibonacci[i - 1];
//			System.out.println(fibonacci[i]);
//		}

		int[] enteros = new int[5];

		HolaMundo prueba[] = new HolaMundo[5];

		for (int i = 0; i < prueba.length; i++) {
			prueba[i] = new HolaMundo();
			prueba[i].setDoble(i + 1.2);
			prueba[i].setEntero(i + 20);
		}

		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = i + 3;
		}
		int contar = 0;

		for (int i = 0; i < prueba.length; i++) {
			if (prueba[i] != null) {
				System.out.println(prueba[i].getDoble());
				System.out.println(prueba[i].getEntero());
				contar++;
			}
		}
		System.out.println(contar);

		System.out.println("tamaño enteros" + enteros.length);
		System.out.println("tamaño prueba " + prueba.length);
		System.out.println("hashCode " + enteros.hashCode());
		double a = 5.5;
		int b = 5;

		System.out.println("a / b " + a / b);
		System.out.println("b / a " + b / a);

	}

}
