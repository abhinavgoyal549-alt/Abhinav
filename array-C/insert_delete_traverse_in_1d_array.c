#include <stdio.h>

int main() {
    int a[100], n, i;

    printf("Enter size: ");
    scanf("%d", &n);

    printf("Enter elements: ");
    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);

    printf("Array elements are: ");
    for(i = 0; i < n; i++)
        printf("%d ", a[i]);

    return 0;
}