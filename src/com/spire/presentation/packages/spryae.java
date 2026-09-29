/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmky;
import com.spire.presentation.packages.sprqnaa;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class spryae {
    private Vector cfr_renamed_3;
    private Hashtable cfr_renamed_4;

    public void cfr_renamed_41() {
        spryae spryae2 = this;
        spryae2.cfr_renamed_4 = new Hashtable();
        spryae2.cfr_renamed_3 = new Vector();
    }

    public void cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws IOException {
        this.cfr_renamed_18(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER"));
    }

    public void cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) {
        if (this.cfr_renamed_4.containsKey(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqnaa.cfr_renamed_9(" (15+#,?+p")).append(arg0).append(sprmky.cfr_renamed_9("\u001b\u0019W\n^\u0019_\u0001\u001b\u0019_\u001c^\u001c")).toString());
        }
        spryae spryae2 = this;
        spryae2.cfr_renamed_3.addElement(arg0);
        sprtzd sprtzd2 = arg0;
        sprtzd sprtzd3 = arg0;
        spryae2.cfr_renamed_4.put(sprtzd3, new sprtie(sprtzd3, arg1, (sprxue)new sprlqe(arg2)));
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.isEmpty();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 5;
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 1);
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

    public spryae() {
        spryae spryae2 = this;
        this.cfr_renamed_4 = new Hashtable();
        spryae2.cfr_renamed_3 = new Vector();
    }

    public sprszd cfr_renamed_31() {
        int n;
        sprtie[] sprtieArray = new sprtie[this.cfr_renamed_3.size()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            spryae spryae2 = this;
            int n3 = n++;
            sprtieArray[n3] = (sprtie)spryae2.cfr_renamed_4.get(spryae2.cfr_renamed_3.elementAt(n3));
            n2 = n;
        }
        return new sprszd(sprtieArray);
    }
}

