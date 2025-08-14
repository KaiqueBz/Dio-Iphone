import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Reprodutor Musical");
            System.out.println("2 - Aparelho Telefônico");
            System.out.println("3 - Navegador na Internet");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    menuReprodutor(sc, iphone);
                    break;
                case 2:
                    menuTelefone(sc, iphone);
                    break;
                case 3:
                    menuNavegador(sc, iphone);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void menuReprodutor(Scanner sc, Iphone iphone) {
        int escolha;
        do {
            System.out.println("\n--- Reprodutor Musical ---");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Pausar música");
            System.out.println("3 - Selecionar música");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    iphone.tocar();
                    break;
                case 2:
                    iphone.pausar();
                    break;
                case 3:
                    System.out.print("Digite o nome da música: ");
                    String musica = sc.nextLine();
                    iphone.selecionarMusica(musica);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    private static void menuTelefone(Scanner sc, Iphone iphone) {
        int escolha;
        do {
            System.out.println("\n--- Aparelho Telefônico ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar correio de voz");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o número: ");
                    String numero = sc.nextLine();
                    iphone.ligar(numero);
                    break;
                case 2:
                    iphone.atender();
                    break;
                case 3:
                    iphone.iniciarCorreioVoz();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }

    private static void menuNavegador(Scanner sc, Iphone iphone) {
        int escolha;
        do {
            System.out.println("\n--- Navegador na Internet ---");
            System.out.println("1 - Exibir página");
            System.out.println("2 - Adicionar nova aba");
            System.out.println("3 - Atualizar página");
            System.out.println("0 - Voltar");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = sc.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 2:
                    iphone.adicionarNovaAba();
                    break;
                case 3:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }
}


