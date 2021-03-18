#include <stdio.h>
void change(int *x, int *y)
{
    int new = *x;
    *x = *y;
    *y = new;
}
void sort(int row[], int a)
{
    int mn , i ,j;
    for (i = 0; i < a-1; i++)
{
        mn = i;
        for (j = i+1; j < a; j++)
          if (row[j] < row[mn])
            mn = j;
        change(&row[mn], &row[i]);
    }
}

void print(int row[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", row[i]);
    printf("\n");
}
int main()
{
    int row[] = {5989,26,18,33,11,7,9,99985};
    int a = sizeof(row)/sizeof(row[0]);
    sort(row , a);
    print(row, a);
    return 0;
}
