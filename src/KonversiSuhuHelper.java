public class KonversiSuhuHelper {
    public static double convert(double value, String fromScale, String toScale) {
        switch (fromScale) {
            case "Celcius":
                if (toScale.equals("Fahrenheit")) return (value * 9/5) + 32;
                if (toScale.equals("Kelvin")) return value + 273.15;
                if (toScale.equals("Reamur")) return value * 4/5;
                break;
            case "Fahrenheit":
                if (toScale.equals("Celcius")) return (value - 32) * 5/9;
                if (toScale.equals("Kelvin")) return (value - 32) * 5/9 + 273.15;
                if (toScale.equals("Reamur")) return (value - 32) * 4/9;
                break;
            case "Kelvin":
                if (toScale.equals("Celcius")) return value - 273.15;
                if (toScale.equals("Fahrenheit")) return (value - 273.15) * 9/5 + 32;
                if (toScale.equals("Reamur")) return (value - 273.15) * 4/5;
                break;
            case "Reamur":
                if (toScale.equals("Celcius")) return value * 5/4;
                if (toScale.equals("Fahrenheit")) return (value * 9/4) + 32;
                if (toScale.equals("Kelvin")) return value * 5/4 + 273.15;
                break;
        }
        return value; // Tidak ada konversi jika skala sama
    }
}
