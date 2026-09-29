/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprozz;
import com.spire.presentation.packages.sprzos;
import java.math.BigInteger;

public class spromk {
    private int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public boolean cfr_renamed_9671() {
        spromk spromk2 = this;
        return spromk2.cfr_renamed_3 < spromk2.cfr_renamed_4.length;
    }

    public byte[] cfr_renamed_9855() {
        int n = this.cfr_renamed_9856();
        if (n == 0) {
            return new byte[0];
        }
        spromk spromk2 = this;
        if (spromk2.cfr_renamed_3 > spromk2.cfr_renamed_4.length - n) {
            throw new IllegalArgumentException(sprzos.cfr_renamed_9("\u0004&\u001ei\u000f'\u0005<\r!J-\u000b=\u000bi\f&\u0018i\b%\u0005*\u0001"));
        }
        spromk spromk3 = this;
        int n2 = spromk3.cfr_renamed_3;
        spromk3.cfr_renamed_3 += n;
        return sproze.cfr_renamed_533(spromk3.cfr_renamed_4, n2, this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_3461() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public spromk(byte[] byArray) {
        spromk spromk2 = this;
        spromk2.cfr_renamed_3 = 0;
        spromk2.cfr_renamed_4 = byArray;
    }

    public int cfr_renamed_9856() {
        spromk spromk2 = this;
        if (spromk2.cfr_renamed_3 > spromk2.cfr_renamed_4.length - 4) {
            throw new IllegalArgumentException(sprozz.cfr_renamed_9("gC1\u001a'\u0006 C5\f!C\u0006PaC6\u001b0\u00066\u0007 C1\u00165\u00056\u0011}"));
        }
        int n = (this.cfr_renamed_4[this.cfr_renamed_3++] & 0xFF) << 24;
        n |= (this.cfr_renamed_4[this.cfr_renamed_3++] & 0xFF) << 16;
        n |= (this.cfr_renamed_4[this.cfr_renamed_3++] & 0xFF) << 8;
        return n |= this.cfr_renamed_4[this.cfr_renamed_3++] & 0xFF;
    }

    public String cfr_renamed_9857() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_9855());
    }

    public void cfr_renamed_9858() {
        spromk spromk2 = this;
        int n = spromk2.cfr_renamed_9856();
        if (spromk2.cfr_renamed_3 > this.cfr_renamed_4.length - n) {
            throw new IllegalArgumentException(sprzos.cfr_renamed_9("\u0004&\u001ei\u000f'\u0005<\r!J-\u000b=\u000bi\f&\u0018i\b%\u0005*\u0001"));
        }
        this.cfr_renamed_3 += n;
    }

    public byte[] cfr_renamed_9859(int arg0) {
        int n = this.cfr_renamed_9856();
        if (n == 0) {
            return new byte[0];
        }
        spromk spromk2 = this;
        if (spromk2.cfr_renamed_3 > spromk2.cfr_renamed_4.length - n) {
            throw new IllegalArgumentException(sprozz.cfr_renamed_9("=\f'C6\r<\u00164\u000bs\u00072\u00172C5\f!C1\u000f<\u00008"));
        }
        int n2 = n % arg0;
        if (0 != n2) {
            throw new IllegalArgumentException(sprzos.cfr_renamed_9("\u0007 \u0019:\u0003'\ri\u001a(\u000e-\u0003'\r"));
        }
        spromk spromk3 = this;
        int n3 = spromk3.cfr_renamed_3;
        spromk3.cfr_renamed_3 += n;
        int n4 = spromk3.cfr_renamed_3;
        if (n > 0) {
            spromk spromk4 = this;
            int n5 = spromk4.cfr_renamed_4[spromk4.cfr_renamed_3 - 1] & 0xFF;
            if (0 < n5 && n5 < arg0) {
                int n6 = n5;
                int n7 = 1;
                int n8 = n4 -= n6;
                int n9 = n7;
                while (n9 <= n6) {
                    if (n7 != (this.cfr_renamed_4[n8] & 0xFF)) {
                        throw new IllegalArgumentException(sprozz.cfr_renamed_9(":\r0\f!\u00116\u0000'C#\u00027\u0007:\r4"));
                    }
                    n9 = ++n7;
                    ++n8;
                }
            }
        }
        return sproze.cfr_renamed_533(this.cfr_renamed_4, n3, n4);
    }

    public byte[] cfr_renamed_9860() {
        return this.cfr_renamed_9859(8);
    }

    public BigInteger cfr_renamed_9861() {
        spromk spromk2 = this;
        int n = spromk2.cfr_renamed_9856();
        if (spromk2.cfr_renamed_3 + n > this.cfr_renamed_4.length) {
            throw new IllegalArgumentException(sprzos.cfr_renamed_9("\u0004&\u001ei\u000f'\u0005<\r!J-\u000b=\u000bi\f&\u0018i\b \ri\u0004<\u0007"));
        }
        spromk spromk3 = this;
        int n2 = spromk3.cfr_renamed_3;
        spromk3.cfr_renamed_3 += n;
        byte[] byArray = sproze.cfr_renamed_533(spromk3.cfr_renamed_4, n2, this.cfr_renamed_3);
        return new BigInteger(1, byArray);
    }

    /*
     * WARNING - void declaration
     */
    public spromk(byte[] byArray, byte[] byArray2) {
        void arg0;
        int n;
        void arg1;
        spromk spromk2 = this;
        spromk2.cfr_renamed_3 = 0;
        spromk2.cfr_renamed_4 = arg1;
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            if (arg0[n] != arg1[n]) {
                throw new IllegalArgumentException(sprozz.cfr_renamed_9("\u000e2\u0004:\u0000~\r&\u000e1\u0006!C:\r0\f!\u00116\u0000'"));
            }
            n2 = ++n;
        }
        this.cfr_renamed_3 += ((void)arg0).length;
    }
}

