# 17-12_Arrays
Übungsaufgabe für das Programmierpraktikum im Wise 20/21 zum 17.12.2020

# Willkommen bei der sechsten Übungsaufgabe.

Erinnert euch für die dieswöchige Aufgabe an letzte Woche. Dort haben wir zwei Utility-Methoden (Math-Utils) geschrieben. Diese Woche was ähnliches, nur mit Arrays.
Diesmal lade ich nur die Lösung hoch. Also erstellt zu aller Erst ein neues Projekt mit zwei Klassen (eine für die Main Methode und eine ArrayUtil-Klasse).


### 📝 Aufgabe:

![#f03c15](https://via.placeholder.com/15/f03c15/000000?text=+) __Der Code auf Github ist nur die Lösung, keine Vorlage__

In Börges Seminarstunde habt ihr bereits eine Methode geschrieben, die Arrays vergrößern kann. Ähnlich dazu kann es ja sein, dass man ein Array verkleinern möchte. Das könnte in Programmen wichtig sein, die nur mit limitierten Arbeitsspeicher arbeiten können. Außerdem werdet ihr vielleicht schon gemerkt haben, dass man Arrays nicht einfach auf die Konsole ausgeben kann, zumindest nicht einfach mit *System.out.println(__array__);*.
Aufgabe ist es also diese zwei Funktionalitäten in der Klasse ArrayUtils zu erstellen.

#### *Methoden*:
*shrinkArray*:
- Nimmt ein int[] Array und einen Integer als Parameter
  - Das Array was verkleinert werden soll und die Anzahl an Stellen um die das Array verkleinert werden soll
- Gibt ein neues kleineres int[] Array zurück

*printArray*:
- Nimmt ein int[] Array als Parameter
- Gibt dieses Array als String auf der Konsole wieder aus
- Benutzt bitte einen StringBuilder, um die Konsolenausgabe zu erstellen
- Die Ausgabe sollte so aussehen: [int, int, int]
  - Überlegt euch, wie ihr die Kommata am besten implementiert

### Tipps:

- Denkt an statische Methoden
- Ein Array kann man ohne das Stichwort new initialisieren. Beispiel:
```java
int[] initArray = {1, 2, 3};
// ist das gleiche wie:
int[] initArray2 = [3];
initArray[0] = 1;
initArray[1] = 2;
initArray[2] = 3;
```
- Arrays fangen bei 0 an

### Kleines Extra:
Wenn euch zufällig langweilig sein solltet könnt ihr euch gerne überlegen, was an diesen Methoden nicht so ideal ist, besonders wenn man sie in ein großes Programm mit verschiedenen Funktionen integrieren möchte.
Ihr könntet außerdem versuchen mehr Methoden zu programmieren, die man beim Arbeiten mit Arrays brauchen könnte.
Aber das ist freiwillig, wenn der Durst nach Arrays nach den vielen Aufgaben aus dem Seminar und der Übung nicht gestillt werden konnte.
    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Börges Seminar Video](https://www.ilias.uni-koeln.de/ilias/ilias.php?ref_id=3638292&eid=9118f1cb-68c5-4d9a-8f67-7f3e83ecc782&cmd=streamVideo&cmdClass=xoctplayergui&cmdNode=wn:os:17u:185&baseClass=ilrepositorygui)

- [📃 Arrays (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Arrays.html)
- [📃 StringBuilder (Extern)](http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_04_004.htm)
- [📃 Static Members (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Static-Members.html)
- [📃 Schleifen (Wegweiser)](https://dh-cologne.github.io/java-wegweiser/articles/Schleifen.html)

- [📃 Java Naming Conventions](https://github.com/DH-Cologne/java-wegweiser/blob/master/articles/Naming-Conventions.md)
