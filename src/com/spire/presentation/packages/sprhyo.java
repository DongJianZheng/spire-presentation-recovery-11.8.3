/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprlzy;
import com.spire.presentation.packages.sprmaaa;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprpxo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprhyo {
    private spravp cfr_renamed_2;
    private sprpxo cfr_renamed_3;
    private sprmzo cfr_renamed_4;

    public boolean cfr_renamed_15072() {
        int n;
        sprhyo sprhyo2 = this;
        sprhyo2.cfr_renamed_3 = sprpxo.cfr_renamed_15088(sprhyo2.cfr_renamed_4);
        if (!sprhyo2.cfr_renamed_15093().cfr_renamed_1974()) {
            return false;
        }
        this.cfr_renamed_2 = new spravp();
        int n2 = n = 0;
        while (n2 < (this.cfr_renamed_15093().cfr_renamed_4 & 0xFFFF)) {
            sprhyo sprhyo3 = this;
            sprkto sprkto2 = sprkto.cfr_renamed_15088(sprhyo3.cfr_renamed_4);
            sprhyo3.cfr_renamed_15086().cfr_renamed_12160(sprkto2.cfr_renamed_0, sprkto2);
            n2 = ++n;
        }
        return true;
    }

    public spreen cfr_renamed_14060() {
        return this.cfr_renamed_4.cfr_renamed_14060();
    }

    public void cfr_renamed_15087(String arg0) {
        sprkto sprkto2 = (sprkto)this.cfr_renamed_2.cfr_renamed_12347(arg0);
        if (sprkto2 == null) {
            Object[] objectArray = new Object[1];
            objectArray[0] = arg0;
            throw new IllegalStateException(sprraia.cfr_renamed_11562(sprlzy.cfr_renamed_9("&[\u000bT\nNE\\\fT\u0001\u001a\u0011[\u0007V\u0000\u001aBAUGB\u001a\fTEN\r_E\\\nT\u0011\u001a\u0003S\t_K"), objectArray));
        }
        this.cfr_renamed_4.cfr_renamed_14060().cfr_renamed_11548(sprkto2.cfr_renamed_3);
    }

    public sprhyo(sprmzo sprmzo2) {
        this.cfr_renamed_4 = sprmzo2;
    }

    public void cfr_renamed_16585() {
        if (!this.cfr_renamed_15072()) {
            throw new IllegalStateException(sprmaaa.cfr_renamed_9("Q\u0019`Qv\u0017k\u0005%\u0017l\u001d`Ql\u0002%\u001fj\u0005%\u0007d\u001dl\u0015+"));
        }
    }

    public byte[] cfr_renamed_15095(String arg0) {
        sprhyo sprhyo2 = this;
        sprhyo2.cfr_renamed_15087(arg0);
        sprkto sprkto2 = (sprkto)sprhyo2.cfr_renamed_2.cfr_renamed_12347(arg0);
        return this.cfr_renamed_4.cfr_renamed_16065((int)(sprkto2.cfr_renamed_2 & 0xFFFFFFFFL));
    }

    public sprmzo cfr_renamed_15084() {
        return this.cfr_renamed_4;
    }

    public spravp cfr_renamed_15086() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhyo(spreen spreen2) {
        void arg0;
        sprhyo sprhyo2 = this;
        sprhyo2.cfr_renamed_4 = new sprmzo((spreen)arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 5;
        int cfr_ignored_0 = 5 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 3 ^ 1;
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

    public sprpxo cfr_renamed_15093() {
        return this.cfr_renamed_3;
    }
}

