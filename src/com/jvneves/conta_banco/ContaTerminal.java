package com.jvneves.conta_banco;

import java.util.Scanner;

import static java.lang.System.out;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome;
        double saldo;

        Scanner sc = new Scanner(System.in);
        out.println("Digite o número da conta:");
        numero = sc.nextInt();
        sc.nextLine();
        out.println("Digite a agência:");
        agencia = sc.nextLine();
        out.println("Digite o nome do titular:");
        nome = sc.nextLine();
        out.println("Digite o saldo:");
        saldo = sc.nextDouble();

        out.println("Olá "+nome+ ", obrigado por " +
                "criar uma conta em nosso banco, sua agência " +
                "é "+agencia+", conta "+numero+" e seu saldo "+saldo
                +" já está disponível para saque");
    }
}
