/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprkro;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprvzb;
import java.io.IOException;
import java.io.InputStream;

public class spruua {
    public InputStream cfr_renamed_3;
    public sprgre cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spruua(InputStream inputStream) throws sprlqd {
        this.cfr_renamed_3 = inputStream;
        try {
            void arg0;
            sprkwe sprkwe2 = new sprkwe((InputStream)arg0);
            spruua spruua2 = this;
            spruua2.cfr_renamed_4 = new sprgre((sprao)sprkwe2.cfr_renamed_24());
            return;
        }
        catch (IOException iOException) {
            throw new sprlqd(sprkro.cfr_renamed_9("ile[CFPWILN\u0003RFAGIMG\u0003CLNWEMT\r"), iOException);
        }
        catch (ClassCastException classCastException) {
            throw new sprlqd(sprvzb.cfr_renamed_9("-c\u001du\bh\u001by\u001diXb\u001ag\u001dn\f-\nh\u0019i\u0011c\u001f-\u001bb\u0016y\u001dc\f#"), classCastException);
        }
    }

    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_3.close();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
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
}

