# Table of Contents
1. [Lab 1](#lab1)
2. [Lab 2](#lab2)
3. [Lab 3](#lab3)
4. [Lab 4](#lab4)
5. [Lab 5](#lab5)
6. [Lab 6](#lab6)
7. [Lab 7](#lab7)
8. [Lab 8](#lab8)
9. [Lab 9](#lab9)
10. [Lab 10](#lab10)
11. [Lab 11](#lab11)
12. [Lab 12](#lab12)
13. [Project](#project)
 
# Lab 1 - Wypożyczalnia sprzętu narciarskiego <a name="lab1"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_1)<br/><br/>
Proszę napisać kalkulator dla wypożyczalni sprzętu narciarskiego o następujących funkcjonalnościach:
1. wprowadzanie ilości kompletów (narty, kijki, buty)
2. wprowadzanie ilości dni lub godzin
3. wprowadzanie ceny bazowej (za jeden komplet, jedną jednostkę czasu)
4. wyświetlenie łącznego kosztu (z listą wypożyczonych rzeczy)
5. dodawanie elementów opcjonalnych (kask, gogle)
6. możliwość konfigurowania wypożyczenia punkt po punkcie (z możliwością modyfikacji)
7. do opcji 6: czyszczenie wprowadzonych danych

Program nie powinien się kończyć po wyliczeniu kosztu wypożyczenia dla jednego klienta.

# Lab 2 - Klasy <a name="lab2"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_2)<br/><br/>
Proszę w programie z Lab 1 dodać klasę, reprezentującą wypożyczenie, spełniającą następujące założenia:

Klasa powinna zawierać:
1. pola do przechowywania wszystkich danych dotyczących wypożyczenia,
2. metodę do wyliczania łącznego kosztu wypożyczenia,
3. metodę do wyświetlania pełnej informacji o wypożyczeniu,
4. metodę do zapisywania wszystkich danych o wypożyczeniu do String'a

Dodatkowo:
1. program powinien zawierać opcje: wypożycz, wyświetl wypożyczenie, zwróć, itd.
2. obiekt wypożyczenia powinien być tworzony dopiero w momencie wykonywania wypożyczenia (new Person( ))
3. obiekt wypożyczenia powinien być usuwany w momencie zwracania sprzętu (person = null)

# Lab 3 - Tablice <a name="lab3"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_3)<br/><br/>
Proszę napisać program do przechowywania liczb i wykonywania na nich prostych operacji.

Program powinien zawierać następujące opcje:
1. Utwórz tablicę o podanym rozmiarze
2. Wyświetl tablicę
3. Wypełnij tablicę kolejnymi liczbami, zaczynając od podanej (np. 3, 4, 5, 6, ...)
4. Wprowadź na podanej pozycji podaną liczbę
5. Oblicz sumę i średnią wszystkich liczb
6. Znajdź najmniejszą i największą liczbę w tablicy
7. Wprowadź podaną liczbę na pozycjach od a do b
8. Powiększ tablicę (poprzednia zawartość zostaje)  
9. Pomniejsz tablicę (poprzednia zawartość zostaje)
10.  Usuń tablicę

Ważne: powyższe operacje mogą być wykonywane przez użytkownika w dowolnej kolejności
 
# Lab 4 - Metody <a name="lab4"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_4_new)<br/><br/>
Proszę o napisanie programu wykonującego obliczenia dla figur geometrycznych:
1. Klasa Prostokat z polami na boki, konstruktorem i metodami niestatycznymi Pole i Obwod
2. Klasa Kwadrat z polami i metodami, jak wyżej
3. Klasa Obliczenia z metodami statycznymi do obliczania pola i obwodu trójkąta i trapezu
4. Dodatkowe metody statyczne w klasach Kwadrat i Prostokat, zwracające nazwę klasy
5. Dodatkowe metody niestatyczne w obu ww. klasach, zwracające w formie napisu nazwę figury, dł. boków oraz jej pole i obwód
6. Metody z punktu 5 powinny korzystać z innych metod w tych klasach
7. W klasach P i K po dwa konstruktory (jeden z długościami boków, drugi bez)

# Lab 5 - "Właściwości" (getters i setters) w klasach <a name="lab5"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_5)<br/><br/>
Proszę napisać klasę Person oraz program do przetestowania jej możliwości. Klasa Person powinna umożliwiać przechowywanie i pobieranie następujących danych (gettery, settery):
1. imię, nazwisko, rok urodzenia, adres/miejscowość,
2. konstruktor z 4 parametrami,
3. rok urodzenia powinien być niezmienny po utworzeniu obiektu,
4. imię i nazwisko powinny spełniać warunki: co najmniej dwa znaki, pierwsza litera wielka, kolejne małe,
5. wiek (właściwość tylko do odczytu, wyliczana na podstawie roku urodzenia),
6. nazwa osoby (właściwość tylko do odczytu, wyliczana na podstawie imienia i nazwiska),
7. możliwość zmiany nazwy (zmieniają się imię i nazwisko),
8. "Sztuczny" setter, który pozwala zmienić ostatnią literę adresu.
 
# Lab 6 - Dziedziczenie <a name="lab6"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_6)<br/><br/>
Proszę napisać klasę Osoba (Person), umożliwiającą przechowywanie imienia, nazwiska i roku urodzenia (pola prywatne) oraz posiadająca konstruktor z takimi parametrami. Proszę napisać klasy Student i Nauczyciel (Teacher), dziedziczące po klasie Osoba (Person), spełniające następujące wymagania:
1. Student dodatkowo posiada nr albumu i rok naboru,
2. Nauczyciel dodatkowo posiada stopień naukowy,
3. wszystkie klasy posiadają konstruktory z odpowiednimi parametrami,
4. klasy Student i Nauczyciel powinny umożliwiać odczyt i zmianę imienia i nazwiska,
5. w każdej klasie ma być metoda zwracająca napis z wszystkimi danymi z obiektu (o takiej samej nazwie),
6. umożliwiamy przetestowanie 3 klas (możliwość tworzenia i wyświetlania obiektów),
7. do 6 dodatkowo edycja,
8. możliwość przechowywania wielu osób (jedna tablica) i dodawania zarówno studentów, jak i nauczycieli.
 
# Lab 7 - Klasy abstrakcyjne - figury <a name="lab7"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab7)<br/><br/>
Proszę napisać program zawierający następujące klasy (z metodami: obliczPole, obliczObwod, pobierzOpis (napis z nazwą, wymiarami, polem i obwodem) oraz konstruktorami, pobierającymi przez parametry wymiary figury):
1. Wielokat, Trojkat i Prostokat (przechowujemy długości boków, a nie współrzędne wierzchołków)
2. Figura, Kolo
3. Kwadrat
4. Rownoleglobok, Romb

Proszę zmienić nazwy klas i metod na angielskie.

Program powinien umożliwiać przechowywanie obiektów różnych figur w jednej kolekcji, dodawanie nowych figur/obiektów do tej kolekcji i wyświetlanie danych wszystkich elementów tej kolekcji bez sprawdzania, jakiego typu jest dana figura.

# Lab 8 - Interfejsy <a name="lab8"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_8)<br/><br/>
Proszę napisać:
1. interfejs zawierający metody zwracające krótki i długi opis
2. 3 klasy implementujące wyżej wymieniony interfejs (prostokąt, osoba, samochód)
3. metodę w klasie Main, wyświetlającą krótki opis danego obiektu w konsoli
4. menu, pozwalające przetestować klasy i interfejs (tworzenie 3 rodzajów obiektów i wyświetlanie opisów)
5. metodę w klasie Main, wyświetlającą długi opis danego obiektu w konsoli
6. metodę w klasie Main, wyświetlającą krótki lub długi opis danego obiektu z ozdobnikami (decyzja czy krótki, czy długi na podstawie drugiego parametru)
7. przechowywanie wielu obiektów różnych klas (z punktu 2) w jednej tablicy i wyświetlanie opisów wszystkich tych obiektów
8. oddzielna metoda wyświetlająca krótkie opisy wszystkich obiektów z tablicy (przekazanej jako parametr)
9. metoda jak w punkcie 8 + dodatkowy parametr określa, czy krótkie, czy długie opisy

# Lab 9 - Kalkulator okienkowy <a name="lab9"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_9_new)<br/><br/>
Proszę napisać okienkowy kalkulator, spełniający następujące wymagania:
1. możliwość wykonania czterech podstawowych działań (+, -, *, /) za pomocą czterech przycisków,
2. dwie liczby, na których wykonywane jest działanie wprowadzane są w oddzielnych polach edycyjnych,
3. wynik jest wyświetlany w trzecim polu,
4. na pasku tytułowym okna jest napis "Kalkulator",
5. piąty przycisk umożliwia wyczyszczenie wszystkich pól,
6. pola edycyjne są ułożone w jednej linii i po wykonaniu np. działania dodawania, pomiędzy polami pojawiają się dodatkowo znaki '+' i '=' (efekt: 2 + 2 = 4)
7. jeśli użytkownik niczego nie wpisze i kliknie przycisk działania, to "gdzieś w oknie" pojawia się komunikat "wprowadź dane!"
8. jeśli użytkownik wpisze coś, co nie jest liczbą, pojawia się komunikat "wpisz poprawne liczby!"
  
# Lab 10 - Zdarzenia i słuchacze <a name="lab10"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/lab_10)<br/><br/>
Proszę napisać program okienkowy, który demonstruje różne zdarzenia związane z myszką (poruszanie kursorem, wciskanie przycisków, itp.). Program powinien pokazywać, jakie zdarzenie zaszło i wyświetlać podstawowe informacje (nie używamy okien dialogowych), związane z tym zdarzeniem.
1.  4 różne zdarzenia
2.  słuchacz(e) w postaci klasy anonimowej
3.  słuchacz(e) w postaci klasy nazwanej

# Project <a name="project"></a>
[folder link](https://github.com/roseannee/PPO_Sem_2/tree/master/project_tetris)<br/><br/>
[Specyfikacja.pdf](https://github.com/roseannee/PPO_Sem_2/files/8547662/Specyfikacja.pdf)
