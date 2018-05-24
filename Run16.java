package Exersice16_1;

/*
    Write a method called stutter that doubles the size of a list by replacing
    every integer in the list with two of that integer.
    For example, suppose a variable list stores the values [1, 8, 19, 4, 17],
    after a call of list.stutter(), it should store [1, 1, 8, 8, 19, 19, 4, 4, 17, 17].
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(8);
    list1.add(19);
    list1.add(4);
    list1.add(17);

    list1.stutter();
    System.out.println(list1);

}
}