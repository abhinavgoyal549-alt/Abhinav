#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

int main()
{
    struct node *head = NULL, *newnode, *temp;
    int n, i, count = 0;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        newnode = (struct node*)malloc(sizeof(struct node));

        scanf("%d", &newnode->data);
        newnode->next = head;
        head = newnode;
    }

    temp = head;

    while(temp != NULL)
    {
        count++;
        temp = temp->next;
    }

    printf("Number of nodes = %d", count);

    return 0;
}