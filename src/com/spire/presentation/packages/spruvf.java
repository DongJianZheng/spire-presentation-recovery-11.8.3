/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfg;
import com.spire.presentation.packages.sprjuf;
import com.spire.presentation.packages.sprljn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprseo;

public class spruvf {
    public sprjuf[] cfr_renamed_1;
    private sprhfg cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprjuf cfr_renamed_6975(int arg0) {
        return this.cfr_renamed_1[arg0];
    }

    public void cfr_renamed_6976() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_6975(n++).cfr_renamed_6976();
            n2 = n;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_4) {
            int n3 = n;
            stringBuffer.append(this.cfr_renamed_1[n3].toString());
            if (n3 != this.cfr_renamed_4 - 1) {
                stringBuffer.append(sprseo.cfr_renamed_9("~u"));
            }
            n2 = ++n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    public spruvf(sprhfg arg0) {
        int n;
        spruvf spruvf2 = this;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_4 = this.cfr_renamed_2.cfr_renamed_6977();
        spruvf2.cfr_renamed_3 = arg0.cfr_renamed_6978();
        spruvf2.cfr_renamed_1 = new sprjuf[this.cfr_renamed_4];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_1[n++] = new sprjuf(arg0);
            n2 = n;
        }
    }

    public void cfr_renamed_6979(spruvf arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_6975(n).cfr_renamed_6980(arg0.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public byte[] cfr_renamed_6981() {
        spruvf spruvf2 = this;
        spruvf2.cfr_renamed_6976();
        byte[] byArray = new byte[spruvf2.cfr_renamed_2.cfr_renamed_6982()];
        int n = 0;
        if (spruvf2.cfr_renamed_2.cfr_renamed_6982() == this.cfr_renamed_4 * 320) {
            int n2;
            short[] sArray = new short[4];
            int n3 = n2 = 0;
            while (n3 < this.cfr_renamed_4) {
                int n4;
                int n5 = n4 = 0;
                while (n5 < 64) {
                    int n6;
                    int n7 = n6 = 0;
                    while (n7 < 4) {
                        int n8 = n6++;
                        sArray[n8] = (short)(((this.cfr_renamed_6975(n2).cfr_renamed_6983(4 * n4 + n8) << 10) + 1664) / 3329 & 0x3FF);
                        n7 = n6;
                    }
                    int n9 = n;
                    int n10 = n;
                    byArray[n10 + 0] = (byte)(sArray[0] >> 0);
                    byArray[n10 + 1] = (byte)(sArray[0] >> 8 | sArray[1] << 2);
                    byArray[n + 2] = (byte)(sArray[1] >> 6 | sArray[2] << 4);
                    byArray[n9 + 3] = (byte)(sArray[2] >> 4 | sArray[3] << 6);
                    n += 5;
                    byArray[n9 + 4] = (byte)(sArray[3] >> 2);
                    n5 = ++n4;
                }
                n3 = ++n2;
            }
        } else if (this.cfr_renamed_2.cfr_renamed_6982() == this.cfr_renamed_4 * 352) {
            int n11;
            short[] sArray = new short[8];
            int n12 = n11 = 0;
            while (n12 < this.cfr_renamed_4) {
                int n13;
                int n14 = n13 = 0;
                while (n14 < 32) {
                    int n15;
                    int n16 = n15 = 0;
                    while (n16 < 8) {
                        int n17 = n15++;
                        sArray[n17] = (short)(((this.cfr_renamed_6975(n11).cfr_renamed_6983(8 * n13 + n17) << 11) + 1664) / 3329 & 0x7FF);
                        n16 = n15;
                    }
                    int n18 = n;
                    int n19 = n;
                    int n20 = n;
                    int n21 = n;
                    byArray[n21 + 0] = (byte)(sArray[0] >> 0);
                    byArray[n21 + 1] = (byte)(sArray[0] >> 8 | sArray[1] << 3);
                    byArray[n + 2] = (byte)(sArray[1] >> 5 | sArray[2] << 6);
                    byArray[n20 + 3] = (byte)(sArray[2] >> 2);
                    byArray[n20 + 4] = (byte)(sArray[2] >> 10 | sArray[3] << 1);
                    byArray[n + 5] = (byte)(sArray[3] >> 7 | sArray[4] << 4);
                    byArray[n19 + 6] = (byte)(sArray[4] >> 4 | sArray[5] << 7);
                    byArray[n19 + 7] = (byte)(sArray[5] >> 1);
                    byArray[n + 8] = (byte)(sArray[5] >> 9 | sArray[6] << 2);
                    byArray[n18 + 9] = (byte)(sArray[6] >> 6 | sArray[7] << 5);
                    n += 11;
                    byArray[n18 + 10] = (byte)(sArray[7] >> 3);
                    n14 = ++n13;
                }
                n12 = ++n11;
            }
        } else {
            throw new RuntimeException(sprljn.cfr_renamed_9("{\tR\u0015BP`\u001f\\\tf\u0015S3_\u001d@\u0002U\u0003C\u0015T2I\u0004U\u0003\u0010\u001eU\u0019D\u0018U\u0002\u0010C\u0002@\u0010Z\u0010;I\u0012U\u0002{P_\u0002\u0010C\u0005B\u0010Z\u0010;I\u0012U\u0002{Q"));
        }
        return byArray;
    }

    public void cfr_renamed_6984() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_6975(n++).cfr_renamed_6985();
            n2 = n;
        }
    }

    public void cfr_renamed_6986(byte[] arg0) {
        int n = 0;
        if (this.cfr_renamed_2.cfr_renamed_6982() == this.cfr_renamed_4 * 320) {
            int n2;
            short[] sArray = new short[4];
            int n3 = n2 = 0;
            while (n3 < this.cfr_renamed_4) {
                int n4;
                int n5 = n4 = 0;
                while (n5 < 64) {
                    int n6;
                    sArray[0] = (short)((arg0[n] & 0xFF) >> 0 | (short)((arg0[n + 1] & 0xFF) << 8));
                    sArray[1] = (short)((arg0[n + 1] & 0xFF) >> 2 | (short)((arg0[n + 2] & 0xFF) << 6));
                    sArray[2] = (short)((arg0[n + 2] & 0xFF) >> 4 | (short)((arg0[n + 3] & 0xFF) << 4));
                    short s = (short)((arg0[n + 3] & 0xFF) >> 6 | (short)((arg0[n + 4] & 0xFF) << 2));
                    n += 5;
                    sArray[3] = s;
                    int n7 = n6 = 0;
                    while (n7 < 4) {
                        int n8 = 4 * n4 + n6;
                        int n9 = (sArray[n6] & 0x3FF) * 3329 + 512;
                        this.cfr_renamed_1[n2].cfr_renamed_6987(n8, (short)(n9 >> 10));
                        n7 = ++n6;
                    }
                    n5 = ++n4;
                }
                n3 = ++n2;
            }
        } else if (this.cfr_renamed_2.cfr_renamed_6982() == this.cfr_renamed_4 * 352) {
            int n10;
            short[] sArray = new short[8];
            int n11 = n10 = 0;
            while (n11 < this.cfr_renamed_4) {
                int n12;
                int n13 = n12 = 0;
                while (n13 < 32) {
                    int n14;
                    sArray[0] = (short)((arg0[n] & 0xFF) >> 0 | (short)(arg0[n + 1] & 0xFF) << 8);
                    sArray[1] = (short)((arg0[n + 1] & 0xFF) >> 3 | (short)(arg0[n + 2] & 0xFF) << 5);
                    sArray[2] = (short)((arg0[n + 2] & 0xFF) >> 6 | (short)(arg0[n + 3] & 0xFF) << 2 | (short)((arg0[n + 4] & 0xFF) << 10));
                    sArray[3] = (short)((arg0[n + 4] & 0xFF) >> 1 | (short)(arg0[n + 5] & 0xFF) << 7);
                    sArray[4] = (short)((arg0[n + 5] & 0xFF) >> 4 | (short)(arg0[n + 6] & 0xFF) << 4);
                    sArray[5] = (short)((arg0[n + 6] & 0xFF) >> 7 | (short)(arg0[n + 7] & 0xFF) << 1 | (short)((arg0[n + 8] & 0xFF) << 9));
                    sArray[6] = (short)((arg0[n + 8] & 0xFF) >> 2 | (short)(arg0[n + 9] & 0xFF) << 6);
                    short s = (short)((arg0[n + 9] & 0xFF) >> 5 | (short)(arg0[n + 10] & 0xFF) << 3);
                    n += 11;
                    sArray[7] = s;
                    int n15 = n14 = 0;
                    while (n15 < 8) {
                        int n16 = 8 * n12 + n14;
                        int n17 = (sArray[n14] & 0x7FF) * 3329 + 1024;
                        this.cfr_renamed_1[n10].cfr_renamed_6987(n16, (short)(n17 >> 11));
                        n15 = ++n14;
                    }
                    n13 = ++n12;
                }
                n11 = ++n10;
            }
        } else {
            throw new RuntimeException(sprseo.cfr_renamed_9("\u0019,00 u\u0002:>,\u000401\u0016=8\"'7&!06\u0017+!7&r;7<&=7'rf`er\u007fr\u001e+77'\u0019u='rfggr\u007fr\u001e+77'\u0019t"));
        }
    }

    public static void cfr_renamed_6988(sprjuf arg0, spruvf arg1, spruvf arg2, sprhfg arg3) {
        int n;
        sprjuf sprjuf2 = new sprjuf(arg3);
        sprjuf.cfr_renamed_6989(arg0, arg1.cfr_renamed_6975(0), arg2.cfr_renamed_6975(0));
        int n2 = n = 1;
        while (n2 < arg3.cfr_renamed_6977()) {
            sprjuf sprjuf3 = sprjuf2;
            sprjuf.cfr_renamed_6989(sprjuf3, arg1.cfr_renamed_6975(n), arg2.cfr_renamed_6975(n++));
            arg0.cfr_renamed_6980(sprjuf3);
            n2 = n;
        }
        arg0.cfr_renamed_6985();
    }

    public void cfr_renamed_6990() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_6975(n++).cfr_renamed_6991();
            n2 = n;
        }
    }

    public byte[] cfr_renamed_6992() {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            System.arraycopy(this.cfr_renamed_1[n].cfr_renamed_6992(), 0, byArray, n++ * 384, 384);
            n2 = n;
        }
        return byArray;
    }

    public void cfr_renamed_6993(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_6975(n).cfr_renamed_6993(sproze.cfr_renamed_533(arg0, n * 384, ++n * 384));
            n2 = n;
        }
    }

    public void cfr_renamed_6994() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_6975(n++).cfr_renamed_6995();
            n2 = n;
        }
    }

    public spruvf() throws Exception {
        throw new Exception(sprljn.cfr_renamed_9("b\u0015A\u0005Y\u0002U\u0003\u0010 Q\u0002Q\u001dU\u0004U\u0002"));
    }
}

