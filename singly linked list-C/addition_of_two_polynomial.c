#include <stdio.h>
#include <stdlib.h>

struct node
{
    int coeff;
    int exp;
    struct node *next;
};

struct node* create()
{
    struct node *head = NULL, *newnode, *temp;
    int n, i;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    for(i = 0; i < n; i++)
    {
        newnode = (struct node*)malloc(sizeof(struct node));

        scanf("%d %d", &newnode->coeff, &newnode->exp);
        newnode->next = NULL;

        if(head == NULL)
            head = newnode;
        else
        {
            temp = head;

            while(temp->next != NULL)
                temp = temp->next;

            temp->next = newnode;
        }
    }

    return head;
}

void display(struct node *p)
{
    while(p != NULL)
    {
        printf("%dx^%d", p->coeff, p->exp);

        if(p->next != NULL)
            printf(" + ");

        p = p->next;
    }
}

int main()
{
    struct node *p1, *p2, *p3 = NULL;
    struct node *temp, *newnode;

    printf("Enter first polynomial:\n");
    p1 = create();

    printf("Enter second polynomial:\n");
    p2 = create();

    while(p1 != NULL && p2 != NULL)
    {
        newnode = (struct node*)malloc(sizeof(struct node));
        newnode->next = NULL;

        if(p1->exp == p2->exp)
        {
            newnode->coeff = p1->coeff + p2->coeff;
            newnode->exp = p1->exp;

            p1 = p1->next;
            p2 = p2->next;
        }
        else if(p1->exp > p2->exp)
        {
            newnode->coeff = p1->coeff;
            newnode->exp = p1->exp;

            p1 = p1->next;
        }
        else
        {
            newnode->coeff = p2->coeff;
            newnode->exp = p2->exp;

            p2 = p2->next;
        }

        if(p3 == NULL)
            p3 = newnode;
        else
        {
            temp = p3;

            while(temp->next != NULL)
                temp = temp->next;

            temp->next = newnode;
        }
    }

    printf("Result: ");
    display(p3);

    return 0;
}