package generic;

public class Pair<E> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this first = first;
        this second = second;
        }

    public E getFirst() {
        return first;
    }

    public void setFirst(E first) {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }
}
