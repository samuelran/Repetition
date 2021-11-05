class Sportscar extends Car {
    // Det er min childclass, som tilføjer en ny attribut ved navn numberOfSeats. Denne attribut kan jeg tilføje til parentclassen for at se inheritance virker.
    public int numberOfSeats;
    //Jeg definerer attributerne til en sportscar
    public Sportscar( int speed, int horsepower, int seatsInCar)

    {
        super(speed, horsepower);
        numberOfSeats = seatsInCar;
    }
    //Jeg ændrer i toString for at tilføje numberOfSeats til det samlede printout. Dette er @Override's formål.
    @Override public String toString()
    {
        return (super.toString() + "\n and the amount of seats in the car is" + numberOfSeats);
    }
}
