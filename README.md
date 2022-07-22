Aplikacja implementuje REST API, które przyjmuje JSON ze współrzędnymi geograficznymi.
Pozycja jest zapisywana do bazy MySQL, w odpowiedzi przesyłany jest JSON potwierdzający
zapisanie współrzędnych w bazie.

Aplikacja współpracuje z serwerem MySQL, który należy uruchomić lokalnie na domyślnym 
porcie 3306, przed pierwszym uruchomieniem na serwerze powinna być założona pusta
baza danych o nazwie "pos". Logowanie do bazy danych - użytkownik: "root", hasło: ""

Aplikacja przyjmuje pod adresem localhost:8080/api/positions dane wejściowe w formacie
za pomocą metody POST:

{'deviceId':'12345', 'latitiude': 505430, 'longitude': 1423412}

Wymagana jest autentykacja, gdzie nazwa użytkownika to "admin", hasło to "password"

Walidacja danych wejściowych:
deviceId w przedziale między 100000000 - 999999999
latitiude w przedziale -900000 do +900000
longitude w przedziale -1800000 do 1800000

Testy jednostkowe aplikacji weryfikują reakcję aplikacji na prawidłowe oraz błędne dane wejściowe.

___________
The application implements a REST API that takes JSON with geographic coordinates.
Coordinates are saved to the MySQL database, and a JSON is sent in response
to confirm operation.

Application works with MySQL on default port 3306 working on localhost. Before first use
empty databese named "pos" have to been created. Authentication user: "root", password: ""

Application listening on address localhost:8080/api/positions for incoming data 
in POST method like below:

{'deviceId':'12345', 'latitiude': 505430, 'longitude': 1423412}

Requied authentication is user: "admin", password: "password"

Incoming data validation:
deviceId between 100000000 and 999999999
latitiude between -900000 and +900000
longitude between -1800000 and 1800000

Unit test of application testing application reaction for good and wrong input data.
