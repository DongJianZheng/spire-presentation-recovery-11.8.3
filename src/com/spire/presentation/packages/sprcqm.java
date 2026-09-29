/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxqm;
import java.util.Enumeration;
import java.util.Hashtable;

public class sprcqm {
    public int cfr_renamed_4;

    public sprcqm() {
        this.cfr_renamed_4 = 0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 ^ 5;
        int cfr_ignored_0 = 5 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 2 << 3 ^ (2 ^ 5);
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

    public void cfr_renamed_4694(int arg0) {
        this.cfr_renamed_4 |= arg0;
    }

    public boolean cfr_renamed_4692(int arg0) {
        return (this.cfr_renamed_4 & arg0) != 0;
    }

    public int cfr_renamed_4690() {
        return this.cfr_renamed_4;
    }

    public sprcqm(int n) {
        sprcqm sprcqm2 = this;
        sprcqm2.cfr_renamed_4 = 0;
        sprcqm2.cfr_renamed_4 = n;
    }

    public String cfr_renamed_4691(Hashtable arg0) {
        sprxqm sprxqm2 = new sprxqm(" ");
        Enumeration enumeration = arg0.keys();
        while (enumeration.hasMoreElements()) {
            Integer n = (Integer)enumeration.nextElement();
            if (!this.cfr_renamed_4692(n)) continue;
            sprxqm2.cfr_renamed_4693((String)arg0.get(n));
        }
        return sprxqm2.toString();
    }
}

