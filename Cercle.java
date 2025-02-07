public class Cercle extends Forme2D
{
    private double rayon = 0;

    public Cercle(double r)
    {
        this.rayon = r;
    }

    public double getRayon()
    {
        return this.rayon;
    }

    public double perimetre()
    {
        double p = 0;
        p = this.rayon * 3.14;
        return p;
    }
    
    public double surface()
    {
        double s = 0;
        s = this.rayon * this.rayon * 3.14;
        return s;
    }

    public void dessiner()
    {
        System.out.println("C'est une cercle de rayon = " + this.rayon);
    }
}