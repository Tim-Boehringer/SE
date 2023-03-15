# Architektur: Schichtenarchitektur

* Status: proposed
* Date: 2023-03-15

## Context and Problem Statement

-Nutzung verschiedener externer Schnittstellen
-Anbieten eigener Schnittstellen
-Sequenzieller Ablauf des Programms
-Keine interaktiven Nutzereingaben

## Considered Options

* Schichtenarchitektur
* Pipes and Filters

## Decision Outcome

Chosen option: "Schichtenarchitektur", because 1. Durch die Kapselung und klar definierten Schnittstellen entsteht eine leichte Wartbarkeit, da bei externen Veränderungen nur die einzelnen Module angepasst werden müssen.
2. Sequenzieller Aufbau
3. Datentrennung der einzelnen Module sorgt für höhere Angriffssicherheit

### Positive Consequences

* Wartbarkeit
* Erweiterbarkeit
* Testbarkeit
* Skarlierbarkeit

### Negative Consequences

* Mögliche Verüberkomplizierung
* Komplexität
