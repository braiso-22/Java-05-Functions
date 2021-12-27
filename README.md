# Java-05-functions
Java course part 5
<ol>
  <li>
    Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se
    llame a dichas funciones:
  </li>
  <ul>
    <li>
      Función llamada par() que se le pasa un entero y devuelve true si es par, false si
    no lo es.
    </li>
    <li>
      Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos.
    </li>
    <li>
      Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long
      con la suma de los números comprendidos entre los números pasados (el
      primero es menor que el segundo, y ambos mayores que cero, en caso contrario
      devuelve -1)
    </li>
    <li>
      Función llamada contarCeros() que se le pasa una cadena y devuelve la
      cantidad de ceros que tiene.
    </li>
    <li>
      Función llamada aleatorio() que se le pasan dos valores enteros devuelve un
      entero al azar comprendido entre esos dos valores (el primero es menor que el
      segundo, y ambos mayores que cero, en caso contrario devuelve -1)
    </li>
  </ul>
  <li>
    Programa que presente un menú y permita calcular repetidas veces <br>a) el área de
    círculo –necesitará el radio- , <br>b) el área de cuadrado –necesitará el lado - , <br>c) el área de
    triángulo –necesitará base y altura – <br>d) Salir. Usar funciones para cada una de las 3
    opciones.
  </li>
  <li>
    Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y
    un mes y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A
    continuación, realizar un programa al que se le introduzca una fecha y nos informe de los
    días pasados desde el 1 de enero de ese año (no usar clases Java de fechas).
  </li>
  <li>
    Partiendo de la función del programa anterior, hacer un programa al que se le
    introduzcan dos fechas del mismo año y nos informe de los días comprendidos entre ellas
    (no usar clases Java de fechas)
  </li>
  <li>
    Programa que calcule el factorial de números menores de 20. El programa permite al
    usuario meter los números que desee y finalizará cuando meta un número menor que 1 o
    mayor que 20. Crea las funciones que consideres útiles y que puedas reutilizar en otros
    programas.
  </li>
  <li>
    Realiza una función llamada cantidadDivisores al que se le pase como parámetro un
    número entero y devuelva el número de divisores o bien cero si el número es negativo. Usa
    dicha función en un main.
  </li>
  <li> 
  Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo.
  Usando la función del programa anterior, haz un programa que muestre la suma de los
  números primos comprendidos entre 1 y 1000.
  </li>
  <li>
    Realizar un programa al que se le introduzcan dos números enteros positivos y nos
    diga cuál de los dos tiene más divisores (usar función previa).
  </li>
  <li>
    El siguiente programa tiene una variable global llamada saldo sobre la que se
    ejecutan las funciones ingresar() y retirar() que aumentan y reducen el saldo
    respectivamente, no pudiendo quedar el saldo por debajo de cero. ¿Hay algún error?
    ¿Cuánto vale la variable saldo al finalizar la ejecución del programa?
  </li>
  
  ```java
  public class Ejercicio {
    public static int saldo=0;
    public static void main(String[] args){
      boolean ok = false;
      ingresar(30);
      retirar(10);
      if (retirar(10)==false) System.out.println("No se puede retirar tanto");
        System.out.println("Saldo final: "+ saldo);
      }
      static void ingresar(int i){
        saldo+=i;
      }
      static boolean retirar(int i){
        if (i>saldo) return false;

        saldo-=i;
        return true;

      } 
  }
  
  ```
  <li>
    Este código es erróneo ¿Qué mostraría por pantalla? ¿Por qué?
  </li>
  
  ```java
  
  public static void main(String[] args) {
    float saldo = 500f;
    saldo = ingresar(saldo, 400f);
    if (ingresar(saldo, 400f)>1000f)
    System.out.println("Ya tienes más de 1000 euros: " + saldo);
    else System.out.println("No tienes más de 1000 euros: " + saldo);
  }
  static float ingresar (float saldo, float increm){ return saldo+increm;}
  ```
  <li>
    ¿Qué mostraría este código por pantalla? ¿Por qué?
  </li>
  
  ```java
  
  public static void main(String[] args) {
    float saldo = 500f;
    ingresar(saldo, 600f);
    if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo);
    else System.out.println("No tienes más de 1000 euros: "+ saldo);
  }
  static void ingresar(float saldo, float increm) {saldo += increm; }
  ```
  
</ol>
