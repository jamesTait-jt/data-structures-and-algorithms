#include <stdio.h> 

# define MAX 50

int queue[MAX];
int head = -1;
int tail = -1;

void printQueue() {
    for (int i = head ; i <= tail ; i++) {
        printf("%d ", queue[i]);
    }
    printf("\n\n");
}

void enqueue(int n) {
    if (tail == MAX - 1) {
        printf("Queue overflow\n");
    }
    else if (tail == -1) {
        queue[0] = n;
        head = 0;
    } else {
        queue[tail + 1] = n;
    }
    tail++;
}

void dequeue() {
    if (head == -1) {
       printf("Queue underflow\n"); 
    }
    else {
        for (int i = head ; i <= tail ; i++) {
            queue[i-1] = queue[i];
        }
        tail--;
    }
}

int main(void) {
    for (int i = 0 ; i < MAX ; i++) {
        enqueue(i+1);
    }
    printQueue();
    dequeue();
    printQueue();
    return 0;
}
