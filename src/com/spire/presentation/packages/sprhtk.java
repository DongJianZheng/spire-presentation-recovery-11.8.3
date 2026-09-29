/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprfyha;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmsf;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprhtk
implements sprvv {
    private byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private boolean cfr_renamed_91;
    private int[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> arg1 | arg0 << -arg1;
    }

    public sprhtk() {
        sprhtk sprhtk2 = this;
        sprhtk sprhtk3 = this;
        this.cfr_renamed_0 = new int[1024];
        sprhtk3.cfr_renamed_2 = new int[1024];
        sprhtk3.cfr_renamed_4 = 0;
        sprhtk2.cfr_renamed_112 = new byte[4];
        sprhtk2.cfr_renamed_3 = 0;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        return (byte)(arg0 ^ this.cfr_renamed_3662());
    }

    private /* synthetic */ void cfr_renamed_1314() {
        int n;
        Object[] objectArray;
        if (this.cfr_renamed_119.length != 32 && this.cfr_renamed_119.length != 16) {
            throw new IllegalArgumentException(sprmsf.cfr_renamed_9("\f\u000b=C3\u0006!C5\u0016+\u0017x\u0001=CiQ`LjVnC:\n,\u0010x\u000f7\r?"));
        }
        if (this.cfr_renamed_1.length < 16) {
            throw new IllegalArgumentException(sprfyha.cfr_renamed_9("\\\u0003mKA=(\u0006}\u0018|Kj\u000e(\n|Kd\u000ei\u0018|K9Y0Kj\u0002|\u0018(\u0007g\u0005o"));
        }
        if (this.cfr_renamed_119.length != 32) {
            objectArray = new byte[32];
            System.arraycopy(this.cfr_renamed_119, 0, objectArray, 0, this.cfr_renamed_119.length);
            System.arraycopy(this.cfr_renamed_119, 0, objectArray, 16, this.cfr_renamed_119.length);
            this.cfr_renamed_119 = objectArray;
        }
        if (this.cfr_renamed_1.length < 32) {
            objectArray = new byte[32];
            System.arraycopy(this.cfr_renamed_1, 0, objectArray, 0, this.cfr_renamed_1.length);
            System.arraycopy(this.cfr_renamed_1, 0, objectArray, this.cfr_renamed_1.length, objectArray.length - this.cfr_renamed_1.length);
            this.cfr_renamed_1 = objectArray;
        }
        this.cfr_renamed_3 = 0;
        this.cfr_renamed_4 = 0;
        objectArray = new int[2560];
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = n >> 2;
            int n4 = objectArray[n3] | (this.cfr_renamed_119[n] & 0xFF) << 8 * (n & 3);
            objectArray[n3] = n4;
            n2 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 32) {
            int n6 = (n >> 2) + 8;
            int n7 = objectArray[n6] | (this.cfr_renamed_1[n] & 0xFF) << 8 * (n & 3);
            objectArray[n6] = n7;
            n5 = ++n;
        }
        int n8 = n = 16;
        while (n8 < 2560) {
            byte by = objectArray[n - 2];
            byte by2 = objectArray[n - 15];
            objectArray[++n] = (sprhtk.cfr_renamed_493(by, 17) ^ sprhtk.cfr_renamed_493(by, 19) ^ by >>> 10) + objectArray[n - 7] + (sprhtk.cfr_renamed_493(by2, 7) ^ sprhtk.cfr_renamed_493(by2, 18) ^ by2 >>> 3) + objectArray[n - 16] + n;
            n8 = n;
        }
        System.arraycopy(objectArray, 512, this.cfr_renamed_0, 0, 1024);
        System.arraycopy(objectArray, 1536, this.cfr_renamed_2, 0, 1024);
        int n9 = n = 0;
        while (n9 < 4096) {
            this.cfr_renamed_3663();
            n9 = ++n;
        }
        this.cfr_renamed_4 = 0;
    }

    private /* synthetic */ int cfr_renamed_3663() {
        int n;
        sprhtk sprhtk2;
        sprhtk sprhtk3 = this;
        int n2 = sprhtk3.cfr_renamed_4 & 0x3FF;
        if (sprhtk3.cfr_renamed_4 < 1024) {
            sprhtk sprhtk4 = this;
            sprhtk2 = sprhtk4;
            int n3 = sprhtk4.cfr_renamed_0[n2 - 3 & 0x3FF];
            int n4 = sprhtk4.cfr_renamed_0[n2 - 1023 & 0x3FF];
            int n5 = n2;
            sprhtk4.cfr_renamed_0[n5] = sprhtk4.cfr_renamed_0[n5] + (this.cfr_renamed_0[n2 - 10 & 0x3FF] + (sprhtk.cfr_renamed_493(n3, 10) ^ sprhtk.cfr_renamed_493(n4, 23)) + this.cfr_renamed_2[(n3 ^ n4) & 0x3FF]);
            n3 = sprhtk4.cfr_renamed_0[n2 - 12 & 0x3FF];
            n = sprhtk4.cfr_renamed_2[n3 & 0xFF] + this.cfr_renamed_2[(n3 >> 8 & 0xFF) + 256] + this.cfr_renamed_2[(n3 >> 16 & 0xFF) + 512] + this.cfr_renamed_2[(n3 >> 24 & 0xFF) + 768] ^ this.cfr_renamed_0[n2];
        } else {
            sprhtk sprhtk5 = this;
            sprhtk2 = sprhtk5;
            int n6 = sprhtk5.cfr_renamed_2[n2 - 3 & 0x3FF];
            int n7 = sprhtk5.cfr_renamed_2[n2 - 1023 & 0x3FF];
            int n8 = n2;
            sprhtk5.cfr_renamed_2[n8] = sprhtk5.cfr_renamed_2[n8] + (this.cfr_renamed_2[n2 - 10 & 0x3FF] + (sprhtk.cfr_renamed_493(n6, 10) ^ sprhtk.cfr_renamed_493(n7, 23)) + this.cfr_renamed_0[(n6 ^ n7) & 0x3FF]);
            n6 = sprhtk5.cfr_renamed_2[n2 - 12 & 0x3FF];
            n = sprhtk5.cfr_renamed_0[n6 & 0xFF] + this.cfr_renamed_0[(n6 >> 8 & 0xFF) + 256] + this.cfr_renamed_0[(n6 >> 16 & 0xFF) + 512] + this.cfr_renamed_0[(n6 >> 24 & 0xFF) + 768] ^ this.cfr_renamed_2[n2];
        }
        sprhtk2.cfr_renamed_4 = this.cfr_renamed_4 + 1 & 0x7FF;
        return n;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl {
        int n;
        if (!this.cfr_renamed_91) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprmsf.cfr_renamed_9("C6\f,C1\r1\u00171\u00024\n+\u0006<")).toString());
        }
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprfyha.cfr_renamed_9("\u0002f\u001b}\u001f(\t}\rn\u000ezK|\u0004gK{\u0003g\u0019|"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(sprmsf.cfr_renamed_9("7\u0016,\u0013-\u0017x\u0001-\u0005>\u0006*C,\f7C+\u000b7\u0011,"));
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

    private /* synthetic */ byte cfr_renamed_3662() {
        int n;
        if (this.cfr_renamed_3 == 0) {
            sprhtk sprhtk2 = this;
            n = sprhtk2.cfr_renamed_3663();
            sprhtk2.cfr_renamed_112[0] = (byte)(n & 0xFF);
            sprhtk2.cfr_renamed_112[1] = (byte)((n >>= 8) & 0xFF);
            sprhtk2.cfr_renamed_112[2] = (byte)((n >>= 8) & 0xFF);
            sprhtk2.cfr_renamed_112[3] = (byte)((n >>= 8) & 0xFF);
        }
        sprhtk sprhtk3 = this;
        n = this.cfr_renamed_112[sprhtk3.cfr_renamed_3];
        this.cfr_renamed_3 = sprhtk3.cfr_renamed_3 + 1 & 3;
        return (byte)n;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1314();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprfyha.cfr_renamed_9("#KF:^>");
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprbj sprbj2;
        sprbj sprbj3 = arg1;
        if (sprbj3 instanceof sprkpk) {
            this.cfr_renamed_1 = ((sprkpk)arg1).cfr_renamed_1205();
            sprbj2 = sprbj3 = ((sprkpk)arg1).cfr_renamed_284();
        } else {
            this.cfr_renamed_1 = new byte[0];
            sprbj2 = sprbj3;
        }
        if (!(sprbj2 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmsf.cfr_renamed_9("\u0011\r.\u00024\n<C(\u0002*\u00025\u0006,\u0006*C(\u0002+\u0010=\u0007x\u00177C\u0010 jVnC1\r1\u0017xNx")).append(arg1.getClass().getName()).toString());
        }
        this.cfr_renamed_119 = ((sprtpk)sprbj3).cfr_renamed_1521();
        this.cfr_renamed_1314();
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), this.cfr_renamed_119.length * 8, arg1, sprlrk.cfr_renamed_9915(arg0)));
        this.cfr_renamed_91 = true;
    }
}

