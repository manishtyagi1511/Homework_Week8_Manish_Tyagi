package programweek8;

public class Program13_SharedDigit {



        public static boolean hasSharedDigit(int a, int b) {
            if (a < 10 || a > 90 || b < 10 || b > 90) {
                return false;
            }
            int compare1 = 0;
            int compare2 = 0;
            while (a > 0) {
                compare1 = a % 10;
                a = a / 10;
                int tempNum = b;
                while (tempNum > 0) {
                    compare2 = tempNum % 10;
                    tempNum = tempNum / 10;
                    if (compare1 == compare2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static void main(String[] args) {
            System.out.println(hasSharedDigit(12, 23));  //true
            System.out.println(hasSharedDigit(9,99));  //false
            System.out.println(hasSharedDigit(15,55)); //true
        }
    }

