# git documentation
***
## git config
Mit git config können verschiedenste Einstellungen für git getroffen werden
sowohl auf globaler (--global) Ebene als auch Projektebene. Einstellungen können sich mit der Konfiguration der des Users
aber auch der Darstellungsweise im Editor befassen.

z.b Ändern des User Namens global. 
```bash
git config --global user.name "max-pfi"
```
## git init
Mit git init wird für das aktuelle Verzeichnis ein neues git Repository erstellt.
Es ist auch möglich, ein leeres Verzeichnis anzulegen bei dem das Arbeitsverzeichnis weggelassen wird.
```bash
git init --bare <verzeichnis>
```
## git commit
Git commit erstellt einen neuen Snapshot der alle Files und Änderungen beinhaltet die davor mit `git add ...` in die Stage 
area hinzugefügt wurden. Der Snapshot wird dann zum Repository hinzugefügt.
Für git commit muss mit `-m "..."` eine Message hinzugefügt werden.
## git status
Gibt den status des Arbeitsverzeichnisses und auch der Staging Area zurück. Hier kann man sehen, welche Datein nicht getrackt werden und welche
Änderungen noch nicht in die Staging Area hinzugefügt wurden. Man kann auch den aktuellen Branch sehen.
## git add
Mit `git add <filename>` wird eine Datei zur Staging Area hinzugefügt, was bedeutet, dass alle 
Änderungen dieser Datei beim nächsten Commit im Repository gespeichert werden. Wie oben beschriebne können mit `git status` genauere
Informationen über den Zustand der einzelnen Dateien eingholt werden. 
## git log
Mit git log kann man sich alle bisherigen Commits ansehen. Es gibt Zusatzparameter um die Art der Ausgabe anzupassen. Beispiele dafür sind:

`git log --oneline`: commits als Einzeiler.

`git log --stat`: für eine Kurzübersicht der Veränderungen.

`git log --graph`: für eine graphische Räpresentation der Branches

## git diff
Zum Vergleich von zwei git-Datenquellen, also z.b. Commits und Branches. Mit `git diff` ohne Zusatz werden die Veränderungen seit dem letzten
Commit angezeigt. Es könenn aber z.b. auch die Commit-IDs von zwei unterschiedlichen Versionen angegeben werden um diese zu vergleichen.
`git diff id1 id2` oder bestimmte branches verglichen werden: `git diff branch1 branch2`

## git pull
Mit git pull wird das lokale Repository auf den Stand des remoten Repositories gebracht. 
Dabei wird im Grund zuerst ein `git fetch` ausgeführt und anschließend ein `git merge`. Dabei werden also die Änderungen
die im remote Repository gespeichert sind heruntergeladen und in das lokale repository gemerged. Das Ergebnis ist ein neuer Merge-Commit.
Wenn die es zu Merge-Conflicts kommt, müssen diese manuell gelöst werden bevor git pull vollständig durchgeführt werden kann.
Mit `git pull --no-commit` kann verhindert werden, dass automatisch ein neuer lokaler Commit erstellt wird. 
Mit '`git pull --rebase` wird eine andere Strategie angewandt, wo die remoten Änderungen vor den lokalen eingefügt werden und die lokalen
Commits in weiterer Folge dahinter in den Verlauf der Commits eingefügt werden.

## git push
Mit git push werden lokale Änderungen in ein remotes Repository hochgeladen. Dabei sollte zuerst immer ein git pull durchgeführt werden um keine Änderunge anderer Mitwirkender zu überschreiben. 
Standardmäßig wird mit `git push` der Branch gepushed auf dem man sich gerade befindet, man kann aber auch den gewünschten branch hinzufügen:
`git push <remote> <branch>` um das remote Repository und den branch auszuwählen zu dem gepusht werden soll. 
Mit `git push --force` werden auch Änderungen gepusht, die zu Konflikten führen oder remote Änderungen überschreiben. 