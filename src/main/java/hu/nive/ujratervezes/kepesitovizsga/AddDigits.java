package hu.nive.ujratervezes.kepesitovizsga;

public class AddDigits {

    public int addDigits(String input) {

        if (input==null) {
            return -1;
        } else {
            if (input.isBlank()) {
                return -1;
            }
        }


        int result = 0;

          for (char c: input.toCharArray()) {

              if (Character.isDigit(c)) {
                  result += Character.getNumericValue(c);
              }

          }

        return result;
    }
}
