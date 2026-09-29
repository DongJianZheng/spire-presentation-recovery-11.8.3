/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdiaa;
import com.spire.presentation.packages.sprfv;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprttc;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;

public class sprbrk
extends sprirk {
    public static final int cfr_renamed_91 = 3;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 1;

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_0;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException, sprull {
        block18: {
            block16: {
                block17: {
                    if (this.cfr_renamed_0 + arg1 > arg0.length) {
                        throw new sprwjl(sprdiaa.cfr_renamed_9("\u0007\u0006\u001c\u0003\u001d\u0007H\u0011\u001d\u0015\u000e\u0016\u001aS\u001c\u001cH\u0000\u0005\u0012\u0004\u001fH\u001a\u0006S\f\u001c.\u001a\u0006\u0012\u0004"));
                    }
                    v0 = this;
                    var3_3 = v0.cfr_renamed_2.cfr_renamed_1195();
                    var4_4 = v0.cfr_renamed_0 - var3_3;
                    var5_5 = new byte[var3_3];
                    if (!v0.cfr_renamed_119) break block16;
                    if (this.cfr_renamed_0 < var3_3) {
                        throw new sprddl(sprttc.cfr_renamed_9("\u0006/\r.H+\u001cj\u0004/\t9\u001cj\u0007$\rj\n&\u0007)\u0003j\u0007,H#\u0006:\u001d>H,\u00078H\u0004!\u0019<\t<\u0019"));
                    }
                    if (this.cfr_renamed_0 <= var3_3) break block17;
                    var6_6 = new byte[var3_3];
                    if (this.cfr_renamed_2 == 2 || this.cfr_renamed_2 == 3) {
                        v1 = this;
                        v1.cfr_renamed_2.cfr_renamed_3064((byte[])v1.cfr_renamed_91, 0, var5_5, 0);
                        v2 = this;
                        System.arraycopy(v2.cfr_renamed_91, var3_3, var6_6, 0, var4_4);
                        v2.cfr_renamed_2.cfr_renamed_3064(var6_6, 0, var6_6, 0);
                        if (v1.cfr_renamed_2 == 2 && var4_4 == var3_3) {
                            System.arraycopy(var5_5, 0, arg0, arg1, var3_3);
                            System.arraycopy(var6_6, 0, arg0, arg1 + var3_3, var4_4);
                        } else {
                            System.arraycopy(var6_6, 0, arg0, arg1, var3_3);
                            System.arraycopy(var5_5, 0, arg0, arg1 + var3_3, var4_4);
                        }
                    } else {
                        v3 = this;
                        System.arraycopy(v3.cfr_renamed_91, 0, var5_5, 0, var3_3);
                        v3.cfr_renamed_2.cfr_renamed_3064(var5_5, 0, var5_5, 0);
                        System.arraycopy(var5_5, 0, arg0, arg1, var4_4);
                        v4 = this;
                        System.arraycopy(this.cfr_renamed_91, v4.cfr_renamed_0 - var4_4, var6_6, 0, var4_4);
                        v4.cfr_renamed_2.cfr_renamed_3064(var6_6, 0, var6_6, 0);
                        System.arraycopy(var6_6, 0, arg0, arg1 + var4_4, var3_3);
                    }
                    ** GOTO lbl105
                }
                v5 = this;
                v6 = v5;
                v5.cfr_renamed_2.cfr_renamed_3064((byte[])v5.cfr_renamed_91, 0, var5_5, 0);
                System.arraycopy(var5_5, 0, arg0, arg1, var3_3);
                break block18;
            }
            if (this.cfr_renamed_0 < var3_3) {
                throw new sprddl(sprdiaa.cfr_renamed_9("\u001d\r\u0016\fS\t\u0007H\u001f\r\u0012\u001b\u0007H\u001c\u0006\u0016H\u0011\u0004\u001c\u000b\u0018H\u001c\u000eS\u0001\u001d\u0018\u0006\u001cS\u000e\u001c\u001aS+';"));
            }
            var6_7 = new byte[var3_3];
            if (this.cfr_renamed_0 > var3_3) {
                if (this.cfr_renamed_2 == 3 || this.cfr_renamed_2 == 2 && (((int)this.cfr_renamed_91).length - this.cfr_renamed_0) % var3_3 != 0) {
                    v7 = this;
                    if (this.cfr_renamed_2 instanceof sprfv) {
                        var7_9 = ((sprfv)v7.cfr_renamed_2).cfr_renamed_2349();
                        v8 = var3_3;
                        var7_9.cfr_renamed_3064((byte[])this.cfr_renamed_91, 0, var5_5, 0);
                    } else {
                        v7.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_91, 0, var5_5, 0);
                        v8 = var3_3;
                    }
                    v9 = var7_10 = v8;
                    while (v9 != this.cfr_renamed_0) {
                        v10 = var7_10 - var3_3;
                        v11 = (byte)(var5_5[var7_10 - var3_3] ^ this.cfr_renamed_91[var7_10]);
                        var6_7[v10] = v11;
                        v9 = ++var7_10;
                    }
                    v12 = this;
                    v6 = v12;
                    System.arraycopy(v12.cfr_renamed_91, var3_3, var5_5, 0, var4_4);
                    v12.cfr_renamed_2.cfr_renamed_3064(var5_5, 0, arg0, arg1);
                    System.arraycopy(var6_7, 0, arg0, arg1 + var3_3, var4_4);
                } else {
                    var7_11 = ((sprfv)this.cfr_renamed_2).cfr_renamed_2349();
                    v13 = this;
                    var7_11.cfr_renamed_3064((byte[])v13.cfr_renamed_91, v13.cfr_renamed_0 - var3_3, var6_7, 0);
                    System.arraycopy(this.cfr_renamed_91, 0, var5_5, 0, var3_3);
                    if (var4_4 != var3_3) {
                        v14 = var4_4;
                        System.arraycopy(var6_7, v14, var5_5, v14, var3_3 - var4_4);
                    }
                    this.cfr_renamed_2.cfr_renamed_3064(var5_5, 0, var5_5, 0);
                    System.arraycopy(var5_5, 0, arg0, arg1, var3_3);
                    var8_12 = 0;
                    v15 = var8_12;
                    while (v15 != var4_4) {
                        v16 = var8_12;
                        v17 = (byte)(var6_7[v16] ^ this.cfr_renamed_91[var8_12]);
                        var6_7[v16] = v17;
                        v15 = ++var8_12;
                    }
                    System.arraycopy(var6_7, 0, arg0, arg1 + var3_3, var4_4);
                    v6 = this;
                }
            } else {
                v18 = this;
                v18.cfr_renamed_2.cfr_renamed_3064((byte[])v18.cfr_renamed_91, 0, var5_5, 0);
                System.arraycopy(var5_5, 0, arg0, arg1, var3_3);
lbl105:
                // 4 sources

                v6 = this;
            }
        }
        var6_8 = v6.cfr_renamed_0;
        this.cfr_renamed_41();
        return var6_8;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        sprbrk sprbrk2 = this;
        if (sprbrk2.cfr_renamed_0 == ((int)sprbrk2.cfr_renamed_91).length) {
            sprbrk sprbrk3 = this;
            sprbrk sprbrk4 = this;
            n = sprbrk3.cfr_renamed_2.cfr_renamed_3064((byte[])sprbrk4.cfr_renamed_91, 0, arg1, arg2);
            sprbrk sprbrk5 = this;
            System.arraycopy(sprbrk3.cfr_renamed_91, sprbrk5.cfr_renamed_1, sprbrk5.cfr_renamed_91, 0, this.cfr_renamed_1);
            sprbrk3.cfr_renamed_0 = sprbrk4.cfr_renamed_1;
        }
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        return n;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_0;
        int n2 = n % ((int)this.cfr_renamed_91).length;
        if (n2 == 0) {
            return n - ((int)this.cfr_renamed_91).length;
        }
        return n - n2;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprttc.cfr_renamed_9("\t\t$O>H\"\t<\rj\tj\u0006/\u000f+\u001c#\u001e/H#\u0006:\u001d>H&\r$\u000f>\u0000k"));
        }
        sprbrk sprbrk2 = this;
        int n = sprbrk2.cfr_renamed_1195();
        int n2 = sprbrk2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprwjl(sprdiaa.cfr_renamed_9("\u0007\u0006\u001c\u0003\u001d\u0007H\u0011\u001d\u0015\u000e\u0016\u001aS\u001c\u001c\u0007S\u001b\u001b\u0007\u0001\u001c"));
        }
        int n3 = 0;
        int n4 = ((int)this.cfr_renamed_91).length - this.cfr_renamed_0;
        if (arg2 > n4) {
            sprbrk sprbrk3 = this;
            System.arraycopy(arg0, arg1, sprbrk3.cfr_renamed_91, sprbrk3.cfr_renamed_0, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_91, 0, arg3, arg4);
            int n5 = n;
            System.arraycopy(this.cfr_renamed_91, n5, this.cfr_renamed_91, 0, n);
            this.cfr_renamed_0 = n5;
            arg1 += n4;
            int n6 = arg2 -= n4;
            while (n6 > n) {
                sprbrk sprbrk4 = this;
                System.arraycopy(arg0, arg1, sprbrk4.cfr_renamed_91, sprbrk4.cfr_renamed_0, n);
                sprbrk sprbrk5 = this;
                n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])sprbrk5.cfr_renamed_91, 0, arg3, arg4 + n3);
                int n7 = n;
                System.arraycopy(sprbrk5.cfr_renamed_91, n7, this.cfr_renamed_91, 0, n7);
                arg1 += n;
                n6 = arg2 -= n;
            }
        }
        sprbrk sprbrk6 = this;
        System.arraycopy(arg0, arg1, sprbrk6.cfr_renamed_91, sprbrk6.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbrk(int n, sprmr sprmr2) {
        void arg1;
        void arg0;
        sprbrk sprbrk2 = this;
        this.cfr_renamed_2 = arg0;
        sprbrk2.cfr_renamed_2 = (int)sprhqk.cfr_renamed_7530((sprmr)arg1);
        sprbrk2.cfr_renamed_1 = arg1.cfr_renamed_1195();
        this.cfr_renamed_91 = (int)new byte[this.cfr_renamed_1 * 2];
        this.cfr_renamed_0 = 0;
    }
}

