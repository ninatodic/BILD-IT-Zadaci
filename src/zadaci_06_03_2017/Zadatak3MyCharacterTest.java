package zadaci_06_03_2017;

public class Zadatak3MyCharacterTest {

	public static void main(String[] args) {
        MyCharacter myCharacter1 = new MyCharacter('c');
        MyCharacter myCharacter2 = new MyCharacter('B');
        MyCharacter myCharacter3 = new MyCharacter('0');

        //print charValue()
        System.out.println("Test charValue:");
        System.out.println(myCharacter1.charValue());
        System.out.println(myCharacter2.charValue());
        System.out.println(myCharacter3.charValue());
        System.out.println();

        //compare MyCharacters
        System.out.println("Test compare");
        System.out.println("compare('c', 'C') = " + MyCharacter.compare('a', 'A'));
        System.out.println("compare('0', '0') = " + MyCharacter.compare('0', '0'));
        System.out.println("compare('0', 'c') = " + MyCharacter.compare('0', 'a'));
        System.out.println();

        System.out.println("myCharacter1 compareTo myCharacter2 = " + myCharacter1.compareTo(myCharacter2));
        System.out.println("myCharacter3 compareTo myCharacter3  = " + myCharacter3.compareTo(myCharacter3));
        System.out.println("myCharacter3 compareTo myCharacter1) = " + myCharacter3.compareTo(myCharacter1));
        System.out.println();

        // print numericValue()
        System.out.println("Test numericValue method: ");
        System.out.println("myCharacter1 = " + myCharacter1.getNumericValue());
        System.out.println("myCharacter2 = " + myCharacter2.getNumericValue());
        System.out.println("myCharacter3 = " + myCharacter3.getNumericValue());
        System.out.println();

        // print isLetter()\
        System.out.println("Test isLetter method (returns true if it is):");
        System.out.println("myCharacter1 = " + myCharacter1.isLetter());
        System.out.println("myCharacter2 = " + myCharacter2.isLetter());
        System.out.println("myCharacter3 = " + myCharacter3.isLetter());
        System.out.println();

        // print isDigit()
        System.out.println("Test isDigit method (returns true if it is):");
        System.out.println("myCharacter1 = " + myCharacter1.isDigit());
        System.out.println("myCharacter2 = " + myCharacter2.isDigit());
        System.out.println("myCharacter3 = " + myCharacter3.isDigit());
        System.out.println();

        // print isLetterOrDigit()
        System.out.println("Test isLetterOrDigit method (returns true if it is):");
        System.out.println("myCharacter1. = " + myCharacter1.isLetterOrDigit());
        System.out.println("myCharacter2. = " + myCharacter2.isLetterOrDigit());
        System.out.println("myCharacter3. = " + myCharacter3.isLetterOrDigit());
        System.out.println();

        // print isLowerCase()
        System.out.println("Test isLowerCase method (returns true if it is):");
        System.out.println("myCharacter1 = " + myCharacter1.isLowerCase());
        System.out.println("myCharacter2 = " + myCharacter2.isLowerCase());
        System.out.println("myCharacter3 = " + myCharacter3.isLowerCase());
        System.out.println();

        // print isUpperCase()
        System.out.println("Test isUpperCase method (returns true if it is):");
        System.out.println("myCharacter1 = " + myCharacter1.isUpperCase());
        System.out.println("myCharacter2 = " + myCharacter2.isUpperCase());
        System.out.println("myCharacter3 = " + myCharacter3.isUpperCase());
        System.out.println();

        // print toUpperCase()
        System.out.println("Test toUpperCase method (returns uppercase letter):");
        System.out.println("myCharacter1 = " + myCharacter1.toUpperCase());
        System.out.println("myCharacter2 = " + myCharacter2.toUpperCase());
        System.out.println("myCharacter3 = " + myCharacter3.toUpperCase());
        System.out.println();

        // print toLowerCase()
        System.out.println("Test toLowerCase method (returns lowercase letter):");
        System.out.println("myCharacter1.toLowerCase() = " + myCharacter1.toLowerCase());
        System.out.println("myCharacter2.toLowerCase() = " + myCharacter2.toLowerCase());
        System.out.println("myCharacter3.toLowerCase() = " + myCharacter3.toLowerCase());
        System.out.println();

        // print toString()
        System.out.println("Test toString method:");
        System.out.println("myCharacter1 = " + myCharacter1.toString());
        System.out.println("myCharacter2 = " + myCharacter2.toString());
        System.out.println("myCharacter3 = " + myCharacter3.toString());
        System.out.println();

        // print valueOf()
        System.out.println("Test valueOf method:");
        System.out.println("MyCharacter.valueOf('!') = " + MyCharacter.valueOf('!').toString());
        System.out.println("MyCharacter.valueOf('1') = " + MyCharacter.valueOf('1').toString());
        System.out.println("MyCharacter.valueOf('q') = " + MyCharacter.valueOf('q').toString());
        System.out.println();
	}

}
