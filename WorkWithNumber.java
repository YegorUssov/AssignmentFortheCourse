public class WorkWithNumber {
    public String pars(String st) {
        String result = "";
        char[] numbersSplit = st.toCharArray();
        int counter = 1;

        if (st.length() == 1) {
            result = "1" + st;
        }
        else {
            for (int i = 0; i < st.length() - 1; i++) {
                if (((char) numbersSplit[i] == (char) numbersSplit[i + 1])) {
                    counter++;
                }
                else {
                    result += Integer.toString(counter);
                    result += (char) numbersSplit[i];
                    counter = 1;
                }
                if (i == st.length() - 2) {
                    result += Integer.toString(counter);
                    result += (char) numbersSplit[i + 1];
                    counter = 1;
                }
            }
        }
        return result;
    }
}
