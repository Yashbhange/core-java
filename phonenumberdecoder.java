import java.util.Scanner;

public class phonenumberdecoder {

    public static String decodePhoneNumber(String input) {
        StringBuilder result = new StringBuilder();

        
        input = input.toUpperCase();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);
            } else if (Character.isLetter(ch)) {
                result.append(getDigitForLetter(ch));
            }
        }

        
        if (result.length() >= 10) {
            return "(" + result.substring(0, 3) + ") " +
                   result.substring(3, 6) + "-" +
                   result.substring(6, 10);
        } else {
            return result.toString();
        }
    }

    private static char getDigitForLetter(char letter) {
        switch (letter) {
            case 'A': case 'B': case 'C': return '2';
            case 'D': case 'E': case 'F': return '3';
            case 'G': case 'H': case 'I': return '4';
            case 'J': case 'K': case 'L': return '5';
            case 'M': case 'N': case 'O': return '6';
            case 'P': case 'Q': case 'R': case 'S': return '7';
            case 'T': case 'U': case 'V': return '8';
            case 'W': case 'X': case 'Y': case 'Z': return '9';
            default: return letter;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a phone number with letters: ");
        String input = sc.nextLine();

        String decoded = decodePhoneNumber(input);
        System.out.println("Decoded phone number: " + decoded);

        sc.close();
    }
}
