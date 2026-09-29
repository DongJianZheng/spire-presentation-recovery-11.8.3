/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrep;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzto;

@sprtea
public class sprudp {
    private sprrep cfr_renamed_107;
    private static final int cfr_renamed_132 = 3;
    private sprrep cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private static final int cfr_renamed_152 = 1;
    @sprtea
    public static final int cfr_renamed_112 = 3;
    @sprtea
    public static final int cfr_renamed_119 = 7168;
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprrep cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_19133(sprzto sprzto2) {
        int n;
        void arg0;
        sprudp sprudp2 = this;
        sprudp2.cfr_renamed_102 = new sprrep(8, (sprzto)arg0);
        int n2 = n = 0;
        while (n2 < 2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8) {
                this.cfr_renamed_102.cfr_renamed_19134(n3++);
                n4 = n3;
            }
            n2 = ++n;
        }
    }

    @sprtea
    public byte[] cfr_renamed_19101() {
        return this.cfr_renamed_91;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprudp(int n, sprzto sprzto2) {
        void arg0;
        void arg1;
        sprudp sprudp2 = this;
        void v1 = arg1;
        sprudp sprudp3 = this;
        sprudp3.cfr_renamed_1 = arg0;
        sprudp3.cfr_renamed_19135();
        this.cfr_renamed_19133((sprzto)v1);
        sprudp2.cfr_renamed_19136((sprzto)v1);
        sprudp2.cfr_renamed_19137(sprzto2);
        sprudp2.cfr_renamed_19138();
    }

    private /* synthetic */ void cfr_renamed_19135() {
        int n = 1;
        sprudp sprudp2 = this;
        this.cfr_renamed_93 = 1 + (1 << 3 * n) - 1;
        while (sprudp2.cfr_renamed_19130() < (long)this.cfr_renamed_1) {
            sprudp2 = this;
            this.cfr_renamed_93 = 1 + (1 << 3 * ++n) - 1;
        }
        sprudp sprudp3 = this;
        sprudp3.cfr_renamed_2 = 256 + 8 * n;
        sprudp3.cfr_renamed_86 = sprudp3.cfr_renamed_2 + 1;
        sprudp3.cfr_renamed_0 = sprudp3.cfr_renamed_86 + 1;
        sprudp3.cfr_renamed_4 = sprudp3.cfr_renamed_0 + 1;
    }

    @sprtea
    public long cfr_renamed_19130() {
        return this.cfr_renamed_93;
    }

    @sprtea
    public int cfr_renamed_19125() {
        return this.cfr_renamed_86;
    }

    @sprtea
    public sprrep cfr_renamed_19127() {
        return this.cfr_renamed_102;
    }

    @sprtea
    public sprrep cfr_renamed_19112() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_19138() {
        int n;
        this.cfr_renamed_91 = new byte[7168];
        int n2 = 0;
        int n3 = n = 0;
        while ((n3 & 0xFF) < 32) {
            int n4;
            int n5 = n4 = 0;
            while ((n5 & 0xFF) < 96) {
                sprudp sprudp2 = this;
                sprudp2.cfr_renamed_91[n2++] = n;
                sprudp2.cfr_renamed_91[n2++] = n4;
                n5 = n4 = (int)((byte)(n4 + 1));
            }
            n3 = n = (int)((byte)(n + 1));
        }
        int n6 = n = 0;
        while (n6 < 256) {
            sprudp sprudp3 = this;
            sprudp3.cfr_renamed_91[n2++] = (byte)n;
            sprudp3.cfr_renamed_91[n2++] = (byte)n;
            sprudp3.cfr_renamed_91[n2++] = (byte)n;
            byte by = (byte)n;
            sprudp3.cfr_renamed_91[n2++] = by;
            n6 = ++n;
        }
    }

    @sprtea
    public int cfr_renamed_19120() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public sprrep cfr_renamed_19129() {
        return this.cfr_renamed_107;
    }

    @sprtea
    public int cfr_renamed_19126() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_19137(sprzto sprzto2) {
        int n;
        void arg0;
        this.cfr_renamed_3 = new sprrep(this.cfr_renamed_4, (sprzto)arg0);
        this.cfr_renamed_3.cfr_renamed_19134(256);
        this.cfr_renamed_3.cfr_renamed_19134(257);
        int n2 = n = 0;
        while (n2 < 12) {
            sprudp sprudp2 = this;
            sprudp2.cfr_renamed_3.cfr_renamed_19134(sprudp2.cfr_renamed_2);
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < 6) {
            sprudp sprudp3 = this;
            sprudp3.cfr_renamed_3.cfr_renamed_19134(sprudp3.cfr_renamed_86);
            n3 = ++n;
        }
    }

    @sprtea
    public int cfr_renamed_5797() {
        return this.cfr_renamed_1 + 7168;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_19136(sprzto sprzto2) {
        int n;
        void arg0;
        sprudp sprudp2 = this;
        sprudp2.cfr_renamed_107 = new sprrep(8, (sprzto)arg0);
        int n2 = n = 0;
        while (n2 < 2) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8) {
                this.cfr_renamed_107.cfr_renamed_19134(n3++);
                n4 = n3;
            }
            n2 = ++n;
        }
    }
}

