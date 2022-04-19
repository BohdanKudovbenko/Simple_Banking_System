import java.awt.event.WindowFocusListener;

class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        try {
            // code that may throw an exception
            return Double.parseDouble(input);
        } catch (Exception e) {

            return 0.0;

        }


    }
}