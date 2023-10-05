public class Wypisz {
    public static void main(String[] args){
        Wektor obj, obj2;
        obj= new Wektor(6,7,8);
        obj2=new Wektor(5,5,5);
        Wektor obj3=obj.iloczyn(obj2);
        System.out.println(obj3);
        System.out.println(obj.iloczynSkalarny(obj2));
    }
}
