package exercicio1;

import java.util.Scanner;

public class InputOutput {
    Scanner sc = new Scanner(System.in);
    double nota1;
    double nota2;
    double peso1;
    double peso2;



    public void InputAritmetica(){

        System.out.println("Digite suas notas a seguir...");
        System.out.println("1: ");
        this.nota1 = sc.nextDouble();
        System.out.println("2: ");
        this.nota2 = sc.nextDouble();
    }

    public void InputPonderada(){
        System.out.println("Digite suas notas a seguir...");
        System.out.println("nota 1: ");
        this.nota1 = sc.nextDouble();
        System.out.println("nota 2: ");
        this.nota2 = sc.nextDouble();

        System.out.println("Digite os pesos das notas a seguir...");
        System.out.println("peso 1: ");
        this.peso1 = sc.nextDouble();
        System.out.println("peso 2: ");
        this.peso2 = sc.nextDouble();
    }

    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }
    public double getPeso1() {return peso1;}
    public double getPeso2() { return peso2;}

    public void Avaliar() {
        while (true) {
            Validacao validacao = new Validacao();
            Calculo calculo = new Calculo();
            Result status = new Result();

            System.out.println("Seja bem-vindo professor!");
            System.out.println("O que gostaria de fazer hoje?");
            System.out.println("1- Calcular média ponderada \n2- Calcular média aritmética \n0- Sair");
            int resposta = sc.nextInt();

            switch (resposta){
                case 0:
                    System.out.println("Tudo bem, tchauzinho...");
                    System.exit(0);
                    break;
                case 1:
                    this.InputPonderada();
                    boolean valid = validacao.Validar(getNota1(), getNota2());
                    if (valid) {
                        double media = calculo.Ponderada(getNota1(), getNota2(), getPeso1(), getPeso2());
                        System.out.println("O valor da média ponderada é igual a: " + media);
                        boolean statusatual = status.Status(media);
                        if (statusatual){
                            System.out.println("E o aluno está aprovado.");
                            break;
                        } else {
                            System.out.println("E o aluno está reprovado.");
                            break;
                        }
                    } else {
                        System.out.println("Notas inválidas!");
                    }
                    break;
                case 2:
                    this.InputAritmetica();
                    valid = validacao.Validar(getNota1(), getNota2());
                    if (valid) {
                        double media = calculo.Aritmetica(getNota1(), getNota2());
                        System.out.println("O valor da média aritmetica é igual a: "+ media);
                        boolean statusatual = status.Status(media);
                        if (statusatual){
                            System.out.println("E o aluno está aprovado.");
                            break;
                        } else {
                            System.out.println("E o aluno está reprovado.");
                            break;
                        }
                    } else {
                        System.out.println("Nota inválida.");
                    }
                    break;
                }

            }

    };
}
