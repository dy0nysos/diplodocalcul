class fonctioncalcul extends Program{
	void algorithm(){
		int operande1=0,operande2=0,resultat=0,difficulte=50;
		String operateurs;
		String [] operateur  = new String [4];
		operateur[0]="+";
		operateur[1]="-";
		operateur[2]="*";
		operateur[3]="/";
		operateurs=operateur[(int)(random()*4)];
		if(operateurs=="/"){
			while(operande1==0 || operande2==0 || operande1%operande2!=0){
				operande2=(int)(random()*difficulte);
				operande1=(int)(random()*difficulte);
			}
			resultat=(operande1/operande2);
		}
		else{
			operande1=(int)(random()*difficulte);
			operande2=(int)(random()*difficulte);
			if (operateurs=="+"){
				resultat=(operande1+operande2);
			}
			else if(operateurs=="-"){
				resultat=(operande1-operande2);
			}
			else if(operateurs=="*"){
				resultat=(operande1*operande2);
			}
		}
		println(operande1+operateurs+operande2);
		println(resultat);
	}
}
