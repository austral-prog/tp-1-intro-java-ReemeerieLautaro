package com.template;

public class App {


    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        System.out.println(a);
        System.out.println(b); //esto puede ser para ver los valores que toman los parametros en el test
        return a + b;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }


    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a > b) {
            return a;
        }
        return b;
    }


    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int result = 1;
        for (int i = 1; i <= n; i++) { // sumarle 1 a i
            result *= i; // al resultado se le multiplica i
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        int contador = 0;
        for (int i = 0; i < input.length(); i++) {
            contador += 1;
        }
        return contador;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        String resultado = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            resultado += input.charAt(i);
        }
        return resultado;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) { // ver si un numero es primo o no
        // TODO: Implement this method
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] < min) {
            min = array[i];
        }
    }
    return min;
}

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return celsius * 9.0 / 5.0 + 32;
    }
}
