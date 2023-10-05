public class Wektor {
    double x,y,z;
    public Wektor(){
        x=0;
        y=0;
        z=0;
    }
    public String toString(){
        return "[X: "+x+" Y: "+y+" Z: "+z+"]";
    }
    public Wektor(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Wektor dodaj(Wektor w){
        return new Wektor(x+w.x,y+w.y,z+w.z);
    }
    public Wektor odejmin(Wektor w){
        return new Wektor(x-w.x,y-w.y,z-w.z);
    }
    public Wektor iloczyn(Wektor w){
        return new Wektor(y*w.z-w.z*w.y,z*w.x-x*w.z,x*w.y-y*w.x);
    }
    public Wektor ilorazPrzezLiczbe(double l){
        return new Wektor(x/l,y/l,z/l);
    }
    public String iloczynSkalarny(Wektor w){
        double liczba=x*w.x+y*w.y+z*w.z;
        return "Iloczyn skalarny: "+liczba;
    }
}
