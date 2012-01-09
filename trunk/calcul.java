class calcul extends Program{
    void algorithm(){
	int niveau=0,difficulte=0,operande1=0,operande2=0,reponseAttendue=0,reponseEleve=0;
	String [] operateurs = new String [12];
	String operateurChoisi;
	niveau=readInt();
	operateurs[0]="+";//add simple
	operateurs[1]="-";//sous simple
	operateurs[2]="*";//mult 1 chiffre
	operateurs[3]="+";//add complexe
	operateurs[4]="-";//sous complexe
	operateurs[5]="+";//add flottante
	operateurs[6]="-";//sous flottante
	operateurs[7]="/";//division entiere
	operateurs[8]="*";//mult compliquee
	operateurs[9]="/";//division  compliquee
	operateurs[10]="*";//multi flottante
	operateurs[11]="/";//division flottante
	operateurChoisi=operateurs[(int)(random()*niveau)];
	println(operateurChoisi);
	//Gestion des additions par niveau
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
		println(operande1+"+"+operande2);
		reponseAttendue=operande1+operande2;
		println(reponseAttendue);
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
	    reponseAttendue=operande1-operande2;
	    println("operateur -");}
	//Gestion des multiplications par niveau
	else if(operateurChoisi.equals("*")){
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
	}
	//Gestion des divisions par niveau
	else if(operateurChoisi.equals("/")){
	    switch (niveau){
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
	}
	else{
	    println("une erreur est survenue au choix du niveau");
	}

    }
}	