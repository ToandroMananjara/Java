public class Carre extends Forme2D
{
    private double cote = 0;
    
    public double getCote()
    {
        return this.cote;
    }

    public Carre(double c)
    {
        this.cote = c;
    }

    public double perimetre()
    {
        double p = 0;
        p = cote * 4;
        return p; 
    }
    public double surface()
    {
        double s = 0;
        s = this.cote * this.cote;
        return s;
    }

    public void dessiner()
    {
        System.out.println("C'est un carrée de coté = " + this.cote);
    }
}