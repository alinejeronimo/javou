import java.io.IOException;

public class Matriz1 {

	/**
	 *
	 * @author aline
	 */

	public static void main(String args[]) throws IOException {
		MatriznoTXT m1 = new MatriznoTXT();
		m1.GeraMatriz();
		m1.MostraMatriz();
		m1.GuardaMatriz("C:/Users/Alunos/Desktop/alo.txt");
		m1.MostraTXT("C:/Users/Alunos/Desktop/alo.txt");
	}

}
