package ca.uqam.inf2015.jsonapplication.exercices;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import ca.uqam.inf2015.jsonapplication.utilitaires.FileReader;

public class exercice5 {

    public static void main(String[] args) throws Exception {
        /* Créer un nouvel objet JSON et y ajouter une unité de chaque articles de la collection
         * dont le prix est inférieur à 28$.
         */
        String contenu = FileReader.loadFileIntoString("JSON/collection.json", "UTF-8");
        JSONArray collection = JSONArray.fromObject(contenu);
              
        JSONArray articles = new JSONArray();
        double total = 0;
        
        for(int i = 0; i < collection.size(); i++) {
            JSONObject uniteArticle;
            JSONObject article = collection.getJSONObject(i);
            if (article.getDouble("prix") < 28.00) {
                uniteArticle = JSONObject.fromObject(article);
                uniteArticle.element("quantite", 1); //On veut 1 unité de cet article
                total += uniteArticle.getDouble("prix");
                articles.add(uniteArticle);
            }
        }
        
        JSONObject commande = new JSONObject();
        commande.accumulate("noCommande", 10432);
        commande.accumulate("date", "2014-01-23");
        commande.accumulate("prix", total);
        commande.accumulate("articles", articles);

        System.out.println(commande.toString(4));
        
    }
}
