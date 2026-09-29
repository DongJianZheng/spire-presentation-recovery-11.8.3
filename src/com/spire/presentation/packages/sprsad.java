/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravy;
import com.spire.presentation.packages.sprbe;
import com.spire.presentation.packages.spref;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzrc;

public class sprsad
implements spref {
    private static final long cfr_renamed_119 = 0x800000000000L;
    private byte[] cfr_renamed_91;
    private long cfr_renamed_0;
    private static final int cfr_renamed_1 = 262144;
    private spruc cfr_renamed_2;
    private sprbe cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_3299(byte[] arg0) {
        sprsad sprsad2 = this;
        sprsad2.cfr_renamed_3308(sprzra.cfr_renamed_543(sprsad2.cfr_renamed_3.cfr_renamed_3300(), arg0));
        sprsad2.cfr_renamed_0 = 1L;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_91.length * 8;
    }

    private /* synthetic */ void cfr_renamed_3308(byte[] arg0) {
        this.cfr_renamed_3309(arg0, (byte)0);
        if (arg0 != null) {
            this.cfr_renamed_3309(arg0, (byte)1);
        }
    }

    private /* synthetic */ void cfr_renamed_3309(byte[] arg0, byte arg1) {
        sprsad sprsad2 = this;
        sprsad2.cfr_renamed_2.cfr_renamed_1524(new sprnld(this.cfr_renamed_4));
        sprsad2.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
        this.cfr_renamed_2.cfr_renamed_1221(arg1);
        if (arg0 != null) {
            this.cfr_renamed_2.cfr_renamed_1197(arg0, 0, arg0.length);
        }
        sprsad sprsad3 = this;
        sprsad3.cfr_renamed_2.cfr_renamed_1219(sprsad3.cfr_renamed_4, 0);
        this.cfr_renamed_2.cfr_renamed_1524(new sprnld(this.cfr_renamed_4));
        sprsad3.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_91, 0, this.cfr_renamed_91.length);
        sprsad sprsad4 = this;
        sprsad4.cfr_renamed_2.cfr_renamed_1219(sprsad4.cfr_renamed_91, 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprsad(spruc spruc2, int n, sprbe sprbe2, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg4;
        void arg1;
        void arg2;
        void arg0;
        if (n > sprzrc.cfr_renamed_3304((spruc)arg0)) {
            throw new IllegalArgumentException(spravy.cfr_renamed_9("h\rK\u001d_\u001bN\r^HI\rY\u001dH\u0001N\u0011\u001a\u001bN\u001a_\u0006]\u001cRHS\u001b\u001a\u0006U\u001c\u001a\u001bO\u0018J\u0007H\u001c_\f\u001a\nCHN\u0000_H^\rH\u0001L\tN\u0001U\u0006\u001a\u000eO\u0006Y\u001cS\u0007T"));
        }
        if (arg2.cfr_renamed_3225() < arg1) {
            throw new IllegalArgumentException(sprkto.cfr_renamed_9("\u0019*#e2+800-w 91%*'<w#87w62&\"7>1.e$1% 9\"#-w724\",% 3"));
        }
        sprsad sprsad2 = this;
        this.cfr_renamed_3 = arg2;
        this.cfr_renamed_2 = arg0;
        byte[] byArray3 = sprzra.cfr_renamed_527(arg2.cfr_renamed_3300(), (byte[])arg4, (byte[])arg3);
        sprsad2.cfr_renamed_4 = new byte[arg0.cfr_renamed_2404()];
        sprsad2.cfr_renamed_91 = new byte[this.cfr_renamed_4.length];
        sprzra.cfr_renamed_492(this.cfr_renamed_91, (byte)1);
        this.cfr_renamed_3308(byArray3);
        this.cfr_renamed_0 = 1L;
    }

    @Override
    public int cfr_renamed_3298(byte[] arg0, byte[] arg1, boolean arg2) {
        int n;
        int n2 = arg0.length * 8;
        if (n2 > 262144) {
            throw new IllegalArgumentException(spravy.cfr_renamed_9("&O\u0005X\rHHU\u000e\u001a\nS\u001cIHJ\rHHH\rK\u001d_\u001bNHV\u0001W\u0001N\r^HN\u0007\u001aZ\fZ\u000b\\\u000e"));
        }
        if (this.cfr_renamed_0 > 0x800000000000L) {
            return -1;
        }
        if (arg2) {
            this.cfr_renamed_3299(arg1);
            arg1 = null;
        }
        if (arg1 != null) {
            this.cfr_renamed_3308(arg1);
        }
        byte[] byArray = new byte[arg0.length];
        int n3 = arg0.length / this.cfr_renamed_91.length;
        this.cfr_renamed_2.cfr_renamed_1524(new sprnld(this.cfr_renamed_4));
        int n4 = n = 0;
        while (n4 < n3) {
            sprsad sprsad2 = this;
            sprsad2.cfr_renamed_2.cfr_renamed_1197(sprsad2.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            sprsad sprsad3 = this;
            this.cfr_renamed_2.cfr_renamed_1219(sprsad3.cfr_renamed_91, 0);
            int n5 = n * this.cfr_renamed_91.length;
            System.arraycopy(sprsad3.cfr_renamed_91, 0, byArray, n5, this.cfr_renamed_91.length);
            n4 = ++n;
        }
        if (n3 * this.cfr_renamed_91.length < byArray.length) {
            sprsad sprsad4 = this;
            sprsad4.cfr_renamed_2.cfr_renamed_1197(sprsad4.cfr_renamed_91, 0, this.cfr_renamed_91.length);
            sprsad sprsad5 = this;
            this.cfr_renamed_2.cfr_renamed_1219(sprsad5.cfr_renamed_91, 0);
            System.arraycopy(sprsad5.cfr_renamed_91, 0, byArray, n3 * this.cfr_renamed_91.length, byArray.length - n3 * this.cfr_renamed_91.length);
        }
        sprsad sprsad6 = this;
        sprsad6.cfr_renamed_3308(arg1);
        ++sprsad6.cfr_renamed_0;
        System.arraycopy(byArray, 0, arg0, 0, arg0.length);
        return n2;
    }
}

