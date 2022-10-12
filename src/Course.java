public class Course {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Белоусов Вальтер Эдуардович" , 1 , 50000);
        employees[1] = new Employee("Виноградов Осип Богданович" , 1 , 43000);
        employees[2] = new Employee("Кудрявцев Павел Робертович" , 2 , 56000);
        employees[3] = new Employee("Блинов Агафон Андреевич" , 2 , 46000);
        employees[4] = new Employee("Егоров Вениамин Демьянович" , 3 , 67000);
        employees[5] = new Employee("Тарасов Филипп Борисович" , 3 , 48000);
        employees[6] = new Employee("Жуков Авакум Ярославович" , 4 , 55000);
        employees[7] = new Employee("Рыбаков Антон Игоревич" , 4 , 87000);
        employees[8] = new Employee("Кондратьев Ираклий Вадимович" , 5 , 68000);
        employees[9] = new Employee("Моисеев Бронислав Богданович" , 5 , 66000);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Сумма затрат на зарплаты в месяц - " + calculateSalary());
        System.out.println("Максимальная зарплата - " + getMaxSalary());
        System.out.println("Минимальная зарплата - " + getMinSalary());
        System.out.println("Средняя зарплата - " + calculateAverageSalary());
        System.out.println(displayListEmployees());
    }
    public static int calculateSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public static int getMaxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        return max;
    }
    public static int getMinSalary() {
        int min = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        return min;
    }
    public static int calculateAverageSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum++;
            }
        }
        return calculateSalary() / sum;
    }
    public static String displayListEmployees() {
        String listEmployees = "";
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
        return listEmployees;
    }
}