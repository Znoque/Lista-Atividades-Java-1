/*Questão 3
Escreva um programa que escreve na saída os valores assumidos por x. Esta variável x deve iniciar com algum valor. Se x for par, x deve receber o valor dele mesmo somado com 5. Já se x for ímpar, x deve receber o valor dele multiplicado por 2. O programa termina assim que x for maior que 1000. Por exemplo, para x = 10, a saída deve ser: 15, 30, 35, 70, 75, 150, 155, 310, 315, 630, 635, 1270. Faça este exercício usando blocos if e depois usando blocos switch.*/

public class main{
    public static void main(String[] args){
        //1 Bloco IF
        int x=10;
        while(x<=1000){
            if(x%2==0){
                x+=5;
            }else{
                x*=2;
            }
            System.out.println(x);
        }
        System.out.println("====================================");

        //2 Bloco Switch
        x=10;
        int r=0;
        do{
            r=x%2==0?1:0;
            switch(r){
                case 1:
                    System.out.println(x+=5);
                    break;
                case 0:  
                    System.out.println(x*=2);                   
                    break;
            }
        }while(x<=1000);
    }
}