package com.example.testingtesting123

class UniqueCollection {
    private val collection = ArrayList<Item>()

    /** Add an item to the collection */
    fun addItem(item: Item) {
        if (!collection.contains(item))
            collection.add(item)
    }

    /** Return an element from the collection at the specified position */
    fun get(position: Int) = collection[position]

    /** Remove an item from the collection */
    fun remove(item: Item) {
        collection.remove(item)
    }

    /** Clear all items from the collection */
    fun clear() {
        collection.clear()
    }

    /** Return the size of the collection */
    fun size() = collection.size

    /** Check if the collection contains an item */
    fun contains(item: Item) = collection.contains(item)
}