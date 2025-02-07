public class Application
{
    public static void main(String[] args) 
    {
        Carre carre1 = new Carre(10);
        Cercle cercle1 = new Cercle(5);

        double perimetreCarre1 = 0;
        double surfaceCarre1 = 0;

        double perimetreCercle1 = 0;
        double surfaceCercle1 = 0;

        // Dessiner un carré
        carre1.dessiner();

        // Calculer son perimetre
        perimetreCarre1 = carre1.perimetre();
        System.out.println("perimetre de carre1: " +  perimetreCarre1);

        // Calculer sa surface
        surfaceCarre1 = carre1.surface();
        System.out.println("surface de ce carre1: " +  surfaceCarre1);

        System.out.println("****************************************************" );
        // Dessiner un cercle
        cercle1.dessiner();

        // Calculer son perimetre
        perimetreCercle1 = cercle1.perimetre();
        System.out.println("perimetre de cercle1: " +  perimetreCercle1);

        // Calculer sa surface
        surfaceCercle1 = cercle1.surface();
        System.out.println("surface de ce cercle1: " +  surfaceCercle1);

    }
}