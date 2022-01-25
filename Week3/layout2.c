/* * @author Silberschatz, Galvin, and Gagne
 * Operating System Concepts  - Tenth Edition
 * Copyright John Wiley & Sons - 2018
 */

#include <stdio.h>
#include <stdlib.h>

int x;
int a,b,c,d;
int y = 15;

int main(int argc, char *argv[])
{
	int *values;
	int i;

	values = (int *)malloc(sizeof(int)*5);
	
	for(i=0; i<5; i++)
		values[i] = i * y;
	
	return 0;
}