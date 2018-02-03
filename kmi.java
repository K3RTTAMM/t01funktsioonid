// Programm laseb kasutajal sisestada enda kehakaalu kilogrammides ja pikkuse meetrites
// ning arvutab välja kehamassiindeksi
// kehamassiindeks on kaal kilogrammides * pikkuse ruuduga meetrites

public class kmi{
public static void main(String[] arg) {
	double kaal = Double.parseDouble(arg[0]);
	double pikkus = Double.parseDouble(arg[1]);
	double indeks = kaal/(pikkus*pikkus);
	System.out.println("---------------------------------");
	System.out.println("Sisestatud kaal: "+kaal+"kg\nSisestatud pikkus: "+pikkus+"m");	
	System.out.println("Teie kehamassi indeks on "+indeks);
	if(indeks<16){
		System.out.println("Tervisele ohtlik alakaal");
		}
	if(indeks>=16&&indeks<19){
		System.out.println("Alakaal");
		}		
	if(indeks>=19&&indeks<=25){
		System.out.println("Normaalkaal");
		System.out.println("-----------------------------");
		}		
	if(indeks>25&&indeks<=30){
		System.out.println("Ülekaal");
		}
	if(indeks>30&&indeks<=35){
		System.out.println("Rasvumine");
		}		
	if(indeks>35&&indeks<=40){
		System.out.println("Tugev rasvumine");
		}	
	if(indeks>40){
		System.out.println("Tervisele ohtlik rasvumine");
		}	

//Kui on ülekaalus siis kuvab milline peaks olema suurim normaalkaal		
	double tulemus = indeks;
	while(tulemus>25){
		kaal=kaal-0.1;
		tulemus=(kaal)/(pikkus*pikkus);
			if(tulemus<=25){
				System.out.println("Teie normaalkaal peaks olema maksimaalselt "+kaal+" kilogrammi.");
				System.out.println("-------------------------------------------------------");
				}
			
		}
		
//Kui on alakaalus siis kuvab milline peaks olema vähim normaalkaal			
	while(tulemus<19){
		kaal=kaal+0.1;
		tulemus=(kaal)/(pikkus*pikkus);
			if(tulemus>=19){
				System.out.println("Teie normaalkaal peaks olema vähemalt "+kaal+" kilogrammi.");
				System.out.println("-------------------------------------------------------");
				}
			
		}			
	
	}//public static void main lõpp
}//public class lõpp

// Tervisele ohtlik alakaal	< 16
// Alakaal	16 - 18.9
// Normaalkaal	19 - 25
// Ülekaal	25.1 - 30
// Rasvumine	30.1 - 35
// Tugev rasvumine	35.1 - 40
// Tervisele ohtlik rasvumine > 40.1