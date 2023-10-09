import java.util.Random;

public class BoatMaker {

    public static void main(String[] args) {
        System.out.println("Starting boat application");
        Boat myBoat = new Boat();
        Boat myBoat1 = new Boat("Harmony Blue","International 505", 6467,9);
        System.out.println(myBoat.toString());
        System.out.println(myBoat1.toString());
        myBoat.setName("Australia II");
        System.out.println(myBoat.toString());
        System.out.println(myBoat.getName());
        System.out.println(myBoat1.getName());
        int i = 4;
        while (i > 0) {
            Boat testBoat = new Boat();
            System.out.println("Sequence #: " + testBoat.getSeqNum());
            System.out.println(testBoat);
            i--;
        }
        System.out.println();
        System.out.println(Boat.getTotal()); // print the total number of boats created
// ... earlier part of BoatMaker main method ...

        System.out.println("Boat #\tStart\tEnd\tYdstk\tAdjusted Time (mins)");
        System.out.println("--------------------------------------------------");

        Random rand = new Random();

// Variables for tracking best time and the boat number
        double bestTime = Double.MAX_VALUE;
        int boatNum = -1;

        int index = 0;
        while (index < 8) {
            int startYardstick = rand.nextInt(10) + 91; // Yardstick in the range 91 to 100

            Boat boat = new Boat(); // Create a new Boat with the default constructor
            boat.setYardstick(startYardstick); // Set the yardstick to the one generated above

            int startTime = getCorrectedTime(900, 1145);
            int endTime = getCorrectedTime(1030, 1230);
            String adjustedTimeStr = boat.adjustedRaceTime(startTime, endTime);

////            操作
//            if (adjustedTimeStr=="36.00"){
//                adjustedTimeStr="36";
//            }
//            if (adjustedTimeStr=="108.60"){
//                adjustedTimeStr="108.6";
//            }
            System.out.println("Boat " + (index + 1) + "\t" + startTime + "\t" + endTime + "\t" + startYardstick + "\t" + adjustedTimeStr);

            // Determine the best time
            if (!"Incorrect time keeping".equals(adjustedTimeStr)) {
                double adjustedTime = Double.parseDouble(adjustedTimeStr);
                if (adjustedTime < bestTime) {
                    bestTime = adjustedTime;
                    boatNum = index;
                }
            }

            index++;
        }

        System.out.println("--------------------------------------------------");
        System.out.println("The winner of the race is: Boat " + (boatNum + 1) + " with a time of " + bestTime + " minutes");

    }
    public static int getCorrectedTime(int min, int max) {
        Random random = new Random();

        // Generate a random number between min and max
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Extract hour and minute parts
        int hours = randomNumber / 100;
        int minutes = randomNumber % 100;

        // Adjust if minutes exceed 59
        if (minutes > 59) {
            hours += 1;
            minutes -= 60;
        }

        // Combine adjusted hour and minute parts
        int adjustedNumber = (hours * 100) + minutes;
        return adjustedNumber;
    }

    }


