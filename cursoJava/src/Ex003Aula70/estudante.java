package Ex003Aula70;

public class estudante {
    public double nota1;
    public double nota2;
    public double nota3;

    public double calculoNota() {
        return(nota1 +nota2 +nota3);
    }
    public void calculoMedia(){
        if (calculoNota() >= 60){
            System.out.print("Aprovado");
        } else {
            System.out.println("Reprovado");
            System.out.printf("Faltam: %.2f", 60.00 - calculoNota());
            System.out.print(" pontos");
        }
    }
}
