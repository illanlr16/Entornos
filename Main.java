package main;

import java.util.Scanner;

public class Main {
    
    public static Scanner sc = new Scanner (System.in);
    
    public static void main1 (String [] args) {
        int a;
        String b;
        
        a = 42;
        b = "Hola";
        
        System.out.println("Hola");
        System.out.println("3" + "4");
        System.out.println(3 + "4");
        System.out.println("3" + 4);
        
        System.out.println("3" + "4" + "5");
        System.out.println("3" + "4" + 5);
        System.out.println("3" + 4 + "5");
        System.out.println("3" + 4 + 5);
        System.out.println(3 + "4" + "5");
        System.out.println(3 + "4" + "5");
        System.out.println(3 + 4 + "5");
        System.out.println(3 + 4 + 5);
        
        System.out.println(a);
        System.out.println(b);
        
        a = 10;
        
        System.out.println(a);
        
    }
    
    public static void main2 (String [] args){
    
        int mariana;
        String almudena;
        int andrea;
        String cristina;
        
        mariana = 42;
        almudena = "cuarenta y dos";
        andrea = mariana + 22;
        cristina = almudena + mariana;
        
        System.out.println(mariana);
        System.out.println(almudena);
        System.out.println(andrea);
        System.out.println(cristina);

    }
    
    public static void main3(String [] args) {
        int a; 
        
        a = 42;
        System.out.println (a);
        
        a = 43;
        System.out.println (a);
        
        a = a + 1;
        
        System.out.println (a);
        
        a = a + 1;
        
        System.out.println (a);
        
        a = a + 1;
        
        System.out.println (a);
        
        if(a==7){
            System.out.println ("es igual a 7");
        }else{
            System.out.println("no lo es");
            }
    }
    
    public static void main4(String [] args){
        //Comentario de línea
        /*Comentario
        de
        bloque
        */
        
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        
        
    }
    
    public static void main5 (String [] args) {
        boolean b;   
        b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);
        b = 5 < 44;
        System.out.println(b);
        byte w;
        w = 55;
        System.out.println(w);
        
        int i;
        i = 0b1101; // Los ints admiten binario, hexadecimales y octales.
        System.out.println(i);
        i = 0x2AD;
        System.out.println(i);
        
        long l;
        l = 33L;
        System.out.println(l);
        
        double d;
        d = 3.14;
        System.out.println(d);
        d = 1600000000000.0;
        System.out.println(d); // El .0 marca que es double y no int
        d = 6.023E26;
        System.out.println(d); // También se pueden poner exponentes
        
        char c;
        c = 'A';
        System.out.println(c);
        c = 97;
        System.out.println(c); // El resultado es una "a" ya que escribe el caracter UNICODE equivalente al nº
        // Para poder añadir comillas dentro de comillas se haría de la siguiente manera
        c = '\'';
        System.out.println(c);        
        // Para poder añadir una barra, añadiriamos 2 barras
        c = '\\';
        System.out.println(c);
        
        String s;        
        s = "hola";
        System.out.println(s);        
        s = "";
        System.out.println(s);
        
