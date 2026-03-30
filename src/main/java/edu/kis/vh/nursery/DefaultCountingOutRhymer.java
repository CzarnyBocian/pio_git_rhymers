package edu.kis.vh.nursery;

/**
 * Klasa symulujaca wyliczanke
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    /**
     * Zwraca aktualna wartosc licznika wyliczanki
     * @return aktualna wartosc licznika
     */
    public int getTotal() {
        return total;
    }

    /**
     * Metoda dodajaca nowa wartosc do wyliczanki
     * * @param in wartosc, ktora ma zostac dodana
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta
     * * @return true jesli wyliczanka jest pusta, lub false w przeciwnym wypadku
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy wyliczanka jest pelna
     * * @return true jesli wyliczanka jest pelna, lub false w przeciwnym wypadku
     */
    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    /**
     * Zwraca ostatnia dodana wartosc bez jej usuwania z wyliczanki
     * * @return ostatnia dodana wartosc lub wartosc domyslna (pod warunkiem, ze wyliczanka jest pusta)
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    /**
     * Zwraca i usuwa ostatnia wartosc z wyliczanki
     * * @return usuwana wartosc lub wartosc domyslna (pod warunkiem, ze wyliczanka jest pusta)
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }
}