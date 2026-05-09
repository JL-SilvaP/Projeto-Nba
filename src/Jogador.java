public class Jogador extends Pessoa{
    private String timeDeOrigem;
    private String posicao;
    private double altura;
    private double peso;
    private EstatisticasJogador estatisticasJogador;

    public String getTimeDeOrigem() {
        return timeDeOrigem;
    }

    public void setTimeDeOrigem(String timeDeOrigem) {
        this.timeDeOrigem = timeDeOrigem;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public EstatisticasJogador getEstatisticasJogador() {
        return estatisticasJogador;
    }

    public void setEstatisticasJogador(EstatisticasJogador estatisticasJogador) {
        this.estatisticasJogador = estatisticasJogador;
    }


    public void mostrarInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Contrato: " + getContratoAnos() + " anos, Salário: $" + getContratoSalario());  
        System.out.println("Time de origem: " + timeDeOrigem);
        System.out.println("Posição: " + posicao);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Jogos jogados: " + estatisticasJogador.getJogosJogados());
        System.out.println("PPG: " + estatisticasJogador.getPpgCarreira());
        System.out.println("APG: " + estatisticasJogador.getApgCarreira());
        System.out.println("RPG: " + estatisticasJogador.getRpgCarreira());
        System.out.println("SPG: " + estatisticasJogador.getSpgCarreira());
        System.out.println("BPG: " + estatisticasJogador.getBpgCarreira());
    }
}