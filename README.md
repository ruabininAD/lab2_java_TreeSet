# Лабораторная работа №2 java collection. TreeSet




`TreeSet` предоставляет реализацию интерфейса `SortedSet`, а `SortedSet` расширяет интерфейс Set. Он ведет себя как простой набор, за исключением того, что он хранит элементы в отсортированном формате.Ниже приведены функции `TreeSet`.
* `TreeSet` использует древовидную структуру данных для хранения.
* Объекты хранятся в отсортированном порядке по возрастанию. Но мы можем выполнять итерацию в порядке убывания, используя метод `TreeSet.descendingIterator()`.
* Время доступа и извлечения очень быстрое, что делает `TreeSet` отличным выбором для хранения большого объема данных в отсортированном формате.
* `TreeSet` не использует методы `hashCode()` и `equals()` для сравнения своих элементов. Он использует метод `compare()` (ли `compareTo()` для определения равенства двух элементов.


Реализовать интерфейс одной из стандартных или apache коллекции Java (+ добавить параметры типа, + реализовать интерфейс Iterable<T>)
1. [x] `int` size()
2. [x] `boolean` contains(Object<T>)
3. [x] `boolean`   add(Object<T>)
4. [X] `boolean` remove(Object<T>)
5. [X] `void` clear()
6. [x] `T` first()
7. [x] `T` last()
7. [x] `SortedSet<T>` headSet(E toElement)
8. [X] `SortedSet<E>  `  tailSet(E fromElement)
8. [x]  `boolean` isEmpty()



TEST
1. [X] `int` size()
2. [X] `boolean` contains(Object<T>)
3. [X] `boolean`   add(Object<T>)
4. [X] `boolean` remove(Object<T>)
5. [X] `void` clear()
6. [ ] `T` first()
7. [ ] `T` last()
7. [ ] `SortedSet<T>` headSet(E toElement)
8. [ ] `SortedSet<E>  `  tailSet(E fromElement)
8. [X]  `boolean` isEmpty()
