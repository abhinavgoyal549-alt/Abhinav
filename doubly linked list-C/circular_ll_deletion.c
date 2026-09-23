#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

int main()
{
    struct node *head = NULL, *newnode, *temp, *last;
    int n, i;

    printf("Enter number of nodes: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        newnode = (struct node*)malloc(sizeof(struct node));

        scanf("%d", &newnode->data);

        if(head == NULL)
        {
            head = newnode;
            newnode->next = head;
        }
        else
        {
            temp = head;

            while(temp->next != head)
                temp = temp->next;

            temp->next = newnode;
            newnode->next = head;
        }
    }

    /* Deletion from beginning */

    if(head == NULL)
    {
        printf("List is empty");
    }
    else if(head->next == head)
    {
        free(head);
        head = NULL;
    }
    else
    {
        last = head;

        while(last->next != head)
            last = last->next;

        temp = head;
        head = head->next;
        last->next = head;

        free(temp);
    }

    printf("After deletion: ");

    if(head != NULL)
    {
        temp = head;

        do
        {
            printf("%d -> ", temp->data);
            temp = temp->next;
        } while(temp != head);
    }

    return 0;
}