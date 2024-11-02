package implementations;

import java.util.ArrayList;
import utilities.DictionaryADT;
import exceptions.DuplicateKeyException;

// Author: Dinh Anh Nguyen, Mark Bui

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// Constant
	private static final int DEFAULT_SIZE = 10;
	
	// Index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	public Dictionary(int i) {
		keys = new ArrayList<>(i);
	    values = new ArrayList<>(i);
	}
	
	public Dictionary() {
		this(DEFAULT_SIZE);
	}
	
	// Method for creating a new dictionary object
	@Override
	public void create(int size) {
		keys = new ArrayList<>(size);
        values = new ArrayList<>(size);
		
	}
	
	// Method for inserting a new key - value pair with an unique key
	@Override
	public boolean insert(K key, V value) throws DuplicateKeyException {		
		if (keys.contains(key)) {
			throw new DuplicateKeyException("Error! " + key + " already existed.");
		}
		
		keys.add(key);
		values.add(value);
		
		return true;
	}
	
	// Method for removing a key - value pair based on the key
	@Override
	public V remove(K key) {
		int i = keys.indexOf(key);
		if (i == -1) {
			System.out.println("Key not found. Try again.");
		}
		
		V removedValue = values.get(i);
		keys.remove(i);
		values.remove(i);
		return removedValue;
	}
	
	// Method for updating a key - value pair from the dictionary
	@Override
	public boolean update(K key, V value) {
		int i = keys.indexOf(key);
		if (i == -1) {
			System.out.println("Key not found. Try again.");
		}
		
		values.set(i, value);
		return true;
	}
	
	// Method for retrieving the value of a key from the Dictionary.
	@Override
	public V lookup(K key) {
		int i = keys.indexOf(key);
		if (i == -1) {
			System.out.println("Key not found. Try again.");
		}
		
		return values.get(i);
	}
}
