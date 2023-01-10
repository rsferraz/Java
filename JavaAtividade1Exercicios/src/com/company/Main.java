package com.company;
import java.util.*;
public class Main {

    /**
     * 1) Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo utilizando valores do tipo
     ENTRADA => Salário: 10000.00 Abono: Abono: 1000.00, SAÍDA => Novo Salário: 11000.00
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario, abono, novoSalario;

        System.out.print("Digite o salário: ");
        salario = scanner.nextFloat();
        System.out.print("Digite o abono: ");
        abono = scanner.nextFloat();
        novoSalario = salario + abono;
        System.out.printf("Novo Salário: %.2f", novoSalario);
    }
}

package com.company;
import java.util.*;

public class Main {

    /**
     2) Elabore um algoritmo que leia 4 notas de um participante, em variáveis do tipo float e
     exiba na tela a média final do participante.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Nota 1: ");
        nota1 = scanner.nextFloat();
        System.out.print("Nota 2: ");
        nota2 = scanner.nextFloat();
        System.out.print("Nota 3: ");
        nota3 = scanner.nextFloat();
        System.out.print("Nota 4: ");
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média final: %.1f", media);
    }
}

package com.company;
import java.util.*;

public class Main {

    /**
     3) Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e
     os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido
     */

    public static void main(String[] args) {
        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário Bruto: ");
        salarioBruto = scanner.nextFloat();
        System.out.print("Adicional Noturno: ");
        adicionalNoturno = scanner.nextFloat();
        System.out.print("Horas Extras: ");
        horasExtras = scanner.nextFloat();
        System.out.print("Descontos: ");
        descontos = scanner.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        System.out.printf("Salário Líquido: %.2f", salarioLiquido);
    }
}

package com.company;
import java.util.*;
public class Main {

    /**
     * 4) Leia quatro valores float (numero1, numero2, numero3 e numero4)
     * calcule e mostre a diferença do produto entre o numero1 e o numero2
     * pelo produto entre o numero3 e o numero4.
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        float num4;
        float diferenca;

        System.out.println("Digite o 1 numero:");
        num1 = ler.nextFloat();
        System.out.println("Digite o 2 numero:");
        num2 = ler.nextFloat();
        System.out.println("Digite o 3 numero:");
        num3 = ler.nextFloat();
        System.out.println("Digite o 4 numero:");
        num4 = ler.nextFloat();

        diferenca = (num1 * num2) - (num3 * num4 );
        System.out.printf("O salario liquido é..%.1f:", Math.abs(diferenca));
    }
}