package map;

import java.util.*;

/*
Map is an Interface

Elements in array, List, or ArrayList are allocated with their indices.
In Map, the elements (values) are allocated with unique key.
Like Set, Map uses the concept of HashCode, the entries are not necessarily in the same sequence when put

Sub-interfaces:
Bindings, ConcurrentMap<K,V>, ConcurrentNavigableMap<K,V>, LogicalMessageContext,
MessageContext,NavigableMap<K,V>, SOAPMessageContext, SortedMap<K,V>

Implemented classes:
AbstractMap, Attributes, AuthProvider, ConcurrentHashMap, ConcurrentSkipListMap,
EnumMap, HashMap, Hashtable, IdentityHashMap, LinkedHashMap, PrinterStateReasons, Properties,
Provider, RenderingHints, SimpleBindings, TabularDataSupport, TreeMap, UIDefaults, WeakHashMap

Nested interfaces:
Entry

common methods:
1. put(Object k, Object v)  Puts an entry, overwrites any previous value associated with the key.
    Returns null if the key did not already exist. Otherwise, the previous value linked to the key is returned.
2. get(k)  Returns the value associated with the key k.
3. size( )  Returns the number of entries
4. remove(k)  Removes the entry whose key equals k.
5. isEmpty( )
6. void clear( )  Removes all pair
7. equals(obj)   Returns true if Map obj is equal to this Map object, else false.
8. void putAll(Map m) Puts all the entries from m into this map.
9. containsKey(k) Returns true if contains key k, else false
10. containsValue(v)  Returns true if contains value v, else false.
11. entrySet( )  Returns the entries of the map as a set. The set contains objects of type Map.Entry.
12. hashCode( )
13. Set keySet( )  Returns the keys as a set.
14. Collection values( ) Returns all the values as a collection

 */

public class Definition {
    public static void main(String[] args) {
        //Raw
        Map a = new Hashtable();

        //With generic: Map<keyType, objectType>
        Map<Integer, String> b = new HashMap<>();
        Map<Integer, String> c = new Hashtable<>();
        //HashTable is synchronize/thread-safe (works with multiple threads), but HashMap is not.
        //Hashtable is slower than HashMap
        //HashTable does not allow any null key, HashMap allows one null key
        //HashTable is there since Java is introduced, HashMap came in version 1.2


        Map<Integer, String> student = new HashMap<Integer, String>(){{
           put(101, "John");
           put(102, "Amber");
           put(103, "Allie");
           put(104, "Hakim");
        }};
        System.out.println(student.get(101));

        Set<Integer> keys =student.keySet();
        for (int id : keys){
            System.out.println("ID #: "+id + "First Name: "+student.get(id));
        }

        // With Map.Entry
        // Set is taking Map.Entry type, and Entry is taking Integer and String types.
        Set<Map.Entry<Integer, String>> pairs = student.entrySet();
        for (Map.Entry<Integer, String > pair : pairs){
            System.out.println(pair.getKey()+": "+pair.getValue());
        }

        //Tree Map. It is always sorted based on the keys. Comparable can be provided.
        Map<Integer, String> teacher = new TreeMap<>();
    }
}
