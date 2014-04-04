package ca.uqam.inf2015.jsonapplication.exercices;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import ca.uqam.inf2015.jsonapplication.utilitaires.FileReader;

public class exercice3 {

    public static void main(String[] args) throws Exception{
        /*Afficher le nom et le prix des articles qui sont en stock*/
        String contenu = FileReader.loadFileIntoString("JSON/collection.json", "UTF-8");
        JSONArray collectionJSON = JSONArray.fromObject(contenu);
        
        System.out.println("Prix des articles en stock: ");
        for (int i = 0; i < collectionJSON.size(); i++) {
            JSONObject article = collectionJSON.getJSONObject(i);
            if (article.getInt("quantite") > 0) {
                String nom = article.getString("nom");
                Double prix = article.getDouble("prix");
                System.out.println("-" + nom + " : " + prix.toString() + "$");
            }
        }
    }
}
