import java.util.Arrays;

public class TrabajoFinalPrueba {
    public static void main(String[] args) {
            //Datos de entrada
            String [] platos = {"Lomo Saltado","Aji de Gallina","Papa Rellena","Seco con Frijoles","Pollo a la Brasa"};
            int [] nacionales = {25000,18600,14400,12000,30000};
            int [] extranjeros = {10000,5000,200,800,60000};

            int [] totalxPlato = calcularTotalxPlato(nacionales,extranjeros);
            System.out.println("El total por platos es: "+ Arrays.toString(totalxPlato));

            double [] porcentaje = calcularPorcentaje(nacionales,extranjeros);
            System.out.println("Los porcentajes son: "+Arrays.toString(porcentaje));

            String platoMasVendido = calcularPlatomasVendido(nacionales,extranjeros,platos);
            System.out.println("El plato más vendido es: "+platoMasVendido);

        }

        private static String calcularPlatomasVendido(int[] nacionales, int[] extranjeros, String[] platos) {
            int[] totalxPlato = calcularTotalxPlato(nacionales,extranjeros);
            int mayor = 0;
            int posicion = 0;
            for (int i=0;i< nacionales.length;i++){
                if (totalxPlato[i]>mayor){
                    mayor = totalxPlato[i];
                    posicion = i;
                }
            }
            return platos[posicion];
        }


        private static int[] calcularTotalxPlato(int[] nacionales, int[] extranjeros) {
            int[] arr = new int[nacionales.length];
            for (int i=0;i< nacionales.length;i++){
                arr[i] = nacionales[i] + extranjeros[i];
            }
            return arr;
        }
        private static double[] calcularPorcentaje(int[] nacionales, int[] extranjeros){
            double[] miArreglo = new double[nacionales.length];
            int [] totalxPlato = calcularTotalxPlato(nacionales,extranjeros);
            int denominador = 0;
            double porcentaje = 0.0;
            for (int i=0;i< nacionales.length;i++){
                denominador = denominador + totalxPlato[i];
            }
            for (int j=0; j< nacionales.length;j++){
                porcentaje = totalxPlato[j]*100.0 / denominador;
                miArreglo [j]= Math.round(porcentaje*100)/100.0;
            }
            return miArreglo;
        }


}





