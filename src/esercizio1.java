public class esercizio1 {
    public static void main(String[] args){

int numero1 = 263;
int numero2 = 7;


        System.out.println("Esercizio 1: il risultato di " + numero1 + " moltiplicato per " + numero2 + " é uguale a: " + numero1 * numero2 );


//--------Esercizio 1 parte 3----------

        String[] arrayOriginale = {"Esercizio", "numero", "uno", "back", "end", };
        String newString = "corso";
        String[] newArray = inserisciInArray(arrayOriginale, newString);
        for(String str : newArray){
            System.out.println(str);
        }
    }

public static String[] inserisciInArray(String[] arrayOriginale, String newString) {
        if (arrayOriginale.length != 5) {
            throw new IllegalArgumentException("L'array originale contiene 5 elementi!");
        }


        String[] newArray = new String[6];

        System.arraycopy(arrayOriginale, 0, newArray, 0, 3);
newArray[3] =newString;

System.arraycopy(arrayOriginale, 3, newArray,4, 2);

return newArray;
}

}
