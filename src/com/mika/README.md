
```
// luetaan syotteet
while (true) {
    String rivi = lukija.nextLine();
    if (rivi.equals("loppu")) {
        break;
    }
    syotteet.add(rivi);
}

// selvitetään kolmella jaollisten lukumaara
long kolmellaJaollistenLukumaara = syotteet.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .filter(luku -> luku % 3 == 0)
    .count();

// selvitetään keskiarvo
double keskiarvo = syotteet.stream()
    .mapToInt(s -> Integer.valueOf(s))
    .average()
    .getAsDouble();
```

<table> 
    <tr>
        <td>Virran luominen: `stream()`</td>
        <td>Metodia kutsutaan Collection-rajapinnan toteuttavalle kokoelmalle kuten ArrayList-oliolle. Luotavalle virralle tehdään jotain.</td>
    </tr>
    <tr>
        <td>Virran muuntaminen kokonaislukuvirraksi: `mapToInt(arvo -> toinen)`</td>
        <td>Virta muuntuu kokonaislukuja sisältäväksi virraksi. Merkkijonoja sisältävä muunnos voidaan tehdä esimerkiksi Integer-luokan valueOf-metodin avulla. Kokonaislukuja sisältävälle virralle tehdään jotain.</td>
    </tr>
    <tr>
        <td>Arvojen rajaaminen: `filter(arvo -> hyvaksymisehto)`</td>
        <td>Virrasta rajataan pois ne arvot, jotka eivät täytä hyväksymisehtoa. "Nuolen" oikealla puolella on lauseke, joka palauttaa totuusarvon. Jos totuusarvo on `true`, arvo hyväksytään virtaan. Jos totuusarvo on `false`, arvoa ei hyväksytä virtaan. Rajatuille arvoille tehdään jotain.</td>
    </tr>
    <tr>
        <td>Keskiarvon laskeminen: `average()`</td>
        <td>Palauttaa OptionalDouble-tyyppisen olion, jolla on `double` tyyppisen arvon palauttava metodi `getAsDouble()`. Metodin `average()` kutsuminen onnistuu kokonaislukuja sisältävälle virralle (luominen onnistuu `mapToInt`-metodilla.</td>
    </tr>
    <tr>
        <td>Virrassa olevien alkioiden lukumaara: `count()`</td>
        <td>Palauttaa virrassa olevien alkioiden lukumäärän `long`-tyyppisenä arvona.</td>
    </tr>
</table>