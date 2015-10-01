#!/bin/python

class Node(object):

    def __init__(self, data=None, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

    def add_node(self, root, node):
        if root:
            if root.data > node.data:
                self.add_node(root.left, node)
            else:
                self.add_node(root.right, node)
        root = node

    def print_print(self, root):
        if root:
            print root.data
            print_tree(root.left)
            print_tree(root.right)


def print_tree(root):
    if root:
        print root.data
        print_tree(root.left)
        print_tree(root.right)


def main():
    root = Node(5)
    list = [1, 2, 3, 4, 5, 6, 7, 8]
    print list
    for data in list:
        node = Node(data)
        root.add_node(root, node)

    root.print_print(root)
    print_tree(root)

if __name__ == "__main__": main()
