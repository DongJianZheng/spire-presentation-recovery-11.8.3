/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprrgja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlia;
import com.spire.presentation.packages.sprvkja;

@sprtea
public class sprxro {
    private byte[] cfr_renamed_2;
    @sprtea
    public sprbnja cfr_renamed_3;
    private sprvkja cfr_renamed_4;

    public int cfr_renamed_17894(int arg0) {
        return this.cfr_renamed_2[arg0 * 4 + 1] & 0xFF;
    }

    public void cfr_renamed_17634() {
        sprtlia.cfr_renamed_17890(this.cfr_renamed_2, 0, this.cfr_renamed_3.cfr_renamed_17881(), this.cfr_renamed_2.length);
        sprxro sprxro2 = this;
        sprxro2.cfr_renamed_4.cfr_renamed_17886(sprxro2.cfr_renamed_3);
    }

    public void cfr_renamed_17633(int arg0, int arg1, int arg2, int arg3, int arg4) {
        sprxro sprxro2 = this;
        sprxro2.cfr_renamed_2[(arg0 *= 4) + 3] = (byte)arg1;
        sprxro2.cfr_renamed_2[arg0 + 2] = (byte)arg2;
        sprxro2.cfr_renamed_2[arg0 + 1] = (byte)arg3;
        sprxro2.cfr_renamed_2[arg0 + 0] = (byte)arg4;
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_3.cfr_renamed_1452();
    }

    public byte[] cfr_renamed_17895() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_17896() {
        return this.cfr_renamed_3.cfr_renamed_1942() * this.cfr_renamed_3.cfr_renamed_1452();
    }

    public sprrgja cfr_renamed_17881() {
        return this.cfr_renamed_3.cfr_renamed_17881();
    }

    public int cfr_renamed_17897(int arg0) {
        return this.cfr_renamed_2[arg0 * 4 + 2] & 0xFF;
    }

    public int cfr_renamed_17898(int arg0) {
        return this.cfr_renamed_2[arg0 * 4] & 0xFF;
    }

    public int cfr_renamed_17880() {
        return this.cfr_renamed_3.cfr_renamed_17880();
    }

    @sprtea
    public sprxro(sprvkja arg0, sprbnja arg1) {
        sprxro sprxro2 = this;
        sprxro sprxro3 = this;
        sprxro3.cfr_renamed_4 = arg0;
        sprxro3.cfr_renamed_3 = arg1;
        this.cfr_renamed_2 = new byte[sprxro2.cfr_renamed_3.cfr_renamed_17880() * this.cfr_renamed_3.cfr_renamed_1452()];
        sprtlia.cfr_renamed_17883(sprxro2.cfr_renamed_3.cfr_renamed_17881(), this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
    }

    public int cfr_renamed_1942() {
        return this.cfr_renamed_3.cfr_renamed_1942();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 5;
        int cfr_ignored_0 = 4 << 3 ^ 1;
        int n4 = n2;
        int n5 = 3 << 3 ^ 1;
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

    public int cfr_renamed_17899(int arg0) {
        return this.cfr_renamed_2[arg0 * 4 + 3] & 0xFF;
    }

    public void cfr_renamed_17900(int arg0, int arg1) {
        this.cfr_renamed_2[arg0 * 4 + 3] = (byte)arg1;
    }
}

