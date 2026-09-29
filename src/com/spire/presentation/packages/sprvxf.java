/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdxf;
import com.spire.presentation.packages.sprebg;
import com.spire.presentation.packages.sprfzf;
import com.spire.presentation.packages.sprjod;
import com.spire.presentation.packages.sprmdg;
import com.spire.presentation.packages.sprnvf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwk;
import com.spire.presentation.packages.sprwcg;
import com.spire.presentation.packages.sprzcg;
import java.security.SecureRandom;

public class sprvxf {
    private SecureRandom cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    public int cfr_renamed_0;
    private sprfzf cfr_renamed_1;
    private int cfr_renamed_2;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    public byte[] cfr_renamed_6854(boolean arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        byte[] byArray;
        int n;
        sprvxf sprvxf2 = this;
        byte[] byArray2 = new byte[sprvxf2.cfr_renamed_119];
        byte[] byArray3 = new byte[sprvxf2.cfr_renamed_119];
        byte[] byArray4 = new byte[sprvxf2.cfr_renamed_119];
        byte[] byArray5 = new byte[sprvxf2.cfr_renamed_119];
        short[] sArray = new short[sprvxf2.cfr_renamed_119];
        short[] sArray2 = new short[sprvxf2.cfr_renamed_119];
        byte[] byArray6 = new byte[48];
        byte[] byArray7 = new byte[sprvxf2.cfr_renamed_3];
        sprnvf sprnvf2 = new sprnvf();
        sprwcg sprwcg2 = new sprwcg();
        sprdxf sprdxf2 = new sprdxf();
        sprebg sprebg2 = new sprebg();
        int n2 = 0;
        sprvxf sprvxf3 = this;
        int n3 = sprvxf2.cfr_renamed_1.cfr_renamed_6895(byArray2, 0, sprvxf3.cfr_renamed_0, sprvxf3.cfr_renamed_1.cfr_renamed_2[this.cfr_renamed_0], arg5, arg6 + n2, this.cfr_renamed_91 - n2);
        if (n3 == 0) {
            throw new IllegalStateException(sprpwk.cfr_renamed_9("Q]S\u0018T\u0012S\u0018\u0017\u001bV\u0014[\u0018S"));
        }
        n2 += n3;
        sprvxf sprvxf4 = this;
        n3 = this.cfr_renamed_1.cfr_renamed_6895(byArray3, 0, sprvxf4.cfr_renamed_0, sprvxf4.cfr_renamed_1.cfr_renamed_2[this.cfr_renamed_0], arg5, arg6 + n2, this.cfr_renamed_91 - n2);
        if (n3 == 0) {
            throw new IllegalStateException(sprjod.cfr_renamed_9("\u0017s\u00146\u0013<\u00146P5\u0011:\u001c6\u0014"));
        }
        n2 += n3;
        sprvxf sprvxf5 = this;
        n3 = this.cfr_renamed_1.cfr_renamed_6895(byArray4, 0, sprvxf5.cfr_renamed_0, sprvxf5.cfr_renamed_1.cfr_renamed_4[this.cfr_renamed_0], arg5, arg6 + n2, this.cfr_renamed_91 - n2);
        if (n3 == 0) {
            throw new IllegalArgumentException(sprpwk.cfr_renamed_9("q]S\u0018T\u0012S\u0018\u0017\u001bV\u0014[\u0018S"));
        }
        if ((n2 += n3) != this.cfr_renamed_91 - 1) {
            throw new IllegalStateException(sprjod.cfr_renamed_9("\u0016&\u001c?P8\u0015*P=\u001f'P&\u00036\u0014"));
        }
        if (!sprdxf2.cfr_renamed_6837(byArray5, 0, byArray2, 0, byArray3, 0, byArray4, 0, this.cfr_renamed_0, new short[2 * this.cfr_renamed_119], 0)) {
            throw new IllegalStateException(sprpwk.cfr_renamed_9("T\u0012Z\r[\u0018C\u0018h\rE\u0014A\u001cC\u0018\u0017\u001bV\u0014[\u0018S"));
        }
        sprnvf sprnvf3 = sprnvf2;
        this.cfr_renamed_112.nextBytes(byArray7);
        sprnvf sprnvf4 = sprnvf2;
        sprnvf2.cfr_renamed_6806();
        sprnvf4.cfr_renamed_6808(byArray7, 0, this.cfr_renamed_3);
        sprnvf4.cfr_renamed_6808(arg2, arg3, arg4);
        sprnvf3.cfr_renamed_6807();
        sprebg2.cfr_renamed_6896(sprnvf3, sArray2, 0, this.cfr_renamed_0);
        this.cfr_renamed_112.nextBytes(byArray6);
        sprnvf sprnvf5 = sprnvf2;
        sprnvf5.cfr_renamed_6806();
        sprnvf5.cfr_renamed_6808(byArray6, 0, byArray6.length);
        sprnvf2.cfr_renamed_6807();
        sprwcg2.cfr_renamed_6877(sArray, 0, sprnvf2, byArray2, 0, byArray3, 0, byArray4, 0, byArray5, 0, sArray2, 0, this.cfr_renamed_0, new sprmdg[10 * this.cfr_renamed_119], 0);
        byte[] byArray8 = new byte[this.cfr_renamed_4 - 2 - this.cfr_renamed_3];
        if (arg0) {
            byArray8[0] = (byte)(32 + this.cfr_renamed_0);
            n = this.cfr_renamed_1.cfr_renamed_6897(byArray8, 1, byArray8.length - 1, sArray, 0, this.cfr_renamed_0);
            if (n == 0) {
                throw new IllegalStateException(sprjod.cfr_renamed_9(" \u00194\u001e2\u0004&\u00026P5\u0011:\u001c6\u0014s\u0004<P4\u0015=\u0015!\u0011'\u0015"));
            }
            ++n;
            byArray = arg1;
        } else {
            n = this.cfr_renamed_1.cfr_renamed_6897(byArray8, 0, byArray8.length, sArray, 0, this.cfr_renamed_0);
            if (n == 0) {
                throw new IllegalStateException(sprpwk.cfr_renamed_9("\u000e^\u001aY\u001cC\bE\u0018\u0017\u001bV\u0014[\u0018S]C\u0012\u0017\u001aR\u0013R\u000fV\tR"));
            }
            byArray = arg1;
        }
        byArray[0] = (byte)(48 + this.cfr_renamed_0);
        System.arraycopy(byArray7, 0, arg1, 1, this.cfr_renamed_3);
        System.arraycopy(byArray8, 0, arg1, 1 + this.cfr_renamed_3, n);
        return sproze.cfr_renamed_533(arg1, 0, 1 + this.cfr_renamed_3 + n);
    }

