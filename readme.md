# So ist der Einstieg schön in `Kotlin`

## Was ist ein "So ist der Einstieg schön in ..."?

Bei jeder neuen Technologie, jeder neuen Sprache oder jedem neuen Framework stellt sich 
vielen Entwicklern die Frage: _Wie fange ich an_? 
Einige Lesen zunächst viel im Netz. A ndere schauen sich Videos an. Und wieder andere können 
nicht ohne ein Buch beginnen. Immer wieder zeigt sich

*Ausprobieren ist schwieriger als gedacht*

Es kommen schnell folgende Fragen auf:
* Benötige ich eine IDE? Wenn ja, welche?
* Benötige ich eine JVM? Wenn ja, welche Version?
* Welche Tools sind in welcher Version notwendig?
* Lohnt es sich überhaupt, diese Technologie näher zu betrachten (den Zeitaufwand zu investieren)?
* Was gibt es für Pitfalls oder bekannte Probleme?

An dieses Problem richtet sich ein "So ist der Einstieg schön in ..."-Termin. 

### Ziel
Ein einfacher Einstieg in die neue Materie, bei der direkt Fragen beantwortet werden können
und auf die Bedürfnisse der Interessierten eingegangen wird. 

### Zutaten
* Eine Handvoll interessierte Menschen
* Einen Experten (oder eine Person mit tieferem Wissen in die Materie)
* Einen ruhigen Raum mit Monitor oder Beamer
* Ggf. Notebooks zum Mitarbeiten
* ca 1 Stunde Zeit

## Termin So ist der Einstieg schön in `Kotlin`

Dieser Termin fand bei der Neusta SD GmbH am 25.10. statt. Dieses Repository dient als 
Nachschlagewerk für die Beteiligten.

Die einzelnen Commits in diesem Repository spielen die gemachten Schritte in dem Termin durch. 
In den Kommentaren der Commits steht jeweils, was getan wurde.

### Ziel dieses Termins

Es geht hier nicht darum, Vor- und Nachteile von Kotlin aufzuzeigen, denn dazu gibt es 
genug Lektüre im Netz. Hier gibt es darum, wie ein einfaches Kotlin-Projekt mit folgenden 
Vorraussetzungen aufgesetzt werden kann:

* Kotlin auf der JVM (in diesem Fall 11)
* Maven als Build-Tool
* IntelliJ Idea als IDE

### Schritt 1

* Über IDEA ein Maven (JDK11) Java Projekt angelegt
* Mit `mvn clean package` prüfen, ob das Projekt baut

### Schritt 2

* Kotlin als Maven Dependency hinzugefügt
* `kotlin-maven-plugin` in die Maven-Compile-Phase hinzugefügt
* `src/main/java` zu `src/main/kotlin` umbenannt
* `src/test/java` zu `src/test/kotlin` umbenannt
* Mit `mvn clean package` prüfen, dass das Projekt baut

### Schritt 3

* Package und `Main.kt`erstellt
* Mit `mvn clean package` prüfen, dass das Projekt baut
* Feststellen, dass `java -jar target/kotlin-1.0-SNAPSHOT.jar` folgenden Fehler liefert: `no main manifest attribute, in target/kotlin-1.0-SNAPSHOT.jar`

### Schritt 4

* `maven-assembly-plugin` hinzufügen (`<mainClass>...</mainClass>` beachten!)
* Mit `mvn clean package` prüfen, dass das Projekt baut
* Festellen, dass `java -jar target/kotlin-1.0-SNAPSHOT-jar-with-dependencies.jar ` das gewünschte Ergebnis

### Schritt 5

* Logik von `Main.kt` in `Text.kt` und `TextJoiner.kt` ausgelagern
* Mit `mvn clean package` prüfen, dass das Projekt baut
* Festellen, dass `java -jar target/kotlin-1.0-SNAPSHOT-jar-with-dependencies.jar ` das gewünschte Ergebnis