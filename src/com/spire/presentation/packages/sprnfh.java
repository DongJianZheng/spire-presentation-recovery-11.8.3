/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprafh;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprfch;
import com.spire.presentation.packages.sprfjn;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprifh;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprphh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqvg;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprvgh;
import com.spire.presentation.packages.sprvhh;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprycn;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Iterator;

public class sprnfh
extends FilterInputStream {
    private static final int[] cfr_renamed_0;
    public PrintWriter cfr_renamed_1;
    public PrintWriter cfr_renamed_2;
    private int cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    public BigInteger cfr_renamed_8137() throws Exception {
        return this.cfr_renamed_8138(false, 1);
    }

    static {
        int[] nArray = new int[8];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        cfr_renamed_0 = nArray;
        int[] nArray2 = new int[8];
        nArray2[0] = 128;
        nArray2[1] = 64;
        nArray2[2] = 32;
        nArray2[3] = 16;
        nArray2[4] = 8;
        nArray2[5] = 4;
        nArray2[6] = 2;
        nArray2[7] = 1;
        cfr_renamed_4 = nArray2;
    }

    private /* synthetic */ int cfr_renamed_8139(sprvlh arg0) {
        Iterator<sprvlh> iterator;
        int n = 0;
        Iterator<sprvlh> iterator2 = iterator = arg0.cfr_renamed_8112().iterator();
        while (iterator2.hasNext()) {
            sprvlh sprvlh2 = iterator.next();
            n += sprvlh2.cfr_renamed_4567() ? 0 : 1;
            iterator2 = iterator;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprco cfr_renamed_8140(sprvlh arg0) throws IOException {
        sprnfh sprnfh2 = this;
        byte[] byArray = sprnfh2.cfr_renamed_8141(sprafh.cfr_renamed_8142(sprnfh2.cfr_renamed_4934()));
        if (sprkqe.cfr_renamed_476(sprnfh2.in, byArray) != byArray.length) {
            throw new IOException(sprgtb.cfr_renamed_9("g\u0013gZm\u0015wZe\u000fo\u0016zZq\u001fb\u001e#\u0015s\u001fmZw\u0003s\u001f#\u001bpZq\u001btZa\u0003w\u001fp"));
        }
        FilterInputStream filterInputStream = null;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            filterInputStream = new sprnfh(byteArrayInputStream);
            sprqqe sprqqe2 = ((sprnfh)filterInputStream).cfr_renamed_8143(arg0);
            return sprqqe2;
        }
        finally {
            if (filterInputStream != null) {
                filterInputStream.close();
            }
        }
    }

    public BigInteger cfr_renamed_8144() throws Exception {
        return this.cfr_renamed_8138(1 != 0, 1);
    }

    public sprfch cfr_renamed_8145() throws IOException {
        return new sprfch(this);
    }

    public BigInteger cfr_renamed_8146() throws Exception {
        return this.cfr_renamed_8138(false, 8);
    }

    public static sprco cfr_renamed_8147(byte[] arg0, sprvlh arg1) throws IOException {
        return new sprnfh(new ByteArrayInputStream(arg0)).cfr_renamed_8143(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprnfh(InputStream inputStream, int n) {
        void arg0;
        sprnfh sprnfh2 = this;
        sprnfh sprnfh3 = this;
        super((InputStream)arg0);
        sprnfh3.cfr_renamed_2 = null;
        sprnfh3.cfr_renamed_3 = 0x100000;
        sprnfh2.cfr_renamed_1 = null;
        sprnfh2.cfr_renamed_3 = n;
    }

    public BigInteger cfr_renamed_8148() throws Exception {
        return this.cfr_renamed_8138(false, 8);
    }

    public BigInteger cfr_renamed_8149() throws Exception {
        return this.cfr_renamed_8138(true, 2);
    }

    public BigInteger cfr_renamed_8138(boolean arg0, int arg1) throws Exception {
        byte[] byArray = new byte[arg1];
        if (sprkqe.cfr_renamed_476(this, byArray) != byArray.length) {
            throw new IllegalStateException(sprfjn.cfr_renamed_9("\u0018(\u0005#\u0016#\u0003f\u001f)\u0005f\u00173\u001d*\bf\u0003#\u0010\""));
        }
        if (arg0) {
            return new BigInteger(1, byArray);
        }
        return new BigInteger(byArray);
    }

    public BigInteger cfr_renamed_8150() throws Exception {
        return this.cfr_renamed_8138(true, 4);
    }

    public void cfr_renamed_8104(String arg0) {
        if (this.cfr_renamed_2 != null) {
            int n;
            StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
            int n2 = -1;
            int n3 = n = 0;
            while (n3 != stackTraceElementArray.length) {
                StackTraceElement stackTraceElement = stackTraceElementArray[n];
                if (stackTraceElement.getMethodName().equals(sprgtb.cfr_renamed_9("\u001ef\u0018v\u001dS\bj\u0014w"))) {
                    n2 = 0;
                } else if (stackTraceElement.getClassName().contains(sprfjn.cfr_renamed_9(">\u0003#\u000f\u001f6\u00042"))) {
                    ++n2;
                }
                n3 = ++n;
            }
            int n4 = n2;
            while (n4 > 0) {
                this.cfr_renamed_2.append("    ");
                n4 = --n2;
            }
            this.cfr_renamed_2.append(arg0).append("\n");
            this.cfr_renamed_2.flush();
        }
    }

    public BigInteger cfr_renamed_8151() throws IOException {
        int n = this.read();
        if (n == -1) {
            throw new EOFException(sprgtb.cfr_renamed_9("f\u0002s\u001f`\u000ej\u0014dZs\bf\u001cj\u0002#\u0015eZf\u0014v\u0017f\bb\u000ej\u0015m"));
        }
        if ((n & 0x80) == 128) {
            int n2 = n & 0x7F;
            if (n2 == 0) {
                return BigInteger.ZERO;
            }
            byte[] byArray = new byte[n2];
            if (sprkqe.cfr_renamed_476(this, byArray) != byArray.length) {
                throw new EOFException(sprfjn.cfr_renamed_9("3\u001f'\u0013*\u0014f\u0005)Q \u0004*\u001d?Q4\u0014'\u0015f\u0018(\u0005#\u0016#\u0003f\u0012)\u001c6\u001e(\u0014(\u0005f\u001e Q#\u001f3\u001c#\u0003'\u0005/\u001e("));
            }
            return new BigInteger(1, byArray);
        }
        return BigInteger.valueOf(n);
    }

    public BigInteger cfr_renamed_8152() throws Exception {
        return this.cfr_renamed_8138(false, 4);
    }

    private /* synthetic */ byte[] cfr_renamed_8141(int arg0) {
        if (arg0 > this.cfr_renamed_3) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("q\u001fr\u000fj\bf\u001e#\u0018z\u000efZb\bq\u001bzZp\u0013y\u001f#")).append(arg0).append(sprfjn.cfr_renamed_9("Q1\u00105Q!\u0003#\u00102\u00144Q2\u0019'\u001ff")).append(this.cfr_renamed_3).toString());
        }
        return new byte[arg0];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprco cfr_renamed_8153(sprvlh sprvlh2) {
        void arg0;
        this.cfr_renamed_8104(arg0 + sprgtb.cfr_renamed_9(";a\tf\u0014w"));
        return sprenh.cfr_renamed_3;
    }

    public sprafh cfr_renamed_4934() throws IOException {
        boolean bl = false;
        int n = this.read();
        if (n == -1) {
            throw new EOFException(sprfjn.cfr_renamed_9("\u0014>\u0001#\u00122\u0018(\u0016f\u001d#\u001f!\u0005."));
        }
        if ((n & 0x80) == 0) {
            this.cfr_renamed_8104(sprgtb.cfr_renamed_9("6f\u0014#RP\u0012l\bwZe\u0015q\u0017*@#") + (n & 0x7F));
            return new sprafh(BigInteger.valueOf(n & 0x7F), true);
        }
        byte[] byArray = new byte[n & 0x7F];
        if (sprkqe.cfr_renamed_476(this, byArray) != byArray.length) {
            throw new EOFException(sprfjn.cfr_renamed_9("\"\u0018\"Q(\u001e2Q4\u0014'\u0015f\u0010*\u001df\u0013?\u0005#\u0002f\u001e Q*\u0014(\u00162\u0019f\u0015#\u0017/\u001f/\u0005/\u001e("));
        }
        this.cfr_renamed_8104(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("O\u001fmZ+6l\u0014dZE\u0015q\u0017*@#")).append(n & 0x7F).append(sprfjn.cfr_renamed_9("f\u0010%\u00053\u0010*Q*\u0014(Kf")).append(sprfqe.cfr_renamed_503(byArray)).toString());
        return new sprafh(sprhdf.cfr_renamed_515(byArray), false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public sprqqe cfr_renamed_8143(sprvlh arg0) throws IOException {
        switch (sprphh.cfr_renamed_4[arg0.cfr_renamed_8109().ordinal()]) lbl-1000:
        // 2 sources

        {
            case 1: {
                if (false) ** GOTO lbl-1000
                var2_2 = arg0.cfr_renamed_8154();
                return this.cfr_renamed_8143(new sprvlh(var2_2.cfr_renamed_1451(), arg0));
            }
            case 2: {
                throw new IllegalStateException(sprgtb.cfr_renamed_9(";#\tt\u0013w\u0019kZf\u0016f\u0017f\u0014wZp\u0012l\u000fo\u001e#\u0015m\u0016zZa\u001f#\u001cl\u000fm\u001e#\rj\u000ek\u0013mZbZp\u001fr\u000ff\u0014`\u001f-"));
            }
            case 3: {
                return this.cfr_renamed_8143(new sprvlh(arg0.cfr_renamed_8110().cfr_renamed_1451(), arg0));
            }
            case 4: {
                v0 = this;
                var3_3 = sprafh.cfr_renamed_8142(v0.cfr_renamed_4934());
                var4_13 = v0.cfr_renamed_8141(var3_3);
                if (sprkqe.cfr_renamed_476(v0, var4_13) != var4_13.length) {
                    throw new IOException(sprfjn.cfr_renamed_9("\u0012)\u0004*\u0015f\u001f)\u0005f\u0003#\u0010\"Q'\u001d*Q)\u0017f\u0012)\u0004(\u0005f\u001e Q5\u00147\\)\u0017f\u0007'\u001d3\u00145"));
                }
                var5_22 = sprhdf.cfr_renamed_515(var4_13).intValue();
                this.cfr_renamed_8104(arg0 + sprgtb.cfr_renamed_9("+\u0016f\u0014#G#") + var5_22 + ")");
                var6_27 = new sprrvm();
                if (arg0.cfr_renamed_8112().get(0).cfr_renamed_8115() != null) {
                    throw new IllegalStateException(sprfjn.cfr_renamed_9("#\u001d#\u001c#\u001f2Q\"\u0014 Q \u001e4Q/\u0005#\u001cf\u0018(Q\u00154\u0017Q\t7f\u0019'\u0002f\u0010f\u00021\u00182\u0012.]f\u00021\u00182\u0012.\u00145Q)\u001f*\bf\u00023\u00016\u001e4\u0005#\u0015f\u0018(Q5\u00147\u0004#\u001f%\u00145"));
                }
                v1 = var7_32 = 0;
                while (v1 < var5_22) {
                    var8_35 = sprvlh.cfr_renamed_8114(arg0.cfr_renamed_8112().get(0), arg0);
                    var6_27.cfr_renamed_5004(this.cfr_renamed_8143(var8_35));
                    v1 = ++var7_32;
                }
                return new sprcen(var6_27);
            }
            case 5: {
                var3_4 = new sprifh(this.in, arg0);
                this.cfr_renamed_8104(arg0 + var3_4.toString());
                var4_14 = new sprrvm();
                var5_23 = arg0.cfr_renamed_8112();
                var6_28 = 0;
                var7_33 = false;
                v2 = var6_28 = 0;
                while (v2 < var5_23.size()) {
                    var8_36 = var5_23.get(var6_28);
                    if (var8_36.cfr_renamed_8109() == sprvhh.cfr_renamed_1) ** GOTO lbl68
                    if (var8_36.cfr_renamed_8113() <= 0) ** GOTO lbl44
                    v3 = var3_4;
                    ** GOTO lbl71
lbl44:
                    // 1 sources

                    if ((var8_36 = sprvlh.cfr_renamed_8114(var8_36, arg0)).cfr_renamed_8115() == null) ** GOTO lbl51
                    v4 = var8_36.cfr_renamed_8115().cfr_renamed_8103(new sprvgh(var4_14));
                    var9_38 /* !! */  = (byte[])v4;
                    if (v4.cfr_renamed_8155() == arg0) ** GOTO lbl52
                    var9_38 /* !! */  = new sprvlh((sprvlh)var9_38 /* !! */ , arg0);
                    v5 = var3_4;
                    ** GOTO lbl53
lbl51:
                    // 1 sources

                    var9_38 /* !! */  = (byte[])var8_36;
lbl52:
                    // 2 sources

                    v5 = var3_4;
lbl53:
                    // 2 sources

                    if (sprifh.cfr_renamed_8156(v5) == null) {
                        var4_14.cfr_renamed_5004(this.cfr_renamed_8143((sprvlh)var9_38 /* !! */ ));
                    } else if (sprifh.cfr_renamed_8156(var3_4)[var6_28]) {
                        v6 = var4_14;
                        if (var9_38 /* !! */ .cfr_renamed_4567()) {
                            v6.cfr_renamed_5004(this.cfr_renamed_8143((sprvlh)var9_38 /* !! */ ));
                        } else {
                            v6.cfr_renamed_5004(sprenh.cfr_renamed_23(this.cfr_renamed_8143((sprvlh)var9_38 /* !! */ )));
                        }
                    } else {
                        v7 = var4_14;
                        if (var9_38 /* !! */ .cfr_renamed_8116() != null) {
                            v7.cfr_renamed_5004(var8_36.cfr_renamed_8116());
                        } else {
                            v7.cfr_renamed_5004(this.cfr_renamed_8153(var8_36));
                        }
                    }
lbl68:
                    // 6 sources

                    v2 = ++var6_28;
                }
                v3 = var3_4;
lbl71:
                // 2 sources

                if (sprifh.cfr_renamed_8157(v3)) {
                    v8 = this;
                    var8_37 = sprafh.cfr_renamed_8142(v8.cfr_renamed_4934());
                    var9_38 /* !! */  = v8.cfr_renamed_8141(var8_37);
                    if (sprkqe.cfr_renamed_476(v8.in, var9_38 /* !! */ ) != var9_38 /* !! */ .length) {
                        throw new IOException(sprgtb.cfr_renamed_9("g\u0013gZm\u0015wZe\u000fo\u0016zZq\u001fb\u001e#\nq\u001fp\u001fm\u0019fZo\u0013p\u000e-"));
                    }
                    var11_40 = var9_38 /* !! */ .length * 8 - var9_38 /* !! */ [0];
                    v9 = var6_28;
                    for (var10_39 = 8; v9 < var5_23.size() || var10_39 < var11_40; ++var10_39) {
                        v10 = var12_41 = var6_28 < var5_23.size() ? var5_23.get(var6_28) : null;
                        if (var12_41 == null) {
                            if ((var9_38 /* !! */ [var10_39 / 8] & sprnfh.cfr_renamed_4[var10_39 % 8]) != 0) {
                                var13_42 = sprafh.cfr_renamed_8142(this.cfr_renamed_4934());
                                while (--var13_42 >= 0) {
                                    this.in.read();
                                }
                            }
                        } else if (var10_39 < var11_40 && (var9_38 /* !! */ [var10_39 / 8] & sprnfh.cfr_renamed_4[var10_39 % 8]) != 0) {
                            var4_14.cfr_renamed_5004(this.cfr_renamed_8140(var12_41));
                        } else {
                            if (var12_41.cfr_renamed_4567()) {
                                throw new IOException(sprfjn.cfr_renamed_9("#\t2\u0014(\u0002/\u001e(Q/\u0002f\u001c'\u0003-\u0014\"Q'\u0002f\u0014>\u0001*\u0018%\u00182Q$\u00042Q/\u0002f\u001f)\u0005f\u0015#\u0017/\u001f#\u0015f\u0018(Q6\u0003#\u0002#\u001f%\u0014f\u001d/\u00022"));
                            }
                            var4_14.cfr_renamed_5004(sprenh.cfr_renamed_3);
                        }
                        v9 = ++var6_28;
                    }
                }
                return new sprcen(var4_14);
            }
            case 6: {
                v11 = this;
                var3_5 = v11.cfr_renamed_8145();
                v11.cfr_renamed_8104(new StringBuilder().insert(0, var3_5.toString()).append(" ").append(var3_5.cfr_renamed_4).toString());
                if (var3_5.cfr_renamed_8158()) {
                    var4_15 = sprvlh.cfr_renamed_8114(arg0.cfr_renamed_8112().get(var3_5.cfr_renamed_8159()), arg0);
                    if (var4_15.cfr_renamed_8113() > 0) {
                        this.cfr_renamed_8104(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("9k\u0015p\u001fmZ+?{\u000e*@#")).append(var4_15).toString());
                        return new sprycn(var3_5.cfr_renamed_4, this.cfr_renamed_8140(var4_15));
                    }
                    this.cfr_renamed_8104(new StringBuilder().insert(0, sprfjn.cfr_renamed_9("2.\u001e5\u0014(Kf")).append(var4_15).toString());
                    return new sprycn(var3_5.cfr_renamed_4, this.cfr_renamed_8143(var4_15));
                }
                if (var3_5.cfr_renamed_8160()) {
                    throw new IllegalStateException(sprgtb.cfr_renamed_9("/m\u0013n\no\u001fn\u001fm\u000ef\u001e#\u000eb\u001d#\u000ez\nf"));
                }
                if (var3_5.cfr_renamed_8161()) {
                    throw new IllegalStateException(sprfjn.cfr_renamed_9("$(\u0018+\u0001*\u0014+\u0014(\u0005#\u0015f\u0005'\u0016f\u0005?\u0001#"));
                }
                if (var3_5.cfr_renamed_8162()) {
                    throw new IllegalStateException(sprgtb.cfr_renamed_9("/m\u0013n\no\u001fn\u001fm\u000ef\u001e#\u000eb\u001d#\u000ez\nf"));
                }
                throw new IllegalStateException(sprfjn.cfr_renamed_9("$(\u0018+\u0001*\u0014+\u0014(\u0005#\u0015f\u0005'\u0016f\u0005?\u0001#"));
            }
            case 7: {
                v12 = this;
                var3_6 = v12.cfr_renamed_8151();
                v12.cfr_renamed_8104(arg0 + sprgtb.cfr_renamed_9("F4V7+") + var3_6 + sprfjn.cfr_renamed_9("XfLf") + arg0.cfr_renamed_8112().get(var3_6.intValue()).cfr_renamed_8132());
                return new sprqvg(var3_6);
            }
            case 8: {
                var5_24 = arg0.cfr_renamed_8128();
                if (var5_24 == 0) ** GOTO lbl135
                v13 = this;
                var3_7 = v13.cfr_renamed_8141(Math.abs(var5_24));
                sprkqe.cfr_renamed_476(v13, var3_7);
                if (var5_24 < 0) {
                    var4_16 = new BigInteger(var3_7);
                    v14 = this;
                } else {
                    var4_16 = sprhdf.cfr_renamed_515(var3_7);
                    v14 = this;
                }
                ** GOTO lbl154
lbl135:
                // 1 sources

                if (!arg0.cfr_renamed_8129()) ** GOTO lbl143
                v15 = this;
                var6_29 = v15.cfr_renamed_4934();
                var3_7 = v15.cfr_renamed_8141(sprafh.cfr_renamed_8142(var6_29));
                sprkqe.cfr_renamed_476(v15, var3_7);
                var4_16 = var3_7.length == 0 ? BigInteger.ZERO : new BigInteger(1, var3_7);
                ** GOTO lbl153
lbl143:
                // 1 sources

                v16 = this;
                var6_30 = v16.cfr_renamed_4934();
                var3_7 = v16.cfr_renamed_8141(sprafh.cfr_renamed_8142(var6_30));
                sprkqe.cfr_renamed_476(v16, var3_7);
                if (var3_7.length == 0) {
                    var4_16 = BigInteger.ZERO;
                    v14 = this;
                } else {
                    var4_16 = new BigInteger(var3_7);
lbl153:
                    // 2 sources

                    v14 = this;
                }
lbl154:
                // 4 sources

                if (v14.cfr_renamed_2 != null) {
                    this.cfr_renamed_8104(arg0 + sprgtb.cfr_renamed_9("J4W?D?QZa\u0003w\u001fO\u001fmG#") + var3_7.length + sprfjn.cfr_renamed_9("Q.\u0014>Lf") + var4_16.toString(16) + ")");
                }
                return new sprktm(var4_16);
            }
            case 9: {
                var4_17 = 0;
                if (arg0.cfr_renamed_8131() != null && arg0.cfr_renamed_8131().equals(arg0.cfr_renamed_8163())) {
                    v17 = this;
                    var4_17 = arg0.cfr_renamed_8131().intValue();
                } else {
                    v18 = this;
                    v17 = v18;
                    var4_17 = sprafh.cfr_renamed_8142(v18.cfr_renamed_4934());
                }
                var3_8 = v17.cfr_renamed_8141(var4_17);
                if (sprkqe.cfr_renamed_476(this, var3_8) != var4_17) {
                    throw new IOException(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("\u001ej\u001e#\u0014l\u000e#\bf\u001bgZb\u0016oZl\u001c#")).append(arg0.cfr_renamed_8132()).toString());
                }
                if (this.cfr_renamed_2 != null) {
                    var5_25 = Math.min(var3_8.length, 32);
                    this.cfr_renamed_8104(arg0 + sprfjn.cfr_renamed_9(">\u0005%\u0003%f\"\u0012#\u000f?\u0001Qn") + var3_8.length + sprgtb.cfr_renamed_9("S#G#") + sprfqe.cfr_renamed_501(var3_8, 0, var5_25) + " " + (var3_8.length > 32 ? sprfjn.cfr_renamed_9("h_h") : ""));
                }
                return new sprfvg(var3_8);
            }
            case 10: {
                v19 = this;
                if (arg0.cfr_renamed_8130()) {
                    var3_9 = v19.cfr_renamed_8141(arg0.cfr_renamed_8131().intValue());
                    v20 = this;
                } else {
                    var3_9 = v19.cfr_renamed_8141(sprafh.cfr_renamed_8142(this.cfr_renamed_4934()));
                    v20 = this;
                }
                if (sprkqe.cfr_renamed_476(v20, var3_9) != var3_9.length) {
                    throw new IOException(sprgtb.cfr_renamed_9("\u0019l\u000fo\u001e#\u0014l\u000e#\bf\u001bgZb\u0016oZl\u001c#3BO#\tw\bj\u0014d"));
                }
                var4_18 = sprkoe.cfr_renamed_184(var3_9);
                if (this.cfr_renamed_2 != null) {
                    this.cfr_renamed_8104(arg0.cfr_renamed_8118(new StringBuilder().insert(0, sprfjn.cfr_renamed_9("8\u0007Df\"2\u0003/\u001f!Qn")).append(var3_9.length).append(sprgtb.cfr_renamed_9("S#G#")).append(var4_18).toString()));
                }
                return new sprnrm(var4_18);
            }
            case 11: {
                v21 = this;
                var3_10 = v21.cfr_renamed_8141(sprafh.cfr_renamed_8142(v21.cfr_renamed_4934()));
                if (sprkqe.cfr_renamed_476(v21, var3_10) != var3_10.length) {
                    throw new IOException(sprfjn.cfr_renamed_9("\u0012)\u0004*\u0015f\u001f)\u0005f\u0003#\u0010\"Q'\u001d*Q)\u0017f\u00042\u0017fIf\u00022\u0003/\u001f!"));
                }
                var4_19 = sprkoe.cfr_renamed_427(var3_10);
                if (this.cfr_renamed_2 != null) {
                    this.cfr_renamed_8104(arg0 + sprgtb.cfr_renamed_9("V.EB#)w\bj\u0014dZ+") + var3_10.length + sprfjn.cfr_renamed_9("XfLf") + var4_19);
                }
                return new spraen(var4_19);
            }
            case 12: {
                if (arg0.cfr_renamed_8130()) {
                    var3_11 = new byte[arg0.cfr_renamed_8163().intValue() / 8];
                    v22 = this;
                } else {
                    v23 = this;
                    if (BigInteger.ZERO.compareTo(arg0.cfr_renamed_8131()) > 0) {
                        var3_11 = v23.cfr_renamed_8141(arg0.cfr_renamed_8131().intValue() / 8);
                        v22 = this;
                    } else {
                        var3_11 = v23.cfr_renamed_8141(sprafh.cfr_renamed_8142(this.cfr_renamed_4934()) / 8);
                        v22 = this;
                    }
                }
                sprkqe.cfr_renamed_476(v22, var3_11);
                if (this.cfr_renamed_2 != null) {
                    var4_20 = new StringBuffer();
                    var4_20.append(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("A3WZP.Q3M=+")).append(var3_11.length * 8).append(sprfjn.cfr_renamed_9("XfLf")).toString());
                    var5_26 = 0;
                    v24 = var5_26;
                    while (v24 != var3_11.length) {
                        var6_31 = var3_11[var5_26];
                        v25 = var7_34 = 0;
                        while (v25 < 8) {
                            var4_20.append((var6_31 & 128) > 0 ? "1" : "0");
                            var6_31 = (byte)(var6_31 << 1);
                            v25 = ++var7_34;
                        }
                        v24 = ++var5_26;
                    }
                    this.cfr_renamed_8104(arg0 + var4_20.toString());
                }
                return new sprdye(var3_11);
            }
            case 13: {
                this.cfr_renamed_8104(arg0 + sprgtb.cfr_renamed_9("4V6O"));
                return sprpen.cfr_renamed_4;
            }
            case 14: {
                v26 = this;
                var3_12 = v26.cfr_renamed_4934();
                var4_21 = new byte[sprafh.cfr_renamed_8142(var3_12)];
                if (sprkqe.cfr_renamed_476(v26, var4_21) != sprafh.cfr_renamed_8142(var3_12)) {
                    throw new IOException(sprfjn.cfr_renamed_9("\u0012)\u0004*\u0015f\u001f)\u0005f\u0003#\u0010\"Q'\u001d*Q)\u0017f\u0012)\u0004(\u0005f\u001e Q)\u0001#\u001ff\u0007'\u001d3\u0014f\u0018(Q%\u0019)\u0018%\u0014fYh_hXf"));
                }
                this.cfr_renamed_8104(new StringBuilder().insert(0, sprgtb.cfr_renamed_9("\u001f{\u000e#")).append(sprafh.cfr_renamed_8142(var3_12)).append(" ").append(sprfqe.cfr_renamed_503(var4_21)).toString());
                return new sprfvg(var4_21);
            }
            case 15: {
                if (this.read() == 0) {
                    return sprbxm.cfr_renamed_4;
                }
                return sprbxm.cfr_renamed_91;
            }
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprfjn.cfr_renamed_9("\u0013\u001f.\u0010(\u0015*\u0014\"Q2\b6\u0014f")).append((Object)arg0.cfr_renamed_8109()).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprnfh(InputStream inputStream) {
        void arg0;
        sprnfh sprnfh2 = this;
        super((InputStream)arg0);
        this.cfr_renamed_2 = null;
        sprnfh2.cfr_renamed_3 = 0x100000;
        sprnfh2.cfr_renamed_1 = null;
    }

    public BigInteger cfr_renamed_8164() throws Exception {
        return this.cfr_renamed_8138(false, 2);
    }

    public static /* synthetic */ int[] cfr_renamed_3555() {
        return cfr_renamed_0;
    }
}

