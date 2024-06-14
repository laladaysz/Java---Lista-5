package exercicio2;

import java.util.Scanner;

public class InputOutput {

    double salario;
    double horasExtras;

    Scanner sc = new Scanner(System.in);
    Validacao status = new Validacao();
    Calculo calcular = new Calculo();

    public void setSalario () {
        System.out.print("Insira seu salário: ");
        this.salario = sc.nextDouble();

    }

    public double getSalario() {
        return salario;
    }

    public void setHorasExtras(){
        System.out.print("Insira suas horas extras feitas:");
        this.horasExtras = sc.nextDouble();
    }

    public double getHorasExtras(){ return horasExtras; }
    public double  calcularSalario () {
        if (status.valid(getSalario())) {
            double resultINSS = calcular.INSS(getSalario());
            double resultIRPF = calcular.IRPF(getSalario());
            double resultUnimed = calcular.Unimed(getSalario());
            double resultHE = calcular.horaExtra(getSalario(), getHorasExtras());

            return (calcular.salarioLiquido(getSalario(),resultINSS,resultIRPF,resultUnimed, resultHE));

        } else {
            System.out.println("Salário inválido.");
        }
        return (0);
    };

    public void sistema() {
        System.out.println("Seja bem-vindo!");
        setSalario();
        setHorasExtras();
        double salarioLiquido = calcularSalario();
        System.out.println("Seu salário líquido é igual a " + salarioLiquido);
    };

}
