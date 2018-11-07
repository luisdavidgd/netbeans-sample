package basics.classes;

public class Extras {

    public String NumeroPrimo(int num) {
        int x = 1;
        if (num <= 0) {
            return "Ingrese números del 1 para arriba";
        } else if (num == 1) {
            return "El número " + num + " es un unitario";
        } else {
            do {
                x++;
            } while (num % x != 0);
        }
        if (x == num) {
            return "El número " + num + " es primo";
        } else {
            return "El número " + num + " NO es primo";
        }
    }

    public String Capicua(long num) {
        long f, ni, r;
        while (num <= 0);
        f = num;
        ni = 0;
        r = 0;
        //aca le doy vuelta pe
        while (f != 0) {
            r = f % 10;
            ni = ni * 10 + r;
            f = f / 10;
        }
        //comparando
        if (ni == num) {
            return "El numero es capicua\n";
        } else {
            return "El numero no es capicua\n";
        }
    }

    public String Bisiesto(int x) {
        if (x % 4 == 0) {
            return "El año " + x + " es bisiesto";
        } else {
            return "El año " + x + " no es bisiesto";
        }
    }
}
