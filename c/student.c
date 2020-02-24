/* 
 * Author : piibear writecode 
 */

#include <stdio.h>
#include <stdlib.h>

#define MAX_INPUT_CHAR 1000

typedef struct student student;
struct student
{
    char fullname[20];
    int grade;
};

int main()
{
    student s1 = {.fullname = "Fred Park", .grade = 67};
    student s2 = {.fullname = "Tayyab Estes", .grade = 73};
    student s3 = {.fullname = "Maude Colley", .grade = 38};
    student s4 = {.fullname = "Darcie Carty", .grade = 33};

    struct student students[] = {s1, s2, s3, s4};

    for (int i = 0; i < sizeof(students) / sizeof(students[0]); i++)
    {
        student s = students[i];
        printf("student : %-20s, grade : %2d\n", s.fullname, s.grade);
    }

    return 0;
}