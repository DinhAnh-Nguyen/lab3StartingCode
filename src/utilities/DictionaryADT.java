package utilities;

import exceptions.DuplicatedKeyException;
import exceptions.NullKeyException;
import exceptions.NullValueException;

/**
* DictionaryADT.java
*
* @author Dinh Anh Nguyen, Mark Bui
* @version major.minor revision number starting at 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
	/**
	 * Insert a key - value pair into the dictionary where every key is unique.
	 * If the inserted key already exists, an exception will be thrown.
	 * 
	 * @param key the inserted key
	 * @param value the inserted value that is paired with the key
	 * @exception NullArgumentException thrown when the key or the value is null
	 * @exception DuplicatedKeyException thrown when the inserted key already exists
	 */
	void insert(K key, V value) throws NullKeyException, NullValueException, DuplicatedKeyException;
	
	/**
	 * Remove a pair in the dictionary based on the key
	 * 
	 * @param key the key to be removed
	 * @exception NullArgumentException thrown when the key or the value is null
	 * @return removed key
	 */
	V remove(K key) throws NullKeyException, NullValueException;
	
	/**
	 * Update the value of an existing key
	 * 
	 * @param key the existing key
	 * @param value the value to be updated
	 * @exception NullArgumentException thrown when the key or the value is null
	 * @return new value
	 */
	V update(K key, V value) throws NullKeyException, NullValueException;
	
	/**
	 * Look up a value based on the key
	 * 
	 * @param key the key to be found
	 * @exception NullArgumentException thrown when the key or the value is null
	 * @return the index of the desired key
	 */
	V find(K key) throws NullKeyException, NullValueException;
}
