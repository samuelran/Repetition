public class Exercise4 {
    //Jeg ved ikke hvorfor denne ikke giver mig det korrekte resultat, efter min hovedregning burde det ca give 341.406.033
    public static void main(String[] args) {
        int currentPopulationInTheUS = 331002651;
        int years = 5;
        int amountOfSecondsForOneBirth = 7;
        int amountOfSecondsForOneDeath = 13;

        int amountOfPeopleInTheUSIn5Years = calculateFuturePopulation(currentPopulationInTheUS, years, amountOfSecondsForOneBirth, amountOfSecondsForOneDeath);
        System.out.println("The expected population of the USA in " + years + " years is " + amountOfPeopleInTheUSIn5Years + " people.");
    }

    static int calculateFuturePopulation(int currentPopulationInTheUS, int years, int amountOfSecondsForOneDeath, int amountOfSecondsForOneBirth){
        int amountOfSecondsInAYear = 31556926;

        int amountOfSecondsIn5Years = amountOfSecondsInAYear * years;
        int amountOfPeopleDyingIn5Years = amountOfSecondsIn5Years / amountOfSecondsForOneDeath;
        int amountOfPeopleBornIn5Years = amountOfSecondsIn5Years / amountOfSecondsForOneBirth;
        currentPopulationInTheUS = currentPopulationInTheUS + amountOfPeopleBornIn5Years - amountOfPeopleDyingIn5Years;
        return currentPopulationInTheUS;
    }
}

