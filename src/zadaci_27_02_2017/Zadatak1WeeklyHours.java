package zadaci_27_02_2017;

public class Zadatak1WeeklyHours {

	public static void main(String[] args) {
		// initialize 2D array
		int[][] hoursPerDay = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		// initialize two arrays needed for sorting
		int [] sumOfHoursPerEmploye = totalHoursPerEmploye(hoursPerDay);
		int [] employes = new int [hoursPerDay.length];
		
		// store indexes of employees
		for (int i = 0; i<employes.length; i++){
			employes[i] = i;
		}
		
		// sort sum hours array and sort indexes of employees to follow the same order
		for (int i = 0; i<sumOfHoursPerEmploye.length-1; i++){
			int currentMax = sumOfHoursPerEmploye[i];
			int maxEmploye = employes[i];
			int currentMaxIndex = i;
			
			for(int j = i +1; j<sumOfHoursPerEmploye.length; j++){
				if (currentMax<sumOfHoursPerEmploye[j]){
					currentMax = sumOfHoursPerEmploye[j];
					maxEmploye = employes[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex !=i){
				sumOfHoursPerEmploye[currentMaxIndex] = sumOfHoursPerEmploye [i];
				employes[currentMaxIndex] = employes [i];
				sumOfHoursPerEmploye[i] = currentMax;
				employes[i] = maxEmploye;
			}
		}
		
		for (int i = 0; i<employes.length; i++){
			System.out.println("Employe " + employes[i] + "'s weekly  hours are " + sumOfHoursPerEmploye[i]);
		}
		
 	}

	
	// sum total hours of employees
	public static int[] totalHoursPerEmploye(int[][] m){
		int [] sumOfHoursPerEmploye = new int [m.length];
		for (int i =0;i<m.length;i++){
			int sumOfHours = 0;
			for(int j = 0; j<m[i].length;j++){
				sumOfHours += m[i][j];
			}
			
			sumOfHoursPerEmploye[i]= sumOfHours;
		}
		return sumOfHoursPerEmploye;
	}
}
