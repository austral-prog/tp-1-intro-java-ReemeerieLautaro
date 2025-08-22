package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {


    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        System.out.println(a);
        System.out.println(b);
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
        if (a > b) {
            return a;
        }
        return b;
    }


    // 4. Factorial of a Number
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int contador = 0;
        for (int i = 0; i < input.length(); i++) {
            contador += 1;
        }
        return contador;
    }

    // 6. Reverse a String
    public String reverse(String input) {
        String resultado = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            resultado += input.charAt(i);
        }
        return resultado;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
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
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        int suma = 0;
        for (int i : list) {
            suma += i;
        }
        return suma;
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("list is empty");
        }
        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        for (String i : list) {
            if (i.equals(element)) {
                return true;
            }
        }
        return false;
    }


    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String i : list) {
            i = i.toUpperCase();
            result.add(i);
        }
        return result;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set;
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        for (String i : map.keySet()) {
            if (key.equals(i)) {
                return true;
            }
        }
        return false;
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        for (String i : map.values()) {
            if (value.equals(i)) {
                return true;
            }
        }
        return false;
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String line = entry.getKey() + " -> " + entry.getValue();
            System.out.println(line);  // imprime en consola
            result.add(line);          // lo guarda en la lista
        }
        return result;
    }
}