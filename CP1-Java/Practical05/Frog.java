public class Frog {

    private int id = -1;  // -1 used to indicate it has not been set
    private String name = "Name not set";
    private int age = 0;  // New instance variable for age, initialized to 0

    public Frog() {
        // Constructor currently does nothing
        // no code in body of constructor
    }
    public Frog(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // New setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    public String alterName() {
        StringBuilder alteredName = new StringBuilder();
        for (char c : name.toCharArray()) {
            char alteredChar = c;
            switch (c) {
                case 'a' -> alteredChar = 'e';
                case 'n' -> alteredChar = 'e';
                case 'r' -> alteredChar = 'a';
                case 'F' -> alteredChar = 'a';
                case 'd' -> alteredChar = 'i';
            }
            alteredName.append(alteredChar);
        }
        return alteredName.toString();
    }

    // New method: firstAlphabetically
    public Frog firstAlphabetically(Frog otherFrog) {
        if (this.name.compareTo(otherFrog.name) <= 0) {
            return this;
        } else {
            return otherFrog;
        }
    }

    // New method: shiftName
    public String shiftName(int shift) {
        StringBuilder shiftedName = new StringBuilder();
        for (char c : name.toCharArray()) {
            if (Character.isLowerCase(c)) {
                shiftedName.append((char) (((c - 'a' + shift) % 26) + 'a'));
            } else if (Character.isUpperCase(c)) {
                shiftedName.append((char) (((c - 'A' + shift) % 26) + 'A'));
            } else {
                shiftedName.append(c);
            }
        }
        return shiftedName.toString();
    }

    public String printAgeGroup() {
        String ageGroup = "";
        if (age >= 0 && age <= 20) {
            ageGroup = "young";
        } else if (age >= 21 && age <= 50) {
            ageGroup = "juvenile";
        } else if (age > 50) {
            ageGroup = "adult";
        }
        return "Age group is " + ageGroup;
    }

    public String toString() {
        return "**** Start of print method ****\n"
                + "Frog's name is " + name + "\n"
                + "Id is " + id;
    }
}