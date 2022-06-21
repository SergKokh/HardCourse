package PloshaFigur;

public class MetodPloshaFigur {
    int dlina = 30;
    int shirina = 15;
    int vysota = 10;
    double pi = 3.14;

    public  int ploshaKvadrata(){
        int a = dlina*dlina;
        return a;
    }

    public double ploshaKruga(){
        double b = (dlina/2)*(dlina/2)*pi;
        return b;
    }

    public int ploshaPryamokutnyka(){
        int c = dlina*shirina;
        return c;
    }

    public int ploshaTrykutnyka(){
        int d = (shirina*vysota)/2;
        return d;
    }
}

