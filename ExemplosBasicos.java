public class ExemplosBasicos{
    public static void main(String args[]){
        //indent (identação)
        //for, while e do/while
        //repetição manual, não faça isso
        //System.out.println(1);
        //System.out.println(2);
        //repetição controlada por contador
        //declara o contador
        //for (int cont= 1;cont <= 3;cont = cont +1){
        //    System.out.println(cont);
        //}

        int cont = 1;
        do{
            //%d é um placeholder
            System.out.printf("Valor da vez :%d\n", cont);
        }
        while(cont <= 3);
            System.out.print(cont);
            cont = cont + 1;
    }