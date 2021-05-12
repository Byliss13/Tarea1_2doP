
/**
 * Ejercicio 1 de la 1ra Tarea del Segundo parcial.
 * 
 * @author (lisandro) 
 * @version (12/05/2021)
 */
public class Ejercicio1
{
    int[] numerosSucesion;
    /**
     *El comstructor estará vacio
     */
    public Ejercicio1()
    {
    }

    /**
     * En este metodo se va a especificar la cantidad de valores que quiere obtener
     */
    public void sucesion(int cantidad)
    {
        if(cantidad > 1){
            numerosSucesion = new int[cantidad];
            numerosSucesion[0] = 1;
            int sum = 1;
            int contador = 1;
            int contadorAumento = 0;
            int contadorDisminucion = 0;
            while(contador < cantidad){
                numerosSucesion[contador] = numerosSucesion[contador-1]+sum;
                if(sum == 1){
                    sum = 2;
                    contadorAumento++;
                }else if(sum == 3){
                    sum = 2;
                    contadorDisminucion++;
                }else{
                    if(contadorAumento > contadorDisminucion){
                        sum = 3;
                    }else{
                        sum = 1;
                    }
                }
                contador++;
            }
            int indice = 0;
            while(indice < cantidad){
                System.out.print(numerosSucesion[indice]+" ");
                indice++;
            }
        }else if(cantidad == 1){
            System.out.print(1+" ");
        }else{
            System.out.print("Ingrese valores positivos (mayores a 0)");
        }
    }
}
