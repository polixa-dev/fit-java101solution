1. Що буде виведено на екран після виконання програми?
```java
enum D
{
    A, B, C;
     
    private D()
    {
        System.out.print(“*”);
    }
}
 
public class Demo
{
    public static void main(String[] args)
    {
        Enum enu = D.B;
    }
}
```
- [X] ***
- [ ] Нічого
- [ ] Буде помилка компіляції


2. Що буде виведено на екран після виконання програми?
```java
enum Seasons
{
    SPRING, WINTER;
     
    private Seasons()
    {
        System.out.println(“ok”);
    }
}
 
public class Test
{
    public static void main(String[] args)
    {
        Seasons seasons = new Seasons();
    }
}
```
- [ ] ok
- [X] Помилка компіляції
- [ ] Помилка часу виконання
- [ ] Щось інше


3. Що буде виведено на екран після виконання програми?
```java
enum Seasons
{
    SPRING, WINTER;
     
    private Seasons()
    {
        System.out.println(“ok”);
    }
}
 
public class Test
{
    public static void main(String[] args)
    { 
       Seasons[] seasons= new Seasons[2];
  
       for (int i = 0; i  < seasons.length; i++)
       {
           System.out.print(seasons[i]);
       }
   }
}
```
- [X] nullnull
- [ ] Помилка компіляції
- [ ] Помилка часу виконання
- [ ] Щось інше


4. Яким чином отримати доступ до константи WINTER за межами класу Demo?
```java
public class Demo
{
    public enum Seasons
    {
        SPRING, WINTER;
    }
}
```
- [ ] new Demo().Seasons.WINTER
- [X] Demo.Seasons.WINTER
- [ ] Це не можливо


5. Що буде виведено на екран після виконання програми?
```java
enum Demo
{
    DEMO;
     
    int i = 10;
     
    {
        i--;
    }
     
    {
        --i;
    }
     
    private Demo()
    {
        i = i-- + --i;
    }
}
 
public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println(Demo.DEMO.i);
    }
}
```
- [X] 14
- [ ] 15
- [ ] 10
- [ ] Помилка компіляції
- [ ] Помилка часу виконання
- [ ] Щось інше


6. Чи буде зкомпільовано наступний фрагмент коду?
```java
class Question
{
    void Test()
    {
        enum Demo
        {
             
        }
    }
}
```
- [ ] так
- [X] ні


7. Чи буде зкомпільовано наступний фрагмент коду?
```java
class A
{
    class B
    {
        static void test()
        {
            System.out.println("ok");
        }
    }
}
```
- [ ] так
- [X] ні


8. Що з наведеного нижче неправда про анонімний внутрішній клас?
- [X] Ви можете створити безліч екземплярів такого класу
- [ ] Такі класи не мають імені
- [ ] Такий клас може мати лише один екземпляр


9. Яким чином отримати доступ до змінної i за межами класу OuterClass
```java
  class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}
```
- [ ] Це неможливо
- [ ] OuterClass.new InnerClass().i
- [ ] OuterClass.InnerClass.i
- [X] new OuterClass.InnerClass().i


10. Чи буде зкомпільовано наступний код?
```java
class A
{    
    void test()
    {
        class B
        {
            static void demo(){ }
        }
    }
}
```
- [ ] так
- [X] ні
