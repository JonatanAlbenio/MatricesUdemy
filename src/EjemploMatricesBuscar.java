public class EjemploMatricesBuscar {
    public static void main(String[] args) {


        int[][] matrizDeEnteres ={

                {34,23,56},
                {14,2020,10,50},
                {455,123,12333,1222}
        };

        int elementoBuscar =2020;
        boolean encontrado =false;
        int i=0;
        int j=0;
        buscar:for (;i<matrizDeEnteres.length;i++){
            for (;j<matrizDeEnteres[i].length;j++){
                if(matrizDeEnteres[i][j]==elementoBuscar){
                    encontrado=true;
                    break buscar;
                }
            }
        }


        if(encontrado){
            System.out.println(" Encontrado elemento "+ elementoBuscar+ "en las coordenadas"+ i+", "+j);
        }else {
            System.out.println(" No se encontro ");
        }
    }
}
