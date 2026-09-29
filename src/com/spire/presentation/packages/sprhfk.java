/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjmo;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprrmk;
import com.spire.presentation.packages.spryxg;
import java.io.IOException;
import java.io.InputStream;

public class sprhfk {
    public static void cfr_renamed_9620(InputStream arg0) throws IOException {
        if (arg0.read() != 41) {
            throw new IOException(sprjmo.cfr_renamed_9("[dEdA}@*MbOxOiZo\\*KdMe[dZo\\oJ"));
        }
    }

    public static String cfr_renamed_9621(InputStream arg0, int arg1) throws IOException {
        int n;
        char[] cArray = new char[sprhfk.cfr_renamed_4918(arg0, arg1)];
        int n2 = n = 0;
        while (n2 != cArray.length) {
            cArray[n++] = (char)arg0.read();
            n2 = n;
        }
        return new String(cArray);
    }

    public static sprpik cfr_renamed_9622(InputStream arg0) throws IOException {
        InputStream inputStream = arg0;
        sprhfk.cfr_renamed_9623(inputStream);
        String string = sprhfk.cfr_renamed_9621(inputStream, inputStream.read());
        byte[] byArray = sprhfk.cfr_renamed_9624(inputStream, inputStream.read());
        long l = Long.parseLong(sprhfk.cfr_renamed_9621(inputStream, inputStream.read()));
        sprhfk.cfr_renamed_9620(inputStream);
        return new sprrmk(2, byArray, (int)l, l);
    }

    private static /* synthetic */ int cfr_renamed_4918(InputStream arg0, int arg1) throws IOException {
        int n = arg1 - 48;
        InputStream inputStream = arg0;
        while ((arg1 = inputStream.read()) >= 0 && arg1 != 58) {
            n = n * 10 + arg1 - 48;
            inputStream = arg0;
        }
        return n;
    }

    public static void cfr_renamed_9623(InputStream arg0) throws IOException {
        int n = arg0.read();
        if (n != 40) {
            throw new IOException(new StringBuilder().insert(0, spryxg.cfr_renamed_9(")a7a3x2/?g=}=l(j./9a?`)a(j.j85|")).append((char)n).toString());
        }
    }

    public static byte[] cfr_renamed_9624(InputStream arg0, int arg1) throws IOException {
        InputStream inputStream = arg0;
        byte[] byArray = new byte[sprhfk.cfr_renamed_4918(inputStream, arg1)];
        sprkqe.cfr_renamed_476(inputStream, byArray);
        return byArray;
    }
}

