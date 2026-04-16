public class Time {
    private String nomeTime;
    private String cidade;
    private int idadeTime;
    private Jogador jogador;
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

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
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
        }
}