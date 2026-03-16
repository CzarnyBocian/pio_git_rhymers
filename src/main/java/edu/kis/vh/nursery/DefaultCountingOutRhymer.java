package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int SIZE = 12;
    private static final int NUMBER = -1;
    private final int[] numbers = new int[SIZE];

    public int total = NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NUMBER;
    }

    public boolean isFull() {
        return total == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return NUMBER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NUMBER;
        return numbers[total--];
    }

}
