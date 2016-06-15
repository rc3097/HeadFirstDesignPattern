package enumerationIterator;
import java.util.Enumeration;
import java.util.Iterator;


public class EnumerationIterator<F> implements Iterator {
	Enumeration<F> enums;
	public EnumerationIterator(Enumeration enums) {
		this.enums = enums;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enums.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enums.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
