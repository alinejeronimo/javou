package trab;

/**
 *
 * @author aline e nathláia
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class Arquivo {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        ArquivoPGM arq = new ArquivoPGM();
        arq.carregaPGM("/home/aline/Desktop/coins.ascii.pgm");
        arq.escrevePGM("/home/aline/Desktop/tst.ascii.pgm");
    }
}
