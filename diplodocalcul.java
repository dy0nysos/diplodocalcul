class diplodocalcul extends Program{
    /*Diplodocalcul:
      logiciel ludo-éducatif destiné à des élèves de 5 à 11 ans les guidant dans leur apprentissage des mathématiques.
      Logiciel créé dans le cadre du controle continu du module d'algorithmique et programmation du DUT informatique à l'IUTA de Lille 1 pour l'année 2011-2012.
      Il est distribué sous licence Mozilla Foundation et disponible gratuitement. Le code source est également disponible
    */
    /* fonction calcul. on rentre la difficulte, le niveau et le tableau d'operateurs.
    */
    int calcul(int difficulte,int niveau,String [] operateur){
	String operateurs="";
	int operande1=0,operande2=0,reponseADonner=0;
   //on genere une string avec un operateur choisi aleatoirement
	operateurs=operateur[(int)(random()*(niveau+1))];
	if(operateurs=="/"){
   //gestion des cas menant a un divide/0 ou une opération avec reste 
	    while(operande1==0 || operande2==0 || operande1%operande2!=0){
		operande2=(int)(random()*difficulte);
		operande1=(int)(random()*difficulte);
	    }
	    println(operande1+"/"+operande2);
	    reponseADonner=(operande1/operande2);
	}
	else{
	    operande1=(int)(random()*difficulte);
	    operande2=(int)(random()*difficulte);
	    if (operateurs=="+"){
		reponseADonner=(operande1+operande2);
		println(operande1+"+"+operande2);
	    }
	    else if(operateurs=="-"){
		reponseADonner=(operande1-operande2);
		println(operande1+"-"+operande2);
	    }
	    else if(operateurs=="*"){
		reponseADonner=(operande1*operande2);
		println(operande1+"*"+operande2);
	    }
	}
	return reponseADonner;
    }
    void algorithm(){
	int difficulte=5,niveau=3,operande1,operande2,reponseADonner,reponseEleve,mode=0;
	boolean continuerCalcul=false,niveauCorrect=false,nomEtPrenom=false,modeCorrect=false;
	String prenom="",nom="";
   //tableau d'operateurs utilisés dans la fonction calcul
	String [] operateur  = new String [4];
	operateur[0]="+";
	operateur[1]="-";
	operateur[2]="*";
	operateur[3]="/";;

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
		println("Veuillez choisir la classe: \n1)Grande Section\n2)Cours primaire\n3)Cours elementaire 1 et 2\n4)Cours moyen 1 et 2");
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
	print("\n\n\n\n");
	//Fonction génératrice de calculs en fonction du niveau. On se sert du tableau d'opérandes créée au début du programme
	println(calcul(difficulte,niveau,operateur));
    }
}