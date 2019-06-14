package generic;
/**
 *    Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элементов типа Е.
 *    Предоставьте методы доступа для получения первого и второго элементов.
 */

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
