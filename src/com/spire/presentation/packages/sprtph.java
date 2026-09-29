/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekh;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnyh;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqlh;
import com.spire.presentation.packages.sprrrh;
import com.spire.presentation.packages.sprvih;
import java.math.BigInteger;

public class sprtph
extends sprrrh {
    public int[] cfr_renamed_112;
    public static final BigInteger cfr_renamed_119 = new BigInteger(1, sprfqe.cfr_renamed_5217(sprjvo.cfr_renamed_9("\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.\u000b.}X}X}X}X}X}X}X}X}X}X}X}Y")));

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
        sprnyh.cfr_renamed_2022((int[])v1, arg0, (int[])v2);
        sprnyh.cfr_renamed_2024((int[])v1, (int[])v2);
        sprnyh.cfr_renamed_1627(nArray, (int[])v0);
        void v3 = arg2;
        sprnyh.cfr_renamed_1654((int[])v3, (int[])arg3, arg0);
        sprnyh.cfr_renamed_2022((int[])v3, (int[])v0, (int[])v3);
        sprnyh.cfr_renamed_2032(sprvih.cfr_renamed_1705(7, (int[])arg2, 2, 0), (int[])arg2);
    }

    private static /* synthetic */ void cfr_renamed_2040(int[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4) {
        int n;
        sprekh.cfr_renamed_1653(arg0, arg3);
        int[] nArray = sprekh.cfr_renamed_1631();
        int[] nArray2 = sprekh.cfr_renamed_1631();
        int n2 = n = 0;
        while (n2 < 7) {
            sprekh.cfr_renamed_1653(arg1, nArray);
            sprekh.cfr_renamed_1653(arg2, nArray2);
            int n3 = 1 << n;
            while (--n3 >= 0) {
                sprtph.cfr_renamed_2039(arg1, arg2, arg3, arg4);
            }
            sprtph.cfr_renamed_2038(arg0, nArray, nArray2, arg1, arg2, arg3, arg4);
            n2 = ++n;
        }
    }

    @Override
    public sprlsh cfr_renamed_1048() {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_1627(this.cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    @Override
    public boolean cfr_renamed_287() {
        return sprekh.cfr_renamed_1659(this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_8934(sprlsh arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2021(this.cfr_renamed_112, ((sprtph)arg0).cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    private static /* synthetic */ boolean cfr_renamed_2041(int[] arg0) {
        int n;
        int[] nArray = sprekh.cfr_renamed_1631();
        int[] nArray2 = sprekh.cfr_renamed_1631();
        sprekh.cfr_renamed_1653(arg0, nArray);
        int n2 = n = 0;
        while (n2 < 7) {
            int[] nArray3 = nArray;
            sprekh.cfr_renamed_1653(nArray, nArray2);
            int n3 = 1 << n;
            sprnyh.cfr_renamed_2026(nArray3, n3, nArray);
            sprnyh.cfr_renamed_2022(nArray3, nArray2, nArray);
            n2 = ++n;
        }
        sprnyh.cfr_renamed_2026(nArray, 95, nArray);
        return sprekh.cfr_renamed_1659(nArray);
    }

    @Override
    public boolean cfr_renamed_805() {
        return sprekh.cfr_renamed_1660(this.cfr_renamed_112);
    }

    @Override
    public sprlsh cfr_renamed_1908() {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2025(this.cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    @Override
    public int cfr_renamed_1938() {
        return cfr_renamed_119.bitLength();
    }

    public sprtph() {
        this.cfr_renamed_112 = sprekh.cfr_renamed_1631();
    }

    @Override
    public boolean cfr_renamed_1930() {
        return sprekh.cfr_renamed_1662(this.cfr_renamed_112, 0) == 1;
    }

    public sprtph(int[] nArray) {
        this.cfr_renamed_112 = nArray;
    }

    @Override
    public sprlsh cfr_renamed_952() {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_8805(this.cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    public int hashCode() {
        return cfr_renamed_119.hashCode() ^ sproze.cfr_renamed_536(this.cfr_renamed_112, 0, 7);
    }

    @Override
    public sprlsh cfr_renamed_1773() {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2027(this.cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    @Override
    public sprlsh cfr_renamed_1817() {
        int[] nArray = this.cfr_renamed_112;
        if (sprekh.cfr_renamed_1660(this.cfr_renamed_112) || sprekh.cfr_renamed_1659(nArray)) {
            return this;
        }
        int[] nArray2 = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2027(nArray, nArray2);
        int[] nArray3 = sprqlh.cfr_renamed_1758(sprnyh.cfr_renamed_4);
        int[] nArray4 = sprekh.cfr_renamed_1631();
        if (!sprtph.cfr_renamed_2041(nArray)) {
            return null;
        }
        int[] nArray5 = nArray2;
        while (!sprtph.cfr_renamed_2042(nArray5, nArray3, nArray4)) {
            nArray5 = nArray2;
            sprnyh.cfr_renamed_2025(nArray3, nArray3);
        }
        sprnyh.cfr_renamed_1627(nArray4, nArray3);
        if (sprekh.cfr_renamed_1648(nArray, nArray3)) {
            return new sprtph(nArray4);
        }
        return null;
    }

    @Override
    public sprlsh cfr_renamed_8663(sprlsh arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_1654(this.cfr_renamed_112, ((sprtph)arg0).cfr_renamed_112, nArray);
        return new sprtph(nArray);
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
        sprnyh.cfr_renamed_2022((int[])arg4, (int[])v3, (int[])arg6);
        void v4 = arg6;
        sprnyh.cfr_renamed_2022((int[])v4, arg0, (int[])v4);
        void v5 = arg6;
        sprnyh.cfr_renamed_2022((int[])arg3, (int[])arg1, (int[])arg5);
        sprnyh.cfr_renamed_1654((int[])arg5, (int[])v5, (int[])arg5);
        sprnyh.cfr_renamed_2022((int[])v2, (int[])v3, (int[])v5);
        sprekh.cfr_renamed_1653((int[])arg5, (int[])v2);
        sprnyh.cfr_renamed_2022((int[])v1, (int[])arg1, (int[])arg4);
        sprnyh.cfr_renamed_1654((int[])v1, (int[])arg6, (int[])v1);
        sprnyh.cfr_renamed_1627((int[])arg4, (int[])v0);
        sprnyh.cfr_renamed_2022((int[])v0, nArray, (int[])arg5);
    }

    @Override
    public String cfr_renamed_1985() {
        return sproen.cfr_renamed_9("AUq` \u0002&b#v{U~T");
    }

    @Override
    public BigInteger cfr_renamed_1779() {
        return sprekh.cfr_renamed_1651(this.cfr_renamed_112);
    }

    private static /* synthetic */ boolean cfr_renamed_2042(int[] arg0, int[] arg1, int[] arg2) {
        int n;
        int[] nArray = sprekh.cfr_renamed_1631();
        sprekh.cfr_renamed_1653(arg1, nArray);
        int[] nArray2 = sprekh.cfr_renamed_1631();
        int[] nArray3 = nArray2;
        nArray2[0] = 1;
        int[] nArray4 = sprekh.cfr_renamed_1631();
        sprtph.cfr_renamed_2040(arg0, nArray, nArray3, nArray4, arg2);
        int[] nArray5 = sprekh.cfr_renamed_1631();
        int[] nArray6 = sprekh.cfr_renamed_1631();
        int n2 = n = 1;
        while (n2 < 96) {
            int[] nArray7 = nArray;
            sprekh.cfr_renamed_1653(nArray7, nArray5);
            sprekh.cfr_renamed_1653(nArray3, nArray6);
            sprtph.cfr_renamed_2039(nArray7, nArray3, nArray4, arg2);
            if (sprekh.cfr_renamed_1660(nArray)) {
                sprnyh.cfr_renamed_8805(nArray6, arg2);
                sprnyh.cfr_renamed_2022(arg2, nArray5, arg2);
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    @Override
    public sprlsh cfr_renamed_8936(sprlsh arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_8805(((sprtph)arg0).cfr_renamed_112, nArray);
        sprnyh.cfr_renamed_2022(nArray, this.cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprtph(BigInteger bigInteger) {
        void arg0;
        if (bigInteger == null || arg0.signum() < 0 || arg0.compareTo(cfr_renamed_119) >= 0) {
            throw new IllegalArgumentException(sprjvo.cfr_renamed_9("\u0010m\u001e,\u00048\rm\u0001#\u001e,\u0004$\fm\u000e\"\u001am;(\u000b\u001dZ\u007f\\\u001fY\u000b\u0001(\u0004)-!\r \r#\u001c"));
        }
        this.cfr_renamed_112 = sprnyh.cfr_renamed_1652((BigInteger)arg0);
    }

    @Override
    public sprlsh cfr_renamed_8682(sprlsh arg0) {
        int[] nArray = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2022(this.cfr_renamed_112, ((sprtph)arg0).cfr_renamed_112, nArray);
        return new sprtph(nArray);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprtph)) {
            return false;
        }
        sprtph sprtph2 = (sprtph)arg0;
        return sprekh.cfr_renamed_1648(this.cfr_renamed_112, sprtph2.cfr_renamed_112);
    }
}

