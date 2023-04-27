# Threads für Parallelisierung

* Status: proposed
* Date: 2023-04-27

## Context and Problem Statement

Das System führt mehrere HTTP-Abfragen an fremde Systeme durch. Die Anfragen sind potentiell langlaufende Operationen, was zu einer zeitlichen Ineffizienz führen kann.

## Considered Options

* Threads
* API-Abfragen sequenziell nacheinander
* Microservices
* Reactive Architecture

## Decision Outcome

Chosen option: "Threads", because -Parallelierung unabdingbar (Sequenzieller Ablauf scheiden aus)
-Umsetzung von Microservices und Reactive Architecture sind zu aufwändig für den geringen Umfang des Projektes
-Limit der Anzahl an Anfragen liegt sehr hoch und ist deshalb nicht ausschlaggeben

### Positive Consequences

* Zeiteffiziente Anfragen an unser System möglich
* Einfach umsetzbar

### Negative Consequences

* Limitiert Anzahl an Anfragen an unser System (Limit ist aber bei hoher Rechenleistung sehr hoch)

## Pros and Cons of the Options

### Threads

API Abfragen laufen parallel auf gleichem System

* Good, because Einfach zu implementieren
* Good, because Zeiteffizient

### API-Abfragen sequenziell nacheinander

API-Abfragen werden nacheinander ausgeführt

* Good, because Sehr einfach umzusetzen
* Bad, because Sehr zeitineffizient
* Bad, because Wenn eine Abfrage fehlschlägt noch ineffizienter

### Microservices

Microservices sind eine Architektur, bei der verschiedene Dienste einer Anwendung unabhängig voneinander ausgeführt werden. Die API Abfragen werden auf die Microservices verteilt

* Good, because Skalierbarkeit: Jeder Dienst kann unabhängig von anderen Diensten skaliert werden, um die Leistung und Verfügbarkeit zu erhöhen
* Good, because Flexibilität: Neue Dienste können hinzugefügt oder entfernt werden, ohne dass dies Auswirkungen auf andere Teile des Systems hat
* Good, because Wartbarkeit: Die einzelnen Microservices können einfach und unabhängig gewartet werden
* Bad, because Komplexität: Die Verwaltung von mehreren Diensten kann komplex sein und erfordert möglicherweise zusätzliche Tools und Ressourcen
* Bad, because Implementierung: Die Implementierung ist für dieses kleine System sehr aufwöndig

### Reactive Architecture

Eine reaktive Architektur ist eine Architektur, die darauf ausgelegt ist, auf Ereignisse zu reagieren, anstatt auf Anfragen zu warten

* Good, because Skalierbarkeit: Das System kann dynamisch auf Lastspitzen reagieren, um die Leistung aufrechtzuerhalten
* Good, because Flexibilität: Reaktive Systeme können sich an Änderungen in den Anforderungen anpassen und sind somit flexibler
* Bad, because Implementierung: Implementierung kann sehr komplex sein
