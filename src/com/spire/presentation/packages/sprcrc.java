/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwc;
import com.spire.presentation.packages.sprefg;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprpxc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsva;
import com.spire.presentation.packages.sprtj;
import com.spire.presentation.packages.spruofa;
import com.spire.presentation.packages.sprzc;
import com.spire.presentation.packages.sprzsc;
import java.security.SecureRandom;

public abstract class sprcrc
implements sprsc {
    private sprtj cfr_renamed_112;
    private SecureRandom cfr_renamed_119;
    private Object cfr_renamed_91;
    private sprpxc cfr_renamed_0;
    private sprzc cfr_renamed_1;
    private static long cfr_renamed_2 = sprsva.cfr_renamed_424();
    private sprgbd cfr_renamed_3;
    private sprpxc cfr_renamed_4;

    public void cfr_renamed_2850(sprpxc arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_2828(sprpxc arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public sprgbd cfr_renamed_2666() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_3032(Object arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @Override
    public sprpxc cfr_renamed_2683() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprcrc(SecureRandom secureRandom, sprgbd sprgbd2) {
        void arg0;
        sprcrc sprcrc2 = this;
        void v1 = arg0;
        sprcrc sprcrc3 = this;
        sprcrc sprcrc4 = this;
        sprcrc4.cfr_renamed_0 = null;
        sprcrc4.cfr_renamed_4 = null;
        sprcrc3.cfr_renamed_1 = null;
        sprcrc3.cfr_renamed_91 = null;
        arg0.setSeed(++sprcrc.cfr_renamed_2);
        v1.setSeed(sprsva.cfr_renamed_424());
        sprcrc sprcrc5 = this;
        this.cfr_renamed_112 = new sprbwc(sprzsc.cfr_renamed_2640((short)4));
        this.cfr_renamed_112.cfr_renamed_1353(arg0.generateSeed(32));
        sprcrc2.cfr_renamed_119 = v1;
        sprcrc2.cfr_renamed_3 = sprgbd2;
    }

    @Override
    public sprzc cfr_renamed_3031() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_2940(sprzc arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @Override
    public sprpxc cfr_renamed_2824() {
        return this.cfr_renamed_0;
    }

    @Override
    public byte[] cfr_renamed_3034(String arg0, byte[] arg1, int arg2) {
        if (arg1 != null && !sprzsc.cfr_renamed_2677(arg1.length)) {
            throw new IllegalArgumentException(sprefg.cfr_renamed_9("\n`BmYfUwruLoXf\n#@v^w\rkLuH#AfCdYk\roHp^#YkLm\r1s2\u001b#\u0005l_#Of\rmXoA*"));
        }
        sprgbd sprgbd2 = this.cfr_renamed_2666();
        byte[] byArray = sprgbd2.cfr_renamed_2726();
        byte[] byArray2 = sprgbd2.cfr_renamed_2727();
        int n = byArray.length + byArray2.length;
        if (arg1 != null) {
            n += 2 + arg1.length;
        }
        byte[] byArray3 = new byte[n];
        int n2 = 0;
        System.arraycopy(byArray, 0, byArray3, n2, byArray.length);
        System.arraycopy(byArray2, 0, byArray3, n2 += byArray.length, byArray2.length);
        n2 += byArray2.length;
        if (arg1 != null) {
            sprzsc.cfr_renamed_2679(arg1.length, byArray3, n2);
            System.arraycopy(arg1, 0, byArray3, n2 += 2, arg1.length);
            n2 += arg1.length;
        }
        if (n2 != n) {
            throw new IllegalStateException(spruofa.cfr_renamed_9("t\u0019c\u0004cKx\u00051\bp\u0007r\u001e}\ne\u0002~\u00051\u0004wKb\u000et\u000f1\r~\u00191\u000ei\u001b~\u0019e"));
        }
        return sprzsc.cfr_renamed_2669(this, sprgbd2.cfr_renamed_2667(), arg0, byArray3, arg2);
    }

    @Override
    public SecureRandom cfr_renamed_2794() {
        return this.cfr_renamed_119;
    }

    @Override
    public Object cfr_renamed_3033() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprtj cfr_renamed_2866() {
        return this.cfr_renamed_112;
    }
}

