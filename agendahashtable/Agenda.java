
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Agenda {

private static Scanner sc;

public static void main(String args[]) {
sc = new Scanner(System.in);

String nome = null, email = null;
int telefone = 0;
int cod = 0;
int opc;

Map<Integer, Contato> map = new Hashtable<>();
Contato c1 = new Contato(cod, nome, telefone, email);

do {
System.out.println("Escolha uma opção no menu:");
System.out.println("1. Inserir");
System.out.println("2. Consultar");
System.out.println("3. Remover");
System.out.println("4. Listar");
System.out.println("5. Excluir Todos");
System.out.println("0. Sair ");
opc = sc.nextInt();

switch (opc) {
case 1:

System.out.println("Insira o código do contato: ");
cod = sc.nextInt();
System.out.println("Insira o nome do contato: ");
nome = sc.nextLine();
System.out.println("Insira o número do contato: ");
telefone = sc.nextInt();
System.out.println("Insira o email do contato: ");
email = sc.nextLine();
map.put(c1.cod, c1);
System.out.println("Contato agendado com sucesso!");
break;
case 2:
System.out.println("Digite o código do contato: ");
cod = sc.nextInt();
map.containsKey(cod);
if (map.containsKey(cod) == true) {
System.out.println("A agenda contém o contato?" + map.containsKey(cod));

} else {
System.out.println("Contato não agendado!");
}
break;

case 3:
System.out.println("Digite o código do contato que você quer apagar: ");
cod = sc.nextInt();
map.containsKey(cod);
map.remove(cod);
System.out.println("Contato excluído com sucesso!");
break;

case 4:
for (Map.Entry<Integer, Contato> entry : map.entrySet()) {

int key = entry.getKey();
Contato value = entry.getValue();
System.out.println(key + " - Detalhes do contato: \n");
System.out.println(" \n " + value.cod + " " + value.nome + " \n " + value.telefone + " \n " + value.email);
}
break;

case 5:
System.out.println("Deseja excluir todos os contatos? \n 1. Sim \n 2. Não");
opc = sc.nextInt();
if (opc == 1) {
map.clear();
System.out.println("Contatos excluídos com sucesso!");
break;
} else {
break;
}

case 0:
break;
default:
System.out.println("Opção Inválida!");
}

} while (opc != 0);

}
;

}

