public class Tecnico extends Pessoa {
    private String estiloJogo;
    private int experienciaAnos;
    private int titulos;

    public String getEstiloJogo() {
        return estiloJogo;
    }

    public void setEstiloJogo(String estiloJogo) {
        this.estiloJogo = estiloJogo;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }

    public void setExperienciaAnos(int experienciaAnos) {
        if (experienciaAnos >= 0) {
            this.experienciaAnos = experienciaAnos;
        }
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        if (titulos >= 0) {
            this.titulos = titulos;
        }
    }
    public void mostrarInfo() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Nacionalidade: " + getNacionalidade());
    System.out.println("Contrato: " + getContratoAnos() + " anos, Salário: $" + getContratoSalario());
    System.out.println("Estilo de jogo: " + estiloJogo);
    System.out.println("Anos de experiência: " + experienciaAnos);  
    System.out.println("Títulos: " + titulos);
}
}
