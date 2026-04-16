import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        Jogador jogador = null;
        Tecnico tecnico = null;
        ManagerGeral manager = null;
        Governador gov = null;
        Time time = null;

        do {
            System.out.println("1 - Criar Time");
            System.out.println("2 - Criar Jogador");
            System.out.println("3 - Criar Técnico");
            System.out.println("4 - Criar Manager");
            System.out.println("5 - Criar Governador");
            System.out.println("6 - Mostrar Time");
            System.out.println("7 - Mostrar Jogador");
            System.out.println("8 - Mostrar Técnico");
            System.out.println("9 - Mostrar Manager");
            System.out.println("10 - Mostrar Governador");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    time = new Time();

                    System.out.print("Nome do Time: ");
                    time.setNomeTime(sc.nextLine());

                    System.out.print("Cidade: ");
                    time.setCidade(sc.nextLine());

                    System.out.print("Idade do Time: ");
                    time.setIdadeTime(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Time criado!");
                    break;

                case 2:
                    jogador = new Jogador();

                    System.out.print("Nome: ");
                    jogador.setNome(sc.nextLine());

                    System.out.print("Idade: ");
                    jogador.setIdade(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Nacionalidade: ");
                    jogador.setNacionalidade(sc.nextLine());

                    System.out.print("Contrato anos: ");
                    jogador.setContratoAnos(sc.nextInt());

                    System.out.print("Salário: ");
                    jogador.setContratoSalario(sc.nextDouble());
                    sc.nextLine();

                    System.out.print("Time de origem: ");
                    jogador.setTimeDeOrigem(sc.nextLine());

                    System.out.print("Posição: ");
                    jogador.setPosicao(sc.nextLine());

                    System.out.print("Altura: ");
                    jogador.setAltura(sc.nextDouble());

                    System.out.print("Peso: ");
                    jogador.setPeso(sc.nextDouble());
                    sc.nextLine();

                    EstatisticasJogador est = new EstatisticasJogador();

                    System.out.print("Jogos jogados: ");
                    est.setJogosJogados(sc.nextInt());

                    System.out.print("PPG: ");
                    est.setPpgCarreira(sc.nextDouble());

                    System.out.print("APG: ");
                    est.setApgCarreira(sc.nextDouble());

                    System.out.print("RPG: ");
                    est.setRpgCarreira(sc.nextDouble());

                    System.out.print("SPG: ");
                    est.setSpgCarreira(sc.nextDouble());

                    System.out.print("BPG: ");
                    est.setBpgCarreira(sc.nextDouble());

                    jogador.setEstatisticasJogador(est);

                    sc.nextLine();

                    System.out.println("Jogador criado com sucesso!");
                    break;

                case 3:
                    tecnico = new Tecnico();
                    System.out.println("Técnico criado!");
                    break;

                case 4:
                    manager = new ManagerGeral();
                    System.out.println("Manager criado!");
                    break;

                case 5:
                    gov = new Governador();
                    System.out.println("Governador criado!");
                    break;

                case 6:
                    if (time != null) time.mostrarInfo();
                    else System.out.println("Time não criado.");
                    break;

                case 7:
                    if (jogador != null) jogador.mostrarInfo();
                    else System.out.println("Jogador não criado.");
                    break;

                case 8:
                    if (tecnico != null) tecnico.mostrarInfo();
                    else System.out.println("Técnico não criado.");
                    break;

                case 9:
                    if (manager != null) manager.mostrarInfo();
                    else System.out.println("Manager não criado.");
                    break;

                case 10:
                    if (gov != null) gov.mostrarInfo();
                    else System.out.println("Governador não criado.");
                    break;

                case 0:
                    System.out.println("Tamo junto meu nobre");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}