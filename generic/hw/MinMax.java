package generic;
/**
 *   Видоизмените класс из предыдущего упражнения, введя методы mах() и min() для получения наибольшего
 *   и наименьшего из двух элементов. Наложите соответствующее ограничение на обобщенный тип Е.
 */
public class MinMax<E extends Comparable<E>> extends Pair<E>{

    public MinMax(E first, E second) {
        super(first, second);
    }

    public MinMax(Pair <E> pair) {
        super(pair.getFirst(), pair.getSecond());
    }

    public E getMax() {
        return super.getFirst().compareTo(super.getSecond()) > 0 ? super.getFirst() : super.getSecond();
    }

    public E getMin() {
        return super.getFirst().compareTo(super.getSecond()) < 0 ? super.getFirst() : super.getSecond();
    }
}
