public class Test {
    Wektor v1, v2;

    public Test(){
        v1=new Wektor();
        v2=new Wektor();
    }
    public Test(Wektor v1, Wektor v2){
        this.v1=v1;
        this.v2=v2;
    }
    public String testDodawanie() {
        Wektor expected=new Wektor(10,10,10);
        Wektor result=v1.dodaj(v2);
        if(result.x==expected.x && result.y== expected.y && result.z==expected.z) return "tak";
        else return "nie";
    }
}
