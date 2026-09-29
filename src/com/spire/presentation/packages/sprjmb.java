/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spratc;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprsvy;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryqa;
import java.io.IOException;
import java.io.InputStream;

public class sprjmb {
    private final String cfr_renamed_1;
    private final String cfr_renamed_2;
    private final String cfr_renamed_3;
    private final String cfr_renamed_4;

    public sprjmb(String arg0) {
        sprjmb sprjmb2 = this;
        this.cfr_renamed_2 = "-----BEGIN " + arg0 + "-----";
        sprjmb2.cfr_renamed_3 = new StringBuilder().insert(0, spratc.cfr_renamed_9("LqLqL\u001e$\u001b(\u0012A\u0004TlX|")).append(arg0).append("-----").toString();
        this.cfr_renamed_4 = new StringBuilder().insert(0, "-----END ").append(arg0).append("-----").toString();
        this.cfr_renamed_1 = new StringBuilder().insert(0, sprsvy.cfr_renamed_9("Y\u0011Y\u0011Yy:xTdA\fM\u001c")).append(arg0).append("-----").toString();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 2 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprbne cfr_renamed_2129(InputStream arg0) throws IOException {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        block6: {
            sprjmb sprjmb2;
            String string;
            block5: {
                stringBuffer2 = new StringBuffer();
                while ((string = this.cfr_renamed_2279(arg0)) != null && !string.startsWith(this.cfr_renamed_2)) {
                    if (!string.startsWith(this.cfr_renamed_3)) continue;
                    sprjmb2 = this;
                    break block5;
                }
                sprjmb2 = this;
            }
            while ((string = sprjmb2.cfr_renamed_2279(arg0)) != null && !string.startsWith(this.cfr_renamed_4)) {
                if (string.startsWith(this.cfr_renamed_1)) {
                    stringBuffer = stringBuffer2;
                    break block6;
                }
                stringBuffer2.append(string);
                sprjmb2 = this;
            }
            stringBuffer = stringBuffer2;
        }
        if (stringBuffer.length() != 0) {
            sprvva sprvva2 = new sprgle(spryqa.cfr_renamed_488(stringBuffer2.toString())).cfr_renamed_24();
            if (!(sprvva2 instanceof sprbne)) {
                throw new IOException(spratc.cfr_renamed_9("\f=\r:\u000e.\f9\u0005|1\u0019,|\u0005=\u0015=A9\u000f?\u000e)\u000f(\u0004.\u00048"));
            }
            return (sprbne)sprvva2;
        }
        return null;
    }

    private /* synthetic */ String cfr_renamed_2279(InputStream arg0) throws IOException {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            InputStream inputStream = arg0;
            while ((n = inputStream.read()) != 13 && n != 10 && n >= 0) {
                if (n == 13) {
                    inputStream = arg0;
                    continue;
                }
                stringBuffer.append((char)n);
                inputStream = arg0;
            }
        } while (n >= 0 && stringBuffer.length() == 0);
        if (n < 0) {
            return null;
        }
        return stringBuffer.toString();
    }
}

