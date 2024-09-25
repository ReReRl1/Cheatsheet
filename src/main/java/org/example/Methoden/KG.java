package org.example.Methoden;

    /*
Die Software auf den ausgelieferten Computern wird weiterhin von den Mitarbeitenden des System-haus KG verwaltet.
Hierfür steht eine Software zur Verfügung. Sie erhalten den Auftrag, ein Modul dieser Software zu erweitern.

Im Pflichtenheft finden Sie folgende Beschreibung der Logik:
Die Suche nach einem Computer soll in diesem Modul über die MAC-Adresse möglich sein.
Die Methode SucheMAC erhält als Übergabeparameter ein Array mit MAC-Adressen, das durchsucht werden soil.
Der zweite Parameter ist die MAC-Adresse, die gefunden werden soll. Als Rückgabewert soll true zurückgegeben werden,
wenn die gesuchte Adresse im Array vorhanden ist, andernfalls false.

- Erstellen Sie die Suchlogik. Entscheiden Sie sich für eine der folgenden Darstellungsmöglichkeiten:
  Programmiersprache, Pseudocode, Struktogramm oder Programmablaufplan.
 */

public class KG {






    public static void main(String[] args) {

        String [] macAdresse = {"00:0a:95:9d:68:16", "00:0a:95:9d:68:17", "00:0a:95:9d:68:18", "00:0a:95:9d:68:19"};
        String gesuchteMac = "00:0a:95:9d:68:17";

        System.out.println(sucheMac(macAdresse, gesuchteMac));




    }


    public static boolean sucheMac(String [] macAdresse, String gesuchteMac){


        for (String j: macAdresse) {   // diese schreibweise ist wie for, nur verkürzt, : und Array/Liste


            if (j.equals(gesuchteMac)) {


                return true;
            }

        }


        return false;
    }
}
