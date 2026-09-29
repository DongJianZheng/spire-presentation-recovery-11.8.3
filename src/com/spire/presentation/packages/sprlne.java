/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcq;
import com.spire.presentation.packages.sprewe;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqle;
import com.spire.presentation.packages.sprsmaa;
import com.spire.presentation.packages.sprtve;
import com.spire.presentation.packages.spryle;
import com.spire.presentation.packages.spryne;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprlne
extends SecureRandom {
    private static final boolean cfr_renamed_112;
    private static final boolean cfr_renamed_119;
    private static final boolean cfr_renamed_91;
    private static BigInteger cfr_renamed_0;
    private static BigInteger cfr_renamed_1;
    private static BigInteger cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public static /* synthetic */ byte[] cfr_renamed_5142(int arg0, byte[] arg1) {
        return sprlne.cfr_renamed_5143(arg0, arg1);
    }

    private static /* synthetic */ spryne[] cfr_renamed_5144(byte[][] arg0) {
        int n;
        spryne[] spryneArray = new spryne[arg0.length];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n;
            spryne spryne2 = new spryne(arg0[n]);
            spryneArray[n3] = spryne2;
            n2 = ++n;
        }
        return spryneArray;
    }

    public sprlne(byte[] arg0) {
        sprtve[] sprtveArray = new sprtve[1];
        sprtveArray[0] = new spryne(arg0);
        this(sprtveArray);
    }

    @Override
    public long nextLong() {
        long l = 0L;
        l = 0L | (long)this.cfr_renamed_3303() << 56;
        l |= (long)this.cfr_renamed_3303() << 48;
        l |= (long)this.cfr_renamed_3303() << 40;
        l |= (long)this.cfr_renamed_3303() << 32;
        l |= (long)this.cfr_renamed_3303() << 24;
        l |= (long)this.cfr_renamed_3303() << 16;
        l |= (long)this.cfr_renamed_3303() << 8;
        return l |= (long)this.cfr_renamed_3303();
    }

    public sprlne(sprtve[] arg0) {
        super(null, new sprqle());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (cfr_renamed_112) {
            if (cfr_renamed_91) {
                int n;
                int n2 = n = 0;
                while (n2 != arg0.length) {
                    try {
                        if (arg0[n] instanceof sprewe) {
                            int n3;
                            byte[] byArray = arg0[n].cfr_renamed_4;
                            int n4 = arg0[n].cfr_renamed_4.length - byArray.length % 4;
                            int n5 = n3 = byArray.length - n4 - 1;
                            while (n5 >= 0) {
                                byteArrayOutputStream.write(byArray[n3--]);
                                n5 = n3;
                            }
                            int n6 = n3 = byArray.length - n4;
                            while (n6 < byArray.length) {
                                int n7 = n3;
                                byteArrayOutputStream.write(byArray, n7, 4);
                                n6 = n3 += 4;
                            }
                        } else {
                            byteArrayOutputStream.write(arg0[n].cfr_renamed_4);
                        }
                    }
                    catch (IOException iOException) {
                        throw new IllegalArgumentException(sprbcq.cfr_renamed_9("3\u0016>P$W#\u0016&\u0012p\u00011\u001b%\u0012p\u0004?\u0002\"\u00145Y"));
                    }
                    n2 = ++n;
                }
            } else {
                int n;
                int n8 = n = 0;
                while (n8 != arg0.length) {
                    try {
                        byteArrayOutputStream.write(arg0[n].cfr_renamed_4);
                    }
                    catch (IOException iOException) {
                        throw new IllegalArgumentException(sprsmaa.cfr_renamed_9("(\u0012%T?S8\u0012=\u0016k\u0005*\u001f>\u0016k\u0000$\u00069\u0010.]"));
                    }
                    n8 = ++n;
                }
            }
        } else if (cfr_renamed_119) {
            int n;
            int n9 = n = 0;
            while (n9 != arg0.length) {
                try {
                    if (arg0[n] instanceof sprewe) {
                        int n10;
                        byte[] byArray = arg0[n].cfr_renamed_4;
                        int n11 = arg0[n].cfr_renamed_4.length - byArray.length % 4;
                        int n12 = n10 = 0;
                        while (n12 < n11) {
                            n10 += 4;
                            byteArrayOutputStream.write(byArray, byArray.length - n10, 4);
                            n12 = n10;
                        }
                        if (byArray.length - n11 != 0) {
                            int n13 = n10 = 0;
                            while (n13 != 4 - (byArray.length - n11)) {
                                byteArrayOutputStream.write(0);
                                n13 = ++n10;
                            }
                        }
                        int n14 = n10 = 0;
                        while (n14 != byArray.length - n11) {
                            int n15 = n11 + n10;
                            byteArrayOutputStream.write(byArray[n15]);
                            n14 = ++n10;
                        }
                    } else {
                        byteArrayOutputStream.write(arg0[n].cfr_renamed_4);
                    }
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException(sprbcq.cfr_renamed_9("3\u0016>P$W#\u0016&\u0012p\u00011\u001b%\u0012p\u0004?\u0002\"\u00145Y"));
                }
                n9 = ++n;
            }
        } else {
            throw new IllegalStateException(sprsmaa.cfr_renamed_9("\u001e\u001d9\u0016(\u001c,\u001d\"\t.\u0017k1\"\u0014\u0002\u001d?\u0016,\u00169S\"\u001e;\u001f.\u001e.\u001d?\u0012?\u001a$\u001d"));
        }
        this.cfr_renamed_4 = byteArrayOutputStream.toByteArray();
    }

    @Override
    public int nextInt() {
        int n = 0;
        n = 0 | this.cfr_renamed_3303() << 24;
        n |= this.cfr_renamed_3303() << 16;
        n |= this.cfr_renamed_3303() << 8;
        return n |= this.cfr_renamed_3303();
    }

    public sprlne(byte[][] arg0) {
        this(sprlne.cfr_renamed_5144(arg0));
    }

    private /* synthetic */ int cfr_renamed_3303() {
        return this.cfr_renamed_4[this.cfr_renamed_3++] & 0xFF;
    }

    public boolean cfr_renamed_3302() {
        sprlne sprlne2 = this;
        return sprlne2.cfr_renamed_3 == sprlne2.cfr_renamed_4.length;
    }

    static {
        BigInteger bigInteger;
        cfr_renamed_2 = new BigInteger(sprbcq.cfr_renamed_9("`F`E`D`C6\u00116\u00116\u00116\u0011`B`A`@`OaFaFaFaF"), 16);
        cfr_renamed_0 = new BigInteger(sprsmaa.cfr_renamed_9("zBzBzBzB{F{E{D{K-\u0015-\u0015-\u0015-\u0015{B{A{@{G"), 16);
        cfr_renamed_1 = new BigInteger(sprbcq.cfr_renamed_9("D`E`F`C6\u00116\u00116\u00116\u0011`B`A`@`OaFaFaF"), 16);
        BigInteger bigInteger2 = bigInteger = new BigInteger(128, new spryle());
        cfr_renamed_119 = bigInteger2.equals(cfr_renamed_0);
        cfr_renamed_112 = bigInteger2.equals(cfr_renamed_2);
        cfr_renamed_91 = new BigInteger(120, new spryle()).equals(cfr_renamed_1);
    }

    @Override
    public void nextBytes(byte[] arg0) {
        sprlne sprlne2 = this;
        System.arraycopy(sprlne2.cfr_renamed_4, sprlne2.cfr_renamed_3, arg0, 0, arg0.length);
        this.cfr_renamed_3 += arg0.length;
    }

    private static /* synthetic */ byte[] cfr_renamed_5143(int arg0, byte[] arg1) {
        if ((arg0 + 7) / 8 > arg1.length) {
            byte[] byArray = new byte[(arg0 + 7) / 8];
            System.arraycopy(arg1, 0, byArray, byArray.length - arg1.length, arg1.length);
            if (cfr_renamed_119 && arg0 % 8 != 0) {
                sprpxe.cfr_renamed_442(sprpxe.cfr_renamed_446(byArray, 0) << 8 - arg0 % 8, byArray, 0);
            }
            return byArray;
        }
        if (cfr_renamed_119 && arg0 < arg1.length * 8 && arg0 % 8 != 0) {
            int n = sprpxe.cfr_renamed_446(arg1, 0);
            sprpxe.cfr_renamed_442(n << 8 - arg0 % 8, arg1, 0);
        }
        return arg1;
    }

    @Override
    public byte[] generateSeed(int arg0) {
        byte[] byArray = new byte[arg0];
        this.nextBytes(byArray);
        return byArray;
    }
}

