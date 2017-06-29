#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

struct Node {
    int data;
    struct Node *next;
};

void append(struct Node **head, int n) {

    // Need to allocate memory for the new node
    struct Node *newNode = (struct Node *) malloc(sizeof (struct Node));
    
    newNode->data = n;
    newNode->next = NULL;

    struct Node *curr = head;

    while (curr->next != NULL) {
        curr = curr->next;
    }
    curr->next = newNode;
}

int main() {
    struct Node *head = NULL;

    head->data = INT_MAX;
    head->next = NULL;
    
    return 0;
}
