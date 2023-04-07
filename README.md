Am creat un mic proiect care simuleaza un sistem de credite bancare. Pentru aceasta, am implementat urmatoarele: 
- o clasa ce defineste o persoana si datele acesteia;
- o interfata numita "UnitateBancara" cu doua metode declarate: o metoda ce calculeaza creditul si o metoda ce calculeaza dobanda (ambele metode au ca parametru un obiect de tip Persoana).
- doua clase care implementeaza interfata: 
	a. Clasa BancaPentruLocuinte: aici creditul este salariul net al persoanei inmultit cu 100
								: dobanda creditului este de 5%
	b. Clasa BancaPentruNevoiPersonale: aici creditul este salariul net al persoanei inmultit cu 10
									  : dobanda creditului este de 8%
- clasa Main: se citesc datele unei persoane si in functie de varsta, se va stabili tipul unitatii bancare, se va calcula limita maxima a creditului si dobanda aferenta acestuia.