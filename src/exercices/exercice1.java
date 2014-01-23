package exercices;

import net.sf.json.JSONArray;
import net.sf.json.JSONSerializer;
import utilitaires.FileReader;

public class exercice1 {

    public static void main(String[] args) throws Exception {
        String contenuTexte = FileReader.loadFileIntoString("json/collection.json", "UTF-8");
        JSONArray collectionJSON = (JSONArray) JSONSerializer.toJSON(contenuTexte);
        System.out.println("Nombre d'article(s): " + collectionJSON.size());
    }
}
