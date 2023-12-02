import java.util.ArrayList;
import java.util.List;

public class MaxHeap<E extends Comparable<E>> implements AbstractHeap<E> {
    private List<E> elements;

    public MaxHeap() {
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void add(E element) {
        elements.add(element);
        heapifyUp(elements.size() - 1);
    }

    @Override
    public E peek() {
        if (elements.isEmpty()) {
            return null; // или выбросить исключение, в зависимости от требований
        }
        return elements.get(0);
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && elements.get(index).compareTo(elements.get(parentIndex)) > 0) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void swap(int i, int j) {
        E temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    @Override
    public String toString() {
        return  elements.toString();
    }
}
