package wangqi.basic.java.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import wangqi.java.data.model.Item;

public class HashCodeTest {
	public static void main(String[] args) {
		Set<Item> set = new HashSet<Item>();
		Item item1 = new Item(1, 1);
		Item item2 = new Item(1, 1);
		System.out.println(item1.equals(item2));
		set.add(item1); // successfully added
		/*
		 * since hashCode method of class Item has not been overrided,jdk use the
		 * default hashcode method of Object, which means hashcode is the address of
		 * object and items is different from item2
		 * 
		 */
		set.add(item2);// successfully added
		set.add(item1); // abandoned because of existence

		Iterator<Item> iterator = set.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			System.out.println(object);
		}
	}
}