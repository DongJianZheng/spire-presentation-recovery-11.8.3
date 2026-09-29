/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreah;
import com.spire.presentation.packages.sprfdm;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprgur;
import com.spire.presentation.packages.sprhzg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprli;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprmpl;
import com.spire.presentation.packages.sprmxg;
import com.spire.presentation.packages.sprnvg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnl;
import com.spire.presentation.packages.sprpqg;
import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.sprqwl;
import com.spire.presentation.packages.sprtm;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprxcm;
import com.spire.presentation.packages.sprxyl;
import com.spire.presentation.packages.sprzyg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;

public class sprssg {
    private sprtm cfr_renamed_112;
    private OutputStream cfr_renamed_119;
    private sprli cfr_renamed_91;
    private int cfr_renamed_0;
    private sprpnl[] cfr_renamed_1 = new sprpnl[0];
    private sprpnl[] cfr_renamed_2 = new sprpnl[0];
    private int cfr_renamed_3;
    private byte cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_7660(sprvbh arg0) throws sprtqg {
        try {
            return arg0.cfr_renamed_723.cfr_renamed_7661();
        }
        catch (IOException iOException) {
            throw new sprtqg(sprqwl.cfr_renamed_9("\u0005k\u0003v\u0010g\t|\u000e3\u0010a\u0005c\u0001a\t}\u00073\u000bv\u0019="), iOException);
        }
    }

    public void cfr_renamed_1196(byte[] arg0) {
        this.cfr_renamed_1197(arg0, 0, arg0.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzyg cfr_renamed_7662(sprnvg arg0, sprvbh arg1) throws sprtqg {
        this.cfr_renamed_7663(arg1);
        try {
            int n;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            sprqbm[] sprqbmArray = arg0.cfr_renamed_7563();
            int n2 = n = 0;
            while (true) {
                if (n2 == sprqbmArray.length) {
                    this.cfr_renamed_7664(209, byteArrayOutputStream.toByteArray());
                    return this.cfr_renamed_31();
                }
                sprqbmArray[n++].cfr_renamed_2623(byteArrayOutputStream);
                n2 = n;
            }
        }
        catch (IOException iOException) {
            throw new sprtqg(sprgur.cfr_renamed_9("yLtCuY:HtNuI\u007f\riXx]{NqHn\r{_hLc"), iOException);
        }
    }

    public sprpqg cfr_renamed_7542(boolean arg0) throws sprtqg {
        sprssg sprssg2 = this;
        return new sprpqg(new sprfdm(sprssg2.cfr_renamed_3, sprssg2.cfr_renamed_91.cfr_renamed_579(), this.cfr_renamed_91.cfr_renamed_2373(), this.cfr_renamed_91.cfr_renamed_7541(), arg0));
    }

    private /* synthetic */ void cfr_renamed_7663(sprvbh arg0) throws sprtqg {
        sprssg sprssg2 = this;
        byte[] byArray = sprssg2.cfr_renamed_7660(arg0);
        sprssg2.cfr_renamed_1221((byte)-103);
        sprssg2.cfr_renamed_1221((byte)(byArray.length >> 8));
        this.cfr_renamed_1221((byte)byArray.length);
        this.cfr_renamed_1196(byArray);
    }

    private /* synthetic */ sprpnl[] cfr_renamed_7665(sprpnl[] arg0, sprpnl arg1) {
        sprpnl[] sprpnlArray = new sprpnl[arg0.length + 1];
        sprpnlArray[0] = arg1;
        System.arraycopy(arg0, 0, sprpnlArray, 1, arg0.length);
        return sprpnlArray;
    }

    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_3 == 1) {
            int n;
            int n2 = arg1 + arg2;
            int n3 = n = arg1;
            while (n3 != n2) {
                this.cfr_renamed_1221(arg0[n++]);
                n3 = n;
            }
        } else {
            this.cfr_renamed_7536(arg0, arg1, arg2);
        }
    }

