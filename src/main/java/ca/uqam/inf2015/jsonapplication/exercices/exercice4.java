package ca.uqam.inf2015.jsonapplication.exercices;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class exercice4 {

    public static void main(String[] args) {
        /* Créer un nouvel objet JSON et y ajouter des éléments*/
        
        JSONObject commande = new JSONObject();
        commande.accumulate("noCommande", 10432);
        commande.accumulate("date", "2014-01-23");
        commande.accumulate("total", 35.99);
        
        JSONObject article = new JSONObject();
        article.accumulate("id", 125);
        article.accumulate("nom", "Breaking Bad");
        
        JSONArray articles = new JSONArray();
        articles.add(article);
        
        commande.accumulate("articles", articles);
        
        System.out.println(commande.toString(4));
    }
}
