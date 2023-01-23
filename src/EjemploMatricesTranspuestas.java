public class EjemploMatricesTranspuestas {
    public static void main(String[] args) {


        int [][] matriz ={

                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int i =0;
        int j =0;
        System.out.println(" MATRIZ ORIGINAL PERRO ----------------");
        for (;i<matriz.length;i++){
            for (;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

        int k =0;
        int m =0;
        System.out.println(" MATRIZ NUEVAAAAAAAAAA PERRO ----------------");

        int aux=0;
        for (;k<matriz.length;k++){
            for (;m<i;m++){

                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;

            }
        }

        System.out.println(" MATRIZ NUEVAAAAAAAAAA PERRO ----------------");

        for (;i<matriz.length;i++){
            for (;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }





    }
}
