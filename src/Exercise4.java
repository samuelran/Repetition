public class Exercise4 {
    public static void main (String[] args) {
        double amountOfSecondsBetweenbirth = 7, amountOfSecondsBetweenDeaths = 13, populationInTheUS = 331002651;
        double amountOfDeathsPrYear, amountOfBirthsPrYear, populationInFiveYears;

        amountOfBirthsPrYear = 60/amountOfSecondsBetweenbirth*60*24*365;
        amountOfDeathsPrYear = 60/amountOfSecondsBetweenDeaths*60*24*365;

        populationInFiveYears = (-amountOfDeathsPrYear + amountOfBirthsPrYear) * 5 + populationInTheUS;
        System.out.println("The us population in five years is " + populationInFiveYears);
    }
}

