package itstep.learning;

import itstep.learning.async.AsyncDemo;

public class App
{
    public static void main( String[] args )
    {
        new AsyncDemo().run();
    }
}
/*
У Java є прив'язка до файлової системи
- package (аналог namespace) = директорія (папка): itstep.learning -> itstep/learning
- public клас = файл
- casing:
 = Types: CapitalCamelCase
 = fields/methods: lowerCamelCase
 = package: snake_case
 */
