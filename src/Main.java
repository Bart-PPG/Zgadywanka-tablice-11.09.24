import java.util.*;

public class Main {
    public static void main(String[] args) {

        //tablica musi miec z gory okreslony rozmiar
        // nie mozna go pozniej zmienic
        //elemntem tablicy moga byc typy proste i zlozone
        //tablica 6 elementowa z wartosciami losowymi z zakresu 1 do 100
        int tabliczaLosowych [] = new int[6];
        for (int i = 0; i <tabliczaLosowych.length ; i++) {
            tabliczaLosowych[i] = (int) (Math.random()*100+1);
        }
        //wypisywanie elementow z tablicy
        for (int element:tabliczaLosowych         ) {
            System.out.print(element+", ");
        }
        //kolekcje, elementy typami zlozonymi
        //nie musza miec zdefiniowanego rozmiaru
        //rozmiar w trakcie moze sie zmieniac
        //listy List, zbiory set, mapy

        //wstawianie liczb z klawiatury do kolekcji
        List<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        System.out.println("Wstawione liczby: ");
        for (Integer liczbaWpisana:listaLiczbWpisanych){
            System.out.println(liczbaWpisana);
        }
        //wypisywanie inaczej
        System.out.println("Wstawione liczby: ");
        for (int i = 0; i < listaLiczbWpisanych.size(); i++) {
            System.out.println(listaLiczbWpisanych.get(i));
        }
        //losowanie liczb bez powtorzen
        ArrayList<Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100+1);
            while (listaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        System.out.println("wylosowane bez powtorzen");
        System.out.println(listaLosowychBezPowtorzen);
        //losowanie bez powtorzen do zbioru
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size()<6){
            int liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);
        //lista
        /*
           elementy moga sie powtarzac
           elementy sa indeksowane
         */
        //zbior zazwyczaj
        /*
        elementy unikatowe
        elementy nie sa indeksowane
         */
    }
}