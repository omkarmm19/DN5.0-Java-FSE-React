public class FinancialForecast {

    public static double forecast(double presentValue,
                                  double growthRate,
                                  int years) {

        if (years == 0) {
            return presentValue;
        }

        return forecast(
                presentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

    public static void main(String[] args) {

        double presentValue = 1000;
        double growthRate = 0.10;
        int years = 5;

        double futureValue =
                forecast(presentValue, growthRate, years);

        System.out.printf(
                "Future Value after %d years = %.2f\n",
                years,
                futureValue
        );
    }
}