    public void cfr_renamed_7666(sprhzg arg0) {
        if (arg0 == null) {
            this.cfr_renamed_2 = new sprpnl[0];
            return;
        }
        this.cfr_renamed_2 = arg0.cfr_renamed_7563();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7536(byte[] arg0, int arg1, int arg2) {
        try {
            this.cfr_renamed_119.write(arg0, arg1, arg2);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_7537(byte arg0) {
        try {
            this.cfr_renamed_119.write(arg0);
            return;
        }
        catch (IOException iOException) {
            throw new spreah(iOException.getMessage(), iOException);
        }
    }

    /*
     * Unable to fully structure code
     */
    public sprzyg cfr_renamed_31() throws sprtqg {
        block9: {
            var2_1 = 4;
            var3_2 = new ByteArrayOutputStream();
            v0 = this;
            if (!v0.cfr_renamed_7667(v0.cfr_renamed_2, 2)) {
                v1 = this;
                v2 = v1;
                var4_3 = v1.cfr_renamed_7665(v1.cfr_renamed_2, new sprmpl(false, new Date()));
            } else {
                v3 = this;
                v2 = v3;
                var4_3 = v3.cfr_renamed_2;
            }
            if (v2.cfr_renamed_7667(this.cfr_renamed_2, 16)) break block9;
            v4 = this;
            if (v4.cfr_renamed_7667(v4.cfr_renamed_1, 16)) break block9;
            v5 = this;
            var5_4 = v5.cfr_renamed_7665(v5.cfr_renamed_1, new sprxyl(false, this.cfr_renamed_91.cfr_renamed_7541()));
            v6 = var3_2;
            ** GOTO lbl25
        }
        var5_4 = this.cfr_renamed_1;
        try {
            v6 = var3_2;
lbl25:
            // 2 sources

            v6.write((byte)var2_1);
            v7 = var3_2;
            v8 = this;
            var3_2.write((byte)v8.cfr_renamed_3);
            v7.write((byte)v8.cfr_renamed_91.cfr_renamed_2373());
            v7.write((byte)this.cfr_renamed_91.cfr_renamed_579());
            var6_5 = new ByteArrayOutputStream();
            v9 = var7_7 = 0;
            while (v9 != var4_3.length) {
                var4_3[var7_7++].cfr_renamed_2623((OutputStream)var6_5);
                v9 = var7_7;
            }
            var7_8 = var6_5.toByteArray();
            var3_2.write((byte)(var7_8.length >> 8));
            var3_2.write((byte)var7_8.length);
            var3_2.write(var7_8);
        }
        catch (IOException var6_6) {
            throw new sprtqg(sprqwl.cfr_renamed_9("v\u0018p\u0005c\u0014z\u000f}@v\u000ep\u000fw\t}\u00073\br\u0013{\u0005w@w\u0001g\u0001="), var6_6);
        }
        v10 = var3_2.toByteArray();
        var6_5 = v10;
        v11 = var3_2;
        var3_2.write((byte)var2_1);
        v11.write(-1);
        v11.write((byte)(v10.length >> 24));
        var3_2.write((byte)(((Object)var6_5).length >> 16));
        var3_2.write((byte)(((Object)var6_5).length >> 8));
        var3_2.write((byte)((Object)var6_5).length);
        var7_8 = var3_2.toByteArray();
        this.cfr_renamed_7536(var7_8, 0, var7_8.length);
        if (this.cfr_renamed_91.cfr_renamed_2373() == 3 || this.cfr_renamed_91.cfr_renamed_2373() == 1) {
            var1_9 = new sprghm[1];
            v12 = this;
            var1_9[0] = new sprghm(new BigInteger(1, this.cfr_renamed_91.cfr_renamed_79()));
        } else if (this.cfr_renamed_91.cfr_renamed_2373() == 22) {
            var8_10 = this.cfr_renamed_91.cfr_renamed_79();
            v13 = new sprghm[2];
            v13[0] = new sprghm(new BigInteger(1, sproze.cfr_renamed_533(var8_10, 0, var8_10.length / 2)));
            v13[1] = new sprghm(new BigInteger(1, sproze.cfr_renamed_533(var8_10, var8_10.length / 2, var8_10.length)));
            var1_9 = v13;
            v12 = this;
        } else {
            v14 = this;
            v12 = v14;
            var1_9 = sprmxg.cfr_renamed_7540(v14.cfr_renamed_91.cfr_renamed_79());
        }
        var8_10 = v12.cfr_renamed_91.cfr_renamed_580();
        var9_11 = new byte[]{var8_10[0], var8_10[1]};
        v15 = this;
        return new sprzyg(new sprxcm(v15.cfr_renamed_3, v15.cfr_renamed_91.cfr_renamed_7541(), this.cfr_renamed_91.cfr_renamed_2373(), this.cfr_renamed_91.cfr_renamed_579(), var4_3, var5_4, var9_11, var1_9));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_7538(int n, sprmah sprmah2) throws sprtqg {
        void arg1;
        void arg0;
        sprssg sprssg2 = this;
        sprssg2.cfr_renamed_91 = sprssg2.cfr_renamed_112.cfr_renamed_7539((int)arg0, (sprmah)arg1);
        sprssg2.cfr_renamed_119 = sprssg2.cfr_renamed_91.cfr_renamed_470();
        this.cfr_renamed_3 = sprssg2.cfr_renamed_91.cfr_renamed_324();
        this.cfr_renamed_4 = 0;
        if (this.cfr_renamed_0 >= 0) {
            sprssg sprssg3 = this;
            if (sprssg3.cfr_renamed_0 != sprssg3.cfr_renamed_91.cfr_renamed_2373()) {
                throw new sprtqg(sprgur.cfr_renamed_9("F\u007fT:LvJu_sYr@:@s^wLnNr"));
            }
        }
    }

    public sprzyg cfr_renamed_7668(sprvbh arg0) throws sprtqg {
        if (!(this.cfr_renamed_3 != 40 && this.cfr_renamed_3 != 24 || arg0.cfr_renamed_7669())) {
            throw new IllegalArgumentException(sprqwl.cfr_renamed_9("\u0003v\u0012g\tu\tp\u0001g\t|\u000e`@z\u000ee\u000f\u007f\u0016z\u000et@`\u0015q\u000bv\u00193\u0012v\u0011f\ta\u0005`@c\u0015q\fz\u00033\u000bv\u00193\u000fu@a\u0005e\u000fx\t}\u00073\u000bv\u00193\u0001`@d\u0005\u007f\f="));
        }
        sprssg sprssg2 = this;
        sprssg2.cfr_renamed_7663(arg0);
        return sprssg2.cfr_renamed_31();
    }

    private /* synthetic */ boolean cfr_renamed_7667(sprpnl[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n].cfr_renamed_324() == arg1) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprssg(sprtm sprtm2) {
        void arg0;
        sprssg sprssg2 = this;
        sprssg2.cfr_renamed_0 = -1;
        sprssg2.cfr_renamed_112 = arg0;
    }

    public void cfr_renamed_7670(sprhzg arg0) {
        if (arg0 == null) {
            this.cfr_renamed_1 = new sprpnl[0];
            return;
        }
        this.cfr_renamed_1 = arg0.cfr_renamed_7563();
    }

    /*
     * WARNING - void declaration
     */
    public sprzyg cfr_renamed_7671(sprvbh sprvbh2, sprvbh sprvbh3) throws sprtqg {
        void arg0;
        sprssg sprssg2 = this;
        sprssg2.cfr_renamed_7663((sprvbh)arg0);
        sprssg2.cfr_renamed_7663(sprvbh3);
        return sprssg2.cfr_renamed_31();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_7664(int n, byte[] byArray) {
        void arg1;
        void arg0;
        sprssg sprssg2 = this;
        sprssg2.cfr_renamed_1221((byte)arg0);
        sprssg2.cfr_renamed_1221((byte)(byArray.length >> 24));
        this.cfr_renamed_1221((byte)(((void)arg1).length >> 16));
        this.cfr_renamed_1221((byte)(((void)arg1).length >> 8));
        this.cfr_renamed_1221((byte)((void)arg1).length);
        this.cfr_renamed_1196((byte[])arg1);
    }

    public void cfr_renamed_1221(byte arg0) {
        block0: {
            block2: {
                sprssg sprssg2;
                block4: {
                    block3: {
                        block1: {
                            if (this.cfr_renamed_3 != 1) break block0;
                            if (arg0 != 13) break block1;
                            sprssg sprssg3 = this;
                            sprssg2 = sprssg3;
                            sprssg3.cfr_renamed_7537((byte)13);
                            sprssg3.cfr_renamed_7537((byte)10);
                            break block2;
                        }
                        if (arg0 != 10) break block3;
                        if (this.cfr_renamed_4 == 13) break block4;
                        sprssg sprssg4 = this;
                        sprssg2 = sprssg4;
                        sprssg4.cfr_renamed_7537((byte)13);
                        sprssg4.cfr_renamed_7537((byte)10);
                        break block2;
                    }
                    this.cfr_renamed_7537(arg0);
                }
                sprssg2 = this;
            }
            sprssg2.cfr_renamed_4 = arg0;
            return;
        }
        this.cfr_renamed_7537(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzyg cfr_renamed_7672(String string, sprvbh sprvbh2) throws sprtqg {
        void arg0;
        void arg1;
        sprssg sprssg2 = this;
        sprssg2.cfr_renamed_7663((sprvbh)arg1);
        sprssg2.cfr_renamed_7664(180, sprkoe.cfr_renamed_431((String)arg0));
        return sprssg2.cfr_renamed_31();
    }
}

