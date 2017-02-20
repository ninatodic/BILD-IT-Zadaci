package zadaci_20_02_2017;

public class GeneratePlate {
	
	//Method that returns generated plate
	public void generatePlate(){
		for(int i = 0; i<3; i++){ // Using math random to generate three upper case letter 
			System.out.print((char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1)));
		}
		System.out.print("-");
		for(int i=0; i<4; i++){ // using math random to generate four integers
			System.out.print((int)(Math.random()*10));
		}
	}

}
