package implementations;

import java.util.ArrayList;

import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	// constructor
	public Dictionary() {
		this.keys = new ArrayList<>(DEFAULT_SIZE);
		this.values = new ArrayList<>(DEFAULT_SIZE);
	}
	@Override
	public void insert(K key, V value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public V remove(K key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public V update(K key, V value) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public V find(K key) {
		// TODO Auto-generated method stub
		return null;
	}

}
