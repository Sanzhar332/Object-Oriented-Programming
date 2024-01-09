package problem3;

public interface MyCollection<E> {
	public boolean isEmpty();
	public void add(E o);
	public int getSize();
	public E firstElement();
	public void print();
}
