public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //array unidimensional
        int numeros[]= {5,8,7,9};
        //array bidimensionales, matrices
        int numeros2[][]= {{0,1,5,8},{8,9,8,6},{9,4,8,7}};
        //{0,1,5,8}  0,0   0,1   0,2   0,3
        //{8,9,5,6}  1,0   1,1   1,2   1,3
        //{9,4,8,7}  2,0   2,1   2,2   2,3

        for (int i=0; i<=3;i++){
            System.out.println(numeros[i]);
        }
        for (int i: numeros){
            System.out.println(i);
        }
        for (int i=0; i<=2;i++){ //recorriendo filas
            for (int j=0; j<=3;j++){ //recorreindo columnas
                System.out.print(numeros2[i][j]+" ");
            }
            System.out.println();
        }
        for (int i[]:numeros2){ //recorriendo filas
            for(int j: i){ //recorriendo columnas
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
