1.Що буде виведено на екран в результаті виконання?
```java
class Main {
   public static void main(String args[]) {
      try {
         throw new String(“A”);
      }
      catch(int e) {
         System.out.println("Exception " + e);
      }
  }
}
```
- [ ] Exception A
- [ ] Exception
- [X] Нічого, буде помилка компіляції


2. Що буде виведено на екран в результаті виконання?
```java
class Test extends Exception { }

class Main {
   public static void main(String args[]) {
      try {
         throw new Test();
      }
      catch(Test t) {
         System.out.print("A");
      }
      finally {
         System.out.print("B");
      }
  }
}
```
- [ ] A
- [ ] B
- [X] AB
- [ ] Буде помилка компіляції


3.Що буде виведено на екран в результаті виконання фрагменту коду?
```java
try 
{ 
    int x = 0; 
    int y = 5 / x; 
} 
catch (Exception e) 
{
    System.out.print("Exception "); 
} 
catch (ArithmeticException ae) 
{
    System.out.print("Arithmetic Exception "); 
} 
System.out.print("Done");
```
- [ ] Exception
- [ ] Arithmetic Exception
- [ ] Arithmetic Exception Done
- [X] Нічого, буде помилка компіляції


4.Що буде виведено на екран в результаті виконання?
```java
class A extends Exception {}
class B extends A {}

public class Main {
  public static void main(String args[]) {
  try {
          throw new B();
      }
      catch(A a)     { 
          System.out.print("A"); 
      }
      catch(B b) { 
          System.out.print("B"); 
      }
  }
} 
```
- [ ] A
- [ ] B
- [X] Нічого, буде помилка компіляції
- [ ] AB


5. Який блок завжди виконується, незалежно від того було викинуто виключення чи ні?
- [ ] throws
- [X] finally
- [ ] catch
- [ ] throw


6. Який тип виключення не потрібно оброблювати на етапі компіляції?
- [X] Runtime
- [ ] Checked
- [ ] Жоден з наведених


7. Яке значення поверне наступний метод:
```java
public static int test(){
    try {
              return 1;
    } catch (RuntimeException re){
              return 2;
    } finally {
              return 3;
    }
  }
```
- [ ] 1
- [ ] 2
- [X] 3
- [ ] Нічого, буде помилка компіляції


8. Які з тверджень про реалізацію hashCode() за замовчанням правдиві?
- [ ] Клас Object не має реалізації hashCode() за замовчанням
- [X] hashCode() за замовчанням може повертати однакові значення для різних об’єктів
- [X] якщо два різних посилання вказують на один і той же об’єкт то виклик hashCode() поверне одне і теж саме значення
- [ ] hashCode() за замовчанням поверне випадкове число
- [ ] серед наведених варіантів немаєго


9. Що буде виведено на екран в результаті виконання фрагменту коду?
```java
Integer i1 = 100; 
Integer i2 = 100;
System.out.println(i1 == i2);
```
- [X] true
- [ ] false


10. Що буде виведено на екран в результаті виконання фрагменту коду?
```java
Integer num1 = 50;
Integer num2 = num1;
num1++; 
num1--;
System.out.println(num1==num2);
```
- [X] true
- [ ] false


11. Що буде виведено на екран в результаті виконання фрагменту коду?
```java
System.out.println(Integer.valueOf(1).equals(Long.valueOf(1L)));
```
- [ ] true
- [X] false
