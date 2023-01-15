# OOPProject

Aplicatie de rezervare a biletelor la spectacole de teatru

Să se creeze diagrama UML de clase care apoi să fie implementată în Java pentru a obține o aplicaţie numitǎ "E-Teatru" care să rezolve problema descrisă în continuare. 

Descrierea problemei :
 
Se considera un program de rezervari a biletelor la spectacole de teatru. 

Rezervarile nu se fac direct la casa de bilete, ci prin intermediul unor masini (terminale) specializate in acest tip de operatie. 

Un spectacol este identificat prin nume. Acelasi spectacol se joaca pe o perioada de timp formata din mai multe zile si are doua reprezentatii in aceeasi zi. 

Pentru a face o rezervare, clientul selecteaza numele spectacolului la care vrea sa mearga. Dupa selectie, masina ii afiseaza reprezentatiile la care exista bilete nevandute, impreuna cu data si ora la care au loc. 

De aceea, sistemul memoreaza numele, data si ora la care au loc reprezentatiile fiecarui spectacol. 

Apoi, clientul alege data si ora reprezentatiei si numarul de rezervari pe care doreste sa le faca. 

Daca numarul rezervarilor este >1, atunci biletul furnizat este de fapt un abonament. 

Masina ii va afisa o lista cu locurile libere. 

Clientul selecteaza locul/locurile dorite si sistemul calculeaza si afiseaza costul biletului/abonamentului. Masina afiseaza o fereastra in care clientul tasteaza numele si numarul sau de telefon, si apoi introduce banii. 

Masina retine costul biletului si in fereastra “Bilet” va fi afisat continutul biletului respectiv. Un bilet/abonament contine urmatoarele informatii: - nume spectacol; - data/ora reprezentatiei/reprezentatiilor; - locurile rezervate. 

In plus, fereastra Bilet contine butonul “Print” ce va fi actionat de catre client pentru a tipari la imprimanta biletul respectiv. 

Daca suma introdusa de client este mai mica decat cea corecta, se afiseaza un mesaj de atentionare prin care clientul este rugat sa introduca suma corecta sau sa renunte. 

Pentru fiecare client, sistemul memoreaza numele si numarul de telefon al acestuia, pentru a-i confirma rezervarea facuta. 

Confirmarea se face in ziua in care se joaca reprezentatia si contine urmatoarele informatii: numele spectacolului, data si ora reprezentatiei, locurile rezervate. 

La sfarsit, masina furnizeaza restul, daca exista, si apoi un mesaj de asteptare: “Alegeti spectacolul la care vreti sa mergeti”. 

Clientii pot avea mai multe rezervari, dar o rezervare trebuie facuta in numele unui singur client. 

Cerintele proiectului: 

1. Sa se implementeze in Java aplicatia de rezervare a biletelor la spectacole de teatru. 
2. Aplicatia trebuie sa indeplineasca principiile programarii orientate spre obiecte. 
3. Aplicatia trebuie sa indeplineasca toate functiunile specificate in descrierea problemei. 
4. Aplicatia memoreaza intr-o baza de date toate datele necesare functionarii sale. 
5. Pentru realizarea interfetelor grafice ale aplicatiei va fi folosita tehnologia Swing. 
6. Pentru realizarea interfetelor grafice ale aplicatiei nu vor fi folosite programe software care faciliteaza acest lucru. 
7. Pentru gestiunea evenimentelor generate de utilizatorii aplicatiei vor fi folosite clase interne.
8. Pentru gestiunea reprezentatiilor, etc. vor fi folosite colectii dinamice de obiecte.
