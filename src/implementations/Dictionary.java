package implementations;

import java.util.ArrayList;
import utilities.DictionaryADT;
import exceptions.NullKeyException;
import exceptions.NullValueException;
import exceptions.DuplicatedKeyException;

// Author: Dinh Anh Nguyen, Mark Bui

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
	
	// Method for inserting a new key - value pair with an unique key
	@Override
	public void insert(K key, V value) throws NullKeyException, NullValueException, DuplicatedKeyException {
		if (key == null) {
			throw new NullKeyException();
		}
		
		if (value == null) {
			throw new NullValueException();
		}
		
		if (keys.contains(key)) {
			throw new DuplicatedKeyException("Error! " + key + " already existed.");
		}
		
		keys.add(key);
		values.add(value);
	}
	
	// Method for removing a key - value pair based on the key
	@Override
	public V remove(K key) throws NullKeyException {
		if (key == null) {
			throw new NullKeyException();
		}
		
		int i = keys.indexOf(key);
		if (i == -1) {
			System.out.println("Key not found. Try again.");
		}
		
		V removedValue = values.get(i);
		keys.remove(i);
		values.remove(i);
		return removedValue;
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
