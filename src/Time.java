import java.util.ArrayList;

public class Time {

    private String nomeTime;
    private String cidade;
    private int idadeTime;

    private ArrayList<Jogador> jogadores = new ArrayList<>();

    private Tecnico tecnico;
    private ManagerGeral managerGeral;
    private Governador governador;

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getIdadeTime() {
        return idadeTime;
    }

    public void setIdadeTime(int idadeTime) {
        if (idadeTime > 0) {
            this.idadeTime = idadeTime;
        }
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public ManagerGeral getManagerGeral() {
        return managerGeral;
    }

    public void setManagerGeral(ManagerGeral managerGeral) {
        this.managerGeral = managerGeral;
    }

    public Governador getGovernador() {
        return governador;
    }

    public void setGovernador(Governador governador) {
        this.governador = governador;
    }

    public void mostrarInfo() {

        System.out.println("Time: " + nomeTime);
        System.out.println("Cidade: " + cidade);
        System.out.println("Idade do time: " + idadeTime);

        if (tecnico != null) {
            System.out.println("Técnico: " + tecnico.getNome());
        }

        if (managerGeral != null) {
            System.out.println("Manager: " + managerGeral.getNome());
        }

        if (governador != null) {
            System.out.println("Governador: " + governador.getNome());
        }

        if (jogadores.isEmpty()) {

            System.out.println("Nenhum jogador cadastrado.");

        } else {

            System.out.println("Jogadores:");

            for (Jogador j : jogadores) {

                System.out.println("- " + j.getNome());
            }
        }
    }
}