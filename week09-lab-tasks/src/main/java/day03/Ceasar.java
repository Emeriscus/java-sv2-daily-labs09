package day03;

import java.util.Locale;

public class Ceasar extends Encryption {

    private int offset;

    public Ceasar(int offset) {
        this.offset = offset%26;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String encrypts(String input) {
        char[] output = input.toUpperCase().toCharArray();

        for (int i = 0; i < output.length; i++) {
            output[i] += offset;
            if (output[i] > 'Z') {
                output[i] -= 'Z' - 'A' + 1;
            }
        }
        return new String(output);
    }
}
