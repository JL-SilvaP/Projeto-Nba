public class ManagerGeral extends Pessoa {
    private int anosExperiencia;
    private int trocasRealizadas;

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        if (anosExperiencia >= 0) {
            this.anosExperiencia = anosExperiencia;
        }
    }

    public int getTrocasRealizadas() {
        return trocasRealizadas;
    }

    public void setTrocasRealizadas(int trocasRealizadas) {
        if (trocasRealizadas >= 0) {
            this.trocasRealizadas = trocasRealizadas;
        }
    }
     
   public void mostrarInfo() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Nacionalidade: " + getNacionalidade());
    System.out.println("Contrato: " + getContratoAnos() + " anos, Salário: $" + getContratoSalario());
    System.out.println("Anos de experiência: " + anosExperiencia);
    System.out.println("Trocas realizadas: " + trocasRealizadas);
}
}
