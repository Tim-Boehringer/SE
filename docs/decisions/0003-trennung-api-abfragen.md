# Trennung der API-Abfragen innerhalb einer Schicht



* Status: proposed

* Date: 2023-04-28



## Context and Problem Statement



Das System hat mehrere Schnittstellen innerhalb einer Schicht für den Datenaustausch implementiert. Diese werden möglicherweise in Zukunft angepasst oder überarbeitet



## Considered Options



* Getrennte APIs

* APIs zusammenfassen



## Decision Outcome



Chosen option: Trennung der APIs, because -Anpassungen können unabhängig voneinander durchgeführt werden

-Neue Schnittstellen können der Schicht einfacher hinzugefügt werden 

-Clean Code kompatibel



### Positive Consequences



* Unabhängige Wartung und Erweiterung bestehender Schnittstellen

* Klare Trennung von eigenständigen Programmbestandteilen 

* Einfache Implementierung neuer Schnittstellen innerhalb der Schicht



### Negative Consequences



* Bei wachsender Anzahl der Schnittstellen muss Schichtenmodell überholt werden
