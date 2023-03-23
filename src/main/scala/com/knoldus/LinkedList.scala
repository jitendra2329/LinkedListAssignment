package com.knoldus

class LinkedList[A] {
  private case class Node(data: A, var next: Node = null)

  private var head: Node = null

  // inserting the element into the linkedlist
  def insert(data: A): Boolean = {
    val newNode = Node(data)
    if (head == null) {
      head = newNode
      true
    } else {
      var current = head
      while (current.next != null) {
        current = current.next
      }
      current.next = newNode
      true
    }
  }

  //traverse the linkedlist
  def traverse(): Boolean = {

    var currentNode = head
    while (currentNode != null) {
      print(currentNode.data + "->")
      currentNode = currentNode.next
    }
    print(null)

    if(currentNode == null) true else false
  }

  //search a particular data in the linkedlist
  def search(data: A): Boolean = {
    var current = head
    while (current != null) {
      if (current.data == data) {
        return true
      }
      current = current.next
    }
    false
  }

  //delete the given data from linkelist
  def delete(data: A): Unit = {
    if (head != null) {
      if (head.data == data) {
        head = head.next
      } else {
        var currentNode = head
        var previousNode: Node = null
        while (currentNode != null && currentNode.data != data) {
          previousNode = currentNode
          currentNode = currentNode.next
        }
        if (currentNode != null) {
          previousNode.next = currentNode.next
        }
      }
    }
  }
}

object LinkedList extends App {

  val stringList = new LinkedList[String]()
  stringList.insert("Jitendra")
  stringList.insert("Manish")
  stringList.insert("Ayush")
  stringList.insert("Akash")
  stringList.insert("Ajit")

  stringList.delete("Akash")
  println(stringList.search("Ajit")) // True
  stringList.traverse()
}

