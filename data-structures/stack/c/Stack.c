#include <stdio.h>

//TODO: overflow and underflow, pop()

#define MAX 50

int stack[MAX];
int head = -1;
int tail = -1;

void push(int n) {
    if (tail == -1) {
        head = 0;
    } else if (tail == MAX) {
        printf("Stack overflow\n");
    } else {
        for (int i = tail + 1 ; i > head ; i--) {
            stack[i] = stack[i-1];
        }
    }
    stack[head] = n;
    tail++;
}

void pop() {
    if (tail == -1) {
        printf("Stack underflow\n");
    } else {
        for(int i = head ; i < tail ; i++) {
            stack[i] = stack[i+1];
        }
        tail--;
    }
}

void printStack() {
   for (int i = head ; i <= tail ; i++) {
        printf("%d", stack[i]);
    }
    printf("\n");
}

int main(void) {
    push(1);
    push(2);
    push(3);
    
    printStack();

    pop();

    printStack();

    pop();
    push(3);

    printStack();

    return 0;
}
