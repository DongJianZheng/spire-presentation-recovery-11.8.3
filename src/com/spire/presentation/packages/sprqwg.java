/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcle;
import com.spire.presentation.packages.sprkpr;
import com.spire.presentation.packages.sprqme;
import com.spire.presentation.packages.sprtue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class sprqwg
extends BufferedReader {
    private static final String cfr_renamed_3 = "-----END ";
    private static final String cfr_renamed_4 = "-----BEGIN ";

    private /* synthetic */ sprcle cfr_renamed_487(String arg0) throws IOException {
        String string;
        ArrayList<sprqme> arrayList;
        StringBuffer stringBuffer;
        String string2;
        block4: {
            String string3;
            string2 = new StringBuilder().insert(0, cfr_renamed_3).append(arg0).toString();
            stringBuffer = new StringBuffer();
            arrayList = new ArrayList<sprqme>();
            sprqwg sprqwg2 = this;
            while ((string3 = sprqwg2.readLine()) != null) {
                int n = string3.indexOf(58);
                if (n >= 0) {
                    String string4 = string3;
                    String string5 = string4.substring(0, n);
                    String string6 = string4.substring(n + 1).trim();
                    sprqwg2 = this;
                    arrayList.add(new sprqme(string5, string6));
                    continue;
                }
                if (string3.indexOf(string2) != -1) {
                    string = string3;
                    break block4;
                }
                stringBuffer.append(string3.trim());
                sprqwg2 = this;
            }
            string = string3;
        }
        if (string == null) {
            throw new IOException(new StringBuilder().insert(0, string2).append(sprkpr.cfr_renamed_9("8jwp8bwqv`")).toString());
        }
        return new sprcle(arg0, arrayList, sprtue.cfr_renamed_488(stringBuffer.toString()));
    }

    public sprqwg(Reader arg0) {
        super(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 ^ 5);
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

    public sprcle cfr_renamed_486() throws IOException {
        int n;
        String string;
        String string2 = string = this.readLine();
        while (string2 != null && !string.startsWith(cfr_renamed_4)) {
            string2 = this.readLine();
        }
        if (string != null && (n = (string = string.substring(cfr_renamed_4.length())).indexOf(45)) > 0 && string.endsWith("-----") && string.length() - n == 5) {
            String string3 = string.substring(0, n);
            return this.cfr_renamed_487(string3);
        }
        return null;
    }
}

