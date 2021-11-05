public class Car {
    //Her definererer jeg attributerne i parentclassen Car
    public int speed;
    public int horsepower;

    public Car(int speed, int horsepower){
        //til at starte med definerer jeg en ''Car'' til at bestå af mine 2 intergers speed og Horsepower
        this.speed = speed;
        this.horsepower = horsepower;
    }
    //dette er en metode, man kan bruge hvis man gerne vil have en attribut, til at sige.
    public void pressSpeeder(int increase){
        speed += increase;
    }
    public String toString()
            //Jeg laver det til en toString så vi kan printe attributerne ud

    {
        return("Speed is " + speed + "\n" + "The cars horsepower is" + horsepower);
}
}
