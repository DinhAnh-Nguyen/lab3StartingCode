package implementations;

import java.util.ArrayList;
import utilities.DictionaryADT;
import exceptions.NullArgumentException;
import exceptions.DuplicatedKeyException;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	// constructor
	public Dictionary() {
		this.setKeys(new ArrayList<>(DEFAULT_SIZE));
		this.setValues(new ArrayList<>(DEFAULT_SIZE));
	}
	
	// keys and values getters and setters
	public ArrayList<K> getKeys() {
		return keys;
	}
	public void setKeys(ArrayList<K> keys) {
		this.keys = keys;
	}
	public ArrayList<V> getValues() {
		return values;
	}
	public void setValues(ArrayList<V> values) {
		this.values = values;
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
