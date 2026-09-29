/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgho {
    private sprpeja cfr_renamed_3;
    private int cfr_renamed_4;

    public sprpeja cfr_renamed_8505() {
        return this.cfr_renamed_3;
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 << 2 ^ 1);
        int n4 = n2;
        int n5 = 2 << 3 ^ 4;
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
     * WARNING - void declaration
     */
    public sprgho(int n, sprpeja sprpeja2) {
        void arg0;
        sprgho sprgho2 = this;
        sprgho2.cfr_renamed_4 = arg0;
        sprgho2.cfr_renamed_3 = sprpeja2;
    }

    public int cfr_renamed_90() {
        return this.cfr_renamed_4;
    }
}

