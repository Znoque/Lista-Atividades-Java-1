/*Questão 2
Escreva um programa que calcule o fatorial de 10. A regra do fatorial (!) é a seguinte:
0! = 1
1! = 0! × 1
2! = 1! × 2
...
_! = __ − 1! × _*/

public class main{
    public static void main(String[]args){
        int fator=10;
        int total=10;
        System.out.print(fator+"! = "+fator);
        for(int i=9; i>0; i--){
            total*=i;
            System.out.print("."+i);
        }
        System.out.print(" = "+total);
    }
}