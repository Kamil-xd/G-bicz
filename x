plik = "dane.txt"

while True:
    print("1. odczyt")
    print("2. dopisz")
    print("3. nadpisz")
    print("4. wyczyść")
    print("5. szukaj")
    print("6. numerowane linie")
    print("7. koniec")
    
    wybor = input("co chcesz zrobi: ")

    if wybor == "1":
        f = open(plik, "r", encoding="utf-8")
        zawartosc = f.read()
        f.close()
        print(zawartosc)

    elif wybor == "2":
        co_dopisac = input("podaj co chcesz wpisac: ")
        f = open(plik, "a", encoding="utf-8")
        f.write(co_dopisac + "\n")
        f.close()
        print("dopisano!")

    elif wybor == "3":
        nowy_tekst = input("podaj nowy tekst: ")
        f = open(plik, "w", encoding="utf-8")
        f.write(nowy_tekst + "\n")
        f.close()
        print("nadpisano!")

    elif wybor == "4":
        f = open(plik, "w", encoding="utf-8")
        f.write("")
        f.close()
        print("wyczyszczono")

    elif wybor == "5":
        szukane = input("co chcesz znalezc?: ")
        f = open(plik, "r", encoding="utf-8")
        caly_tekst = f.read()
        f.close()
        ile_razy = caly_tekst.count(szukane)
        print("znaleziono razy:", ile_razy)

    elif wybor == "6":
        f = open(plik, "r", encoding="utf-8")
        linie = f.readlines()
        f.close()
        
        numer = 1
        for linijka in linie:
            print(numer, "-", linijka, end="")
            numer = numer + 1

    elif wybor == "7":
        print("nara pecie")
        break

    else:
        print("nie umiesz czytac?")
