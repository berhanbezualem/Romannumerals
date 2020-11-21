package com.romannumerals;

public class RomanNumeral {
	
	private final String unit[]= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	private final String tens[]= {"","X","XX","XXX","XL","L","LI","LII","LIII","XC"};
	private final String hundred[]= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
	private final String thousand[]= {"","M","MM","MMM"};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=399;
		RomanNumeral rm=new RomanNumeral();
		System.out.println("Int To Roman Conversion");
		System.out.println("Int number="+i+"   Roman Numeral="+rm.intToRomanNumeral(i));

	}
	
	
	public String intToRomanNumeral(int num)
	{
		
		String roman="";
		roman=thousand[(num/1000)]+hundred[(num%1000)/100]+tens[((num%1000)%100)/10]+unit[(((num%1000)%100)%10)];
		
		return roman;
				
				
	}

}
