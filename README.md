# bortonprogram - Botka Bianka

Börtön program

Egy börtön fogvatartottakat fogad be, akik lehetnek elítéltek és letartóztatottak. A fogvatartottakat a nevük alapján azonosítják. Az elítélteknek visszaesési kockázatuk van, melyet 5 fokozatú skálán mérnek, nagyon magas, magas, közepes, alacsony, nagyon alacsony. Ezeket az értékeket befogadáskor beállíthatjuk, ha nem tesszük, visszaesési kockázatuk a közepes értéket veszi fel. A letartóztatottak együttműködési hajlandóságát tartjuk nyilván 0-100 értékek között. Ezeket az értékeket befogadáskor beállíthatjuk, ha nem tesszük, 50-es értéket vesz fel. A szélsőértékek elérésekor ccsak ellentétes irányba tudnak elmozdulni indokolt esetben a fenti értékek.

A börtön kétféle integrációt biztosít számukra, az egyiket projekt keretében. Ezek után a fogvatartottak reintegráltak lesznek. Az elítéltek visszaesési kockázata eggyel csökken, ha reintegráltak. A letartóztatottak együttműködési hajlandósága 10%-ot javul, az alap reintegrációs programtól, és 15%-ot javul a reintegrációs projekttől.

A befogadási kötelezettség miatt a börtönben túlzsúfoltság alakulhat ki, ez a reintegrációs törekvések ellenében hat, ezért túlzsúfoltság esetén a visszaesési kockázat eggyel nő, az együttműködési hajlandóság 20%-ot csökken, minden egyes túlzsúfoltság idején törtébő befogadáskor. Mivel a befogadott fogvatartottat is érinti a túlzsúfoltság, az ő értékeire is változnak.

A fogvatartottakat a börtönből szabadítani is tudják, ehhez név alapján azonosítják őket.

A börtönben a fogvatartottak lázadhatnak, ez esetben mindannyian megszöknek, a börtön kiürül.

Technikai specifikáció: 
A börtön ArrayList-et használ a fogvatartottak tárolásához. 
A börtön alapértelmezetten 6 férőhellyel bír, de ezt az értéket létrehozásakor módosíthatjuk.
Folyamatosan fogadhatunk be új fogvatartottat (a szabadult helyére is). Egy személy többször kerülhet börtönbe, és több börtönbe is bekerülhet. 
A fogvatartott legyen abstract. 
Legyen toString a fogvatartotti osztályokban.
