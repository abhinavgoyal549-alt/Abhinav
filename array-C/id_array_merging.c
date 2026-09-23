#include <stdio.h>

int main()
{
    int a[50], b[50], c[100];
    int n, m, i;

    printf("Enter size of first array: ");
    scanf("%d", &n);

    printf("Enter elements of first array:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);

    printf("Enter size of second array: ");
    scanf("%d", &m);

    printf("Enter elements of second array:\n");
    for(i = 0; i < m; i++)
        scanf("%d", &b[i]);

    for(i = 0; i < n; i++)
        c[i] = a[i];

    for(i = 0; i < m; i++)
        c[n + i] = b[i];

    printf("Merged Array:\n");
    for(i = 0; i < n + m; i++)
        printf("%d ", c[i]);

    return 0;
}