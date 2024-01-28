// Fady Zaki SDEV200 1/26/24

class BinaryFormatException extends Exception {
    public BinaryFormatException(String message) {
        super(message);
    }
}

public class BinaryConverter {

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimalValue = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char ch = binaryString.charAt(i);
            if (ch != '0' && ch != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
            decimalValue = decimalValue * 2 + (ch - '0');
        }

        return decimalValue;
    }

    public static void main(String[] args) {
        String binaryString = "1010101";

        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("Decimal value of " + binaryString + " is: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
