package com.example.testingtesting123

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }

    // Test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val item = Item("item1")
        collection.addItem(item)
        assertTrue("Item was not added to the collection", collection.contains(item))
    }

    // Test to ensure that only unique items can be added to the collection
    @Test
    fun addUniqueItem() {
        val item1 = Item("item1")
        val item2 = Item("item1") // Same name as item1, should not be added

        collection.addItem(item1)
        collection.addItem(item2)

        assertEquals("Duplicate item was added to the collection", 1, collection.size())
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size()

        assertTrue("Items not cleared", originalSize == 2 && newSize == 0)
    }
}
