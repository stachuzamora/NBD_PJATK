 # Zadania scala
Kod do zadań znajduje się w folderach tasks i classes. Każde zadanie znajduje się w osobnym Task'u, dodatkowo dwie wymagane klasy znajdują się w folderze classes. Uruchomienie wszystkich zadań znajduje się w obiekcie Main, który odpala po kolei wszystkie zadania. Wszystkie wyniki są printowane do konsoli.

# Zadanie mongo
Wszystkie zapytania i wyniki do zadania z baz dokumentowych znajdują się w folderze mongo podzielone na części 1 i 2.

# Zadanei neo4j
Wszystkie zapytania znajdują się w folderach czesc1, czesc2 i czesc3 zgodnie z podziałem zadań.

# Zadania riak
Zadania z pierwszej części znajduję się w folderze czesc1. Rozwiązanie cześci 2 znaduje się w python_task. Najlepiej uruchomić je w virtual env i zainstalować wymagane libki. Dodatkowo możliwe, że konieczne będzie usunięcie parametru _verbose=False_ z pliku __init__ od riaka.

Kroki do odpalenia programu z tą niewdzięczną libką:
* ``python3 -m venv venv/``
* ``source venv/bin/activate``
* ``pip install -r requirements.txt``
* możliwe konieczne usunięcie w pliku ``./venv/lib/python3.8/site-packages/riak/codecs/__init__.py`` linijki verbose=False, aby program zadziałał

Odpalenie programu
`` python3 main.py ``
