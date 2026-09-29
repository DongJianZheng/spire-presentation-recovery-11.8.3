/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgoa;
import com.spire.presentation.packages.sprjmo;
import com.spire.presentation.packages.sprpva;
import com.spire.presentation.packages.spryqa;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class sprnab
extends BufferedReader {
    private static final String cfr_renamed_3 = "-----BEGIN ";
    private static final String cfr_renamed_4 = "-----END ";

    public sprpva cfr_renamed_486() throws IOException {
        String string;
        String string2 = string = this.readLine();
        while (string2 != null && !string.startsWith(cfr_renamed_3)) {
            string2 = this.readLine();
        }
        if (string != null) {
            string = string.substring(cfr_renamed_3.length());
            int n = string.indexOf(45);
            String string3 = string.substring(0, n);
            if (n > 0) {
                return this.cfr_renamed_487(string3);
            }
        }
        return null;
    }

    public sprnab(Reader arg0) {
        super(arg0);
    }

    private /* synthetic */ sprpva cfr_renamed_487(String arg0) throws IOException {
        String string;
        ArrayList<sprgoa> arrayList;
        StringBuffer stringBuffer;
        String string2;
        block4: {
            String string3;
            string2 = new StringBuilder().insert(0, cfr_renamed_4).append(arg0).toString();
            stringBuffer = new StringBuffer();
            arrayList = new ArrayList<sprgoa>();
            sprnab sprnab2 = this;
            while ((string3 = sprnab2.readLine()) != null) {
                if (string3.indexOf(":") >= 0) {
                    String string4 = string3;
                    int n = string4.indexOf(58);
                    String string5 = string4.substring(0, n);
                    String string6 = string4.substring(n + 1).trim();
                    sprnab2 = this;
                    arrayList.add(new sprgoa(string5, string6));
                    continue;
                }
                if (string3.indexOf(string2) != -1) {
                    string = string3;
                    break block4;
                }
                stringBuffer.append(string3.trim());
                sprnab2 = this;
            }
            string = string3;
        }
        if (string == null) {
            throw new IOException(new StringBuilder().insert(0, string2).append(sprjmo.cfr_renamed_9("*@eZ*He[dJ")).toString());
        }
        return new sprpva(arg0, arrayList, spryqa.cfr_renamed_488(stringBuffer.toString()));
    }
}

