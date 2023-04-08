package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
// Реализовать приложение, которое:
// Принимает от пользователя и запоминает строки
// Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
// Если введено revert, то удаляем последнюю введеную строку
// Если введено exit, то завершаем программу
// > java
// > c++
// > python
// > c#
// > print
// < [c#, python, c++, java]
// > revert
// > print
// < [python, c++, java]
// > exit

public class Main {

    public static void main(String[] args) {
            LinkedList<String> link = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            String str1;
            System.out.println("Введите строку.\nДля выхода введите 'exit'\nДля вывода введите 'print'\nДля удаления последней строки введите'revert'");

            while (!(str1 = scanner.nextLine()).equals("exit"))
                if(str1.equals("print")){
                    System.out.println(link.toString());
                }
                else {
                    if(str1.equals("revert")){
                        link.removeFirst();
                    }
                    else {
                        link.addFirst(str1);
                    }
                }
            scanner.close();

    }
}