#include <stdio.h>

//TODO: overflow and underflow, pop()

#define MAX 50

int stack[MAX];
int head = -1;
int tail = -1;

void push(int n) {
    if (tail == -1) {
        head = 0;
    }
    else {
        printf("%d  |  %d\n", head, tail);
        for (int i = tail + 1 ; i > head ; i--) {
            stack[i] = stack[i-1];
        }
    }
    stack[head] = n;
    tail++;

     for (int i = head ; i <= tail ; i++) {
        printf("%d", stack[i]);
    }
    printf("\n");
}

void pop() {
    
}

int main(void) {
    push(1);
    push(2);
    push(3);
    //for (int i = head ; i <= tail ; i++) {
    //    printf("%d", stack[i]);
    //}

    return 0;
}
