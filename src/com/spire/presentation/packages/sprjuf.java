/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprffg;
import com.spire.presentation.packages.sprfwe;
import com.spire.presentation.packages.sprhfg;
import com.spire.presentation.packages.sprlag;
import com.spire.presentation.packages.sprrdg;
import com.spire.presentation.packages.sprtag;
import com.spire.presentation.packages.sprtlo;

public class sprjuf {
    private short[] cfr_renamed_91;
    private int cfr_renamed_0;
    private sprlag cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private sprhfg cfr_renamed_4;

    public void cfr_renamed_6991() {
        sprjuf sprjuf2 = this;
        sprjuf2.cfr_renamed_6996(sprtag.cfr_renamed_6997(sprjuf2.cfr_renamed_790()));
        sprjuf2.cfr_renamed_6985();
    }

    public void cfr_renamed_6995() {
        sprjuf sprjuf2 = this;
        sprjuf2.cfr_renamed_6996(sprtag.cfr_renamed_6998(sprjuf2.cfr_renamed_790()));
    }

    public void cfr_renamed_6980(sprjuf arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            sprjuf sprjuf2 = this;
            sprjuf2.cfr_renamed_6987(++n, (short)(sprjuf2.cfr_renamed_6983(n) + arg0.cfr_renamed_6983(n)));
            n2 = n;
        }
    }

    public short[] cfr_renamed_790() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_6999(sprjuf arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n;
            sprjuf sprjuf2 = this;
            short s = sprjuf2.cfr_renamed_6983(n);
            sprjuf2.cfr_renamed_6987(n3, (short)(arg0.cfr_renamed_6983(n3) - s));
            n2 = ++n;
        }
    }

    public void cfr_renamed_7000(byte[] arg0, byte arg1) {
        byte[] byArray = new byte[256 * this.cfr_renamed_2 / 4];
        sprjuf sprjuf2 = this;
        sprjuf2.cfr_renamed_1.cfr_renamed_6681(byArray, arg0, arg1);
        sprffg.cfr_renamed_7001(sprjuf2, byArray, sprjuf2.cfr_renamed_2);
    }

    public void cfr_renamed_7002(byte[] arg0) {
        int n = 0;
        if (this.cfr_renamed_4.cfr_renamed_7003() == 128) {
            int n2;
            int n3 = n2 = 0;
            while (n3 < 128) {
                sprjuf sprjuf2 = this;
                sprjuf2.cfr_renamed_6987(2 * n2 + 0, (short)((short)(arg0[n] & 0xFF & 0xF) * 3329 + 8 >> 4));
                int n4 = (short)((arg0[n] & 0xFF) >> 4) * 3329 + 8;
                ++n;
                sprjuf2.cfr_renamed_6987(2 * n2 + 1, (short)(n4 >> 4));
                n3 = ++n2;
            }
        } else if (this.cfr_renamed_4.cfr_renamed_7003() == 160) {
            int n5;
            byte[] byArray = new byte[8];
            int n6 = n5 = 0;
            while (n6 < 32) {
                int n7;
                byArray[0] = (byte)((arg0[n + 0] & 0xFF) >> 0);
                byArray[1] = (byte)((arg0[n + 0] & 0xFF) >> 5 | (arg0[n + 1] & 0xFF) << 3);
                byArray[2] = (byte)((arg0[n + 1] & 0xFF) >> 2);
                byArray[3] = (byte)((arg0[n + 1] & 0xFF) >> 7 | (arg0[n + 2] & 0xFF) << 1);
                byArray[4] = (byte)((arg0[n + 2] & 0xFF) >> 4 | (arg0[n + 3] & 0xFF) << 4);
                byArray[5] = (byte)((arg0[n + 3] & 0xFF) >> 1);
                byArray[6] = (byte)((arg0[n + 3] & 0xFF) >> 6 | (arg0[n + 4] & 0xFF) << 2);
                byte by = (byte)((arg0[n + 4] & 0xFF) >> 3);
                n += 5;
                byArray[7] = by;
                int n8 = n7 = 0;
                while (n8 < 8) {
                    int n9 = 8 * n5 + n7;
                    int n10 = (byArray[n7] & 0x1F) * 3329 + 16;
                    this.cfr_renamed_6987(n9, (short)(n10 >> 5));
                    n8 = ++n7;
                }
                n6 = ++n5;
            }
        } else {
            throw new RuntimeException(sprfwe.cfr_renamed_9("{aGwhaF~YkX}Njiw_kX.B}\u000b`Ng_fN|\u000b?\u00196\u000baY.\u001a8\u001b/"));
        }
    }

    public byte[] cfr_renamed_7004() {
        int n;
        byte[] byArray = new byte[sprhfg.cfr_renamed_7005()];
        this.cfr_renamed_6976();
        int n2 = n = 0;
        while (n2 < 32) {
            int n3;
            byArray[n] = 0;
            int n4 = n3 = 0;
            while (n4 < 8) {
                short s = (short)(((short)(this.cfr_renamed_6983(8 * n + n3) << 1) + 1664) / 3329 & 1);
                int n5 = n;
                byte by = (byte)(byArray[n5] | (byte)(s << n3));
                byArray[n5] = by;
                n4 = ++n3;
            }
            n2 = ++n;
        }
        return byArray;
    }

    public void cfr_renamed_6976() {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            sprjuf sprjuf2 = this;
            sprjuf2.cfr_renamed_6987(n, sprrdg.cfr_renamed_6973(sprjuf2.cfr_renamed_6983(n++)));
            n2 = n;
        }
    }

    public void cfr_renamed_6987(int arg0, short arg1) {
        this.cfr_renamed_91[arg0] = arg1;
    }

    public short cfr_renamed_6983(int arg0) {
        return this.cfr_renamed_91[arg0];
    }

    public void cfr_renamed_6985() {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            sprjuf sprjuf2 = this;
            sprjuf2.cfr_renamed_6987(n, sprrdg.cfr_renamed_6974(sprjuf2.cfr_renamed_6983(n++)));
            n2 = n;
        }
    }

    public void cfr_renamed_6993(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < 128) {
            sprjuf sprjuf2 = this;
            sprjuf2.cfr_renamed_6987(2 * n, (short)(((arg0[3 * n + 0] & 0xFF) >> 0 | (arg0[3 * n + 1] & 0xFF) << 8) & 0xFFF));
            int n3 = 2 * n + 1;
            long l = ((long)((arg0[3 * n + 1] & 0xFF) >> 4) | (long)((arg0[3 * n + 2] & 0xFF) << 4)) & 0xFFFL;
            sprjuf2.cfr_renamed_6987(n3, (short)l);
            n2 = ++n;
        }
    }

    public void cfr_renamed_7006(byte[] arg0) {
        int n;
        if (arg0.length != 32) {
            throw new RuntimeException(sprtlo.cfr_renamed_9(":\u001f3\u0003#\u00198\b5\u0005!\u0007.\u000b\"\u00013\u001f%\u0003\"f\u001c3\u00022Q$\u0014f\u00147\u0004'\u001df\u0005)Q\r(\u00044\u0014.\b^~Q$\b2\u00145P"));
        }
        int n2 = n = 0;
        while (n2 < 32) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 8) {
                short s = (short)(-1 * (short)((arg0[n] & 0xFF) >> n3 & 1));
                int n5 = 8 * n + n3;
                this.cfr_renamed_6987(n5, (short)(s & 0x681));
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    public void cfr_renamed_6996(short[] arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_7007(byte[] arg0, byte arg1) {
        byte[] byArray = new byte[256 * this.cfr_renamed_3 / 4];
        sprjuf sprjuf2 = this;
        sprjuf2.cfr_renamed_1.cfr_renamed_6681(byArray, arg0, arg1);
        sprffg.cfr_renamed_7001(sprjuf2, byArray, sprjuf2.cfr_renamed_3);
    }

    public static void cfr_renamed_6989(sprjuf arg0, sprjuf arg1, sprjuf arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < 64) {
            sprjuf sprjuf2 = arg0;
            sprtag.cfr_renamed_7008(sprjuf2, 4 * n, arg1.cfr_renamed_6983(4 * n), arg1.cfr_renamed_6983(4 * n + 1), arg2.cfr_renamed_6983(4 * n), arg2.cfr_renamed_6983(4 * n + 1), sprtag.cfr_renamed_3[64 + n]);
            int n3 = 4 * n + 2;
            short s = arg1.cfr_renamed_6983(4 * n + 2);
            short s2 = arg1.cfr_renamed_6983(4 * n + 3);
            short s3 = arg2.cfr_renamed_6983(4 * n + 2);
            short s4 = arg2.cfr_renamed_6983(4 * n + 3);
            short s5 = sprtag.cfr_renamed_3[64 + n];
            sprtag.cfr_renamed_7008(sprjuf2, n3, s, s2, s3, s4, (short)(-1 * s5));
            n2 = ++n;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        int n = 0;
        int n2 = n;
        while (n2 < this.cfr_renamed_91.length) {
            int n3 = n;
            stringBuffer.append(this.cfr_renamed_91[n3]);
            if (n3 != this.cfr_renamed_91.length - 1) {
                stringBuffer.append(sprfwe.cfr_renamed_9("\u0007."));
            }
            n2 = ++n;
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        return stringBuffer2.toString();
    }

    public byte[] cfr_renamed_6992() {
        int n;
        byte[] byArray = new byte[384];
        this.cfr_renamed_6976();
        int n2 = n = 0;
        while (n2 < 128) {
            sprjuf sprjuf2 = this;
            short s = sprjuf2.cfr_renamed_6983(2 * n);
            short s2 = sprjuf2.cfr_renamed_6983(2 * n + 1);
            byArray[3 * n] = (byte)(s >> 0);
            byArray[3 * n + 1] = (byte)(s >> 8 | s2 << 4);
            int n3 = 3 * n + 2;
            byArray[n3] = (byte)(s2 >> 4);
            n2 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprjuf(sprhfg sprhfg2) {
        void arg0;
        sprjuf sprjuf2 = this;
        void v1 = arg0;
        sprjuf sprjuf3 = this;
        sprjuf3.cfr_renamed_91 = new short[256];
        sprjuf3.cfr_renamed_4 = arg0;
        this.cfr_renamed_0 = v1.cfr_renamed_7003();
        sprjuf2.cfr_renamed_2 = v1.cfr_renamed_7009();
        sprjuf2.cfr_renamed_3 = sprhfg.cfr_renamed_7010();
        sprjuf2.cfr_renamed_1 = sprhfg2.cfr_renamed_7011();
    }

    public byte[] cfr_renamed_7012() {
        byte[] byArray = new byte[8];
        sprjuf sprjuf2 = this;
        byte[] byArray2 = new byte[sprjuf2.cfr_renamed_0];
        int n = 0;
        sprjuf2.cfr_renamed_6976();
        if (sprjuf2.cfr_renamed_0 == 128) {
            int n2;
            int n3 = n2 = 0;
            while (n3 < 32) {
                int n4;
                int n5 = n4 = 0;
                while (n5 < 8) {
                    int n6 = n4++;
                    byArray[n6] = (byte)(((this.cfr_renamed_6983(8 * n2 + n6) << 4) + 1664) / 3329 & 0xF);
                    n5 = n4;
                }
                int n7 = n;
                byArray2[n + 0] = (byte)(byArray[0] | byArray[1] << 4);
                byArray2[n + 1] = (byte)(byArray[2] | byArray[3] << 4);
                byArray2[n7 + 2] = (byte)(byArray[4] | byArray[5] << 4);
                n += 4;
                byArray2[n7 + 3] = (byte)(byArray[6] | byArray[7] << 4);
                n3 = ++n2;
            }
        } else if (this.cfr_renamed_0 == 160) {
            int n8;
            int n9 = n8 = 0;
            while (n9 < 32) {
                int n10;
                int n11 = n10 = 0;
                while (n11 < 8) {
                    int n12 = n10++;
                    byArray[n12] = (byte)(((this.cfr_renamed_6983(8 * n8 + n12) << 5) + 1664) / 3329 & 0x1F);
                    n11 = n10;
                }
                int n13 = n;
                int n14 = n;
                byArray2[n14 + 0] = (byte)(byArray[0] >> 0 | byArray[1] << 5);
                byArray2[n14 + 1] = (byte)(byArray[1] >> 3 | byArray[2] << 2 | byArray[3] << 7);
                byArray2[n + 2] = (byte)(byArray[3] >> 1 | byArray[4] << 4);
                byArray2[n13 + 3] = (byte)(byArray[4] >> 4 | byArray[5] << 1 | byArray[6] << 6);
                n += 5;
                byArray2[n13 + 4] = (byte)(byArray[6] >> 2 | byArray[7] << 3);
                n9 = ++n8;
            }
        } else {
            throw new RuntimeException(sprtlo.cfr_renamed_9("\u0016\u001e*\b\u0005\u001e+\u00014\u00145\u0002#\u0015\u0004\b2\u00145Q/\u0002f\u001f#\u00182\u0019#\u0003f@tIf\u001e4QwGvP"));
        }
        return byArray2;
    }

    public void cfr_renamed_7013() {
        int n;
        int n2 = n = 0;
        while (n2 < 256) {
            sprjuf sprjuf2 = this;
            sprjuf2.cfr_renamed_6987(++n, sprrdg.cfr_renamed_6972(sprjuf2.cfr_renamed_6983(n) * 1353));
            n2 = n;
        }
    }
}

