public class Solution_Using_Fixed_Point_Iteration {

    static double f(double x) {
        return Math.log(x) + x - 2;
    }

    public static void main(String[] args) {
        double x = 1.5;
        double b = -0.5;
        double eps = 0.0001;
        int n = 0;

        while (true) {
            double dx = b * f(x);
            x = x + dx;
            n++;

            System.out.println("Шаг " + n + ": x = " + x);

            if (Math.abs(dx) < eps) {
                System.out.println("Приближённый корень: " + x);
                System.out.println("Количество итераций: " + n);
                break;
            }

            if (n >= 100) {
                System.out.println("Остановка: за 100 итераций условие точности не выполнено.");
                break;
            }
        }
    }
}