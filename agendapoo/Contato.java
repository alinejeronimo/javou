
/**
 *
 * @author aline
 */
import java.util.*;
import java.util.Map.Entry;

public class Contato {

    private String nome;
    private int telefone;
    private int codigo;
    private String email;
    private int opcao;
    private Scanner sc = new Scanner(System.in);
    private Scanner sc1 = new Scanner(System.in);
    Map<Integer, Contato> contato = new Hashtable<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int teleofne) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Menu() {
        do {
            System.out.println("Escolha a opção desejada: ");
            System.out.println("1. Adicionar Contato ");
            System.out.println("2. Remover Contato");
            System.out.println("3. Mostrar Contatos");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    this.AddContato();
                    break;
                case 2:
                    this.DelCotnato();
                    break;
                case 4:
                    this.MostraContatos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 0);
    }

    public void AddContato() {
        System.out.println("Digite o código do contato ao qual você quer adcionar a sua agenda: ");
        codigo = sc.nextInt();
        System.out.println("Digite o nome do contato: ");
        nome = sc1.nextLine();
        System.out.println("Digite o número de telefone do contato: ");
        telefone = sc.nextInt();
        System.out.println("Digite o email do contato que você quer adicionar: ");
        email = sc1.nextLine();
        contato.put(codigo, this);
        System.out.println("Contato adicionado com sucesso!");
    }

    public void DelCotnato() {
        System.out.println("Digite o código do contato que você quer deletar: ");
        codigo = sc.nextInt();
        if (contato.containsKey(codigo) == true) {
            contato.remove(codigo);
            System.out.println("Contsto excluído com sucesso!");
        } else {
            System.out.println("Contato não encontrado!");
        }

    }

    public void MostraContatos() {
        for (Map.Entry<Integer, Contato> entry : contato.entrySet()) {
            int chave = entry.getKey();
            Contato valor = entry.getValue();
            System.out.println("Contatos Agendados:");
            System.out.println(valor.codigo + " - " + valor.nome + ":");
            System.out.println("nº de telefone: " + valor.telefone + " ");
            System.out.println("email: " + valor.email + " ");
        }

    }

}
