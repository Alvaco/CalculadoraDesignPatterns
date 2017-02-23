
public class FactoryStack <E>{
	//selecciona la implementacion a utilizar para un stack
	//se utiliza el patron Factory
	   public iStack<E> getStack(String entry) {
	    // seleccion de la implementacion a utilizar:
		if (entry.equals("AL"))
	      return new ArrayListStack<E>(); //regresa ArrayList
		else
	      return new VectorStack<E>(); //regresa Vector
	   }
	}