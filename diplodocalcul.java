class diplodocalcul extends Program{
  /*Diplodocalcul:
  logiciel ludo-éducatif destiné à des élèves de 5 à 11 ans les guidant dans leur apprentissage des mathématiques.
  Logiciel créé dans le cadre du controle continu du module d'algorithmique et programmation du DUT informatique à l'IUTA de Lille 1 pour l'année 2011-2012.
  Il est distribué sous licence Mozilla Foundation et disponible gratuitement. Le code source est également disponible
  */
  /*doc pour la fonction de génération de calcul:
  http://java.developpez.com/faq/java/?page=langage_chaine#LANGAGE_STRING_chaine_en_nombre
String phrase = "12";
int i;
i = Integer.parseInt(phrase);
Permet de convertir un String en int. Pour nous, on créé un String avec les opérandes et l'opérateur et on convertit ;)
*/
    void algorithm(){
    int difficulte,niveau,operande1,operande2,reponseADonner,reponseEleve,mode;
    boolean continuerCalcul=false,niveauCorrect=false,nomEtPrenom=false,modeCorrect=false;
    String prenom,nom;
    int operandes[4];
    //Enregistrement nom et prenom
    while(!nomEtPrenom){
        if(nom != "" && prenom != ""){
        nomEtPrenom=true;}
        else{
        println("Veuillez entrer le prénom");
        prenom=readString();
        println("Veuillez entrer le nom");
        nom=readString();
        }
    }
    //enregistrement niveau
    while(!niveauCorrect){
        if(niveau >=1 && niveau <= 4){
        niveauCorrect=true;}
        else{
        println("Veuillez choisir la classe: \n1)Grande Section\n2)Cours
primaire\n3)Cours elementaire 1 et 2\n4)Cours moyen 1 et 2");
        niveau=readInt();
        }
    }
    //choix du mode
    while(!modeCorrect)
        {if(mode >= 1 && mode <= 2){
            modeCorrect = true;
        }
            else{
            println("Veuillez choisir le mode:\n1)Apprentissage(illimité)\n2)Examen");
            mode=readInt();
            }
        }
    //Fonction génératrice de calculs en fonction du niveau. On se sert du tableau d'opérandes créée au début du programme

