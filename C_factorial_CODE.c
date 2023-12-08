#include<stdio.h>
int main() {


int num,fact=1;
printf("Enter a number:");
scanf("%d",&num);
if(num<0) {
    printf("\n number can't exist");
}
else{
    for(int i=1;i<=num;i++)
    {
        fact *= i;
    }
    printf("%d",fact);
}
return 0;
}