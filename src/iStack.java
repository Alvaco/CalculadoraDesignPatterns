
public interface iStack<E>{
	
	/**
	 * @param algo
	 * Ingresa un elemento a un objeto
	 */
	public void push(E algo);
	
	/**
	 * @return un elemento del final de una lista
	 */
	public E pop();
	
	/**
	 * @return true si el objeto está vacío
	 */
	public boolean isEmpty();
	
}