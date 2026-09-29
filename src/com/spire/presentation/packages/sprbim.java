/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlps;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprxgf;
import java.io.FileInputStream;

public class sprbim {
    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 << 2 ^ 3);
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void main(String[] arg0) throws Exception {
        if (arg0.length < 1) {
            System.out.println(sprjpm.cfr_renamed_9("l(x<|a9\u001fl6i{Bvo\u00069=p7|5x6|"));
            System.exit(1);
        }
        boolean bl = false;
        int n = 0;
        if (arg0.length > 1) {
            bl = sprlps.cfr_renamed_9("\u001fF").equals(arg0[n]);
            ++n;
        }
        FileInputStream fileInputStream = new FileInputStream(arg0[n]);
        ++n;
        try {
            sprxgf sprxgf2;
            sprrzm sprrzm2 = new sprrzm(fileInputStream);
            while ((sprxgf2 = sprrzm2.cfr_renamed_24()) != null) {
                System.out.println(spregm.cfr_renamed_4574(sprxgf2, bl));
            }
            return;
        }
        finally {
            fileInputStream.close();
        }
    }
}

