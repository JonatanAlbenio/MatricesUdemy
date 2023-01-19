public class EjemplosMatrices  {

    public static void main(String[] args) {

        int [][] numeros =new int[2][4];

        numeros[0][0]=1;

        numeros[0][1]=5;

        numeros[0][2]=4;

        numeros[0][3]=3;



        numeros[1][0]=1;

        numeros[1][1]=9;

        numeros[1][2]=8;
        numeros[1][3]=10;


        System.out.println("numeros.length = " + numeros.length);

        System.out.println("numeros[] = " + numeros[0].length);

        System.out.println("numeros[0][0] = " + numeros[0][0]);


        System.out.println("numeros[numeros.] = " + numeros[numeros.length-1][numeros[0].length-1]);



        
        int num1=numeros[0][0];

        int num2=numeros[0][1];

        int num3=numeros[0][2];

        int num4=numeros[0][3];

        System.out.println("num4 = " + num4);

    }




}
