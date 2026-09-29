/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprayca;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprekl;
import com.spire.presentation.packages.sprnkb;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;

public class sprzzk
implements spraq {
    private sprekl cfr_renamed_86;
    private int cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private static final int cfr_renamed_0 = 8;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return sprnkb.cfr_renamed_9("@\u001ap\u001c3_6]I\bg");
    }

    @Override
    public void cfr_renamed_41() {
        sprzzk sprzzk2 = this;
        sproze.cfr_renamed_492(sprzzk2.cfr_renamed_119, (byte)0);
        sproze.cfr_renamed_492(sprzzk2.cfr_renamed_112, (byte)0);
        sproze.cfr_renamed_492(sprzzk2.cfr_renamed_3, (byte)0);
        sproze.cfr_renamed_492(sprzzk2.cfr_renamed_1, (byte)0);
        sprzzk2.cfr_renamed_86.cfr_renamed_41();
        if (sprzzk2.cfr_renamed_4) {
            sprzzk sprzzk3 = this;
            sprzzk3.cfr_renamed_86.cfr_renamed_3064(sprzzk3.cfr_renamed_3, 0, this.cfr_renamed_3, 0);
        }
        this.cfr_renamed_91 = 0;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprtpk) {
            sprzzk sprzzk2 = this;
            sprzzk2.cfr_renamed_86.cfr_renamed_5535(true, arg0);
            sprzzk2.cfr_renamed_4 = true;
            sprzzk2.cfr_renamed_41();
            return;
        }
        throw new IllegalArgumentException(sprayca.cfr_renamed_9("\u001fb m:e2,&m$m;i\"i$,&m%\u007f3hvx9,\u0012\u007f\"ya:d8\u001bm5"));
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprzzk sprzzk2 = this;
        if (sprzzk2.cfr_renamed_91 == sprzzk2.cfr_renamed_1.length) {
            sprzzk sprzzk3 = this;
            sprzzk3.cfr_renamed_3872(sprzzk3.cfr_renamed_1, 0);
            sprzzk3.cfr_renamed_91 = 0;
        }
        this.cfr_renamed_1[this.cfr_renamed_91++] = arg0;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprnkb.cfr_renamed_9("g\bjNpIl\br\f$\b$\u0007a\u000ee\u001dm\u001faIm\u0007t\u001cpIh\fj\u000ep\u0001%"));
        }
        int n = this.cfr_renamed_86.cfr_renamed_1195();
        int n2 = n - this.cfr_renamed_91;
        if (arg2 > n2) {
            sprzzk sprzzk2 = this;
            System.arraycopy(arg0, arg1, sprzzk2.cfr_renamed_1, sprzzk2.cfr_renamed_91, n2);
            sprzzk2.cfr_renamed_3872(this.cfr_renamed_1, 0);
            this.cfr_renamed_91 = 0;
            arg1 += n2;
            int n3 = arg2 -= n2;
            while (n3 > n) {
                this.cfr_renamed_3872(arg0, arg1);
                arg1 += n;
                n3 = arg2 -= n;
            }
        }
        sprzzk sprzzk3 = this;
        System.arraycopy(arg0, arg1, sprzzk3.cfr_renamed_1, sprzzk3.cfr_renamed_91, arg2);
        this.cfr_renamed_91 += arg2;
    }

    private /* synthetic */ void cfr_renamed_3872(byte[] arg0, int arg1) {
        sprzzk sprzzk2 = this;
        sprzzk2.cfr_renamed_10118(sprzzk2.cfr_renamed_119, 0, arg0, arg1, this.cfr_renamed_112);
        sprzzk2.cfr_renamed_86.cfr_renamed_3064(this.cfr_renamed_112, 0, this.cfr_renamed_119, 0);
    }

    private /* synthetic */ void cfr_renamed_10118(byte[] arg0, int arg1, byte[] arg2, int arg3, byte[] arg4) {
        int n;
        if (arg0.length - arg1 < this.cfr_renamed_2 || arg2.length - arg3 < this.cfr_renamed_2 || arg4.length < this.cfr_renamed_2) {
            throw new IllegalArgumentException(sprayca.cfr_renamed_9("%c;ivc0,?b&y\",4y0j3~%,\"c9,%d9~\""));
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = n;
            byte by = (byte)(arg0[n + arg1] ^ arg2[n3 + arg3]);
            arg4[n3] = by;
            n2 = ++n;
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        sprzzk sprzzk2 = this;
        if (sprzzk2.cfr_renamed_91 % sprzzk2.cfr_renamed_1.length != 0) {
            throw new sprddl(sprnkb.cfr_renamed_9("m\u0007t\u001cpIi\u001cw\u001d$\u000baIeIi\u001ch\u001dm\u0019h\f$\u0006bIf\u0005k\no\u001am\u0013a"));
        }
        sprzzk sprzzk3 = this;
        sprzzk sprzzk4 = this;
        sprzzk4.cfr_renamed_10118(sprzzk3.cfr_renamed_119, 0, sprzzk4.cfr_renamed_1, 0, this.cfr_renamed_112);
        sprzzk3.cfr_renamed_10118(sprzzk3.cfr_renamed_112, 0, this.cfr_renamed_3, 0, this.cfr_renamed_119);
        sprzzk3.cfr_renamed_86.cfr_renamed_3064(this.cfr_renamed_119, 0, this.cfr_renamed_119, 0);
        if (sprzzk3.cfr_renamed_152 + arg1 > arg0.length) {
            throw new sprwjl(sprayca.cfr_renamed_9("9y\"|#xvn#j0i$,\"c9,%d9~\""));
        }
        sprzzk sprzzk5 = this;
        System.arraycopy(sprzzk5.cfr_renamed_119, 0, arg0, arg1, this.cfr_renamed_152);
        sprzzk5.cfr_renamed_41();
        return sprzzk5.cfr_renamed_152;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_152;
    }

    public sprzzk(int arg0, int arg1) {
        sprzzk sprzzk2 = this;
        this.cfr_renamed_4 = false;
        sprzzk sprzzk3 = this;
        this.cfr_renamed_86 = new sprekl(arg0);
        this.cfr_renamed_2 = arg0 / 8;
        sprzzk2.cfr_renamed_152 = arg1 / 8;
        sprzzk2.cfr_renamed_119 = new byte[this.cfr_renamed_2];
        sprzzk2.cfr_renamed_3 = new byte[sprzzk2.cfr_renamed_2];
        sprzzk2.cfr_renamed_112 = new byte[sprzzk2.cfr_renamed_2];
        sprzzk2.cfr_renamed_1 = new byte[sprzzk2.cfr_renamed_2];
    }
}

