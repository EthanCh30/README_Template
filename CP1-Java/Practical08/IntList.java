public class IntList {
    private final int DEFAULT_CAPACITY = 4;
    private int[] elementData;
    private int size = 0;
    public IntList() {
        elementData = new int[DEFAULT_CAPACITY];
    }
    public IntList(int size) {
        elementData = new int[size];
    }
    private int[] grow() {
        int[] newElementData = new int[elementData.length + 5];
        System.arraycopy(elementData, 0, newElementData, 0, elementData.length);
        return newElementData;
    }

    public boolean add(int element) {
        if (size >= elementData.length) {
            elementData = grow();
        }
        elementData[size] = element;
        size++;
        return true;
    }
    public boolean add(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index: " + index);
            return false;
        }

        if (size >= elementData.length) {
            elementData = grow();
        }

        for (int i = size - 1; i >= index; i--) {
            elementData[i + 1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }
    public int remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index: " + index);
            return -1;
        }

        int element = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return element;
    }
    public boolean removeElement(int element) {
        int index = indexOf(element);
        if (index >= 0) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index: " + index);
            return -1;
        } else {
            return elementData[index];
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index: " + index);
            return -1;
        } else {
            int oldElement = elementData[index];
            elementData[index] = element;
            return oldElement;
        }
    }

    public int size() {
        return size;
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public IntList subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size || toIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            System.out.println("invalid indices");
            return null;
        }
        IntList subList = new IntList(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add(elementData[i]);
        }
        return subList;
    }

    public void removeRange(int fromIndex, int toIndex) {
        if (fromIndex < 0 || fromIndex >= size || toIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            System.out.println("invalid indices");
            return;
        }

        for (int i = fromIndex; i < toIndex; i++) {
            remove(fromIndex);
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "List is empty: []";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Printing List: [");
            for (int i = 0; i < size; i++) {
                sb.append(elementData[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}