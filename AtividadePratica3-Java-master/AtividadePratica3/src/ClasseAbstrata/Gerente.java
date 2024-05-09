package ClasseAbstrata;

public class Gerente extends Funcionario implements Trabalhavel{

    private float bonusAnual;
    private String equipe;

    public Gerente() {
    }
    public Gerente(String nome, int matricula, float valorHora, int horasTrabalhadas, float bonusAnual,
            String equipe) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.bonusAnual = bonusAnual;
        this.equipe = equipe;
    }

    public float getBonusAnual() {
        return bonusAnual;
    }
    public void setBonusAnual(float bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public float calcularSalario() {
        return (getValorHora() * getHorasTrabalhadas()) + 2000;
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nCargo: Gerente" +
        "\nEquipe: " + equipe +
        "\nSalário: R$:" + calcularSalario();
    }
    @Override
    public String trabalhar() {
        return"O gerente " + getNome() + " está gerenciando a equipe " + getEquipe();
    }
    @Override
    public String relatarProgresso() {
        return getNome() + " disse que a equipe " + getEquipe() + " está com o projeto 70% concluído";
    }
    
}
