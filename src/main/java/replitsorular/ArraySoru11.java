package replitsorular;

import java.util.Scanner;

public class ArraySoru11 {

    /*
    Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.

```
Test Data:
```

```
birinci binary number: 100010
ikinci  binary number: 110010
```

```
Beklenen Çıktı:
```

```
1010100
```
     */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Birinci binary number: ");
            String binary1 = scanner.nextLine();

            System.out.print("İkinci binary number: ");
            String binary2 = scanner.nextLine();

            String result = addBinaryNumbers(binary1, binary2);
            System.out.println("Sonuç: " + result);
        }

        public static String addBinaryNumbers(String binary1, String binary2) {
            int maxLength = Math.max(binary1.length(), binary2.length());
            StringBuilder sum = new StringBuilder();
            int carry = 0;

            for (int i = 0; i < maxLength; i++) {
                int digit1 = i < binary1.length() ? binary1.charAt(binary1.length() - 1 - i) - '0' : 0;
                int digit2 = i < binary2.length() ? binary2.charAt(binary2.length() - 1 - i) - '0' : 0;
                int currentSum = digit1 + digit2 + carry;
                int currentDigit = currentSum % 2;
                carry = currentSum / 2;
                sum.insert(0, currentDigit);
            }

            if (carry != 0) {
                sum.insert(0, carry);
            }

            return sum.toString();
        }
    }


