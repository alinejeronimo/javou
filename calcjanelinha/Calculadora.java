
/**
 *
 * @author aline
 */
import javax.swing.*;

public class Calculadora {

    private int opc, soma, mult, div, sub;
    private int num_1, num_2;
    private int num1;
    private int num2;
    JOptionPane janela = new JOptionPane();

    public int getNum_1() {
        return this.num_1;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public int getSoma() {
        return this.soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getMult() {
        return this.mult;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }

    public int getDiv() {
        return this.div;
    }

    public void setDiv(int div) {
        this.div = div;
    }

    public void menu() {

        do {
            String opcao = janela.showInputDialog(null, "Digite a opção desejada: \n\t1.Somar\n\t2.Multiplicar\n\t3.Dividir\n\t4.Susbtrair\n\t0.Sair\n\t");
            opc = Integer.parseInt(opcao);
            switch (opc) {
                case 1:
                    this.somar();
                    break;
                case 2:
                    this.mult();
                    break;
                case 3:
                    this.divide();
                    break;
                case 4:
                    this.subtrai();
                    break;
                case 0:
                    janela.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    janela.showMessageDialog(null, "Opção Inválida!");

            }
        } while (opc != 0);
    }

    public void somar() {
        String num1 = janela.showInputDialog(null, "Digite o primeiro número:");
        String num2 = janela.showInputDialog(null, "Digite o segundo número:");
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        this.soma = num_1 + num_2;
        janela.showMessageDialog(null, "O resultado da soma é: " + soma);
    }

    public void mult() {
        String num1 = janela.showInputDialog(null, "Digite o primeiro número:");
        String num2 = janela.showInputDialog(null, "Digite o segundo número:");
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        this.mult = num_1 * num_2;
        janela.showMessageDialog(null, "O resultado da multiplicação é: " + mult);
    }

    public void divide() {
        String num1 = janela.showInputDialog(null, "Digite o primeiro número:");
        String num2 = janela.showInputDialog(null, "Digite o segundo número:");
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        this.div = num_1 / num_2;
        janela.showMessageDialog(null, "O resultado da divisão é: " + div);
    }

    public void subtrai() {
        String num1 = janela.showInputDialog(null, "Digite o primeiro número:");
        String num2 = janela.showInputDialog(null, "Digite o segundo número:");
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        this.sub = num_1 - num_2;
        janela.showMessageDialog(null, "O resultado da subtração é: " + sub);
    }

}
