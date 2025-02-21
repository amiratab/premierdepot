import java.util.Scanner;

class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro !");
            return Double.NaN; 
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();

        System.out.println("Bienvenue dans la calculatrice Java !");
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        System.out.println("Choisissez une opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        double resultat;
        switch (operation) {
            case '+':
                resultat = calc.addition(num1, num2);
                System.out.println("Résultat : " + resultat);
                break;
            case '-':
                resultat = calc.soustraction(num1, num2);
                System.out.println("Résultat : " + resultat);
                break;
            case '*':
                resultat = calc.multiplication(num1, num2);
                System.out.println("Résultat : " + resultat);
                break;
            case '/':
                resultat = calc.division(num1, num2);
                if (!Double.isNaN(resultat)) {
                    System.out.println("Résultat : " + resultat);
                }
                break;
            default:
                System.out.println("Erreur : Opération invalide !");
        }

        scanner.close();
    }
}
