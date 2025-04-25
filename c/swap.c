#include<stdio.h>
int main (){
int x,y,z;
printf("enter two  number");
scanf("%d%d",&x,&y);
z=x;
x=y;
y=z;
printf("after swape x is %d\n after y is %d",x,y);
return 0;
}
