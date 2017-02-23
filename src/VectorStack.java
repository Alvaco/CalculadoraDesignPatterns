import java.util.Vector;


public class VectorStack <E> extends AbstractStack<E>{

		protected Vector<E> data;

		public VectorStack()
		// post: constructs a new, empty stack
		{
			data = new Vector<E>();
		}

		public void push(E item)
		// post: the value is added to the stack
		//          will be popped next if no intervening push
		{
			data.add(item);
		}

		public E pop()
		// pre: stack is not empty
		// post: most recently pushed item is removed and returned
		{
			return data.remove(size()-1);
		}

		public E peek()
		// pre: stack is not empty
		// post: top value (next to be popped) is returned
		{
			return data.get(size() - 1);
		}
		
		public int size()
		// post: returns the number of elements in the stack
		{
			return data.size();
		}
	  
		
	}