class diplodocalcul extends Program{
    String operateurChoisi;
    double operande1=0,operande2=0;
    String [] reponse = new String [2];
    // on genere un operateur en fonction du niveau
    void operateur(int niveau){
	String [] operateurs = new String [12];
	operateurs[0]="+";//add simple = niveau 1
	operateurs[1]="-";//sous simple = niveau2 
	operateurs[2]="*";//mult 1 chiffre = niveau 3
	operateurs[3]="+";//add complexe = niveau 4
	operateurs[4]="-";//sous complexe = niveau 5
	operateurs[5]="+";//add flottante = niveau 6
	operateurs[6]="-";//sous flottante = niveau 7
	operateurs[7]="/";//division entiere = niveau 8
	operateurs[8]="*";//mult compliquee = niveau 9
	operateurs[9]="/";//division  compliquee = niveau 10
	operateurs[10]="*";//multi flottante = niveau 11
	operateurs[11]="/";//division flottante = niveau 12
	operateurChoisi=operateurs[(int)(random()*niveau)];
    }
    //en fonction de l operateur genere on genere un calcul avec la fonction appropriee appelee dans l'algo principal
    void addition(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	switch (niveau){
	case 1:
	    operande1=(int)((random()*10)+1);
	    operande2=operande1;
	case 2:
	    operande1=(int)((random()*10)+1);
	    operande2=(int)((random()*10)+1);
	    break;
	case 3:
	    operande1=(int)((random()*10)+1);
	    operande2=(int)((random()*10)+1);
	    break;
	case 4:
	    operande1=(int)((random()*50)+1);
	    operande2=(int)((random()*50)+1);
	    break;
	case 5:
	    operande1=(int)((random()*100)+1);
	    operande2=(int)((random()*100)+1);
	    break;
	case 6:
	    operande1=((int)((random()*1000)+1))/10.0;
	    operande2=((int)((random()*1000)+1))/10.0;
	    break;
	case 7:
	    operande1=((int)((random()*10000)+1))/100.0;
	    operande2=((int)((random()*10000)+1))/100.0;    
	    break;
	case 8:
	    operande1=((int)((random()*100000)+1))/100.0;
	    operande2=((int)((random()*100000)+1))/100.0;
	    break;
	case 9:
	    operande1=((int)((random()*1000000)+1))/100.0;
	    operande2=((int)((random()*1000000)+1))/100.0;
	    break;
	case 10:
	    operande1=((int)((random()*1000000)+1))/100.0;
	    operande2=((int)((random()*1000000)+1))/100.0;
	    break;
	case 11:
	    operande1=((int)((random()*1000000)+1))/100.0;
	    operande2=((int)((random()*1000000)+1))/100.0;
	    break;
	default:
	    println("Un soucis a ete detecte");
	    break;
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //fonction soustraction
    void soustraction(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	switch (niveau){
	case 1:
	    operande1=(int)(random()*11);
		operande2=(int)(random()*11);
	    break;
	case 2:
		operande1=(int)(random()*500);
		operande2=(int)(random()*500);
	    break;
	case 3:
	    operande1=(int)(random()*10000);
	    operande2=(int)(random()*10000);
	    break;
	case 4:
	    operande1=(int)(random()*10000);
	    operande2=(int)(random()*10000);
	    break;
	case 5:
		operande1=(int)(random()*10000);
		operande2=(int)(random()*10000);
		break;
	case 6:
		operande1=(int)(random()*10000);
		operande2=(int)(random()*10000);
	    break;
	case 7:
		operande1=(int)(random()*10000);
		operande2=(int)(random()*10000);
	    break;
	case 8:
		operande1=(int)(random()*10000);
		operande2=(int)(random()*10000);
	    break;
	case 9:
		operande1=(int)(random()*10000);
		operande2=(int)(random()*10000);
  	    break;
	case 10:
		operande1=(int)(random()*10000);
		operande2=(int)(random()*10000);
	    break;
	case 11:
	    
	    break;
	default:
	    println("Un soucis a ete detecte");
	    break;
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //fonction multiplication
    void multiplication(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	switch (niveau){
	case 3:
	    operande1=(int)(random()*10)+1;
	    operande2=(int)(random()*5)+1;
	    break;
	case 4:
	    operande1=(int)(random()*10)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 5:
	    operande1=(int)(random()*20)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 6:
	    operande1=(int)(random()*20)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 7:
	    operande1=(int)(random()*25)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 8:
	    operande1=(int)(random()*100)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 9:
	    operande1=(int)(random()*100)+1;
	    operande2=(int)(random()*99)+1;
	    break;
	case 10:
	    operande1=(random()*1000)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 11:
	    operande1=(random()*1000)+1;
	    operande2=(random()*100)+1;
	    break;
	default:
	    println("Un soucis");
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //fonction division.
    void division(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	switch (niveau){
	case 7:
	    operande1=(int)((random()*10)+1);
	    operande2=(int)((random()*9)+1);
	    break;
	case 8:
	    operande1=(int)((random()*20)+1);
	    operande2=(int)((random()*9)+1);
	    break;
	case 9:
	    operande1=(int)((random()*99)+1);
	    operande2=(int)((random()*9)+1);
	    break;
	case 10:
	    operande1=(int)(random()*999)+1;
	    operande2=(int)(random()*99)+1;
	    break;
	case 11:
	    operande1=(random()*1000)+1;
	    operande2=(int)((random()*99)+1);
	    break;
	default:
	    println("Un soucis");
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    /*Algorithme principal */
    void algorithm(){
	int niveau=0,reponseEleve=0,mode=0,score=0,calculs=0,classe=0;
	double reponseADonner=0,reste=0,resteEleve=0;
	boolean continuerCalcul=false,niveauCorrect=false,nomEtPrenom=false,modeCorrect=false;
	String prenom="",nom="";
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
	    if(niveau >=1 && niveau <= 5){
		niveauCorrect=true;}
	    else{
		println("Veuillez choisir la classe: \n1)CP \n2)CE1 \n3)CE2 \n4)CM1 \n5)CM2");
		niveau=readInt.();
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

	//mode illimite. On calcule tant que l'utilisateur ne rentre pas 000 comme reponse.
	if(mode==1){
	    while(!continuerCalcul){
		//on genere un calcul et on verifie le résultat tant que l'utilisateur ne veut pas arreter
		operateur(niveau);
		calculs++;
		//on calcule le résultat de l'operation
		if(operateurChoisi.equals("+")){
		    addition(niveau,reponse);
		    println(reponse[0]);
		    println(Double.parseDouble(reponse[0])+"+"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])+Double.parseDouble(reponse[1]);
		}
		else if(operateurChoisi.equals("-")){
		    soustraction(niveau,reponse);
		    println(Double.parseDouble(reponse[0])+"-"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])-Double.parseDouble(reponse[1]);
		}
		else if(operateurChoisi.equals("*")){
		    multiplication(niveau,reponse);
		    println(Double.parseDouble(reponse[0])+"*"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])*Double.parseDouble(reponse[1]);
		}
		else{
		    division(niveau,reponse);
		    println(Double.parseDouble(reponse[0])+"/"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])/Double.parseDouble(reponse[1]);
		    reste=Double.parseDouble(reponse[0])%Double.parseDouble(reponse[1]);
		}
		reponseEleve= readInt();
		if(reponseEleve==000){
		    continuerCalcul=true;
		}
		//on verifie le resultat. Si c est une division, on verifie egalement le reste
		else{
		    if(reponseEleve==reponseADonner){
			if(operateurChoisi.equals("/")){
			    if(resteEleve==reste){
				score++;
			    }
			    else{
				println("Reste incorrect");
				println("Le reste était: "+reste);
			    }
			}
			score++;
			println("Résultat correct, votre score est de "+score+" points");
		    }
		    else{
			println("Réponse incorrecte.");
			println("La réponse correcte était: "+reponseADonner+" ");
		    }
		}
	    }	
	    println("Vous avez réalisé un score de: "+score+" points sur "+(calculs-1));
	}
	//on boucle sur 10 calculs.
	else if(mode==2){
	    for(int i=0;i<=9;i++){
		//on genere un calcul et on verifie le résultat tant que l'utilisateur ne veut pas arreter
		operateur(niveau);
		calculs++;
		//on calcule le résultat de l'operation
		if(operateurChoisi.equals("+")){
		    addition(niveau,reponse);
		    println(reponse[0]);
		    println(Double.parseDouble(reponse[0])+"+"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])+Double.parseDouble(reponse[1]);
		}
		else if(operateurChoisi.equals("-")){
		    soustraction(niveau,reponse);
		    println(Double.parseDouble(reponse[0])+"-"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])-Double.parseDouble(reponse[1]);
		}
		else if(operateurChoisi.equals("*")){
		    multiplication(niveau,reponse);
		    println(Double.parseDouble(reponse[0])+"*"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])*Double.parseDouble(reponse[1]);
		}
		else{
		    division(niveau,reponse);
		    println(Double.parseDouble(reponse[0])+"/"+Double.parseDouble(reponse[1]));
		    reponseADonner=Double.parseDouble(reponse[0])/Double.parseDouble(reponse[1]);
		    reste=Double.parseDouble(reponse[0])%Double.parseDouble(reponse[1]);
		}
		reponseEleve= readInt();
		if(reponseEleve==000){
		    continuerCalcul=true;
		}
		else{
		    if(reponseEleve==reponseADonner){
			if(operateurChoisi.equals("/")){
			    if(resteEleve==reste){
				score++;
			    }
			    else{
				println("Reste incorrect");
				println("Le reste était: "+reste);
			    }
			}
			score++;
			println("Résultat correct, votre score est de "+score+" points");
		    }
		    else{
			println("Réponse incorrecte.");
			println("La réponse correcte était: "+reponseADonner+" ");
		    }
		}
	    }
	    println("Vous avez réalisé un score de: "+score+" points sur "+(calculs));
	}
	else{
	    println("Une erreur impromptue s'est produite. Veuillez quitter le logiciel et relancer");
	}
    }
}