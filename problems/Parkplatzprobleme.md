# Parkplatzprobleme

- Mit den vielen Touristen, die in die Graphschaft kommen, hat sich auch die Parkplatzsituation
drastisch verschlechtert. Die Stadt Schilda plant nun, ein kundenfreundliches Parkhaus zu bauen. 
- Jeder Parkplatz hat eine eindeutige Kennung, die Parkplatznummer. Bei Einfahrt in das Parkhaus
können die Kunden einen bestimmten Parkplatz reservieren. Sollte dieser Parkplatz nicht frei sein,
schlägt die Software den nächsten freien Parkplatz vor.
- Die Graphschaft Schilda beauftragt Sie, ein solches Parkplatzzuordnungssystem zu entwickeln. Dabei
soll effizient der nächste freie Parkplatz berechnet werden.

## Notizen

- Lösung mit Pointers eventuell nicht gewünscht. Eventuell auch mit Queue?

## Welche Daten sollen verarbeitet werden?

- Parkplatznummern frei oder nicht
- Reservierungsnummern
- Nächster freier Parkplatz

## Was sind die Eingaben?

- Größe des Parkhauses
- Reservierungsnummern

## Was sind die Ausgaben?

- Reservierung erfolgreich?
- Nummer, die reserviert wurde

## Welcher Algorithmus eignet sich?

- Breitensuche

## Welche Datenstruktur eignet sich?

- Pointer, der kleinste freie Nummer speichert. Falls diese Reserviert wird, gehe zur nächsten freien Nummer

## Was ist die Laufzeit?


