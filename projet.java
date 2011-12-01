class projetpropre extends Program{
int 
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

