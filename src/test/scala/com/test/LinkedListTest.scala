package com.test
import com.knoldus.LinkedList
import org.scalatest.flatspec.AnyFlatSpec

class LinkedListTest extends AnyFlatSpec {

  //LinkedList of Int Type
  val linkedListOfInt = new LinkedList[Int]

  //Insertion of elements in the linked list
  it should "return true if element is inserted into the linkedlist" in {
        assert(linkedListOfInt.insert(12))
        assert(linkedListOfInt.insert(10))
        assert(linkedListOfInt.insert(29))
        assert(linkedListOfInt.insert(92))
  }

  //if currentNode will be null, means by traversing the linkedlist the pointer will be on last node
  // so currentNode should ne null and return true
  it should "print the elements of the linkedlist and return true" in {
      assert(linkedListOfInt.traverse())
  }

  // searching 92 in the linkedlist (which is present in the linkedlist)
  it should "return true, data is found in the linkedlist" in {
    assert(linkedListOfInt.search(92))
  }

  // searching 90 in the linkedlist (which is not present in the linkedlist)
  it should "return false, data is not found in the linkedlist" in {
    assert(linkedListOfInt.search(90))
  }

  /*-----------------------------------*-------------------------------------------------*/


  //LinkedList of String type
  val linkedListOfString = new LinkedList[String]

  //Insertion of elements in the linked list
  it should "return true, names are inserted into the linkedlist" in {
    assert(linkedListOfString.insert("Jitendra"))
    assert(linkedListOfString.insert("Manish"))
    assert(linkedListOfString.insert("Ayush"))
    assert(linkedListOfString.insert("Ajit"))
  }

  //if currentNode will be null, means by traversing the linkedlist the pointer will be on last node
  // so currentNode should ne null and return true
  it should "print the elements(names) of the linkedlist and return true" in {
    assert(linkedListOfString.traverse())
  }

  // searching "Jitendra" in the linkedlist (which is present in the linkedlist)
  it should "return true, name is found in the linkedlist" in {
    assert(linkedListOfString.search("Jitendra"))
  }

  // searching "Akash" in the linkedlist (which is not present in the linkedlist)
  it should "return false, name is not found in the linkedlist" in {
    assert(linkedListOfString.search("Akash"))
  }

}
