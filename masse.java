import java.util.Scanner;

public class masse{
	public static void main(String[] args) {
		double h=1,he=4,li=6.9,be=9,b=10.8,c=12,n=14,o=16,f=19,ne=20.2,na=23,mg=24.3,al=27,si=28.1,p=31,s=32.1,cl=35.5,ar=39.9;
		String mot = "";
		double masse=0;
		int coeff=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir la molecule (respectez les majuscules et les miniscules au niveau des atomes) :");
		System.out.println("Exemple : CO2 ou NaCl");
		mot = sc.nextLine();
		char [] myArray = mot.toCharArray();
 
		for(int i=0; i < myArray.length; i++) {
			try {
			  	//  Block of code to try
				coeff = Integer.parseInt(String.valueOf(myArray[i+1]));
			}catch(Exception e) {}

			if(myArray[i] == 'C'){

				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'l'){
						if(coeff1 == 0){
							masse = masse + cl;
							continue;
						}
						else{
							masse = masse + (cl*coeff1);
							coeff1=0;
							continue;
						}
					}
					else{
						if(coeff == 0){
							masse = masse + c;
							continue;
						}
						else{
							masse = masse + (c*coeff);
							continue;
						}
					}
				}catch(Exception e) {}

				if(coeff == 0){
					masse = masse + c;
				}
				else{
					masse = masse + (c*coeff);
				}
			}

			else if(myArray[i] == 'S'){

				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'i'){
						if(coeff1 == 0){
							masse = masse + si;
							continue;
						}
						else{
							masse = masse + (si*coeff1);
							coeff1=0;
							continue;
						}
					}
					else{
						if(coeff == 0){
							masse = masse + s;
							continue;
						}
						else{
							masse = masse + (s*coeff);
							continue;
						}
					}
				}catch(Exception e) {}

				if(coeff == 0){
					masse = masse + s;
				}
				else{
					masse = masse + (s*coeff);
				}
			}

			else if(myArray[i] == 'O'){
				if(coeff == 0){
					masse = masse + o;
				}
				else{
					masse = masse + (o*coeff);
				}
			}

			else if(myArray[i] == 'F'){
				if(coeff == 0){
					masse = masse + f;
				}
				else{
					masse = masse + (f*coeff);
				}
			}

			else if(myArray[i] == 'P'){
				if(coeff == 0){
					masse = masse + p;
				}
				else{
					masse = masse + (p*coeff);
				}
			}

			else if(myArray[i] == 'H'){
				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'e'){
						if(coeff1 == 0){
							masse = masse + he;
							continue;
						}
						else{
							masse = masse + (he*coeff1);
							coeff1=0;
							continue;
						}
					}
					else{
						if(coeff == 0){
							masse = masse + h;
							continue;
						}
						else{
							masse = masse + (h*coeff);
							continue;
						}
					}
				}catch(Exception e) {}

				if(coeff == 0){
					masse = masse + h;
				}
				else{
					masse = masse + (h*coeff);
				}
			}

			else if(myArray[i] == 'L'){
				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'i'){
						if(coeff1 == 0){
							masse = masse + li;
							continue;
						}
						else{
							masse = masse + (li*coeff1);
							coeff1=0;
							continue;
						}
					}
					else{
					}
				}catch(Exception e) {}
			}

			else if(myArray[i] == 'M'){
				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'g'){
						if(coeff1 == 0){
							masse = masse + mg;
							continue;
						}
						else{
							masse = masse + (mg*coeff1);
							coeff1=0;
							continue;
						}
					}
					else{
					}
				}catch(Exception e) {}
			}

			else if(myArray[i] == 'A'){
				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'l'){
						if(coeff1 == 0){
							masse = masse + al;
							continue;
						}
						else{
							masse = masse + (al*coeff1);
							coeff1=0;
							continue;
						}
					}
					else if(next == 'r'){
						if(coeff1 == 0){
							masse = masse + ar;
							continue;
						}
						else{
							masse = masse + (ar*coeff1);
							coeff1=0;
							continue;
						}
					}
				}catch(Exception e) {}
			}

			else if(myArray[i] == 'B'){
				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'e'){
						if(coeff1 == 0){
							masse = masse + be;
							continue;
						}
						else{
							masse = masse + (be*coeff1);
							coeff1=0;
							continue;
						}
					}
					else{
						if(coeff == 0){
							masse = masse + b;
							continue;
						}
						else{
							masse = masse + (b*coeff);
							continue;
						}
					}
				}catch(Exception e) {}

				if(coeff == 0){
					masse = masse + b;
				}
				else{
					masse = masse + (b*coeff);
				}
			}

			else if(myArray[i] == 'N'){
				try{
					char next = myArray[i+1];
					int coeff1 = 0;
					try{
						coeff1 = Integer.parseInt(String.valueOf(myArray[i+2]));
					}catch(Exception e) {}
					if(next == 'e'){
						if(coeff1 == 0){
							masse = masse + ne;
							continue;
						}
						else{
							masse = masse + (ne*coeff1);
							coeff1=0;
							continue;
						}
					}
					else if(next == 'a'){
						if(coeff == 0){
							masse = masse + na;
							continue;
						}
						else{
							masse = masse + (na*coeff);
							continue;
						}
					}
					else{
						if(coeff == 0){
							masse = masse + n;
							continue;
						}
						else{
							masse = masse + (n*coeff);
							continue;
						}
					}
				}catch(Exception e) {}

				if(coeff == 0){
					masse = masse + n;
				}
				else{
					masse = masse + (n*coeff);
				}
			}

			coeff = 0;
		}

		System.out.println("La masse moleculaire de " + mot +" est : "+ masse);
	}
}