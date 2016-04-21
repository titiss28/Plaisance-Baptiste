package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int chiffre = Integer.valueOf(arabe);
		String res = "";
		while(chiffre!=0){
			if(chiffre%1000==0){
			res += "M";
			chiffre -= 1000;
			}else if(chiffre%500==0){
				res += "D";
				chiffre -= 500;
			}else if(chiffre%100==0){
				res += "C";
				chiffre -= 100;
			}else if(chiffre%50==0){
				res += "L";
				chiffre -= 50;
			}else if(chiffre%10==0){
				res += "X";
				chiffre -= 10;
			}else if(chiffre%5==0){
				res += "V";
				chiffre -= 5;
			}else if(chiffre%1==0){
				res += "I";
				chiffre -= 1;
			}
		}
		return res;
		
	}

	public String convertFromRoman(String roman) {
		int res = 0;
		String resAsString;
		for(int i=0;i<roman.length();i++){
			if(roman.substring(i).equals("M")){
				res += 1000;				
			}else if(roman.substring(i).equals("D")){
				res += 500;
			}else if(roman.substring(i).equals("C")){
				res += 100;
			}else if(roman.substring(i).equals("L")){
				res += 50;
			}else if(roman.substring(i).equals("X")){
				res += 10;
			}else if(roman.substring(i).equals("V")){
				res += 5;
			}else if(roman.substring(i).equals("I")){
				res += 1;
			}
		}
		resAsString = "" + res;
		return resAsString;
	}
	
}
