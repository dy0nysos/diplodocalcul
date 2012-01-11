class diplodocalcul extends Program{
    String [] reponse = new String [3];
    void calcul(int niveau,String [] reponse){
	/* lourde fonction permettant de gnrer deux nombres en fonction du niveau selectionn. Nous n'avons pas trouv d'optimisation */
	double operande1=0,operande2=0;
	String operateurChoisi;
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
	if(operateurChoisi.equals("+")){
	    switch (niveau){
	    case 1:
		while(operande1>10 || operande1<=0){
		    operande1=(int)(random()*11);
		    operande2=operande1;
		}
		break;
	    case 2:
		while(operande1>10 || operande2>10 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*11);
		    operande2=(int)(random()*11);
		}
		break;
	    case 3:
		while(operande1>100 || operande2>100 || operande1+operande2==1000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*100);
		    operande2=(int)(random()*100);
		}
		break;
	    case 4:
		while(operande1>10000 || operande2>10000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 5:
		while(operande1>20000 || operande2>20000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*20000);
		    operande2=(int)(random()*20000);
		}
		break;
	    case 6:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(random()*10000);
		    operande2=(random()*10000);
		}
		break;
	    case 7:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 8:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 9:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 10:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 11:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
		
	    default:
		println("Un soucis a ete detecte");
		break;
	    }
	}
	//Gestion des soustractions par niveau
	else if(operateurChoisi.equals("-")){
	    switch (niveau){
	    case 2:
		while(operande1>10 || operande2>10 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*11);
		    operande2=(int)(random()*11);
		}
		break;
	    case 3:
		while(operande1>1000 || operande2>1000 || operande1+operande2!=1000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*500);
		    operande2=(int)(random()*500);
		    print("soucis ici");
		}
		break;
	    case 4:
		while(operande1>10000 || operande2>10000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 5:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 6:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 7:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 8:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 9:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 10:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 11:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	
	    default:
		println("Un soucis a ete detecte");
		break;
	    }
	}
	//Gestion des multiplications par niveau
	else if(operateurChoisi.equals("*")){
	    switch (niveau){
	    case 3:
		while(operande1>1000 || operande2>1000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*500);
		    operande2=(int)(random()*500);
		    print("    soucis ici     ");
		}
		break;
	    case 4:
		while(operande1>10000 || operande2>10000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 5:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 6:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 7:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 8:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 9:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 10:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    case 11:
		while(operande1>50000 || operande2>50000 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*10000);
		    operande2=(int)(random()*10000);
		}
		break;
	    default:
		println("Un soucis");
	    }
	}
	//Gestion des divisions par niveau
	else if(operateurChoisi.equals("/")){
	    switch (niveau){
	    case 8:
		while(operande1>100 || operande2>15 || operande1<=0 || operande2<=0 || operande1%operande2!=0){
		    operande1=(int)(random()*100);
		    operande2=(int)(random()*20);
		}
		break;
	    case 9:
		while(operande1>2500 || operande2>28 || operande1<=0 || operande2<=0 || operande1%operande2!=0){
		    operande1=(int)(random()*2501);
		    operande2=(int)(random()*29);
		}
		break;
	    case 10:
		while(operande1>3000 || operande2>50 || operande1<=0 || operande2<=0){
		    operande1=(int)(random()*3001);
		    operande2=(int)(random()*51);
		}
		break;
	    case 11:
		while(operande1>100 || operande2>10 || operande1<=0 || operande2<=0){
		    operande1=random()*101;
		    operande2=random()*11;
		}
		break;
	    default:
		println("Un soucis");
	    }
	}
	else{
	    println("probleme de niveau");
	}
	reponse[0]=operateurChoisi;
	reponse[1]=""+operande1;
	reponse[2]=""+operande2;
    }


    /*Algorithme principal */
    void algorithm(){
	int niveau=0,reponseADonner,reponseEleve,mode=0;
	boolean continuerCalcul=false,niveauCorrect=false,nomEtPrenom=false,modeCorrect=false;
	String prenom="",nom="";
   //tableau d'operateurs utiliss dans la fonction calcul
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
	    if(niveau >=1 && niveau <= 12){
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
	//Fonction gnratrice de calculs en fonction du niveau. On se sert du tableau d'oprandes cre au dbut du programme
	calcul(niveau,reponse);
	println(reponse[0]);
	println(reponse[1]);
	println(reponse[2]);
	println(reponse[1]+reponse[0]+reponse[2]);
    }
}