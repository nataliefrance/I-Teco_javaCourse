public class Ex_1 {

    public static void main(String[] args) {
        printInformation();
        System.out.println();
        printHouse();
    }

    public static void printInformation() {
        String city = "Moscow";
        int population = 13104177;
        double procentUnemployed = 0.56;
        System.out.println(city + " " + population + " " + procentUnemployed);
        char sectionOnThePodium = 'C';
        short place = 123;
        double price = 1500.5;
        System.out.println("" + sectionOnThePodium + " " + place + " " + price);
        String name = "Natalya";
        byte age = 33;
        short height = 165;
        System.out.println(name + " " + age + " " + height);
        char letterCarNumber1 = 'A';
        char letterCarNumber2 = 'B';
        int carNumber = 123;
        double carWeight = 2000.0;
        System.out.println("" + letterCarNumber1 + carNumber + letterCarNumber2 + letterCarNumber1 + " " + carWeight);
        String companyName = "Some Company";
        long annualIncome = 150000000000L;
        double marketShare = 99.99;
        System.out.println(companyName + " " + annualIncome + " " + marketShare);
        char rhFactor = '+';
        byte bloodGroup = 4;
        double peopleShare = 0.07;
        System.out.println("" + rhFactor + " " + bloodGroup + " " + peopleShare);
        String nameOfTheUniversity = "MGU";
        int numberOfStudents = '鱀';
        double shareOfDeducted = 10.1;
        System.out.println(nameOfTheUniversity + " " + numberOfStudents + " " + shareOfDeducted);
        char mr1 = 'P';
        char mr2 = 'G';
        char mr3 = '-';
        char mr4 = '1';
        char mr5 = '3';
        int copiesSold = 12000500;
        float movieRatingIMD = 7.1F;
        System.out.println("" + mr1 + mr2 + mr3 + mr4 + mr5 + " " + copiesSold + " " + movieRatingIMD);
        String nameOfBrand = "Lego";
        long amountOfProducedGoods = 500000000000L;
        float percentOfSales = 60.5F;
        System.out.println(nameOfBrand + " " + amountOfProducedGoods + " " + percentOfSales);
        String productCategory = "Food";
        long barCode = 4820024700016L;
        double buyersOver30 = 60.5;
        System.out.println(productCategory + " " + barCode + " " + buyersOver30);
    }

    public static void printHouse() {
        String[] array = new String[]{"____________'\"____\n", "___________---____\n", "_______/\\_|_|_____\n", "______/__\\|_|_____\n", "_____/____\\_|_____\n", "____/______\\|_____\n", "___/__[__]__\\_____\n", "__/|________|\\____\n", "_/_|________|_\\___\n", "___|__---___|_____\n", "___|__|_|___|_____\n"};
        String[] var1 = array;
        int var2 = array.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String s = var1[var3];
            System.out.print(s);
        }

    }
}
