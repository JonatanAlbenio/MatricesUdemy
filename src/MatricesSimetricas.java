public class MatricesSimetricas {
    public static void main(String[] args) {
        boolean simetrica =true;
        int[][] matriz ={
                {
                        1,2,3,4,
                },
                {
                        2,1,0,5
                },
                {
                        3,0,1,6
                },
                {
                        4,5,6,7
                }
        };


        int i=0,j=0;

        sarlir: while(i<matriz.length ){


            while (j<i){
                if(matriz[i][j] != matriz[j][i]){
                    simetrica=false;
                    break sarlir;
                }
                j++;
            }
            i++;
        }
        if(simetrica){
            System.out.println("La matriz es simetrica ");
        }else {
            System.out.println("nocas");
        }
    }

}
