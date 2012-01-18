class diplodocalcul extends Program{
    //variables globales
    String operateurChoisi;
    double operande1=0,operande2=0;
    String [] reponse = new String [2];
    //procedure enregistrement resultats eleves
    void enregistrementres(String prenom,String nom,String niveau,String score){
	String [][] tab;
	CSVFile fichiercsv=loadCSV("resultats.csv");
	int nombreligne= rowCount(fichiercsv);
	tab=new String [nombreligne+1][4];
	for(int i=0;i<nombreligne;i++){
	    for(int j=0;j<4;j++){
		tab[i][j]=getCell(fichiercsv,i,j);
	    }
	}
	tab[nombreligne][0]=nom;
	tab[nombreligne][1]=prenom;
	tab[nombreligne][2]=niveau;
	tab[nombreligne][3]=score;
	saveCSV(tab,"resultats.csv");
    }
    
    //cette procedure genere aleatoirement en fonction du niveau un operateur qui sera utilise dans le calcul
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
    //En fonction de l'operateurChoisi, la procedure correspondante a l'operateur est appellee avec le niveau
    //Elle genere deux nombres( int ou double selon le niveau) et les renvoie dans un tableau
    void addition(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	switch (niveau){
	case 1:
	    operande1=(int)((random()*10)+1);
	    operande2=operande1;
	    break;
	case 2:
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
	    operande1=((int)((random()*1000)+1))/100.0;
	    operande2=((int)((random()*1000)+1))/100.0;    
	    break;
	case 8:
	    operande1=((int)((random()*10000)+1))/100.0;
	    operande2=((int)((random()*10000)+1))/100.0;
	    break;
	case 9:
	case 10:
	case 11:
	case 12:
	    operande1=((int)((random()*10000)+1))/100.0;
	    operande2=((int)((random()*10000)+1))/10.0;
	    break;
	default:
	    println("Un soucis a ete detecte");
	    break;
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //procedure de soustraction. Genere deux nombres ( int ou double selon le niveau) et les renvoie dans un tableau
    void soustraction(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	double stock=0;
	switch (niveau){
	case 1:
	    operande1=(int)(random()*10)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 2:
	    operande1=(int)(random()*10)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 3:
	    operande1=(int)(random()*25)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 4:
	    operande1=(int)(random()*100)+1;
	    operande2=(int)(random()*10)+1;
	    break;
	case 5:
	    operande1=(int)(random()*100)+1;
	    operande2=(int)(random()*1000)+1;
	    break;
	case 6:
	    operande1=(int)(random()*1000)+1;
	    operande2=(int)(random()*1000)+1;
	    break;
	case 7:
	    operande1=((int)(random()*10000)+1)/10.0;
	    operande2=((int)(random()*10000)+1)/10.0;
	    break;
	case 8:
	    operande1=((int)(random()*10000)+1)/100.0;
	    operande2=((int)(random()*10000)+1)/100.0;
	    break;
	case 9:
	    operande1=((int)(random()*10000)+1)/100.0;
	    operande2=((int)(random()*10000)+1)/10.0;
  	    break;
	case 10:
	    operande1=((int)(random()*100000)+1)/10.0;
	    operande2=((int)(random()*100000)+1)/100.0;
	    break;
	case 11:
	case 12:
	    operande1=((int)(random()*100000)+1)/100.0;
	    operande2=((int)(random()*100000)+1)/100.0; 
	    break;
	default:
	    println("Un soucis a ete detecte");
	    break;
	}
	//gestion du cas ou le resultat est negatif.
	if (operande1-operande2<0){
	    stock=operande1;
	    operande1=operande2;
	    operande2=stock;
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //procedure multiplication. Genere deux nombres (int ou double selon niveau) et renvoie dans un tableau
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
	    operande1=(int)(random()*1000)+1;
	    operande2=(int)(random()*999)+1;
	    break;
	case 11:
	    operande1=((int)(random()*10000)+1)/100.0;
	    operande2=(int)(random()*100)+1;
	    break;
	case 12:
	    operande1=((int)(random()*10000)+1)/100.0;
	    operande2=((int)(random()*1000)+1)/10.0;
	    break;
	default:
	    println("Un soucis");
	    break;
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //Procedure division. Genere deux nombres (int ou double selon niveau) et les renvoie dans un tableau
    void division(int niveau,String [] reponse){
	operande1=0;
	operande2=0;
	switch (niveau){
	case 8:
	    operande1=(int)((random()*10)+1);
	    operande2=(int)((random()*9)+1);
	    break;
	case 9:
	    operande1=(int)((random()*19)+1);
	    operande2=(int)((random()*9)+1);
	    break;
	case 10:
	    operande1=(int)((random()*59)+1);
	    operande2=(int)((random()*18)+1);
	    break;
	case 11:
	    operande1=(int)(random()*99)+1;
	    operande2=(int)(random()*30)+1;
	    break;
	case 12:
	    operande1=((int)(random()*1000)+1)/10.0;
	    operande2=(int)((random()*50)+1);
	    break;
	default:
	    println("Un soucis");
	    break;
	}
	reponse[0]=""+operande1;
	reponse[1]=""+operande2;
    }
    //fonction de calcul du resultat
    double resultatAddition(String nombre1,String nombre2){
	double number1=Double.parseDouble(nombre1);
	double number2=Double.parseDouble(nombre2);
	println(number1+" + "+number2);
	return (number1+number2);
    }
    double resultatSoustraction(String nombre1,String nombre2){
	double number1=Double.parseDouble(nombre1);
	double number2=Double.parseDouble(nombre2);
	println(number1+" - "+number2);
	return (number1-number2);
    }
    double resultatMultiplication(String nombre1,String nombre2){
	double number1=Double.parseDouble(nombre1);
	double number2=Double.parseDouble(nombre2);
	println(number1+" x "+number2);
	return (number1*number2);
    }
    
    /*Corps de l'algorithme*/
    void algorithm(){
	int niveau=0,mode=0,score=0,calculs=0,classe=0;
	double reponseADonner=0,reste=0,resteEleve=0, reponseEleve=0,number1=0,number2=0;
	boolean continuerCalcul=false,niveauCorrect=false,nomEtPrenom=false,modeCorrect=false;
	String prenom="",nom="",reponseString="",resteString="";
	
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
	    if(classe >=1 && classe <= 5){
		niveauCorrect=true;}
	    else{
		println("Tapez le numero de la classe choisie: \n1)CP \n2)CE1 \n3)CE2 \n4)CM1 \n5)CM2");
		classe=readInt();
		if (classe==1){
		    niveau=1;
		}
		if (classe==2){
		    niveau=3;
		}
		if (classe==3){
		    niveau=5;
		}
		if (classe==4){
		    niveau=8;
		}
		if (classe==5){
		    niveau=12;
		}
		else {
		}
	    }
	}
	
	//choix du mode
	while(!modeCorrect)
	    {if(mode >= 1 && mode <= 2){
		    modeCorrect = true;
		}
		else{
		    println("Tapez le numero du mode choisi:\n1)Apprentissage(illimité)\n2)Examen");
		    mode=readInt();
		}
	    }
	
	//MODE APPRENTISSAGE. stop pour quitter
	if(mode==1) {
	    while(!continuerCalcul){
		    operateur(niveau);
		    calculs++;
		    reponseString="";
		    resteString="";
		    
		    //on calcule le resultat de l'operation
		    if(operateurChoisi.equals("+")){
			addition(niveau,reponse);
			reponseADonner=resultatAddition(reponse[0],reponse[1]);
		    }
		    else if(operateurChoisi.equals("-")){
			soustraction(niveau,reponse);
			reponseADonner=resultatSoustraction(reponse[0],reponse[1]);
		    }
		    else if(operateurChoisi.equals("*")){
			multiplication(niveau,reponse);
			reponseADonner=resultatMultiplication(reponse[0],reponse[1]);
		    }
		    else{
			division(niveau,reponse);
			number1=Double.parseDouble(reponse[0]);
			number2=Double.parseDouble(reponse[1]);
			println(number1+"/"+number2);
			reponseADonner=(int)(number1/number2);
			reste=(int)(number1%number2);
		    }
		    
		    //demande de la reponse de l'eleve.
		    if(operateurChoisi.equals("/") && (Double.parseDouble(reponse[0])%Double.parseDouble(reponse[1]))>1){
			println("Quel est le quotient?");
			while(reponseString.equals("")){
			    reponseString= readString();
			}
			println("quel est le reste?");
			while(resteString.equals("")){
			    resteString=readString();
			}
		    }
		    else {
			println("quel est la réponse?");
			while(reponseString.equals("")){
			    reponseString=readString();}
		    }
		    
		    //on verifie le resultat. Si c est une division, on verifie egalement le reste
		    reponseEleve=Double.parseDouble(reponseString);
		    if(reponseEleve<=(reponseADonner+0.01) && reponseEleve >= reponseADonner-0.01){
			println("reponse correcte");
		    }    
		    else{
			println("Réponse incorrecte.");
		    }
		    if(operateurChoisi.equals("/") && (Double.parseDouble(reponse[0])%Double.parseDouble(reponse[1]))>=1){
			resteEleve=Double.parseDouble(resteString);
			if(resteEleve==reste){
			    println("Reste correct");
			    score++;
			}
			else{
			    println("Reste incorrect");
			}
		    }
			
		println("Vous avez réalisé un score de: "+score+" points sur "+(calculs));
	    }
	}
	
	//GESTION DU MODE EXAMEN
	//Boucle sur 10 calcul.
	else if(mode==2){
	    for(int i=0;i<=9;i++)
		{
		    
		    //on genere un calcul et on verifie le resultat tant que l'utilisateur ne veut pas arreter
		    operateur(niveau);
		    calculs++;
		    reponseString="";
		    resteString="";
		    
		    //on calcule le resultat de l'operation
		    if(operateurChoisi.equals("+")){
			addition(niveau,reponse);
			reponseADonner=resultatAddition(reponse[0],reponse[1]);
		    }
		    else if(operateurChoisi.equals("-")){
			soustraction(niveau,reponse);
			reponseADonner=resultatSoustraction(reponse[0],reponse[1]);
		    }
		    else if(operateurChoisi.equals("*")){
			multiplication(niveau,reponse);
			reponseADonner=resultatMultiplication(reponse[0],reponse[1]);
		    }
		    else{
			division(niveau,reponse);
			number1=Double.parseDouble(reponse[0]);
			number2=Double.parseDouble(reponse[1]);
			println(number1+"/"+number2);
			reponseADonner=(int)(number1/number2);
			reste=(int)(number1%number2);
		    }
		    
		    //demande de la reponse de l'eleve.
		    if(operateurChoisi.equals("/") && (Double.parseDouble(reponse[0])%Double.parseDouble(reponse[1]))>1){
			println("Quel est le quotient?");
			while(reponseString.equals("")){
			    reponseString= readString();
			}
			println("quel est le reste?");
			while(resteString.equals("")){
			    resteString=readString();
			}
		    }
		    else {
			println("quel est la réponse?");
			while(reponseString.equals("")){
			    reponseString=readString();}
		    }
		    
		    //on verifie le resultat. Si c est une division, on verifie egalement le reste
		    reponseEleve=Double.parseDouble(reponseString);
		    if(reponseEleve<=(reponseADonner+0.01) && reponseEleve >= reponseADonner-0.01){
			println("reponse correcte");
		    }    
		    else{
			println("Réponse incorrecte.");
		    }
		    if(operateurChoisi.equals("/") && (Double.parseDouble(reponse[0])%Double.parseDouble(reponse[1]))>=1){
			resteEleve=Double.parseDouble(resteString);
			if(resteEleve==reste){
			    println("Reste correct");
			    score++;
			}
			else{
			    println("Reste incorrect");
			}
		    }
		}
	    
	    println("Vous avez réalisé un score de: "+score+" points sur "+(calculs));
	    enregistrementres(nom,prenom,""+niveau,""+score);
	}
	else{
	    println("Une erreur impromptue s'est produite. Veuillez quitter le logiciel et relancer");
	    
	}
    }
}
