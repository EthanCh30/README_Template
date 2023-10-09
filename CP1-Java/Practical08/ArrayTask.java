public class ArrayTask {

    public static void main(String[] args) {
        IntList intListOne = new IntList();
        System.out.println(intListOne);
        intListOne.add(42);
        System.out.println(intListOne);
        intListOne.add(2);
        System.out.println(intListOne.get(3));
        System.out.println(intListOne.get(-1));
        System.out.println(intListOne.get(1));
        System.out.println(intListOne);
        intListOne.add(78);
        intListOne.add(9);
        intListOne.add(57);
        System.out.println(intListOne);

        System.out.println("list one size: " + intListOne.size());
        System.out.println("list one contains 42: " + intListOne.contains(42));
        System.out.println("list one contains 101: " + intListOne.contains(101));
        int output = intListOne.indexOf(2);
        System.out.println(output == -1 ? "element not found" : "index of 2: " + output);
        output = intListOne.indexOf(56);
        System.out.println(output == -1 ? "element not found" : "index of 56: " + output);
        intListOne.add(79);
        intListOne.add(23);
        System.out.println(intListOne);
        output = intListOne.set(4, 99);
        System.out.println(output == -1 ? "invalid index" : "old value = " + output);
        System.out.println(intListOne);
        output = intListOne.set(7, 76);
        System.out.println(output == -1 ? "invalid index" : "old value = " + output);
        System.out.println(intListOne);


        System.out.println("Creating ListTwo");
        int[] values = {5, 8, 2, 13, 12, 14, 13, 22, 9, 22, 78, 2, 42};
        IntList intListTwo = new IntList(10);
        for (int i = 0; i < values.length; i++) {
            intListTwo.add(values[i]);
        }
        System.out.println(intListTwo);
        System.out.println("list two size: " + intListTwo.size());
        intListTwo.add(100);
        System.out.println(intListTwo);
        intListTwo.add(4, 47);
        intListTwo.add(79);
        intListTwo.add(-1, 66);
        intListTwo.add(17, 66);
        intListTwo.add(16, 66);
        System.out.println(intListTwo);
        output = intListTwo.remove(2);
        if (output != -1)
            System.out.println("element at index 2 (" + output + ") removed");
        System.out.println(intListTwo);
        if (intListTwo.removeElement(5))
            System.out.println("5 removed");
        else
            System.out.println("no such element: 5");
        System.out.println(intListTwo);
        output = intListTwo.remove(9);
        if (output != -1)
            System.out.println("element at index 9 (" + output + ") removed");
        if (intListTwo.removeElement(52))
            System.out.println("52 removed");
        else
            System.out.println("no such element: 52");
        output = intListTwo.remove(15);
        System.out.println(intListTwo);

        output = intListTwo.lastIndexOf(22);
        System.out.println(output == -1 ? "element not found" : "last index of 22: " + output);
        System.out.println(intListTwo);
        IntList subList = intListTwo.subList(3, 9);
        System.out.println("Sublist: " + subList);
        System.out.println(intListOne);
        intListOne.removeRange(2, 5);
        System.out.println(intListOne);
        subList = intListTwo.subList(4, 4);
        System.out.println("Sublist: " + subList);
    }

}
