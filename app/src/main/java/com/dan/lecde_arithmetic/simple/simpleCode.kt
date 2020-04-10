package com.dan.lecde_arithmetic.simple

/**
 * Create by ldr
 * on 2020/4/10 16:17.
 */
fun main() {
    var node = Node(1)
    var oneNode = node
    var testNode = node
    for (i in 2..10) {
        node.next = Node(i)
        node = node.next!!
    }

    while (oneNode != null) {
        print("${oneNode.value} ->")
        oneNode = oneNode.next ?: break
    }
    println("")
    var re = invert(testNode)
    while (re != null) {
        print("${re.value} ->")
        re = re.next ?: break
    }
}

/**
 * 定义链表节点
 */
class Node {
    constructor(data: Int) {
        value = data
    }

    var value: Int? = 0
    var next: Node? = null
}

/**
 * 链表反转
 */
fun invert(node: Node): Node? {
    var next: Node
    var preNode: Node? = null
    var curNode: Node = node
    while (curNode != null) {
        if (curNode.next == null) {
            preNode!!.value = curNode.value
            return preNode
        }
        next = curNode.next!!
        curNode.next = preNode
        preNode = curNode
        curNode = next
    }
    return preNode
}
