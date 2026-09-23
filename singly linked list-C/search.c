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
    int n, i, key, found = 0;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        newnode = (struct node*)malloc(sizeof(struct node));

        scanf("%d", &newnode->data);
        newnode->next = head;
        head = newnode;
    }

    printf("Enter element to search: ");
    scanf("%d", &key);

    temp = head;

    while(temp != NULL)
    {
        if(temp->data == key)
        {
            found = 1;
            break;
        }

        temp = temp->next;
    }

    if(found == 1)
        printf("Element found");
    else
        printf("Element not found");

    return 0;
}