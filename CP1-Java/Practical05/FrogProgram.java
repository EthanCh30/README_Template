public class FrogProgram {
    public static void main(String[] args) {
        Frog myFrog = new Frog();  // creates a Frog object
        myFrog.setName("Fred");    // sets the name to Fred
        myFrog.setId(1000);        // sets the id to 1000
        myFrog.setAge(22);         // sets the age to 22
        System.out.println(myFrog);
        System.out.println(myFrog.printAgeGroup());

        Frog myFrog1 = new Frog("Fran", 1001, 75);
        System.out.println(myFrog1);
        System.out.println(myFrog1.printAgeGroup());

        System.out.println(myFrog.alterName());
        System.out.println(myFrog1.alterName());

        System.out.println("Frog's name is " + myFrog.getName());
        System.out.println("Frog's name is " + myFrog1.getName());

        Frog f = myFrog.firstAlphabetically(myFrog1);
        System.out.println(f);

        System.out.println(myFrog.shiftName(5));
        System.out.println(myFrog.shiftName(10));
        System.out.println(myFrog.shiftName(15));

        System.out.println(myFrog1.shiftName(5));
        System.out.println(myFrog1.shiftName(10));
        System.out.println(myFrog1.shiftName(15));
    }
}

