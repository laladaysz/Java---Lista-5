package exercicio3;

public class Calculo {

    public double juros (double emprestimo) {
        return emprestimo = emprestimo * 0.35;
    }

    public double parcelas (double emprestimo) {
        return (emprestimo + juros(emprestimo) / 24);
    }

    public double porcentagemSalario (double salario) {
        return salario * 0.15;
    }



}
