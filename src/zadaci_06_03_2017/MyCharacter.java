package zadaci_06_03_2017;

public class MyCharacter {

	private final char value;

    MyCharacter(char value) {
        this.value = value;
    }

    static int compare(char x, char y) {
        if (x < y) return -1;
        if (x > y) return 1;
        return 0;
    }

    static MyCharacter valueOf(char c) {
        return new MyCharacter(c);
    }

    char charValue() {
        return value;
    }

    int compareTo(MyCharacter anotherCharacter) {
        if (this.value < anotherCharacter.value) return -1;
        if (this.value > anotherCharacter.value) return 1;
        return 0;
    }

    boolean equals(MyCharacter anotherCharacter) {
        return this.value == anotherCharacter.value;
    }

    int getNumericValue() {
        if (isDigit()) return (this.value - '0');
        else return -1;
    }

    boolean isLetter() {
        return isUpperCase() || isLowerCase();
    }

    boolean isDigit() {
        return value >= '0' && value <= '9';
    }

    boolean isLetterOrDigit() {
        return isLetter() || isDigit();
    }

    boolean isLowerCase() {
        return value >= 'a' && value <= 'z';
    }

    boolean isUpperCase() {
        return value >= 'A' && value <= 'Z';
    }

    char toLowerCase() {
        if (isUpperCase()) return (char) (value + ('a' - 'A'));
        else return value;
    }

    char toUpperCase() {
        if (isLowerCase()) return (char) (value - ('a' - 'A'));
        else return value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
