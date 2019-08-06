package io.github.kji6252.study;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class UseVarInputStream {
    @Test
    void unUseVarIO() {
        try(InputStream is = ClassLoader.getSystemResourceAsStream(("text.csv"));
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader buf = new BufferedReader(isr)) {

            System.out.println(buf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void useVarIO() {
        try(var inputStream = ClassLoader.getSystemResourceAsStream(("text.csv"));
            var inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            var bufferedReader = new BufferedReader(inputStreamReader)) {

            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
