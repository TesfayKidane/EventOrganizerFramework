package eventorganizerframework.proxy;

import java.util.List;

public interface RealSubject<E> {

	public List<E> request(Object input);

}