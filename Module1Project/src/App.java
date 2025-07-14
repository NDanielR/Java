import java.util.Scanner;

public class App {

    static String name = "N/A";
    static double grade1 = 0.0, grade2 = 0.0, grade3 = 0.01;
    
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int option;

    while (true) {
        menu(); 

        while (!scn.hasNextInt()) {
            System.out.println("Ingresa un numero valido");
            scn.next();  
            System.out.print("Enter an option: ");
        }

        option = scn.nextInt();
        scn.nextLine(); 

        switch (option) {
            case 1:
                registerStudent(scn);
                clearConsole(scn);
                break;

            case 2:
                viewStudentData();
                clearConsole(scn);
                break;

            case 3:
                calculateAverageGrade();
                clearConsole(scn);
                break;

            case 4:
                System.out.println("Adios...");
                return;  

            default:
                System.out.println("Opcion invalida, intenta de nuevo.");
        }
    }

        
    }

    public static void menu() {
        System.out.println("""
                ==============================          
                           BIENVENIDO
                ==============================
                         MENÚ PRINCIPAL
                ==============================
                1. Registrar datos de un estudiante
                2. Mostrar datos del estudiante actual
                3. Calcular promedio de notas del estudiante actual
                4. Salir
                Ingrese una opción:

                """);

    }

    public static void registerStudent(Scanner scn){
        System.out.println("Ingrese el nombre del estudiante : ");
        name = scn.nextLine();
        System.out.println("Ingresa primera nota : ");
        grade1 = scn.nextDouble();
        System.out.println("Ingresa segunda nota : ");
        grade2 = scn.nextDouble();
        System.out.println("Ingresa tercera nota : ");
        grade3 = scn.nextDouble();
    }

    public static void viewStudentData(){
        System.out.printf("""
                Nombre del estudiante: %s
                primera nota: %.2f
                Segunda nota: %.2f
                Tercera nota: %.2f
                """,name,grade1,grade2,grade3);
    }

    public static void calculateAverageGrade(){
        double average = (grade1 + grade2 + grade3) / 3;
        System.out.printf("El promedio del estudiante es: %.2f", average );

    }

    public static void clearConsole(Scanner scn) {
        System.out.println("Presiona ENTER para continuar.");
        scn.nextLine();
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                new ProcessBuilder("clear")
                        .inheritIO()
                        .start()
                        .waitFor();
            }
        } catch (Exception e) {
            System.out.println("Error al limpiar la consola: " + e.getMessage());
        }
    }

}
