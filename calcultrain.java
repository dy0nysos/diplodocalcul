class calcul extends Program{
    void algorithm(){
	int difficulte=0;int niveau=3;String [] operateurs = new String [12];
	int reponseADonner=0;int reponseDeLEleve=0;String operateurChoisi;int operande1=0;int operande2=0;
	operateurs[0]="+";//addition simple
	operateurs[1]="-";//soustraction simple
	operateurs[2]="*";//multiplication a 1 chiffre
	operateurs[3]="+";//addition compliquée
	operateurs[4]="-";//soustraction compliquée
	operateurs[5]="+";//addition à virgule
	operateurs[6]="-";//soustraction à virgule
	operateurs[7]="/";//division entière
	operateurs[8]="*";//multiplication compliquée
	operateurs[9]="/";//division compliquée
	operateurs[10]="*";//multiplication à virgule
	operateurs[11]="/";//division à virgule
	//l'opérateur choisi est fonction du niveau de difficulté
	operateurChoisi=operateurs[(int)(random()*niveau)];
	println("L'opérateur choisi est:"+operateurChoisi);
	//On pratique une découpe par niveau choisi et par opérateurChoisi
	if(niveau==1){
	    while(operande1!=operande2 || operande1>5 || operande1 == 0){
		operande1=(int)(random()*10);
		operande2=(int)(random()*10);
	    }
	    println(operande1+operateurChoisi+operande2);
	    reponseADonner=operande1+operande2;
	    println(reponseADonner);
	}
	else if(niveau==2){
	    if(operateurChoisi=="-"){
	       	while(operande1>10 || operande1-operande2<=0){
		    operande1=(int)(random()*20);
		    operande2=(int)(random()*20);
		}
		println(operande1+operateurChoisi+operande2);
		reponseADonner=operande1-operande2;
		println(reponseADonner);
	    }
	    else{
		while(operande1>15 || operande2>15 || operande1==operande2){
		    operande1=(int)(random()*20);
		    operande2=(int)(random()*20);
		}
		println(operande1+operateurChoisi+operande2);
		reponseADonner=operande1+operande2;
		println(reponseADonner);
	    }
	}
	else if(niveau==3){
	    if(operateurChoisi=="*"){
		while(operande2>10 || operande2<=0 || operande1<=0 || operande1>10){
		    operande1=(int)(random()*20);
		    operande2=(int)(random()*20);
		}
		println(operande1);
		println(operande2);
		println(operande1+operateurChoisi+operande2);
		reponseADonner=operande1*operande2;
		println(reponseADonner);
	    }
	    else if(operateurChoisi=="-"){
		
	    }
	}
	else if(niveau==4){
	}
	else if(niveau==5){
	}
	else if(niveau==6){
	}
	else if(niveau==7){
	}
	else{
	    println("Une erreur est survenue lors du choix du niveau");
	}
    }
}