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
    }
}