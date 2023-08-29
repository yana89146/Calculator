import java.util.Arrays;

public class ForThree {
    String[] tokens;
    int index = 0;

    //    конструктор
    public ForThree(String[] tokens) {
        this.tokens = tokens;
    }


    // 1
    String[] step1() {
        String[] next = tokens;
        Float first = Float.parseFloat(tokens[0]);
        Float result = null;


        if (Arrays.asList(tokens).contains("*") || Arrays.asList(tokens).contains("/")) {

            if (Arrays.asList(tokens).contains("*") && !Arrays.asList(tokens).contains("/")) {
                int operIndex = Arrays.asList(tokens).indexOf("*");
                first = Float.parseFloat(tokens[operIndex - 1]) * Float.parseFloat(tokens[operIndex + 1]);

                if (operIndex == 1) {
                    String[] tokens1 = new String[3];
                    tokens1[0] = Float.toString(first);
                    tokens1[1] = tokens[3];
                    tokens1[2] = tokens[4];
                    next = tokens1;

                } else if (operIndex == 3) {
                    String[] tokens2 = new String[3];
                    tokens2[0] = tokens[0];
                    tokens2[1] = tokens[1];
                    tokens2[2] = Float.toString(first);
                    next = tokens2;
                }

            }
            if (Arrays.asList(tokens).contains("/") && !Arrays.asList(tokens).contains("*")) {
                int operIndex = Arrays.asList(tokens).indexOf("/");
                first = Float.parseFloat(tokens[operIndex - 1]) / Float.parseFloat(tokens[operIndex + 1]);

                if (operIndex == 1) {
                    String[] tokens3 = new String[3];
                    tokens3[0] = Float.toString(first);
                    tokens3[1] = tokens[3];
                    tokens3[2] = tokens[4];
                    next = tokens3;
                } else if (operIndex == 3) {
                    String[] tokens4 = new String[3];
                    tokens4[0] = tokens[0];
                    tokens4[1] = tokens[1];
                    tokens4[2] = Float.toString(first);
                    next = tokens4;
                }
            }

        }

        return next;
    }

    // 2
    float step2() {

        String[] next = step1();
        Float first = Float.parseFloat(next[0]);
        Float result = null;


        if (Arrays.asList(next).contains("/") && Arrays.asList(next).contains("*")) {
            int multiIndex = Arrays.asList(next).indexOf("*");
            int devidIndex = Arrays.asList(next).indexOf("/");
            if (multiIndex < devidIndex) {
                first = Float.parseFloat(next[0]) * Float.parseFloat(next[2]);
                result = first / Float.parseFloat(next[4]);

            } else {
                first = Float.parseFloat(next[0]) / Float.parseFloat(next[2]);
                result = first * Float.parseFloat(next[4]);
            }
        }

        if (Arrays.asList(next).contains("+") && Arrays.asList(next).contains("-")) {
            int plusIndex = Arrays.asList(next).indexOf("+");
            int minusIndex = Arrays.asList(next).indexOf("-");
            if (plusIndex < minusIndex) {
                first = Float.parseFloat(next[0]) + Float.parseFloat(next[2]);
                result = first - Float.parseFloat(next[4]);


            } else {
                first = Float.parseFloat(next[0]) - Float.parseFloat(next[2]);
                result = first + Float.parseFloat(next[4]);
            }
        }


        if (Arrays.asList(tokens).contains("*") && !Arrays.asList(tokens).contains("/")) {
            if (Arrays.asList(next).contains("+")) {
                result = Float.parseFloat(next[0]) + Float.parseFloat(next[2]);
            } else {
                result = Float.parseFloat(next[0]) - Float.parseFloat(next[2]);
            }
        }

        if (Arrays.asList(next).contains("/") && !Arrays.asList(next).contains("*")) {
            if (Arrays.asList(next).contains("+")) {
                result = Float.parseFloat(next[0]) + Float.parseFloat(next[2]);
            } else {
                result = Float.parseFloat(next[0]) - Float.parseFloat(next[2]);
            }
        }
        if (Arrays.asList(next).contains("+") && !Arrays.asList(next).contains("*") && !Arrays.asList(next).contains("/") && !Arrays.asList(next).contains("-")) {
            result = Float.parseFloat(next[0]) + Float.parseFloat(next[2]);
        }
        if (Arrays.asList(next).contains("-") && !Arrays.asList(next).contains("+") && !Arrays.asList(next).contains("*") && !Arrays.asList(next).contains("/")) {
            result = Float.parseFloat(next[0]) - Float.parseFloat(next[2]);
        }
        return result;

    }

}
