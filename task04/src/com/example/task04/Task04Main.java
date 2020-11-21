package com.example.task04;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Task04Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - запустить программу
        // - проверить, что получилось 351.731900
        double sum = .0d;

        InputStreamReader strRead = new InputStreamReader(System.in);
        StringBuilder strBuf = new StringBuilder();
        while (strRead.ready()) {
            strBuf.appendCodePoint(strRead.read());
        }

        String[] values = strBuf.toString().split("\\s");
        for (String value : values) {
            try {
                sum += Double.parseDouble(value);
            } catch (NumberFormatException ignored) {
            }
        }

        System.out.printf(Locale.ROOT, "%.6f\n", sum);
    }
}