    /*
     * WARNING - void declaration
     */
    public sprvxf(int n, int n2, SecureRandom secureRandom) {
        void arg0;
        sprvxf sprvxf2 = this;
        sprvxf sprvxf3 = this;
        sprvxf sprvxf4 = this;
        sprvxf4.cfr_renamed_1 = new sprfzf();
        sprvxf3.cfr_renamed_112 = secureRandom;
        sprvxf3.cfr_renamed_0 = n;
        sprvxf2.cfr_renamed_3 = n2;
        sprvxf2.cfr_renamed_119 = 1 << n;
        this.cfr_renamed_2 = 1 + 14 * this.cfr_renamed_119 / 8;
        if (n == 10) {
            sprvxf sprvxf5 = this;
            sprvxf5.cfr_renamed_91 = 2305;
            sprvxf5.cfr_renamed_4 = 1330;
            return;
        }
        if (arg0 == 9 || arg0 == 8) {
            this.cfr_renamed_91 = 1 + 6 * this.cfr_renamed_119 * 2 / 8 + this.cfr_renamed_119;
            this.cfr_renamed_4 = 690;
            return;
        }
        if (arg0 == 7 || arg0 == 6) {
            this.cfr_renamed_91 = 1 + 7 * this.cfr_renamed_119 * 2 / 8 + this.cfr_renamed_119;
            this.cfr_renamed_4 = 690;
            return;
        }
        this.cfr_renamed_91 = 1 + this.cfr_renamed_119 * 2 + this.cfr_renamed_119;
        this.cfr_renamed_4 = 690;
    }

