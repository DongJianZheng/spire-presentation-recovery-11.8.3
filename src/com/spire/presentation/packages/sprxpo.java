/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprcxp;
import com.spire.presentation.packages.sprlqo;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlia;
import com.spire.presentation.packages.sprvkja;

@sprtea
public abstract class sprxpo {
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    private byte cfr_renamed_2 = (byte)-128;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_18024(byte[] arg0, sprlqo arg1, int arg2) {
        int n;
        byte[] byArray;
        int n2 = arg0[arg2] & 0xFF;
        if (n2 >= (this.cfr_renamed_2 & 0xFF)) {
            byArray = arg0;
            arg0[arg2] = -1;
            n = n2 - 255;
        } else {
            byArray = arg0;
            arg0[arg2] = 0;
            n = n2;
        }
        if ((byArray[arg2] & 0xFF) == 255) {
            arg1.cfr_renamed_14895();
        }
        arg1.cfr_renamed_14896();
        this.cfr_renamed_18025(n, arg0, arg2);
    }

    private static /* synthetic */ void cfr_renamed_18020(int arg0) {
        if (arg0 == 198659) {
            return;
        }
        throw new IllegalStateException(sprcxp.cfr_renamed_9("hiNrMwRuIbY'MnEbQ'[hOj\\s"));
    }

    public byte cfr_renamed_18026() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvkja cfr_renamed_17649(sprvkja sprvkja2) {
        sprbnja sprbnja2;
        void arg0;
        void v0 = arg0;
        sprxpo.cfr_renamed_18020(v0.cfr_renamed_17654());
        sprbnja sprbnja3 = sprbnja2 = this.cfr_renamed_18027((sprvkja)v0);
        byte[] byArray = new byte[sprbnja2.cfr_renamed_1452() * sprbnja3.cfr_renamed_17880()];
        sprtlia.cfr_renamed_17883(sprbnja3.cfr_renamed_17881(), byArray, 0, byArray.length);
        sprvkja sprvkja3 = new sprvkja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452(), 196865);
        sprvkja3.cfr_renamed_17665(arg0.cfr_renamed_14217(), arg0.cfr_renamed_14218());
        sprvkja sprvkja4 = sprvkja3;
        sprxpo sprxpo2 = this;
        sprvkja sprvkja5 = sprvkja3;
        sprbnja sprbnja4 = sprvkja5.cfr_renamed_17877(new sprpeja(0, 0, sprxpo2.cfr_renamed_3, sprxpo2.cfr_renamed_119), 2, sprvkja5.cfr_renamed_17654());
        sprxpo sprxpo3 = this;
        sprxpo sprxpo4 = sprxpo3;
        byte[] byArray2 = new byte[sprxpo3.cfr_renamed_119 * sprbnja4.cfr_renamed_17880()];
        sprlqo sprlqo2 = new sprlqo(byArray2);
        int n = 0;
        int n2 = sprxpo3.cfr_renamed_4 - this.cfr_renamed_3;
        this.cfr_renamed_1 = 0;
        while (sprxpo4.cfr_renamed_1 < this.cfr_renamed_119) {
            sprxpo sprxpo5 = this;
            sprxpo sprxpo6 = sprxpo5;
            sprlqo2.cfr_renamed_6601(sprxpo5.cfr_renamed_1 * sprbnja4.cfr_renamed_17880());
            sprxpo5.cfr_renamed_91 = 0;
            while (sprxpo6.cfr_renamed_91 < this.cfr_renamed_3) {
                sprxpo sprxpo7 = this;
                sprxpo6 = sprxpo7;
                sprxpo7.cfr_renamed_18024(byArray, sprlqo2, n);
                ++n;
                ++sprxpo7.cfr_renamed_91;
            }
            n += n2;
            sprxpo sprxpo8 = this;
            sprxpo4 = sprxpo8;
            ++sprxpo8.cfr_renamed_1;
        }
        sprxpo.cfr_renamed_18028((sprvkja)arg0, sprbnja2, sprvkja3, sprbnja4, byArray2);
        return sprvkja3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbnja cfr_renamed_18027(sprvkja sprvkja2) {
        void arg0;
        sprvkja sprvkja3 = sprvkja2;
        void v1 = arg0;
        sprbnja sprbnja2 = v1.cfr_renamed_17877(new sprpeja(0, 0, sprvkja2.cfr_renamed_1942(), sprvkja2.cfr_renamed_1452()), 1, v1.cfr_renamed_17654());
        sprxpo sprxpo2 = this;
        sprbnja sprbnja3 = sprbnja2;
        this.cfr_renamed_3 = sprbnja2.cfr_renamed_1942();
        this.cfr_renamed_119 = sprbnja3.cfr_renamed_1452();
        sprxpo2.cfr_renamed_4 = sprbnja3.cfr_renamed_17880();
        sprxpo2.cfr_renamed_0 = sprvkja.cfr_renamed_17876(arg0.cfr_renamed_17654()) / 8;
        return sprbnja2;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_18028(sprvkja sprvkja2, sprbnja sprbnja2, sprvkja sprvkja3, sprbnja sprbnja3, byte[] byArray) {
        void arg2;
        void arg3;
        void arg4;
        void arg1;
        sprvkja arg0;
        arg0.cfr_renamed_17886((sprbnja)arg1);
        void v0 = arg4;
        sprtlia.cfr_renamed_17890((byte[])v0, 0, arg3.cfr_renamed_17881(), ((void)v0).length);
        arg2.cfr_renamed_17886((sprbnja)arg3);
    }

    public void cfr_renamed_18029(byte arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 4 ^ 1;
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

    public abstract void cfr_renamed_18025(int var1, byte[] var2, int var3);
}

