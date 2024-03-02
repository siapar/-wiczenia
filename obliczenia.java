class obliczenia {
    public static void main(String[] args) {
        System.out.println("Zadanie pierwsze");
        ExeOne();
        System.out.println("Zadanie drugie");
        ExeTwo();
        System.out.println("Zadanie trzecie");
        ExeThree();
        System.out.println("Zadanie czwarte");
        ExeFour();
        System.out.println("Zadanie piąte");
        ExeFive();
    }

    public static void ExeOne() {

        int[] numbers = { 1, 2, 3, 4 };

        System.out.println(numbers[1] + numbers[0]);
        System.out.println(numbers[2] - numbers[0]);
        System.out.println(numbers[3] / numbers[1]);
        System.out.println(numbers[1] * numbers[3]);
    }

    public static void ExeTwo() {

        int[] numbers2 = { 1, 2, 3, 4, 5 };

        int sum = ((numbers2[0] + numbers2[1] + numbers2[2] + numbers2[3] + numbers2[4]) / 5);

        System.out.println(sum);
    }

    public static void ExeThree() {
        int[] numbers2 = { 1, 2, 3, 4, 5 };
        int sum = ((numbers2[0] + numbers2[1] + numbers2[2] + numbers2[3] + numbers2[4]) / 5);
        if (sum % 2 == 0) {
            System.out.println("Liczba parzysta");
        } else {
            System.out.println("Liczba nie parzysta");
        }
    }

    public static void ExeFour() {

        System.out.println("BMI wynosi: " + (60 / 2.89));

    }

    public static void ExeFive() {
        int[] numbers3 = { 1, 2, 3, 4, 5 };
        int sum2 = ((numbers3[0] + numbers3[1] + numbers3[2] + numbers3[3] + numbers3[4]) / 5);

        if (sum2 > 3) {
            System.out.println("Twój stopien to: A");
        } else if (sum2 == 3) {
            System.out.println("Twój stopien to: B");
        } else if (sum2 < 3) {
            System.out.println("Twój stopien to: C");
        }
    }
}