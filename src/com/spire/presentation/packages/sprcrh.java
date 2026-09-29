/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdbfa;
import com.spire.presentation.packages.sprrkf;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtue;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.InputStream;

public class sprcrh {
    private final String cfr_renamed_1;
    private final String cfr_renamed_2;
    private final String cfr_renamed_3;
    private final String cfr_renamed_4;

    public sprcrh(String arg0) {
        sprcrh sprcrh2 = this;
        this.cfr_renamed_1 = "-----BEGIN " + arg0 + "-----";
        sprcrh2.cfr_renamed_4 = new StringBuilder().insert(0, sprrkf.cfr_renamed_9("A\u001eA\u001eAq)t%}LkY\u0003U\u0013")).append(arg0).append("-----").toString();
        this.cfr_renamed_2 = new StringBuilder().insert(0, "-----END ").append(arg0).append("-----").toString();
        this.cfr_renamed_3 = new StringBuilder().insert(0, sprdbfa.cfr_renamed_9("y\"y\"yJ\u001aKtWa?m/")).append(arg0).append("-----").toString();
    }

    public sprszm cfr_renamed_2129(InputStream arg0) throws IOException {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2;
        block6: {
            sprcrh sprcrh2;
            String string;
            block5: {
                stringBuffer2 = new StringBuffer();
                while ((string = this.cfr_renamed_2279(arg0)) != null && !string.startsWith(this.cfr_renamed_1)) {
                    if (!string.startsWith(this.cfr_renamed_4)) continue;
                    sprcrh2 = this;
                    break block5;
                }
                sprcrh2 = this;
            }
            while ((string = sprcrh2.cfr_renamed_2279(arg0)) != null && !string.startsWith(this.cfr_renamed_2)) {
                if (string.startsWith(this.cfr_renamed_3)) {
                    stringBuffer = stringBuffer2;
                    break block6;
                }
                stringBuffer2.append(string);
                sprcrh2 = this;
            }
            stringBuffer = stringBuffer2;
        }
        if (stringBuffer.length() != 0) {
            sprxgf sprxgf2 = new sprrzm(sprtue.cfr_renamed_488(stringBuffer2.toString())).cfr_renamed_24();
            if (!(sprxgf2 instanceof sprszm)) {
                throw new IOException(sprrkf.cfr_renamed_9("\u0001R\u0000U\u0003A\u0001V\b\u0013<v!\u0013\bR\u0018RLV\u0002P\u0003F\u0002G\tA\tW"));
            }
            return (sprszm)sprxgf2;
        }
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

