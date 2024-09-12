import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gra {
    private static ArrayList<Integer> wylosowane = new ArrayList<>() ;
    private ArrayList<Integer> wpisane;
    private LinkedList<Integer> trafione;

    private void  wylosujLiczbe (int ile) {

        while (wylosowane.size()<ile) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (wylosowane.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            wylosowane.add(liczba);
        }

    }
    private void wpiszLiczbyZklawiatury(int ile){
         wpisane = new ArrayList<>();
        System.out.println("podaj 6 liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            wpisane.add(liczba);
        }
    }
    private void wypisKolekcje(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania){
            System.out.print(element+" ");
        }
    }
    private void zwrocTrafione(){
        trafione = new LinkedList<>();
        //trafione to elementy ktore wystepuja w wylosowanych i wpisanych
        for (Integer wpisana: wpisane){
            if (wylosowane.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
    }
    public void zagraj(){
        wylosujLiczbe(6);
        wpiszLiczbyZklawiatury(6);
        zwrocTrafione();
        System.out.println("Wpisano: ");
        wypisKolekcje(wpisane);
        System.out.println("Wylosowano: ");
        wypisKolekcje(wylosowane);
        System.out.println("Trafiono: ");
        wypisKolekcje(trafione);
    }
}
