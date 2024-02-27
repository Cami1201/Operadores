package co.edu.sena.oop_2902274; 

 import java.util.Scanner; 

 /** 
  * Hello world!  
  * 
  */ 
public class App  
{ 
    public static void main( String[] args ) 
    { 
        //Area de un triangulo 
        //entrada 
        System.out.println( "1. Calcular el área de un triángulo" ); 
        System.out.println( "Ingrese la base del triangulo" ); 
        
        Scanner src = new Scanner(System.in); 
        double base = src.nextDouble(); 
        
        System.out.println( "Ingrese la altura del triángulo " ); 
        double height = src.nextDouble(); 
        
        //proceso 
        double result = (base * height) / 2; 
        
        //salida 
        System.out.println( "El area del triangulo es:" + result); 
        //Area de un triangulo 
        
        //Suma de dos numeros 
        //entrada 
        System.out.println( "2. Suma de dos números" ); 
        System.out.println( "Ingrese el primer número" ); 
        
        Scanner sum = new Scanner(System.in); 
        double num1 = src.nextDouble(); 
        
        System.out.println( "Ingrese el segundo número" ); 
        double num2 = src.nextDouble(); 
        
        //proceso 
        double resul = (num1+num2); 
        
        //salida 
        System.out.println( "La suma de los números es:" + resul); 
        //Suma de dos numeros 
        
        //Número elevado al cuadrado 
        //entrada 
        System.out.println( "3. Número elevado al cuadrado" ); 
        System.out.println( "Ingrese un número" ); 
        
        Scanner lee = new Scanner(System.in); 
        double num = src.nextDouble(); 
        
        //proceso 
        double respue = (num * num); 
        
        //salida 
        System.out.println( "El número elevado al cuadrado es:" + respue); 
        //Número elevado al cuadrado 
        
        //Conversión euros a dolares 
        //entrada 
        System.out.println( "4. Conversión euros a doláres" ); 
        System.out.println( "Ingrese un valor en euros" ); 
        
        Scanner con = new Scanner(System.in); 
        double val = src.nextDouble(); 
        
        //proceso 
        double conver = (val * 1.08); 
        
        //salida 
        System.out.println( "El valor en doláres es:" + conver); 
        //Conversión euros a dolares 
        
        //Área y Perímetro de un cuadrado 
        //entrada 
        System.out.println( "5. Área y Perímetro de un cuadrado" ); 
        System.out.println( "Ingrese la medida de un lado del cuadrado" ); 
        
        Scanner apcu = new Scanner(System.in); 
        double med = src.nextDouble(); 
        
        //proceso 
        double are = (med * med); 
        double per = (med + med + med + med); 
        
        //salida 
        System.out.println( "El área del cuadrado es:" + are); 
        System.out.println( "El perímetro del cuadrado es:" + per); 
        //Área y Perímetro de un cuadrado 
        
        //Área y volumen de cilindro 
        //entrada 
        System.out.println( "6. Área y volumen de cilindro" ); 
        System.out.println( "Ingrese el area del cilindro" ); 
        
        Scanner avci = new Scanner(System.in); 
        double rad = src.nextDouble(); 
        
        System.out.println( "Ingrese la altura del cilindro" ); 
        double alt = src.nextDouble(); 
        
        //proceso 
        double area = ((3.14 * 2* rad * alt) + (3.14 * 2) * (rad * rad)); 
        double vol = (3.14 * (rad * rad)* alt); 
        
        //salida 
        System.out.println( "El área del cilindro es:" + area); 
        System.out.println( "El volumen del cilindro es:" + vol); 
        //Área y volumen de cilindro
        
        //Longitud y area de una circunferencia
        //entrada 
        System.out.println( "7. Longitud y area de una circunferencia" ); 
        System.out.println( "Ingrese el radio de la circunferencia" ); 
        
        Scanner lacir = new Scanner(System.in); 
        double radi = src.nextDouble(); 
        
        //proceso 
        double lon = ((3.14 * 2)*radi); 
        double ar = (3.14 * (radi * radi)); 
        
        //salida 
        System.out.println( "La longitud de la circunferencia es:" + lon); 
        System.out.println( "El area de la circunferencia es:" + ar); 
        //Área y volumen de cilindro

        //Promedio de 3 Numeros
        //entrada 
        System.out.println( "8. Promedio de 3 Numeros" ); 
        System.out.println( "Ingrese el primer número" ); 
         
        Scanner pro = new Scanner(System.in); 
        double nu1 = src.nextDouble(); 
         
        System.out.println( "Ingrese el segundo número" ); 
        double nu2 = src.nextDouble();

        System.out.println( "Ingrese el tercer número" ); 
        double nu3 = src.nextDouble();
         
        //proceso 
        double impri = ((nu1 + nu2 + nu3) / 3); 
         
        //salida 
        System.out.println( "El promedio de los numeros es:" + impri); 
        //Promedio de 3 Numeros
    } 

}