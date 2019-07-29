package poo.u3.e9;

import java.util.ArrayList;
import java.util.Iterator;

public class PooU3E9 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros=new ArrayList<>();
        numeros.add(23);
        numeros.add(43);
        numeros.add(53);
        numeros.add(342);
        numeros.add(695);
        numeros.add(54);
        numeros.add(76);
        numeros.add(60);
        numeros.add(47);
        numeros.add(14);
        int mayor = numeroMayor(numeros);
        System.out.println("El numero mayor del arreglo es: "+mayor);
        int menor = numeroMenor(numeros);
        System.out.println("El numero menor del arreglo es: "+menor);
    }
    static int numeroMayor(ArrayList numeros){
        int mayor=0;
        Iterator<Integer> i= numeros.iterator();
        while(i.hasNext()){
            int numero=i.next();
            if(numero>mayor){
                mayor=numero;
            }
        }return mayor;
    }
        static int numeroMenor(ArrayList numeros){
        
        Iterator<Integer> i= numeros.iterator();
        int menor=i.next();
        while(i.hasNext()){
            int numero=i.next();
            if(numero<menor){
                menor=numero;
            }
        }return menor;
    }       
        }
