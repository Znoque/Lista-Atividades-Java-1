/*Questão 1
Neste exercício, você deve completar 4 tarefas:
1. Imprima todos os números de 10 a 25.
2. Imprima a soma dos números de 1 a 1000, pulando de dois em dois (1, 3, 5, 7, etc.).
3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já impressos for menor que 100.
4. Imprima a tabuada do 9 (até o décimo valor).*/


public class principal{
    public static void main(String[]args){
        //1
        for(int i=10; i<26; i++){
            System.out.println(i);
        }
        System.out.println("===================================");
        
        //2
        int soma=0;
        for(int a=1; a<=1000; a+=2){
            soma+=a;
            
        }
        System.out.println(soma);
        System.out.println("===================================");
        
        //3
        soma=0;
        for(int b=0; b<1000; ++b){
            soma+=b;
            if(soma<100){
                System.out.println(b);
            }
        }
        System.out.println("===================================");

        //4
        int num=9;
        double num2=9;
        System.out.println("Tabuada do 9: ");
        for(int n=0; n<10; n++){
            System.out.println(num+"+"+n+"="+(num+n));
        }
        System.out.println();
        for(int n=0; n<10; n++){
            System.out.println(num+"-"+n+"="+(num-n));
        }
        System.out.println();
        for(int n=0; n<10; n++){
            System.out.println(num+"X"+n+"="+(num*n));
        }
    }
}