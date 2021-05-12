
/**
 * Ejercicio 2 de la 1ra Tarea del Segundo parcial.
 * 
 * @author (lisandro) 
 * @version (12/05/2021)
 */
public class Ejercicio2
{
    int[] numerosPadovan;
    /**
     *El constructor estará vacio
     */
    public Ejercicio2()
    {
    }

    /**
     * En este metodo se va a especificar la cantidad de valores que quiere obtener
     */
    public void sucesion(int cantidad)
    {
        if(cantidad > 3){
            numerosPadovan = new int[cantidad];
            numerosPadovan[0] = 1;
            numerosPadovan[1] = 1;
            numerosPadovan[2] = 1;
            int contador = 3;
            while(contador < cantidad){
                numerosPadovan[contador] = numerosPadovan[contador-3]+numerosPadovan[contador-2];
                contador++;
            }
            int indice = 0;
            while(indice < cantidad){
                System.out.print(numerosPadovan[indice]+" ");
                indice++;
            }
        }else if(cantidad >0 && cantidad > 3){
            switch(cantidad){
            case 1: System.out.print(1+" "); break;
            case 2: System.out.print(1+" "+1+" "); break;
            case 3: System.out.print(1+" "+1+" "+1+" "); break;
            }
        }else{
            System.out.print("Ingrese valores positivos (mayores a 0)");
        }
    }

}
