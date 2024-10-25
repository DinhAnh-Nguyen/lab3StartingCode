package utilities;

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
	 * 
	 * @param key
	 * @param value
	 */
	void insert(K key, V value);
	
	V remove(K key);
	
	V update(K key, V value);
	
	V find(K key);
}
