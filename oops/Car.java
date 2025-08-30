public class Car {

    // encapsolution means hidding such things we did not want to change after.
    private int speed;
    private String color;

    public Car(String color){
        this.color = color;
    }

    public void getSpeed(int speed){

        if (speed < 0) {
            System.out.println("Not possible");
        } else {
            this.speed = speed; 
            System.out.println("Driving at : " + speed);
         
        }

        
    }


    // void drive() {
    //     System.out.println("Driving...");
    // }
}
