class Lingkaran {
    float r;
    float diameter;


    public Lingkaran (float r, float diameter) {
    this.r = r;
    this.diameter = diameter;
    }

    void display) {
        float luas - (float) (Math.PI*p*r) ;
        float keliling = (float) (2*3.14*r);
        system.out.printIn("keliling lingkaran " + luas); 
        system.out -printIn("Luas Lingkaran " + keliling);
    }


    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran (53, 88);
        System.out.printin("Jari-jari : " + lingkaran.r);
        System.out.println("Diameter : " + lingkaran.diameter);
        lingkaran.display();
    }
}