public class Governador extends Pessoa {
    private double patrimonio;
    private String empresa;

    public double getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(double patrimonio) {
        if (patrimonio >= 0) {
            this.patrimonio = patrimonio;
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
   public void mostrarInfo() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Nacionalidade: " + getNacionalidade());
    System.out.println("Contrato: " + getContratoAnos() + " anos, Salário: $" + getContratoSalario());
    System.out.println("Patrimonio: " + getPatrimonio());
    System.out.println("Empresa: " + getEmpresa());
}


}
