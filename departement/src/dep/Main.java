package dep;

public class Main {
    public static void main(String[] args) {
        // Creating and testing Departement and DepartementHashSet
        System.out.println("=== DepartementHashSet Demo ===");

        Departement dept1 = new Departement(1, "IT", 20);
        Departement dept2 = new Departement(2, "HR", 10);
        Departement dept3 = new Departement(3, "Finance", 15);

        DepartementHashSet departementHashSet = new DepartementHashSet();
        departementHashSet.ajouterDepartement(dept1);
        departementHashSet.ajouterDepartement(dept2);
        departementHashSet.ajouterDepartement(dept3);

        // Display all departments
        System.out.println("All Departments:");
        departementHashSet.displayDepartement();

        // Search for a department by name
        String searchName = "IT";
        System.out.println("Searching for department by name (" + searchName + "): " +
                departementHashSet.rechercherDepartement(searchName));

        // Sort and display departments by ID
        System.out.println("Departments sorted by ID:");
        departementHashSet.trierDepartementById().forEach(System.out::println);

        // Remove a department and display the remaining departments
        departementHashSet.supprimerDepartement(dept2);
        System.out.println("Departments after removing HR:");
        departementHashSet.displayDepartement();

        // Creating and testing Employe and SocieteArrayList
        System.out.println("\n=== SocieteArrayList Demo ===");

        Employe emp1 = new Employe(101, "Smith", "John", "IT", 2);
        Employe emp2 = new Employe(102, "Doe", "Jane", "HR", 3);
        Employe emp3 = new Employe(103, "Brown", "James", "Finance", 1);
        Employe emp4 = new Employe(104, "White", "Emily", "IT", 2);

        SocieteArrayList societeArrayList = new SocieteArrayList();
        societeArrayList.ajouterEmploye(emp1);
        societeArrayList.ajouterEmploye(emp2);
        societeArrayList.ajouterEmploye(emp3);
        societeArrayList.ajouterEmploye(emp4);

        // Display all employees
        System.out.println("All Employees:");
        societeArrayList.displayEmploye();

        // Search for an employee by name
        String employeeSearchName = "Doe";
        System.out.println("Searching for employee by name (" + employeeSearchName + "): " +
                societeArrayList.rechercherEmploye(employeeSearchName));

        // Sort employees by ID and display
        System.out.println("Employees sorted by ID:");
        societeArrayList.trierEmployeParId();
        societeArrayList.displayEmploye();

        // Sort employees by department name and grade, then display
        System.out.println("Employees sorted by Department and Grade:");
        societeArrayList.trierEmployeParNomDepartementEtGrade();
        societeArrayList.displayEmploye();

        // Remove an employee and display remaining employees
        societeArrayList.supprimerEmploye(emp2);
        System.out.println("Employees after removing Jane Doe:");
        societeArrayList.displayEmploye();
    }
}