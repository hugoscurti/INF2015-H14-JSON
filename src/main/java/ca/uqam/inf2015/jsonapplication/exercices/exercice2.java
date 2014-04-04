package ca.uqam.inf2015.jsonapplication.exercices;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import ca.uqam.inf2015.jsonapplication.utilitaires.FileReader;

public class exercice2 {

    public static void main(String[] args) throws Exception {
        /*Afficher le nom des articles qui sont de type 'film'*/
        
        String contenu = FileReader.loadFileIntoString("JSON/collection.json", "UTF-8");
        JSONArray collectionJSON = JSONArray.fromObject(contenu);
        
        System.out.println("Nom des articles de type 'film' :");
        for (int i = 0; i < collectionJSON.size(); ++i) {
            JSONObject article = collectionJSON.getJSONObject(i);
            String type = article.getString("type");
            if (type.equals("film")) {
                System.out.println("-" + article.getString("nom"));
            }
        }
        
    }
}
