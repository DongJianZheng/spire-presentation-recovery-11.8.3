/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprsxy;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruuc;

public class sprgkd
implements sprqk {
    private byte[] cfr_renamed_112;
    private boolean cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private int cfr_renamed_2;
    private int[] cfr_renamed_3;
    private int cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    private /* synthetic */ byte cfr_renamed_3662() {
        int n;
        if (this.cfr_renamed_2 == 0) {
            sprgkd sprgkd2 = this;
            n = sprgkd2.cfr_renamed_3663();
            sprgkd2.cfr_renamed_112[0] = (byte)(n & 0xFF);
            sprgkd2.cfr_renamed_112[1] = (byte)((n >>= 8) & 0xFF);
            sprgkd2.cfr_renamed_112[2] = (byte)((n >>= 8) & 0xFF);
            sprgkd2.cfr_renamed_112[3] = (byte)((n >>= 8) & 0xFF);
        }
        sprgkd sprgkd3 = this;
        n = this.cfr_renamed_112[sprgkd3.cfr_renamed_2];
        this.cfr_renamed_2 = sprgkd3.cfr_renamed_2 + 1 & 3;
        return (byte)n;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd {
        int n;
        if (!this.cfr_renamed_119) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprsxy.cfr_renamed_9("\nQEK\nVDV^VKSCLO[")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(spruuc.cfr_renamed_9("\u0018\u0007\u0001\u001c\u0005I\u0013\u001c\u0017\u000f\u0014\u001bQ\u001d\u001e\u0006Q\u001a\u0019\u0006\u0003\u001d"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprsxy.cfr_renamed_9("P_KZJ^\u001fHJLYOM\nKEP\nLBPXK"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg4 + n;
            byte by = (byte)(arg0[arg1 + n] ^ this.cfr_renamed_3662());
            arg3[n3] = by;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return spruuc.cfr_renamed_9("9*\\[D_");
    }

    private /* synthetic */ void cfr_renamed_1314() {
        int n;
        Object[] objectArray;
        if (this.cfr_renamed_0.length != 32 && this.cfr_renamed_0.length != 16) {
            throw new IllegalArgumentException(sprsxy.cfr_renamed_9("kBZ\nTOF\nR_L^\u001fHZ\n\u000e\u0018\u0007\u0005\r\u001f\t\n]CKY\u001fFPDX"));
        }
        if (this.cfr_renamed_91.length < 16) {
            throw new IllegalArgumentException(spruuc.cfr_renamed_9("=\u0019\fQ 'I\u001c\u001c\u0002\u001dQ\u000b\u0014I\u0010\u001dQ\u0005\u0014\b\u0002\u001dQXCQQ\u000b\u0018\u001d\u0002I\u001d\u0006\u001f\u000e"));
        }
        if (this.cfr_renamed_0.length != 32) {
            objectArray = new byte[32];
            System.arraycopy(this.cfr_renamed_0, 0, objectArray, 0, this.cfr_renamed_0.length);
            System.arraycopy(this.cfr_renamed_0, 0, objectArray, 16, this.cfr_renamed_0.length);
            this.cfr_renamed_0 = objectArray;
        }
        if (this.cfr_renamed_91.length < 32) {
            objectArray = new byte[32];
            System.arraycopy(this.cfr_renamed_91, 0, objectArray, 0, this.cfr_renamed_91.length);
            System.arraycopy(this.cfr_renamed_91, 0, objectArray, this.cfr_renamed_91.length, objectArray.length - this.cfr_renamed_91.length);
            this.cfr_renamed_91 = objectArray;
        }
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_4 = 0;
        objectArray = new int[2560];
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = n >> 2;
            int n4 = objectArray[n3] | (this.cfr_renamed_0[n] & 0xFF) << 8 * (n & 3);
            objectArray[n3] = n4;
            n2 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 32) {
            int n6 = (n >> 2) + 8;
            int n7 = objectArray[n6] | (this.cfr_renamed_91[n] & 0xFF) << 8 * (n & 3);
            objectArray[n6] = n7;
            n5 = ++n;
        }
        int n8 = n = 16;
        while (n8 < 2560) {
            byte by = objectArray[n - 2];
            byte by2 = objectArray[n - 15];
            objectArray[++n] = (sprgkd.cfr_renamed_493(by, 17) ^ sprgkd.cfr_renamed_493(by, 19) ^ by >>> 10) + objectArray[n - 7] + (sprgkd.cfr_renamed_493(by2, 7) ^ sprgkd.cfr_renamed_493(by2, 18) ^ by2 >>> 3) + objectArray[n - 16] + n;
            n8 = n;
        }
        System.arraycopy(objectArray, 512, this.cfr_renamed_3, 0, 1024);
        System.arraycopy(objectArray, 1536, this.cfr_renamed_1, 0, 1024);
        int n9 = n = 0;
        while (n9 < 4096) {
            this.cfr_renamed_3663();
            n9 = ++n;
        }
        this.cfr_renamed_4 = 0;
    }

    private /* synthetic */ int cfr_renamed_3663() {
        int n;
        sprgkd sprgkd2;
        sprgkd sprgkd3 = this;
        int n2 = sprgkd3.cfr_renamed_4 & 0x3FF;
        if (sprgkd3.cfr_renamed_4 < 1024) {
            sprgkd sprgkd4 = this;
            sprgkd2 = sprgkd4;
            int n3 = sprgkd4.cfr_renamed_3[n2 - 3 & 0x3FF];
            int n4 = sprgkd4.cfr_renamed_3[n2 - 1023 & 0x3FF];
            int n5 = n2;
            sprgkd4.cfr_renamed_3[n5] = sprgkd4.cfr_renamed_3[n5] + (this.cfr_renamed_3[n2 - 10 & 0x3FF] + (sprgkd.cfr_renamed_493(n3, 10) ^ sprgkd.cfr_renamed_493(n4, 23)) + this.cfr_renamed_1[(n3 ^ n4) & 0x3FF]);
            n3 = sprgkd4.cfr_renamed_3[n2 - 12 & 0x3FF];
            n = sprgkd4.cfr_renamed_1[n3 & 0xFF] + this.cfr_renamed_1[(n3 >> 8 & 0xFF) + 256] + this.cfr_renamed_1[(n3 >> 16 & 0xFF) + 512] + this.cfr_renamed_1[(n3 >> 24 & 0xFF) + 768] ^ this.cfr_renamed_3[n2];
        } else {
            sprgkd sprgkd5 = this;
            sprgkd2 = sprgkd5;
            int n6 = sprgkd5.cfr_renamed_1[n2 - 3 & 0x3FF];
            int n7 = sprgkd5.cfr_renamed_1[n2 - 1023 & 0x3FF];
            int n8 = n2;
            sprgkd5.cfr_renamed_1[n8] = sprgkd5.cfr_renamed_1[n8] + (this.cfr_renamed_1[n2 - 10 & 0x3FF] + (sprgkd.cfr_renamed_493(n6, 10) ^ sprgkd.cfr_renamed_493(n7, 23)) + this.cfr_renamed_3[(n6 ^ n7) & 0x3FF]);
            n6 = sprgkd5.cfr_renamed_1[n2 - 12 & 0x3FF];
            n = sprgkd5.cfr_renamed_3[n6 & 0xFF] + this.cfr_renamed_3[(n6 >> 8 & 0xFF) + 256] + this.cfr_renamed_3[(n6 >> 16 & 0xFF) + 512] + this.cfr_renamed_3[(n6 >> 24 & 0xFF) + 768] ^ this.cfr_renamed_1[n2];
        }
        sprgkd2.cfr_renamed_4 = this.cfr_renamed_4 + 1 & 0x7FF;
        return n;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        sprt sprt2;
        sprt sprt3 = arg1;
        if (sprt3 instanceof sprnjd) {
            this.cfr_renamed_91 = ((sprnjd)arg1).cfr_renamed_1205();
            sprt2 = sprt3 = ((sprnjd)arg1).cfr_renamed_284();
        } else {
            this.cfr_renamed_91 = new byte[0];
            sprt2 = sprt3;
        }
        if (!(sprt2 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsxy.cfr_renamed_9("vDIKSC[\nOKMKROKOM\nOKLYZN\u001f^P\nwi\r\u001f\t\nVDV^\u001f\u0007\u001f")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_0 = ((sprnld)sprt3).cfr_renamed_1521();
        this.cfr_renamed_1314();
        this.cfr_renamed_119 = true;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        return (byte)(arg0 ^ this.cfr_renamed_3662());
    }

    public sprgkd() {
        sprgkd sprgkd2 = this;
        sprgkd sprgkd3 = this;
        this.cfr_renamed_3 = new int[1024];
        sprgkd3.cfr_renamed_1 = new int[1024];
        sprgkd3.cfr_renamed_4 = 0;
        sprgkd2.cfr_renamed_112 = new byte[4];
        sprgkd2.cfr_renamed_2 = 0;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1314();
    }
}

