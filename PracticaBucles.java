import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        int suma = 0;
        int suma2 = 0;
        int conta = 0;
        double media = 0;
        int m = -2000;
        int valor = 1;
        System.out.println("N. maximo de aleatorios a generar"+ n + "o hasta que salga 0");
        while(n>conta && valor !=0){
            valor = generador.nextInt(51001)-1000;
            if(esImpar(valor) == true){
             suma+= valor;
            }
            System.out.println(valor + obtenerNumeroSinCeros(valor));
            if(valor>m && esImpar(valor) == false){
                m = valor;
            }
            if(conta%5==0){
                System.out.print("\n");
            }
            suma2+= valor;
            
            conta++;
            
        }
        media = (double)(suma2/n);
        System.out.printf("Suma de todos los valores impares:%12d\n" , suma);
        System.out.printf("Media de todos los valores:%10.2f\n" , media);
        System.out.printf("Maximo de todos los valores pares:%12d\n" , m);
        
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        while(numero%2 !=0){
             
                return true;
            
        }
        return false;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int aux = numero%10;
        System.out.print("si numero = "+ numero +" devuelve");
        while(aux !=0){
            System.out.print(aux);
        }
        System.out.print("");
        System.out.println(aux);
        return 0;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
       System.out.println("Letra N - Altura: "+altura);
        for(int filas = 0; filas<altura;filas++){
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, filas);
            escribirCaracter(CARACTER, 1);
            escribirCaracter(ESPACIO, altura-filas-1);
            escribirCaracter(CARACTER, 1);
            System.out.println();
        }

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(int i = 0; i<n;i++){
            System.out.print(caracter);
        }
    }

}
