
public class main{
    public static void main(String[] args){
        int d=30;
        int m=4;
        int a=2019;
        if(d!=0 && d<29 && m==2 && a!=0){
            System.out.println("A data "+d+"/"+m+"/"+a+" e valida!");
        }else if(d!=0 && d<32 && m!=0 && m!=4 && m!=6 && m!=9 && m!=11 && m!=2 && m<13 && a!=0){
            System.out.println("A data "+d+"/"+m+"/"+a+" e valida!");
        }else if(d!=0 && d<31 && m!=0 && m!=1 && m!=2 && m!=3 && m!=5 && m!=7 && m!=8 && m!=10 && m!=12 && m<13 && a!=0){
            System.out.println("A data "+d+"/"+m+"/"+a+" e valida!");
        }else{
            System.out.println("A data "+d+"/"+m+"/"+a+" nao e valida!");
        }
    }
}