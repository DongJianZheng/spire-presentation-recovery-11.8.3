/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbe;
import com.spire.presentation.packages.spref;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sproqr;
import com.spire.presentation.packages.sprttg;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzrc;
import java.util.Hashtable;

public class sprdxc
implements spref {
    private static final Hashtable cfr_renamed_93;
    private sprlc cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private static final long cfr_renamed_112 = 0x800000000000L;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 262144;
    private long cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprbe cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        sprdxc sprdxc2 = this;
        byte[] byArray = sprdxc2.cfr_renamed_3.cfr_renamed_3300();
        byte[] byArray2 = sprzra.cfr_renamed_526(cfr_renamed_4, this.cfr_renamed_2, byArray, arg0);
        this.cfr_renamed_2 = sprzrc.cfr_renamed_3305(sprdxc2.cfr_renamed_86, byArray2, this.cfr_renamed_91);
        byte[] byArray3 = new byte[sprdxc2.cfr_renamed_2.length + 1];
        byArray3[0] = 0;
        System.arraycopy(this.cfr_renamed_2, 0, byArray3, 1, this.cfr_renamed_2.length);
        sprdxc sprdxc3 = this;
        sprdxc3.cfr_renamed_152 = sprzrc.cfr_renamed_3305(this.cfr_renamed_86, byArray3, this.cfr_renamed_91);
        sprdxc3.cfr_renamed_1 = 1L;
    }

    private /* synthetic */ void cfr_renamed_3310(byte[] arg0, byte[] arg1) {
        this.cfr_renamed_86.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_86.cfr_renamed_1219(arg1, 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprdxc(sprlc sprlc2, int n, sprbe sprbe2, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg4;
        void arg1;
        void arg2;
        void arg0;
        if (n > sprzrc.cfr_renamed_3307((sprlc)arg0)) {
            throw new IllegalArgumentException(sproqr.cfr_renamed_9("7\n\u0014\u001a\u0000\u001c\u0011\n\u0001O\u0016\n\u0006\u001a\u0017\u0006\u0011\u0016E\u001c\u0011\u001d\u0000\u0001\u0002\u001b\rO\f\u001cE\u0001\n\u001bE\u001c\u0010\u001f\u0015\u0000\u0017\u001b\u0000\u000bE\r\u001cO\u0011\u0007\u0000O\u0001\n\u0017\u0006\u0013\u000e\u0011\u0006\n\u0001E\t\u0010\u0001\u0006\u001b\f\u0000\u000b"));
        }
        if (arg2.cfr_renamed_3225() < arg1) {
            throw new IllegalArgumentException(sprttg.cfr_renamed_9("G?}pl>f%n8)5g${?y))6f\")#l3|\"`$ppz${5g7}8)\"l!|9{5m"));
        }
        sprdxc sprdxc2 = this;
        this.cfr_renamed_86 = arg0;
        sprdxc2.cfr_renamed_3 = arg2;
        sprdxc2.cfr_renamed_119 = arg1;
        this.cfr_renamed_91 = (Integer)cfr_renamed_93.get(arg0.cfr_renamed_1315());
        byte[] byArray3 = sprzra.cfr_renamed_527(arg2.cfr_renamed_3300(), (byte[])arg4, (byte[])arg3);
        sprdxc sprdxc3 = this;
        this.cfr_renamed_2 = sprzrc.cfr_renamed_3305(sprdxc3.cfr_renamed_86, byArray3, this.cfr_renamed_91);
        byte[] byArray4 = new byte[sprdxc3.cfr_renamed_2.length + 1];
        System.arraycopy(this.cfr_renamed_2, 0, byArray4, 1, this.cfr_renamed_2.length);
        sprdxc sprdxc4 = this;
        sprdxc4.cfr_renamed_152 = sprzrc.cfr_renamed_3305(this.cfr_renamed_86, byArray4, this.cfr_renamed_91);
        sprdxc4.cfr_renamed_1 = 1L;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ byte[] cfr_renamed_3311(byte[] byArray, int n) {
        int n2;
        void arg0;
        void arg1;
        int n3 = this.cfr_renamed_86.cfr_renamed_1218();
        void var4_4 = arg1 / 8 / n3;
        byte[] byArray2 = new byte[byArray.length];
        System.arraycopy(arg0, 0, byArray2, 0, ((void)arg0).length);
        byte[] byArray3 = new byte[arg1 / 8];
        byte[] byArray4 = new byte[this.cfr_renamed_86.cfr_renamed_1218()];
        int n4 = n2 = 0;
        while (n4 <= var4_4) {
            this.cfr_renamed_3310(byArray2, byArray4);
            int n5 = byArray3.length - n2 * byArray4.length > byArray4.length ? byArray4.length : byArray3.length - n2 * byArray4.length;
            System.arraycopy(byArray4, 0, byArray3, n2 * byArray4.length, n5);
            this.cfr_renamed_3312(byArray2, cfr_renamed_4);
            n4 = ++n2;
        }
        return byArray3;
    }

    static {
        byte[] byArray = new byte[1];
        byArray[0] = 1;
        cfr_renamed_4 = byArray;
        cfr_renamed_93 = new Hashtable();
        cfr_renamed_93.put("SHA-1", spriwa.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-224", spriwa.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-256", spriwa.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-512/256", spriwa.cfr_renamed_279(440));
        cfr_renamed_93.put(sproqr.cfr_renamed_9("6'$BP^W@W]Q"), spriwa.cfr_renamed_279(440));
        cfr_renamed_93.put("SHA-384", spriwa.cfr_renamed_279(888));
        cfr_renamed_93.put("SHA-512", spriwa.cfr_renamed_279(888));
    }

    private /* synthetic */ byte[] cfr_renamed_3313(byte[] arg0) {
        sprdxc sprdxc2 = this;
        byte[] byArray = new byte[sprdxc2.cfr_renamed_86.cfr_renamed_1218()];
        sprdxc2.cfr_renamed_3310(arg0, byArray);
        return byArray;
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        byte[] byArray;
        byte[] byArray2;
        int n = arg0.length * 8;
        if (n > 262144) {
            throw new IllegalArgumentException(sprttg.cfr_renamed_9("\u001e|=k5{pf6)2`$zpy5{p{5x%l#}pe9d9}5mp}?)b?b8d="));
        }
        if (this.cfr_renamed_1 > 0x800000000000L) {
            return -1;
        }
        if (arg2) {
            this.cfr_renamed_3299(arg1);
            arg1 = null;
        }
        if (arg1 != null) {
            byArray2 = new byte[1 + this.cfr_renamed_2.length + arg1.length];
            byArray2[0] = 2;
            System.arraycopy(this.cfr_renamed_2, 0, byArray2, 1, this.cfr_renamed_2.length);
            System.arraycopy(arg1, 0, byArray2, 1 + this.cfr_renamed_2.length, arg1.length);
            sprdxc sprdxc2 = this;
            byArray = sprdxc2.cfr_renamed_3313(byArray2);
            sprdxc2.cfr_renamed_3312(sprdxc2.cfr_renamed_2, byArray);
        }
        sprdxc sprdxc3 = this;
        byArray2 = sprdxc3.cfr_renamed_3311(sprdxc3.cfr_renamed_2, n);
        byArray = new byte[sprdxc3.cfr_renamed_2.length + 1];
        System.arraycopy(this.cfr_renamed_2, 0, byArray, 1, this.cfr_renamed_2.length);
        byArray[0] = 3;
        sprdxc sprdxc4 = this;
        sprdxc sprdxc5 = this;
        byte[] byArray3 = sprdxc5.cfr_renamed_3313(byArray);
        sprdxc5.cfr_renamed_3312(sprdxc5.cfr_renamed_2, byArray3);
        sprdxc4.cfr_renamed_3312(sprdxc5.cfr_renamed_2, this.cfr_renamed_152);
        byte[] byArray4 = new byte[]{(byte)(this.cfr_renamed_1 >> 24), (byte)(this.cfr_renamed_1 >> 16), (byte)(this.cfr_renamed_1 >> 8), (byte)this.cfr_renamed_1};
        this.cfr_renamed_3312(sprdxc4.cfr_renamed_2, byArray4);
        ++sprdxc4.cfr_renamed_1;
        System.arraycopy(byArray2, 0, arg0, 0, arg0.length);
        return n;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_86.cfr_renamed_1218() * 8;
    }

    private /* synthetic */ void cfr_renamed_3312(byte[] arg0, byte[] arg1) {
        int n;
        int n2;
        int n3 = 0;
        int n4 = n2 = 1;
        while (n4 <= arg1.length) {
            n = (arg0[arg0.length - n2] & 0xFF) + (arg1[arg1.length - n2] & 0xFF) + n3;
            n3 = n > 255 ? 1 : 0;
            int n5 = arg0.length - n2;
            arg0[n5] = (byte)n;
            n4 = ++n2;
        }
        int n6 = n2 = arg1.length + 1;
        while (n6 <= arg0.length) {
            n = (arg0[arg0.length - n2] & 0xFF) + n3;
            n3 = n > 255 ? 1 : 0;
            int n7 = arg0.length - n2;
            arg0[n7] = (byte)n;
            n6 = ++n2;
        }
    }
}

