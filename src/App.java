import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        ArrayList<Jogador> jogadores = new ArrayList<>();
        ArrayList<Tecnico> tecnicos = new ArrayList<>();
        ArrayList<ManagerGeral> managers = new ArrayList<>();
        ArrayList<Governador> governadores = new ArrayList<>();
        ArrayList<Time> times = new ArrayList<>();

        do {

            System.out.println("1 - Criar Time");
            System.out.println("2 - Criar Jogador");
            System.out.println("3 - Criar Técnico");
            System.out.println("4 - Criar Manager");
            System.out.println("5 - Criar Governador");
            System.out.println("6 - Mostrar Times");
            System.out.println("7 - Mostrar Jogadores");
            System.out.println("8 - Mostrar Técnicos");
            System.out.println("9 - Mostrar Managers");
            System.out.println("10 - Mostrar Governadores");
            System.out.println("0 - Sair");

            try {

                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {

                    case 1:

                        Time time = new Time();

                        System.out.print("Nome do Time: ");
                        time.setNomeTime(sc.nextLine());

                        System.out.print("Cidade: ");
                        time.setCidade(sc.nextLine());

                        System.out.print("Idade do Time: ");
                        time.setIdadeTime(sc.nextInt());
                        sc.nextLine();

                        times.add(time);

                        System.out.println("Time criado!");
                        break;

                    case 2:

                        Jogador jogador = new Jogador();

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

                        EstatisticasJogador estatistica = new EstatisticasJogador();

                        System.out.print("Jogos jogados: ");
                        estatistica.setJogosJogados(sc.nextInt());

                        System.out.print("PPG: ");
                        estatistica.setPpgCarreira(sc.nextDouble());

                        System.out.print("APG: ");
                        estatistica.setApgCarreira(sc.nextDouble());

                        System.out.print("RPG: ");
                        estatistica.setRpgCarreira(sc.nextDouble());

                        System.out.print("SPG: ");
                        estatistica.setSpgCarreira(sc.nextDouble());

                        System.out.print("BPG: ");
                        estatistica.setBpgCarreira(sc.nextDouble());

                        jogador.setEstatisticasJogador(estatistica);

                        jogadores.add(jogador);

                        sc.nextLine();

                        System.out.println("Jogador criado com sucesso!");
                        break;

                    case 3:

                        Tecnico tecnico = new Tecnico();

                        System.out.print("Nome: ");
                        tecnico.setNome(sc.nextLine());

                        System.out.print("Idade: ");
                        tecnico.setIdade(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Nacionalidade: ");
                        tecnico.setNacionalidade(sc.nextLine());

                        System.out.print("Contrato anos: ");
                        tecnico.setContratoAnos(sc.nextInt());

                        System.out.print("Salário: ");
                        tecnico.setContratoSalario(sc.nextDouble());
                        sc.nextLine();

                        System.out.print("Estilo de jogo: ");
                        tecnico.setEstiloJogo(sc.nextLine());

                        tecnicos.add(tecnico);

                        System.out.println("Técnico criado!");
                        break;

                    case 4:

                        ManagerGeral manager = new ManagerGeral();

                        System.out.print("Nome: ");
                        manager.setNome(sc.nextLine());

                        System.out.print("Idade: ");
                        manager.setIdade(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Nacionalidade: ");
                        manager.setNacionalidade(sc.nextLine());

                        System.out.print("Contrato anos: ");
                        manager.setContratoAnos(sc.nextInt());

                        System.out.print("Salário: ");
                        manager.setContratoSalario(sc.nextDouble());

                        System.out.print("Anos de experiência: ");
                        manager.setAnosExperiencia(sc.nextInt());

                        System.out.print("Trocas realizadas: ");
                        manager.setTrocasRealizadas(sc.nextInt());

                        managers.add(manager);

                        sc.nextLine();

                        System.out.println("Manager criado!");
                        break;

                    case 5:

                        Governador gov = new Governador();

                        System.out.print("Nome: ");
                        gov.setNome(sc.nextLine());

                        System.out.print("Idade: ");
                        gov.setIdade(sc.nextInt());
                        sc.nextLine();

                        System.out.print("Nacionalidade: ");
                        gov.setNacionalidade(sc.nextLine());

                        System.out.print("Contrato anos: ");
                        gov.setContratoAnos(sc.nextInt());

                        System.out.print("Salário: ");
                        gov.setContratoSalario(sc.nextDouble());

                        System.out.print("Patrimônio: ");
                        gov.setPatrimonio(sc.nextDouble());
                        sc.nextLine();

                        System.out.print("Empresa: ");
                        gov.setEmpresa(sc.nextLine());

                        governadores.add(gov);

                        System.out.println("Governador criado!");
                        break;

                    case 6:

                        if (times.isEmpty()) {

                            System.out.println("Nenhum time criado.");

                        } else {

                            for (Time t : times) {

                                t.mostrarInfo();
                            }
                        }

                        break;

                    case 7:

                        if (jogadores.isEmpty()) {

                            System.out.println("Nenhum jogador criado.");

                        } else {

                            for (Jogador j : jogadores) {

                                j.mostrarInfo();
                            }
                        }

                        break;

                    case 8:

                        if (tecnicos.isEmpty()) {

                            System.out.println("Nenhum técnico criado.");

                        } else {

                            for (Tecnico t : tecnicos) {

                                t.mostrarInfo();
                            }
                        }

                        break;

                    case 9:

                        if (managers.isEmpty()) {

                            System.out.println("Nenhum manager criado.");

                        } else {

                            for (ManagerGeral m : managers) {

                                m.mostrarInfo();
                            }
                        }

                        break;

                    case 10:

                        if (governadores.isEmpty()) {

                            System.out.println("Nenhum governador criado.");

                        } else {

                            for (Governador g : governadores) {

                                g.mostrarInfo();
                            }
                        }

                        break;

                    case 0:

                        System.out.println("Tamo junto meu nobre");
                        break;

                    default:

                        System.out.println("Opção inválida!");
                }

            } catch (Exception e) {

                System.out.println("Erro: digite apenas valores válidos.");
                sc.nextLine();
            }

        } while (opcao != 0);

        sc.close();
    }
}