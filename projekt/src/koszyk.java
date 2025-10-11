public class koszyk {
            private String nazwaKoszyk ;
            private Double cenaKoszyk ;
            private Integer iloscKoszyk ;



            public koszyk(String nazwaKoszyk, Double  cenaKoszyk, Integer iloscKoszyk){
                this.nazwaKoszyk=nazwaKoszyk;
                this.cenaKoszyk=cenaKoszyk;
                this.iloscKoszyk=iloscKoszyk;
            }
            //nazwa
            public String getNazwaKoszyk() {return nazwaKoszyk;}

            public void setNazwaKoszyk(String nazwaKoszyk) {this.nazwaKoszyk = nazwaKoszyk;}

             //cena
            public Double getCenaKoszyk() {return cenaKoszyk;}

            public void setCenaKoszyk(Double cenaKoszyk) {this.cenaKoszyk = cenaKoszyk;}

            //ilosc


            public Integer getIloscKoszyk() {return iloscKoszyk;}

            public void setIloscKoszyk(Integer iloscKoszyk) {this.iloscKoszyk = iloscKoszyk;}
}
