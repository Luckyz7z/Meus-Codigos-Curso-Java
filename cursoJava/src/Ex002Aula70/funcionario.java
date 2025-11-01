package Ex002Aula70;

public class funcionario {
    public String nome;
    public double salario;
    public double taxa;
    public double porcentagem;

    public double taxaSalario() {
        double valor = salario - taxa;
        return valor;
    }
    public double aumentoSalario(){
        return (salario - taxa) + (salario * (porcentagem/100));

    }
}
