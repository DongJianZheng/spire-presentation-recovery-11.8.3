/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprcbh;
import com.spire.presentation.packages.sprdlca;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.spronk;
import com.spire.presentation.packages.spruvg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprogk {
    public static sprarg cfr_renamed_9633(InputStream arg0, int arg1) throws IOException {
        sprcbh sprcbh2;
        sprcbh sprcbh3 = sprarg.cfr_renamed_7843();
        if (sprogk.cfr_renamed_9645(arg0)) {
            String string;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String string2 = null;
            do {
                sprogk.cfr_renamed_9646(arg0, ':', byteArrayOutputStream);
                String string3 = sprkoe.cfr_renamed_184(byteArrayOutputStream.toByteArray()).trim();
                int n = sprogk.cfr_renamed_9647(string3);
                if (n == -1) {
                    string = string3;
                    continue;
                }
                sprcbh3.cfr_renamed_9648(new spruvg(string2, string3.substring(0, n)));
                string = string3.substring(n).trim();
            } while (!string.equalsIgnoreCase("Key"));
            sprcbh2 = sprcbh3;
        } else {
            sprcbh2 = sprcbh3;
        }
        sprcbh2.cfr_renamed_9649(spronk.cfr_renamed_9633(arg0, arg1));
        return sprcbh3.cfr_renamed_1451();
    }

    private static /* synthetic */ int cfr_renamed_9647(String arg0) {
        int n;
        if (arg0.length() == 0) {
            return -1;
        }
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            if (arg0.charAt(n) <= ' ') {
                return n;
            }
            n2 = --n;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_9646(InputStream inputStream, char c, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        int n;
        void arg2;
        InputStream inputStream2 = inputStream;
        arg2.reset();
        while ((n = inputStream2.read()) > -1) {
            InputStream arg0;
            void arg1;
            if (n == arg1) {
                return;
            }
            arg2.write(n);
            inputStream2 = arg0;
        }
    }

    public static boolean cfr_renamed_9645(InputStream arg0) throws IOException {
        if (!arg0.markSupported()) {
            throw new IOException(sprdlca.cfr_renamed_9("TpMkI>NjO{\\s\u001dsHmI>NkMnRlI>P\u007fOu"));
        }
        InputStream inputStream = arg0;
        inputStream.mark(1);
        int n = inputStream.read();
        inputStream.reset();
        return n != 40;
    }
}

