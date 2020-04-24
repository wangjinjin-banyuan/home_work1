# 汉诺塔作业
```
#include<stdio.h>
long count;
void Move(int n,char x,char y,char z)
{
    if(n==1)
    {
        
        printf("time: %ld %c-->%c\n",++count,x,z);
    }
    else
    {
        
        Move(n-1,x,z,y);
        printf("time: %ld %c-->%c\n",++count,x,z);
        Move(n-1,y,x,z);
    }
}
int main()
{
    int n;
    count=0;
    printf("please enter a number:\n");
    scanf("%d",&n);
    Move(n,'a','b','c');
    
}
```
