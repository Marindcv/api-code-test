# api-code-test

API coding test April 2022

Liste des sites dont je me suis aidé:

URL de l'API : https://app-codetest.herokuapp.com

Appel Post pour l'envoie des variables :
POST : https://app-codetest.herokuapp.com/
Body :

``` 
{
"int1": 2,
"int2": 7,
"limit": 300,
"str1": "fizz",
"str2": "buzz"
}
```
(export Postmann disponnible) : Api-code-test.postman_collection.json

### Les Site dont je me suis aidé:

* Mon gitignore vient d'ici : https://www.toptal.com/developers/gitignore/api/intellij,gradle,java,macos
* M'ont aidé pour la mise en place de Gradle : https://www.jetbrains.com/help/idea/gradle.html#convert_project_to_gradle
  https://start.spring.io
  https://projectlombok.org/setup/gradle
* M'a aidé pour l'architecture des API: https://www.geeksforgeeks.org/how-to-create-a-rest-api-using-java-spring-boot/
* M'a aidé à débloqué mon pb de bean : https://www.youtube.com/watch?v=4G677G_4OIM
* Parce que j'ai pas pratiqué le java depuis un moment et que je sais plus comment déclarer une array
  correctement: https://www.w3schools.com/java/java_arraylist.asp
* Parce que je me souviens plus des
  modulo : https://stackoverflow.com/questions/3900184/how-to-determine-the-multiples-of-numbers-in-java
* Parce que je sais plus comment marche une liste (ou parce qu'il est
  tard) : https://mkyong.com/java/java-get-the-last-element-of-a-list/
* Je sais plus exactement pourquoi, mais c'etait dans mes onglets ouvert donc ça à du m'aider à un
  moment : https://www.baeldung.com/building-a-restful-web-service-with-spring-and-java-based-configuration
* Pour le deploiement sur Heroku:
  * https://devcenter.heroku.com/articles/github-integration
  * https://devcenter.heroku.com/articles/logging#view-logs
  * https://devcenter.heroku.com/articles/deploying-gradle-apps-on-heroku
  * Problème lié à Gradle:
    * https://docs.gradle.org/current/userguide/single_versions.html
    * https://stackoverflow.com/questions/25208876/heroku-fails-to-pick-gradle-wrapper-and-correct-java-version
    * https://gradle.org/releases/
    * https://stackoverflow.com/questions/20348451/why-should-the-gradle-wrapper-be-committed-to-vcs
  * https://www.youtube.com/watch?v=7bnyth4ayS8
  * https://devcenter.heroku.com/articles/procfile
  * https://dev.to/lawrence_eagles/causes-of-heroku-h10-app-crashed-error-and-how-to-solve-them-3jnl
  * https://stackoverflow.com/questions/27715404/deploying-a-gradle-app-to-heroku
