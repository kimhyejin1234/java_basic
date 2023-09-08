package etc.generic.basic2;


//멀티 제너릭(key,value)
public class BoxSelf<K,V> {
	private K key;
	private V value;
	
	public BoxSelf(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	public void set(K key , V value) {

		this.key = key;
		this.value = value;
	}
	public V get(K key) {
		return this.value;
	}
	
	@Override
	public String toString() {
		return "{" + key + "=" + value + "}";
	}
	
	
	
}
