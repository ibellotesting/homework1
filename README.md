# Feladat

Egy tesztautomatizálós mintafeladatot kell elkészítened. Ehhez a következő eszközökre lesz szükséged:

- [ibello](https://ibello.hu/downloads) ([telepítési útmutató](https://ibello.hu/documentation-installation)),
- egy IDE java támogatással (Eclipse, Intellij, ...),
- [github](https://github.com/) fiók,
- [git](https://git-scm.com/download/win),
- [Apache Maven](https://maven.apache.org/download.cgi) ([telepítési útmutató](https://maven.apache.org/install.html)).

A megoldásban ezek az ismeretek lesznek segítségedre:

- java alapismeretek,
- CSS szelektorok,
- oldal-leíró (page object) tesztautomatizálási minta,
- tiszta kód (clean code).

Klónozd a saját gépedre a [homework1](https://github.com/ibellotesting/homework1) repót,
([how to clone](https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository)),
itt már kezdhetsz is dolgozni. A feladat egy egyszerű teszt elkészítése lesz, ami egy webalkalmazás néhány oldalát ellenőrzi végig.
A lépései:

- alkalmazás megnyitása
- egy táblázat első sorának ellenőrzése
- a táblázat első sorának megnyitása, egy adat átírása  majd elmentése,
- a táblázat első sorának újbóli ellenőrzése.

A feladatot mi már elkezdtük, neked be kell fejezned. Keresd a `TODO` sorokat a meglévő kódban, azok segítenek!
Létre kell majd hoznod egy második oldal-leírót (page object) is (`CasePage.java`).
Segítségedre lesz az [ibello API dokumentáció](https://ibello.hu/documentation-api),
illetve az [első lépések dokumentáció](https://ibello.hu/documentation-first-steps).
Ha elkészültél a munkával, próbáld ki, hogy fut-e a teszted! A "homework1" mappában futtasd a következő parancsokat:

```
mvn compile
ibello run
```

Ha a teszt lefutott, az eredményt az ibello grafikus felületén tudod megnézni. Ehhez ezt a parancsot kell kiadnod:

```
ibello
```

Válaszleveledben tájékoztass minket a feladat befejeztéről, illetve csatold az általad létrehozott/módosított .java fájlokat,
vagy egy tömörített mappában az egész projektet.

***Jó munkát kívánunk!*** 
