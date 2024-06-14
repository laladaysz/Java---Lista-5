package exercicio3;

import java.util.Scanner;

public class InputOutput {

    double salario;
    double emprestimo;
    Scanner sc = new Scanner(System.in);

    Validacao validacao = new Validacao();
    Calculo calculo = new Calculo();
    public void setEmprestimo(){
        System.out.print("Digite o valor que deseja emprestar: ");
        this.emprestimo = sc.nextDouble();
        sc.nextLine();

    }

    public double getEmprestimo() {
        return emprestimo;
    };

    public void setSalario(){
        System.out.print("Digite o seu salário atual: ");
        this.salario = sc.nextDouble();
    }

    public double getSalario() {
        return salario;
    }

    public void avaliar (){
        System.out.println("Seja bem-vindo ao FUP!");
        setEmprestimo();
        setSalario();

        double parcelas = calculo.parcelas(getEmprestimo());
        double porcentagemSalario = calculo.porcentagemSalario(getSalario());

        if(validacao.validParcela(parcelas, porcentagemSalario)) {
            System.out.println("Empréstimo válido!!");
        } else {
            System.out.println("Empréstimo inválido!!");
        }
    };
}
