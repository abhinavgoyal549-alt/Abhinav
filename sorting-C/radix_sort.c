#include <stdio.h>

int getMax(int a[], int n)
{
    int max = a[0], i;

    for(i = 1; i < n; i++)
    {
        if(a[i] > max)
            max = a[i];
    }

    return max;
}

void countingSort(int a[], int n, int place)
{
    int output[100];
    int count[10] = {0};
    int i;

    for(i = 0; i < n; i++)
        count[(a[i] / place) % 10]++;

    for(i = 1; i < 10; i++)
        count[i] = count[i] + count[i - 1];

    for(i = n - 1; i >= 0; i--)
    {
        output[count[(a[i] / place) % 10] - 1] = a[i];
        count[(a[i] / place) % 10]--;
    }

    for(i = 0; i < n; i++)
        a[i] = output[i];
}

void radixSort(int a[], int n)
{
    int max = getMax(a, n);
    int place;

    for(place = 1; max / place > 0; place *= 10)
        countingSort(a, n, place);
}

int main()
{
    int a[100], n, i;

    printf("Enter size: ");
    scanf("%d", &n);

    printf("Enter elements:\n");
    for(i = 0; i < n; i++)
        scanf("%d", &a[i]);

    radixSort(a, n);

    printf("Sorted array:\n");
    for(i = 0; i < n; i++)
        printf("%d ", a[i]);

    return 0;
}