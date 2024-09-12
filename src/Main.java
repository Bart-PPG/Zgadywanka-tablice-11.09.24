import java.util.*;

public class Main {




    /**
     * metoda wylosujliczbe losuje liczbe calkowita z zakrsesu 1 do 100
     * @param ile - liczba calkowita przechowujaca ile liczb losujemy
     * @return lista z wylosowanymi liczbami
     */
    //metody
    private static ArrayList<Integer> wylosujLiczbe (int ile) {
        ArrayList<Integer> listaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (listaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        return listaLosowychBezPowtorzen;
    }
    private static ArrayList<Integer> wpiszLiczbyZklawiatury(int ile){
        ArrayList<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        return listaLiczbWpisanych;
    }
    private static void wypisKolekcje(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania){
            System.out.println("Element:"+element);
        }
    }
    private static LinkedList<Integer> zwrocTrafione(ArrayList<Integer> listaLiczbWpisanych, ArrayList<Integer>listaLiczbLosowych){
        LinkedList<Integer> trafione = new LinkedList<>();
        //trafione to elementy ktore wystepuja w wylosowanych i wpisanych
        for (Integer wpisana: listaLiczbWpisanych){
            if (listaLiczbLosowych.contains(wpisana)){
                trafione.add(wpisana);
            }

        }
        return trafione;
    }

    public static void main(String[] args) {
//losowanie liczby
        ArrayList<Integer> losowe = wylosujLiczbe(6);
        System.out.println("Wylosowana liczba");
        wypisKolekcje(losowe);
        ArrayList<Integer> wpisane = wpiszLiczbyZklawiatury(6);
        wypisKolekcje(wpisane);
        LinkedList<Integer> trafione = zwrocTrafione(losowe, wpisane);
        wypisKolekcje(trafione);
    }
}