package trab;

/**
 *
 * @author aline e nathália
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoPGM {

    private int altura;
    private int largura;
    private int MAX;
    private int[][] imagem = null;
    private int cont = 0;
    private String linha;

    private Scanner sc = new Scanner(System.in);

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getLargura() {
        return this.largura;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public int getMAX() {
        return this.MAX;
    }

    public int[][] getImagem() {
        return imagem;
    }

    public void setImagem(int[][] imagem) {
        this.imagem = imagem;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void carregaPGM(String caminho) throws FileNotFoundException, IOException {
        try {
            Scanner scanner = new Scanner(new FileReader(caminho));
            String p2 = scanner.nextLine();
            linha = scanner.nextLine();

            while (linha.contains("#")) {
                linha = scanner.nextLine();
            }

            Scanner op = new Scanner(linha);
            this.setLargura(op.nextInt());
            this.setAltura(op.nextInt());
            linha = scanner.nextLine();
            Scanner c = new Scanner(linha);
            this.setMAX(c.nextInt());

            this.imagem = new int[this.altura][this.largura];

            linha = scanner.nextLine();
            Scanner aux = new Scanner(linha);

            for (int i = 0; i < this.altura; i++) {
                for (int j = 0; j < this.largura; j++) {
                    if (aux.hasNextInt()) {
                        this.imagem[i][j] = aux.nextInt();
                    } else {
                        linha = scanner.nextLine();
                        aux = new Scanner(linha);
                        this.imagem[i][j] = aux.nextInt();
                    }
                }
            }

            scanner.close();

            System.out.println("Deu certo!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }

    }

    public void escrevePGM(String caminho) throws IOException {
        try {
            BufferedWriter escreve = new BufferedWriter(new FileWriter(caminho));

            escreve.write("P2");
            escreve.newLine();
            escreve.append(this.largura + " " + this.altura);
            escreve.newLine();
            String max = String.format("%d", this.MAX);
            escreve.write(max);
            escreve.newLine();

            for (int i = 0; i < this.altura; i++) {

                for (int j = 0; j < this.largura; j++) {

                    cont++;
                    escreve.write(String.valueOf(this.imagem[i][j] + " "));
                    if ((cont % 10 == 0)) {
                        escreve.newLine();
                    }
                }

            }
            escreve.close();

        } catch (IOException e) {

        }

    }

}
