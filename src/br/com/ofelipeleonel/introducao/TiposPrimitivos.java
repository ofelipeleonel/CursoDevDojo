package br.com.ofelipeleonel.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, float, double, long, short, char, byte, boolean

        //Int: 4 bytes
        int idadeInt = 10;
        System.out.println("int: A idade é: " + idadeInt + ".");

        //Float: 4 bytes
        float salarioFloat = 2500;
        System.out.println("float: O salário é: R$" + salarioFloat);

        //Double: 8 bytes
        double salarioDouble = 2000;
        System.out.println("double: O salário é: R$" + salarioDouble);

        //Long: 8 bytes
        long numeroGrande = 1000000000;
        System.out.println("long: O número grande é: " + numeroGrande);

        //Short: 2 bytes
        short idadeShort = 5;
        System.out.println("short: A idade é: " + idadeShort);

        //Char: 2 bytes (pois segue o padrão UTF-16)
        char primeiraLetra = 'A';
        System.out.println("char: A primeira letra do alfabeto é: " + primeiraLetra);

        //Byte: 1 byte
        byte temperatura = -15;
        System.out.println("byte: A temperatura mínima de ontem foi " + temperatura + "ºC.");

        //Boolean: 1 bit
        boolean verdadeiro = true;
        System.out.println("boolean: 1 + 1 = 1? " + verdadeiro);



        System.out.println();
        long valorLong = 4294967296L;
        String bitsLong = Long.toBinaryString(valorLong);
        int valorInt = (int) valorLong;
        String bitsInt = Integer.toBinaryString(valorInt);
        System.out.println("Valor long: " + valorLong);
        System.out.println("Binário long:" + bitsLong);
        System.out.println("Valor int: " + valorInt);
        System.out.println("Binário int: " + bitsInt);

    }
}
