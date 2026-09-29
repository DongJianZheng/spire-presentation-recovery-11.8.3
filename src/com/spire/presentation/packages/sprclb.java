/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfob;
import com.spire.presentation.packages.sprkjb;
import com.spire.presentation.packages.sprnvn;
import com.spire.presentation.packages.sprqqb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprrsb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.sprzpf;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprclb
extends sprwtb {
    public static final BigInteger cfr_renamed_91 = sprrsb.cfr_renamed_3;
    public int[] cfr_renamed_4;

    @Override
    public sprwtb cfr_renamed_1983(sprwtb arg0) {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_1654(this.cfr_renamed_4, ((sprclb)arg0).cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_952() {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprqqb.cfr_renamed_1, this.cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprkjb.cfr_renamed_1651(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_2038(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int[] nArray7) {
        void arg1;
        int[] arg0;
        void arg6;
        void arg2;
        void arg3;
        void arg4;
        void arg5;
        void v0 = arg5;
        void v1 = arg4;
        void v2 = arg3;
        void v3 = arg2;
        sprqqb.cfr_renamed_2022((int[])arg4, (int[])v3, (int[])arg6);
        void v4 = arg6;
        sprqqb.cfr_renamed_2022((int[])v4, arg0, (int[])v4);
        void v5 = arg6;
        sprqqb.cfr_renamed_2022((int[])arg3, (int[])arg1, (int[])arg5);
        sprqqb.cfr_renamed_1654((int[])arg5, (int[])v5, (int[])arg5);
        sprqqb.cfr_renamed_2022((int[])v2, (int[])v3, (int[])v5);
        sprkjb.cfr_renamed_1653((int[])arg5, (int[])v2);
        sprqqb.cfr_renamed_2022((int[])v1, (int[])arg1, (int[])arg4);
        sprqqb.cfr_renamed_1654((int[])v1, (int[])arg6, (int[])v1);
        sprqqb.cfr_renamed_1627((int[])arg4, (int[])v0);
        sprqqb.cfr_renamed_2022((int[])v0, nArray, (int[])arg5);
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ void cfr_renamed_2039(int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) {
        void arg2;
        int[] arg0;
        void arg1;
        void arg3;
        void v0 = arg3;
        void v1 = arg1;
        void v2 = arg1;
        sprqqb.cfr_renamed_2022((int[])v1, arg0, (int[])v2);
        sprqqb.cfr_renamed_2024((int[])v1, (int[])v2);
        sprqqb.cfr_renamed_1627(nArray, (int[])v0);
        void v3 = arg2;
        sprqqb.cfr_renamed_1654((int[])v3, (int[])arg3, arg0);
        sprqqb.cfr_renamed_2022((int[])v3, (int[])v0, (int[])v3);
        sprqqb.cfr_renamed_2032(sprrpb.cfr_renamed_1705(7, (int[])arg2, 2, 0), (int[])arg2);
    }

    public int hashCode() {
        return cfr_renamed_91.hashCode() ^ sprzra.cfr_renamed_536(this.cfr_renamed_4, 0, 7);
    }

    @Override
    public sprwtb cfr_renamed_1986(sprwtb arg0) {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2021(this.cfr_renamed_4, ((sprclb)arg0).cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1908() {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2025(this.cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    @Override
    public sprwtb cfr_renamed_1833(sprwtb arg0) {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2022(this.cfr_renamed_4, ((sprclb)arg0).cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    private static /* synthetic */ void cfr_renamed_2040(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        int n;
        sprkjb.cfr_renamed_1653(arg0, arg3);
        int[] nArray = sprkjb.cfr_renamed_1631();
        int[] nArray2 = sprkjb.cfr_renamed_1631();
        int n2 = n = 0;
        while (n2 < 7) {
            sprkjb.cfr_renamed_1653(arg1, nArray);
            sprkjb.cfr_renamed_1653(arg2, nArray2);
            int n3 = 1 << n;
            while (--n3 >= 0) {
                sprclb.cfr_renamed_2039(arg1, arg2, arg3, arg4);
            }
            sprclb.cfr_renamed_2038(arg0, nArray, nArray2, arg1, arg2, arg3, arg4);
            n2 = ++n;
        }
    }

    @Override
    public sprwtb cfr_renamed_1773() {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2027(this.cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    private static /* synthetic */ boolean cfr_renamed_2041(int[] arg0) {
        int n;
        int[] nArray = sprkjb.cfr_renamed_1631();
        int[] nArray2 = sprkjb.cfr_renamed_1631();
        sprkjb.cfr_renamed_1653(arg0, nArray);
        int n2 = n = 0;
        while (n2 < 7) {
            int[] nArray3 = nArray;
            sprkjb.cfr_renamed_1653(nArray, nArray2);
            int n3 = 1 << n;
            sprqqb.cfr_renamed_2026(nArray3, n3, nArray);
            sprqqb.cfr_renamed_2022(nArray3, nArray2, nArray);
            n2 = ++n;
        }
        sprqqb.cfr_renamed_2026(nArray, 95, nArray);
        return sprkjb.cfr_renamed_1659(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprclb(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_91) >= 0) {
            throw new IllegalArgumentException(sprnvn.cfr_renamed_9("j&dg~sw&{hdg~ov&ti`&AcqV 4&T#@{c~bWjwkwhf"));
        }
        this.cfr_renamed_4 = sprqqb.cfr_renamed_1652((BigInteger)arg0);
    }

    private static /* synthetic */ boolean cfr_renamed_2042(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprkjb.cfr_renamed_1653(arg1, nArray);
        int[] nArray2 = sprkjb.cfr_renamed_1631();
        int[] nArray3 = nArray2;
        nArray2[0] = 1;
        int[] nArray4 = sprkjb.cfr_renamed_1631();
        sprclb.cfr_renamed_2040(arg0, nArray, nArray3, nArray4, arg2);
        int[] nArray5 = sprkjb.cfr_renamed_1631();
        int[] nArray6 = sprkjb.cfr_renamed_1631();
        int n2 = n = 1;
        while (n2 < 96) {
            int[] nArray7 = nArray;
            sprkjb.cfr_renamed_1653(nArray7, nArray5);
            sprkjb.cfr_renamed_1653(nArray3, nArray6);
            sprclb.cfr_renamed_2039(nArray7, nArray3, nArray4, arg2);
            if (sprkjb.cfr_renamed_1660(nArray)) {
                sprfob.cfr_renamed_1760(sprqqb.cfr_renamed_1, nArray6, arg2);
                sprqqb.cfr_renamed_2022(arg2, nArray5, arg2);
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    @Override
    public sprwtb cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_4;
        if (sprkjb.cfr_renamed_1660(this.cfr_renamed_4) || sprkjb.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2027(nArray, nArray2);
        int[] nArray3 = sprfob.cfr_renamed_1758(sprqqb.cfr_renamed_1);
        int[] nArray4 = sprkjb.cfr_renamed_1631();
        if (!sprclb.cfr_renamed_2041(nArray)) {
            return null;
        }
        int[] nArray5 = nArray2;
        while (!sprclb.cfr_renamed_2042(nArray5, nArray3, nArray4)) {
            nArray5 = nArray2;
            sprqqb.cfr_renamed_2025(nArray3, nArray3);
        }
        sprqqb.cfr_renamed_1627(nArray4, nArray3);
        if (sprkjb.cfr_renamed_1648(nArray, nArray3)) {
            return new sprclb(nArray4);
        }
        return null;
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprkjb.cfr_renamed_1662(this.cfr_renamed_4, 0) == 1;
    }

    @Override
    public String cfr_renamed_1985() {
        return sprzpf.cfr_renamed_9("H<x\t)k/\u000b*\u001fr<w=");
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprkjb.cfr_renamed_1659(this.cfr_renamed_4);
    }

    public sprclb(int[] nArray) {
        this.cfr_renamed_4 = nArray;
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_91.bitLength();
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprkjb.cfr_renamed_1660(this.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1048() {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_1627(this.cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprclb)) {
            return false;
        }
        sprclb sprclb2 = (sprclb)arg0;
        return sprkjb.cfr_renamed_1648(this.cfr_renamed_4, sprclb2.cfr_renamed_4);
    }

    @Override
    public sprwtb cfr_renamed_1984(sprwtb arg0) {
        int[] nArray = sprkjb.cfr_renamed_1631();
        sprfob.cfr_renamed_1760(sprqqb.cfr_renamed_1, ((sprclb)arg0).cfr_renamed_4, nArray);
        sprqqb.cfr_renamed_2022(nArray, this.cfr_renamed_4, nArray);
        return new sprclb(nArray);
    }

    public sprclb() {
        this.cfr_renamed_4 = sprkjb.cfr_renamed_1631();
    }
}

