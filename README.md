INF2015-H14-JSON
================

Dépôt de la solution des exercices de la démonstration sur json-lib du 23 janvier 2014.


Quelques infos supplémentaires
---------

#### JSONArray
* On obtient l'objet JSONObject d'un tableau JSONArray avec la fonction getJSONObject(int index).
* Les éléments d'un tableau ne sont pas nécessairement des objets, ils
  peuvent également être un entier, un string, un double, un booléen, la
  valeur null, ainsi qu'un tableau (JSONArray). De plus, il n'est pas nécessaire
  que tous les éléments d'un tableau soient du même type.
    * Ex: [213, 12, true, 12.2, "bonjour"] est un tableau valide
* Un objet JSONArray possède une fonction d'obtention pour chaque type:
    * getJSONObject
    * getString
    * getInt
    * getDouble
    * getBoolean
    * getJSONArray
    * getNull
* On peut instancier un objet JSONArray avec soit la fonction JSONArray.fromObject(),
  soit la fonction JSONSerializer.toJSON().
  
    JSONArray monTableau = (JSONArray) JSONSerializer.toJSON(contenuString);
    ou
    JSONArray monTableau = JSONArray.fromObject(contenuString);
    

#### JSONObject
* On obtienr les éléments d'un objet avec les mêmes fonctions d'obtention(getString, getInt, etc...),
  sauf qu'on passe en paramètre la clé associé à l'élément, et non l'index.
* On peut instancier un objet JSONObject avec soit la fonction JSONObject.fromObject(),
  soit la fonction JSONSerializer.toJSON().
  
    JSONObject monObjet = (JSONObject) JSONSerializer.toJSON(contenuString);
    ou
    JSONObject monObjet = JSONObject.fromObject(contenuString);
    

#### Fonction toString()
Lorsqu'on veut mettre un JSONObject ou un JSONArray en string, on peut utiliser la fonction .toString().
De plus, une surcharge de cette fonction permet d'intenter avec un facteur d'intentation le string généré par la fonction toString().
* Ex: monObjectJSON.toString(4) me retournera un string qui est formatté avec 4 espaces pour chaque niveau d'intentation.


#### Fonction fromObject()
La fonction fromObject() permet non seulement de créer un JSONObject ou un JSONArray à partir d'un string, mais permet également
de copier un objet existant dans un autre objet du même type.

Par exemple

    JSONObject maCopie = JSONObject.fromObject(monAutreJSONObject);
    
créera un noueau JSONObject nommé 'maCopie' avec les valeurs du JSONObject nommé 'monAutreJSONObject'.
Le principe est le même pour les objets JSONArray.
