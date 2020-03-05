1. Який спосіб краще використовувати для порівняння рядків?
- [X] Метод equals()
- [ ] Метод hashCode()
- [ ] ==


2. Скільки об’єктів буде створено в наступних рядках коду
```java
String s1 = new String("abc");
String s2 = "abc";
```
- [ ] Один
- [X] Два
- [ ] Жодного


3. Чи допустимо викликати методи у рядкових літералів? Наприклад:
```java
"abc".charAt(0)
"abc".length()
```
- [X] Так
- [ ] Ні


4. Чи можливе наслідування від рядка? Наприклад:
```java
class MyString extends String {}
```
- [ ] Так
- [X] Ні


5. Чи можливо використоввувати рядки в виразі switch?
- [ ] Ні
- [X] Так


6. Що виведе наступний фрагмент коду
```java
class Main {
  public static void main(String args[])
  {
    char chars[] = {'a', 'b', 'c'};
    String str = new String(chars);
    System.out.println(str);
  }
}
```
- [ ] Нічого, буде помилка компіляції
- [X] abc
- [ ] a
- [ ] c


7. Що буде виведено на екран після виконання наступного фрагменту коду
```java
String str1="Hello";
String str2="World";
String str3=str1+str2;
String str4="HelloWorld";
System.out.println(str3==str4);
```
- [ ] true
- [X] false


8. Що з наведеного нижче об’єднає рядки str1 та str2
- [ ] str3 = str1 && str2
- [X] str3 = str1.concat(str2)
- [ ] str3 = str1.append(str2)
- [ ] Всі варіанти помилкові
