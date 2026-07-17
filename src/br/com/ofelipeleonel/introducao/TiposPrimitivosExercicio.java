package br.com.ofelipeleonel.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
*/

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Joãozinho";
        String endereco = "Rua da Goiabeira Nº7070";
        double salario = 50000.15;
        String dataRecebimentoSalario = "01/01/2001";
        String relatorio = "Eu " + nome + ", morando no " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario + ".";

        System.out.println(relatorio);
    }
}
