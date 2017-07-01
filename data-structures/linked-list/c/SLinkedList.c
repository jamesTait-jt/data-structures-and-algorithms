#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

struct Node {
    int data;
    struct Node *next;
};

struct Node *createNode(int data) {
    struct Node *newNode = malloc(sizeof(struct Node));

    newNode->next = NULL;
    newNode->data = data;

    return newNode;
}


void append(struct Node *head, int n) {
    if(!head) {                             // List is empty (head is null)
        struct Node *newNode = createNode(n);
        head = newNode;

    }
}

int main() {
    struct Node *head = NULL;
    
    append(head, 0);

    return 0;
}
