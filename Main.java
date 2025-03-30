//EJERCICIO 1



public static int sumaDeImpares(){
    int suma = 0;

    for (int i = 0; i < 50; i++) {
        if (i % 2 != 0){
            suma = suma + i;
        }
    }

    System.out.println("el resultado es: " + suma);
    return suma;
}

public static void main(String[] args) {
    sumaDeImpares();
}
