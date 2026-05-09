public class Pessoa {
    private String nome;
    private int idade;
    private int contratoAnos;
    private double contratoSalario;
    private String nacionalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }

    public int getContratoAnos() {
        return contratoAnos;
    }

    public void setContratoAnos(int contratoAnos) {
        if (contratoAnos > 0) {
            this.contratoAnos = contratoAnos;
        }
    }

    public double getContratoSalario() {
        return contratoSalario;
    }

    public void setContratoSalario(double contratoSalario) {
        if (contratoSalario >= 0) {
            this.contratoSalario = contratoSalario;
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}