    public byte[][] cfr_renamed_6898(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        sprvxf sprvxf2 = this;
        byte[] byArray = new byte[sprvxf2.cfr_renamed_119];
        byte[] byArray2 = new byte[sprvxf2.cfr_renamed_119];
        byte[] byArray3 = new byte[sprvxf2.cfr_renamed_119];
        short[] sArray = new short[sprvxf2.cfr_renamed_119];
        byte[] byArray4 = new byte[48];
        sprnvf sprnvf2 = new sprnvf();
        sprzcg sprzcg2 = new sprzcg();
        sprvxf2.cfr_renamed_112.nextBytes(byArray4);
        sprnvf sprnvf3 = sprnvf2;
        sprnvf3.cfr_renamed_6806();
        sprnvf3.cfr_renamed_6808(byArray4, 0, byArray4.length);
        sprnvf sprnvf4 = sprnvf2;
        sprnvf4.cfr_renamed_6807();
        sprzcg2.cfr_renamed_6899(sprnvf4, byArray, 0, byArray2, 0, byArray3, 0, null, 0, sArray, 0, this.cfr_renamed_0);
        arg2[arg3 + 0] = (byte)(80 + this.cfr_renamed_0);
        int n = 1;
        sprvxf sprvxf3 = this;
        int n2 = this.cfr_renamed_1.cfr_renamed_6900(arg2, arg3 + n, this.cfr_renamed_91 - n, byArray, 0, sprvxf3.cfr_renamed_0, sprvxf3.cfr_renamed_1.cfr_renamed_2[this.cfr_renamed_0]);
        if (n2 == 0) {
            throw new IllegalStateException(sprjod.cfr_renamed_9("\u0016s\u0015=\u0013<\u00146P5\u0011:\u001c6\u0014"));
        }
        byte[] byArray5 = sproze.cfr_renamed_533(arg2, arg3 + n, n + n2);
        n += n2;
        sprvxf sprvxf4 = this;
        n2 = this.cfr_renamed_1.cfr_renamed_6900(arg2, arg3 + n, this.cfr_renamed_91 - n, byArray2, 0, sprvxf4.cfr_renamed_0, sprvxf4.cfr_renamed_1.cfr_renamed_2[this.cfr_renamed_0]);
        if (n2 == 0) {
            throw new IllegalStateException(sprpwk.cfr_renamed_9("P]R\u0013T\u0012S\u0018\u0017\u001bV\u0014[\u0018S"));
        }
        byte[] byArray6 = sproze.cfr_renamed_533(arg2, arg3 + n, n + n2);
        n += n2;
        sprvxf sprvxf5 = this;
        n2 = this.cfr_renamed_1.cfr_renamed_6900(arg2, arg3 + n, this.cfr_renamed_91 - n, byArray3, 0, sprvxf5.cfr_renamed_0, sprvxf5.cfr_renamed_1.cfr_renamed_4[this.cfr_renamed_0]);
        if (n2 == 0) {
            throw new IllegalStateException(sprjod.cfr_renamed_9("6s\u0015=\u0013<\u00146P5\u0011:\u001c6\u0014"));
        }
        byte[] byArray7 = sproze.cfr_renamed_533(arg2, arg3 + n, n + n2);
        if ((n += n2) != this.cfr_renamed_91) {
            throw new IllegalStateException(sprpwk.cfr_renamed_9("\u000eR\u001eE\u0018C]\\\u0018N]R\u0013T\u0012S\u0014Y\u001a\u0017\u001bV\u0014[\u0018S"));
        }
        arg0[arg1 + 0] = (byte)(0 + this.cfr_renamed_0);
        n2 = this.cfr_renamed_1.cfr_renamed_6901(arg0, arg1 + 1, this.cfr_renamed_2 - 1, sArray, 0, this.cfr_renamed_0);
        if (n2 != this.cfr_renamed_2 - 1) {
            throw new IllegalStateException(sprjod.cfr_renamed_9("#\u00051\u001c:\u0013s\u001b6\ts\u0015=\u0013<\u0014:\u001e4P5\u0011:\u001c6\u0014"));
        }
        byte[][] byArrayArray = new byte[4][];
        byArrayArray[0] = sproze.cfr_renamed_533(arg0, 1, arg0.length);
        byArrayArray[1] = byArray5;
        byArrayArray[2] = byArray6;
        byArrayArray[3] = byArray7;
        return byArrayArray;
    }

    public int cfr_renamed_6852(boolean arg0, byte[] arg1, byte[] arg2, byte[] arg3, byte[] arg4, int arg5) {
        sprvxf sprvxf2 = this;
        short[] sArray = new short[sprvxf2.cfr_renamed_119];
        short[] sArray2 = new short[sprvxf2.cfr_renamed_119];
        short[] sArray3 = new short[sprvxf2.cfr_renamed_119];
        sprnvf sprnvf2 = new sprnvf();
        sprdxf sprdxf2 = new sprdxf();
        sprebg sprebg2 = new sprebg();
        if (sprvxf2.cfr_renamed_1.cfr_renamed_6902(sArray, 0, this.cfr_renamed_0, arg4, arg5, this.cfr_renamed_2 - 1) != this.cfr_renamed_2 - 1) {
            return -1;
        }
        sprdxf2.cfr_renamed_6846(sArray, 0, this.cfr_renamed_0);
        int n = arg1.length;
        int n2 = arg3.length;
        if (arg0) {
            if (n < 1 || arg1[0] != (byte)(32 + this.cfr_renamed_0)) {
                return -1;
            }
            if (this.cfr_renamed_1.cfr_renamed_6903(sArray3, 0, this.cfr_renamed_0, arg1, 1, n - 1) != n - 1) {
                return -1;
            }
        } else if (n < 1 || this.cfr_renamed_1.cfr_renamed_6903(sArray3, 0, this.cfr_renamed_0, arg1, 0, n) != n) {
            return -1;
        }
        sprnvf sprnvf3 = sprnvf2;
        sprnvf2.cfr_renamed_6806();
        sprnvf3.cfr_renamed_6808(arg2, 0, this.cfr_renamed_3);
        sprnvf3.cfr_renamed_6808(arg3, 0, n2);
        sprnvf2.cfr_renamed_6807();
        sprebg2.cfr_renamed_6896(sprnvf2, sArray2, 0, this.cfr_renamed_0);
        sprvxf sprvxf3 = this;
        if (sprdxf2.cfr_renamed_6850(sArray2, 0, sArray3, 0, sArray, 0, sprvxf3.cfr_renamed_0, new short[sprvxf3.cfr_renamed_119], 0) == 0) {
            return -1;
        }
        return 0;
    }
}