        float f;
        f = 3.14f;
        System.out.println(f);
        
    }
    
    public static void main6 (String[] args) {
        // Asignación
        int x;
        int y;
        
        y = 1 + (x = 3 + 2) * 7;
        
        System.out.println(x);
        System.out.println(y);
    }
    
    public static void main7 (String[] args) {
        int a;
        int b;
        
        a = 7;
        b = 42;
        
        System.out.println(true && false);// operador AND (y)
        System.out.println(a <20 && b < 20);
        
        System.out.println(true || false); // operador OR (o)
        System.out.println(a <20 || b < 20);
        
        System.out.println(! true); // Operador NOT (no)
        System.out.println(! (a < 20));
        
        // Operador XOR (O exclusivo)
        System.out.println(true & false);// operador XOR -> AND 
        System.out.println(a <20 & b < 20);
        
        System.out.println(true | false); // operador XOR -> OR
        System.out.println(a <20 | b < 20);
        
        System.out.println(! true); // Operador XOR -> NOT
        System.out.println(! (a < 20));
        
    }
    
    public static void main8 (String[] args) {
        int a = 42;
        int b = 55;
        
        System.out.println (a);
        System.out.println (a);
        
        a++;        
        System.out.println (a);
        System.out.println (b);
        
        ++a;
        System.out.println(a);
        System.out.println(b);
        
        b--;
        System.out.println(a);
        System.out.println(b);
        
        --b;
        System.out.println(a);
        System.out.println(b);
        
        System.out.println(b--);
        System.out.println(b);
        
                
                
    }
    
    public static void main9 (String [] args) { // Condicionales
        int x = 5;
        int y = x > 10 ? 55 : 42;
        System.out.println(x);
        System.out.println(y);
        
        x = 15;
        y = x > 10 ? 55 : 42;
        System.out.println(x);
        System.out.println(y);
    }
    
    public static void main10 (String [] args) {
        int a = 42;
        int b = 55;
        
        System.out.println(a);
        System.out.println(b);
        
        a+= 5;
        System.out.println(a);
        System.out.println(b);
        
        b *= a - 15;
        
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main11 (String [] args) {
        byte b = 42;
        short s = 42;
        int i = 42;
        long l = 42;
        
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        
        
    }
    
    public static void main12 (String [] args) { // Fibo sin bucles
        int a = 1;
        int b = 1;
        int c = a + b;
        System.out.println(c);
        
        a = b;
        b = c;
        c = a + b;       
        System.out.println(c);
        
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
        
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);

        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
        
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
        
        a = b;
        b = c;
        c = a + b;
        System.out.println(c);
    }
    
    public static void main15 (String [] args) { // Fibo con for
        long a = 1;
        long b = 1;
        long c = a + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
                
        
        for(int i = 0;i<=25;i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(c);
        }
       
    }
    
    public static void main16 (String [] args) {
        int x = sc.nextInt (); // Usando el metodo importado Scanner
        int y = sc.nextInt ();
        System.out.println(x < y ? x : y);
        
    }
    
    public static void main17 (String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int mayor;
        
        if (x > y && x > z) {
            mayor = x;
        } else if (y > x && y > z){
            mayor = y;
        } else {
            mayor = z;
        }
        
        System.out.println (mayor);
    }
    
    public static void main19 (String[] args) { // Lo mismo de arriba
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int mayor;
        
        if (x > y) {
            if (x > z) {
                mayor = z;
            } else {
                mayor = z;
            }
        } else {
            if (y > z) {
                mayor = y;
            } else {
                mayor = z;
            }
        }
        System.out.println(mayor);
    }
    
        public static void main20 (String[] args) { // Lo mismo de arriba
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int mayor;
        
        mayor = x;
        
        if (y > mayor) {
            mayor = y;
        }
        
        if (z > mayor) {
            mayor = z;
        }
        
        System.out.println(mayor);
    }
        
    
    
    public static void main21 (String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int mediano;
        
        if ((x > y && x < z) || (x < y && x > z)){
            mediano = x;
        } else if ((y > x && y < z) || (y < x && y > z)) {
            mediano = y;
        } else {
            mediano = z;
        }
        
        System.out.println (mediano);
                
    }
    
    public static void main22 (String[] args) {
        // For loop
        for(int i = 0;i <=10;i++) {
            System.out.println("For "+i);
        }
        // Do/while loop
        int j = 0;
        do {
            System.out.println("Do/while " + j);
            j++;
           
        } while (j<=10);
        
        // while loop
        int k = 0;
        
        while (k<=10) {
            System.out.println("While " + k);
            k++;
        }
    }
    
    public static void main23 (String [] args) {
        //Switch
        
        int dado = sc.nextInt();
        
        switch (dado) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            default: 
                System.out.println("Que dado mas raro");
        }
    }
    
    public static void main24 (String[] args) {
        // Sacar el par
        int x = sc.nextInt();
        
        if(x % 2 == 0) {
            System.out.println("El numero es --> Par " + x);
        } else {
            System.out.println("El numero e --> Impar " + x);
        }
    }
    
    public static void main25 (String [] args) {
        /* Dado un número, calcular cuantas condicione cumple de entre las siguientes:
        - Es un número impar entre 10-20
        - Es mayor que 15
        - Es menor que 17
        */
        int x = sc.nextInt();
        int a = 0;
        
        
        if(x % 2 != 0 && x >=10 && x <=20) 
            a++;
        if (x > 15) 
            a++;           
        if (x < 17) 
            a++;           
            
        System.out.println(a);
       
    }
    
    public static void main26 (String [] args) {
        // Dado un número decir si es un cuadrado perfecto o no.
        int x = sc.nextInt();
        int i;
        
        for(i = 0;i * i < x;i++) {
            
        }
        
        if (i * i == x) {
            System.out.println("El numero " + x +" SI es cuadrado perfecto");
        } else {
            System.out.println("El numero " + x + " NO es cuadrado perfecto");
        }
    }
    
    public static void main27 (String [] args) {
        // Dados tres números, todos entre 1 y 4 y distintos.
        // Escribir el número que falta.
        // Ej: Si tecleo 2, 4, 1; escribiría el 3.
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int i;
        
        for(i = 1;i <= 4; i++) {
            if((i != a) && (i != b) && ( i!= c)) {
                System.out.println("El numero que falta es: " + i);
            }
        } 
    }
    
    public static void main28 (String [] args) {
        // Otra manera del ejercicio de arriba
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int r = 1;
           
        
        while(r == a || r == b || r == c) {
            r++;
        }
        
        System.out.println(r);
        
    }
    
    public static void main29 (String [] args) {
        // Ordenando los números (Otra manera de hacer el ejercicio anterior)
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int t;
        
        if(a > b) {
            t = a;
            a = b;
            b = t;
        // Ahora se que a NO es el mayor de los tres
        }
        
        if (b > c) {
            t = b;
            b = c;
            c = t;
        // Ahora se que c SI es el mayor de los tres
        }
        
        if(a > b) {
            t = a;
            a = b;
            b = t;
        // Ahora a,b,c están ordenados
        }
        
        if (a > 1) {
            System.out.println(1);
        } else if(b > 2) {
            System.out.println(2);  
        } else if(c > 3) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
        
    }
    
    public static void main30 (String [] args) {
        /* Dados tres números, decir cuantos hay distintos. O sea, sin contar los repetidos.
        Ej. 5, 5, 5: Solo hay un número (el 5)
        Ej: 5, 6, 5: Hay dos números distintos (el 5 y el 6)
        Ej: 5, 6, 2: Hay tres números distintos
        */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        
        int i = 0;
        
        if((a!=b) && (a!=c)){
            i++;
        }
        if((b!=c) && (b!=a)){
            i++;
        }
        if((c!=a) && (c!=b)) {
            i++;
        }
        
        System.out.println("Hay " + i + " numeros distintos");
        
    }
    
    public static void main31 (String [] args) {
        // Sacar por consola la suma total de los números que componen otro
        // EJ: 7 --> 1+2+3+4+5+6+7 = 28
        
        int x = sc.nextInt();
        int a = 0;
        
        for(int i = 0; i <= x ;i++){
            a+=i;
        }
        
        System.out.println("La suma total de los numeros es: " + a );
    }
    
    public static void main32 (String [] args) {
        // Lo mismo que el anterior pero multiplicando
        int x = sc.nextInt();
        int a = 1;
        
        for(int i = 1; i <= x; i++) {
            a*= i;
        }
        
        System.out.println("La multiplicacion total de los numeros es: " + a);
    }
    
    public static void main33 (String [] args) {
        /* Programa que al darle un número haga:
        Si es impar : x3+1
        Si es par: /2
        */
        
        int x = sc.nextInt();
        int i;
        
        
        for(i = 0;x != 1; i++){
            if(x % 2 == 0) {
                x = x/2;
                System.out.println(x);
            }else {
                x = x*3+1;
                System.out.println(x);
            }
        }
        System.out.println("El numero total de pasos hasta llegar a 1 ha sido: " + i);           
    }
   
    public static void main34 (String [] args) {
        // Año bisiesto
        int x = sc.nextInt();
        
        if (x % 4 != 0){
            System.out.println(x + " No es bisiesto");
        } else if (x % 100 != 0) {
            System.out.println(x + " Si es bisiesto");
        } else if (x % 400 != 0) {
            System.out.println(x + " No es bisiesto");
        } else{
            System.out.println(x + " Si es bisiesto");
        }
    }
    
    public static void main35 (String [] args) {
        // Calcular edad dando fecha de nacimiento y fecha actual (solo años)
        int dn = sc.nextInt();
        int mn = sc.nextInt();
        int an = sc.nextInt();
        int dh = sc.nextInt();
        int mh = sc.nextInt();
        int ah = sc.nextInt();
        
        int edad = ah - an;
        
        if(mh < mn || mh == mn && dh < dn) {
            edad = edad -1;
        }
        
        System.out.println(edad);  
    }
    
    public static void main36 (String [] args) {
        // reloj
        int desde = sc.nextInt();
        int hasta = sc.nextInt();
        int diferencia = 12;
        
        if(desde > hasta) {
            diferencia = diferencia - (desde - hasta);
        }else if(desde <= hasta) {
            diferencia =(hasta - desde);
        }
        
        System.out.println(diferencia);
    }
    
    public static void main37 (String [] args) {
        // Secuencia. Empezamos en 1, se le suma 1 y se multiplica por dos. Hasta tener 20 números
        
        int x = 1;
        System.out.println(x);
        
        for(int i = 0; i <= 10; i++) {
            x+=1;
            System.out.println(x);
            x = x*2;
            System.out.println(x);
        }
    }
    
    public static void main38 (String [] args) {
        
        // Total llevará un número de segundos y eso tendrá que tener formato en el system.out
        int total = sc.nextInt();

        int s = total% 60; 
        int m = (total % 3600) / 60;
        int h = total / 3600;
                
        
        System.out.println(h + ":" + m + ":" + s);
        
    }
    
    public static void main39 (String [] args) {
        // Ultima cifra del número
        
        int x = sc.nextInt();
        int a = x % 10;        
        System.out.println(a);
    }
    
    public static void main40 (String [] args) {
        // Tiene que dar la primera cifra del número
        int x = sc.nextInt();
        
        while(x>=10) {
            x = x/10;
        }
        
        System.out.println(x);
    }
    
    public static void main41 (String [] args) {
        
        int x = sc.nextInt();
        int a = 0;
        int i = 0;
        int m;
        
        
        while (x != 0) {
            a+=x;
            x = sc.nextInt();
            i++;
        }
        m = a/(i-1);
        
        System.out.println(m);
        
    }
    
    public static void main42 (String [] args) {
        // Un programa que empiece preguntando 3 números y que como resultado
        // escriba un número que sea la menor diferencia entre los 3. 
        // Ej: Si los números son 3, 13 y 5 el resultado sería 2 (la diferencia entre el 5 y el 3)
        
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int ab = a - b;
        int bc = b - c;
        int ca = a - c;
        
        if (a > b) {
            ab = a - b;
        } else {
            ab = b - a;
        }
        
        if (b > c) {
            bc = b - c;
        } else {
            bc = c - b;
        }
        
        if (c > a) {
            ca = c - a;
        } else {
            ca = a - c;
        }
        
        if (ab < bc && ab < ca) {
            System.out.println(ab);
        } else if(bc < ca) {
            System.out.println(bc);
        } else {
            System.out.println(ca);
        }
    }
    
    public static void main43 (String [] args) {
        /* Programa que pregunte un número y tiene que escribir un 1,2,3 la cantidad del número escrita*/
        
        int n = sc.nextInt();
        int a = 0;
        
        for(int i = 1;i <= n; i++) {
            a++;
            System.out.println(a);
            if (a == 3) {
                a = 0;
            }
        }
    }
    
    public static void main44 (String [] args) {
        // Busca el siguiente número que acabe en 7 (usar resto de 10 para la última cifra)
        int x = sc.nextInt();
        
        while (x % 10 != 7){
            x++;            
        }
        System.out.println(x);
    }
    
    public static void main45 (String [] args) {
        // El usuario teclea un número y el programa escribe la suma de los números pares del 1
        // al número tecleado por el usuario
        int x = sc.nextInt();
        int a = 0;
        
        
        for(int i = 0; i <= x; i++) {
            if(i % 2 == 0) {
                a+=i;
                System.out.println(a);
            }
           
        }  
    }
    
    public static void main46 (String [] args) {
        /*
        Consideremos los números del 1 al 100.
        Quitemos que terminan en 4 o 6.
        ¿Cuánto suman los demás?
        */
        
        int a = 0;
        
        for(int i = 1; i <= 100; i++) {
            if(i % 10 != 4 && i % 10 != 6) {
                a+=i;  
            }
        } 
        System.out.println(a);
    }
    
    public static void main47 (String [] args) {
        /*
        Decidir si un número es primo o no
        */
        
        int x = sc.nextInt();
        boolean r = false;
        
        for(int i = 2; i < x && r == false; i++) {
            if(x % i == 0) {
                r = true;
            }
        }
        
        if (r == false) {
            System.out.println("Es primo:");
        } else {
            System.out.println("Es compuesto");
        }
        
    }
    
    public static void main48 (String [] args) {
        /*
        Un programa que calcule la potencia con lo siguiente
        base = sc.nextInt();
        exponente = sc.nextInt();
        */
        
        int base = sc.nextInt();
        int exponente = sc.nextInt();
        int r = 1;
        
        for(int i = 1; i <= exponente; i++ ){
            r*=base;
        }
        
        System.out.println(r);
        
    }
    
    public static void main49 (String [] args) {
        /*
        Calcular la raiz cuadrada de un número.
        */
        
        double x = sc.nextDouble();
        double a = 0;
        double b = x;
        double m = (a + b) / 2;
        
        while(b - a > 1E-6) {
           if(m*m > x) {
                b = m;
                m = (a + b) / 2;   
            }else if (m*m < x){
                a = m;
                m = (a + b) / 2;  
            } 
        }
        System.out.println(m); 
    }
    
    public static void main50 (String [] args) {
        /*
        Preguntar 3 números y decir si alguno es el triple de otro
        */
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        
        if (x == y * 3) {
            System.out.println("El triple de " + x + " es " + y);
        }else if(x == z * 3) {
            System.out.println("El triple de " + x + " es " + z);
        }else if(y == x * 3) {
            System.out.println("El triple de " + y + " es " + x);
        }else if(y == z * 3) {
            System.out.println("El triple de " + y + " es " + z);
        }else if(z == x * 3) {
            System.out.println("El triple de " + z + " es " + x);
        }else if(z == y * 3) {
            System.out.println("El triple de " + z + " es " + y);
        }else {
            System.out.println("Ningun numero es el triple de otro");
        }
    }
    
    public static void main51 (String [] args) {
        /*
        Preguntar 3 números y decir cual es más guapo
        
        1. Cualquier número impar es más guapo que cualquier número par.
        
        2. Entre dos números impares, el mayor es más guapo.
        
        3. Entre dos números pares, el menor es más guapo.
        */
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int r = 0;
        
        if(a % 2 == 0 && b % 2 != 0){
            r = b;
        }else if(a % 2 != 0 && b % 2 == 0){
            r = a;
        }else if(a % 2 != 0) {
            if(a > b){
                r = a;
            }else {
                r = b;
            }
        }else if(a % 2 == 0){
            if(a > b) {
                r = b;
            } else{
                r = a;
            }
        }
        
        if(r % 2 == 0 && c % 2 != 0){
            r = c;
        }else if(r % 2 != 0 && c % 2 == 0){
            r = r;
        }else if(r % 2 != 0) {
            if(r > c){
                r = r;
            }else {
                r = c;
            }
        }else if(r % 2 == 0){
            if(r > c) {
                r = c;
            } else{
                r = r;
            }
        }
        
        System.out.println(r);
        
        
    }
    
    // Entornos
    public static void main52 (String [] args) {
        
        int a = 10;
        int b = 7;
        int c = 0;
        
        for(int i = 1; i <= a; i++){
            c = c + b;
            b--;
        }
    }
    
    public static void main53 (String [] args) {
        
        int numero = 1;
        int suma = 0;
        
        while(numero < 5){
            suma = suma + numero;      
            if(suma > 3){
                numero = numero + 2;
            }else {
                numero ++;
            }
        }
    }
    
    public static void main54 (String [] args) {
        int base = 3;
        int exponente = 4;
        int resultado = 1;
                
        for(int i = 1; i <= exponente; i++) {
            resultado*=base;
        }
        
        System.out.println("Resultado: " + resultado);
             
    }
    
    public static void main55 (String [] args) {
        
        int i = 10;
        int numeroVeces = i;
        int j = 0;
        
        System.out.println("Vamos a contar " + numeroVeces + " veces hasta 10");
        
        for(i = 10; i > 0; i--) {
            System.out.println("Cuenta numero " + i + " ");
            numeroVeces = i;
            
            for(j = 0; j <= 10; j++){
                System.out.println(j);
            }
        }
    }
    
    public static void main56 (String [] args) {
        
        int contador = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                contador++;
            }
        }
        
        System.out.println("Total multiplos: " + contador);

    }
    
    public static void main57 (String [] args) {
        /*
        Preguntar números hasta encontrar un cero.
        Al final decir si los números estaban desordenados
        */
        
        int x = sc.nextInt();
        int z = x;
        boolean asc = true;
        boolean desc = true;
        
        while (x != 0) {
            if(z > x){
                asc = false;
            }
               
            if(z < x){
                desc = false;
            }
            
            z = x;
            x = sc.nextInt();
        }
        
        if(asc == true || desc == true){
            System.out.println("Estan ordenados");
        }else {
            System.out.println("Estan desordenados");
        }
    }
    

    
    public static void main58 (String [] args) {
            /*
            El mayor mas el doble del menor
            */
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int mayor = a;
        int menor = a;
        
        if (b > mayor){
            mayor = b;
        } else if (b > menor) {
            menor = b;
        }
        
        if (c > mayor) {
            mayor = c;
        } else if (c < menor){
            menor = c;
        }
        
        System.out.println(mayor + menor*2);
    }
    
    public static void main59 (String [] args){
        /*
        Cuántas cifras tiene x
        */
        int x = sc.nextInt();
        int i;
        
        for(i = 1; x >= 10; i++){
            x = x/10;
        }
        
        System.out.println(i);
    }
    
    
   
}
