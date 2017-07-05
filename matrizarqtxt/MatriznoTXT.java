
/**
 *
 * @author aline
 */
import java.io.*;
import java.util.*;

public class MatriznoTXT {

	int i, j, matriz[][] = new int[2][2];
	Scanner sc = new Scanner(System.in);
	String caminho;

	public void GeraMatriz() {

		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf("matriz[%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

	}

	public void MostraMatriz() {
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz.length; j++) {
				System.out.printf("%d ", matriz[i][j]);
			}
			System.out.printf("\n");
		}
	}

	public void GuardaMatriz(String caminho) throws IOException {
		BufferedWriter escreve = new BufferedWriter(new FileWriter(caminho));
		// new BufferedWriter(new FileWriter(caminho));
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				
				int k = matriz[i][j];
				String result = String.format("%d",k);
				escreve.append(result);
				escreve.write(" ");
			}
			escreve.newLine();
		}
		
		escreve.close();

	}

	public void MostraTXT(String caminho) throws IOException {
		BufferedReader leitor = new BufferedReader(new FileReader(caminho));
		// new BufferedReader(new FileReader(caminho)); //cria um leitor que
		// pega o caminho do arquivo
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else {
				break;
			}
			linha = leitor.readLine();
		}
		leitor.close();
	}

}
