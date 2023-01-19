class EjemplosMatricesStringFor {
    public static void main(String[] args) {

        String [][] nombre = new String[3][2];
        nombre [0][0]="pepe";
        nombre [0][1]="daniel";
        nombre [1][0]="juan";
        nombre [1][1]="paco";
        nombre [2][0]="pancha";
        nombre [2][1]="shen";
        System.out.println(" -----------------------------------------------------------------");
        for (int i =0;i<nombre.length ;i++){
            for (int j =0;j<nombre[i].length;j++){
                System.out.print(nombre[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(" -----------------------------------------------------------------");

        for (String[] fila :nombre){

            for (String nombre2:fila){
                System.out.print(nombre + "\t");
            }

            System.out.println();
        }

    }
}
