/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spral;
import com.spire.presentation.packages.sprcxe;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprmdf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprssy;
import com.spire.presentation.packages.sprudda;
import java.security.SecureRandom;

public class sprchf
extends sprhgf
implements spral {
    private /* synthetic */ void cfr_renamed_785() {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.length) {
            int n3 = this.cfr_renamed_3[n];
            if (n3 < -1 || n3 > 1) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprssy.cfr_renamed_9("*Z\u000fS\u0004W\u000f\u0016\u0015W\u000fC\u0006\fC")).append(n3).append(sprudda.cfr_renamed_9("\u0003}B(\\)\u000f?J}@3J}@;\u000f&\u0002l\u0003}\u001fq\u000flR")).toString());
            }
            n2 = ++n;
        }
    }

    public sprchf(int arg0) {
        sprchf sprchf2 = this;
        super(arg0);
        sprchf2.cfr_renamed_785();
    }

    @Override
    public sprhgf cfr_renamed_3238(sprhgf arg0, int arg1) {
        if (arg1 == 2048) {
            sprhgf sprhgf2 = (sprhgf)arg0.clone();
            sprhgf2.cfr_renamed_762(2048);
            return new sprcxe(sprhgf2).cfr_renamed_5447(this).cfr_renamed_131();
        }
        return super.cfr_renamed_3238(arg0, arg1);
    }

    @Override
    public int cfr_renamed_84() {
        return this.cfr_renamed_3.length;
    }

    public static sprchf cfr_renamed_708(int arg0, int arg1, int arg2, SecureRandom arg3) {
        int[] nArray = sprmdf.cfr_renamed_706(arg0, arg1, arg2, arg3);
        return new sprchf(nArray);
    }

    public static sprchf cfr_renamed_786(int arg0, SecureRandom arg1) {
        int n;
        sprchf sprchf2 = new sprchf(arg0);
        int n2 = n = 0;
        while (n2 < arg0) {
            sprchf2.cfr_renamed_3[n++] = arg1.nextInt(3) - 1;
            n2 = n;
        }
        return sprchf2;
    }

    public sprchf(int[] arg0) {
        sprchf sprchf2 = this;
        super(arg0);
        sprchf2.cfr_renamed_785();
    }

    @Override
    public int[] cfr_renamed_724() {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int[] nArray = new int[n2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            if (this.cfr_renamed_3[n] == 1) {
                nArray[n3++] = n;
            }
            n4 = ++n;
        }
        return sproze.cfr_renamed_541(nArray, n3);
    }

    public sprchf(sprhgf arg0) {
        this(arg0.cfr_renamed_3);
    }

    @Override
    public int[] cfr_renamed_185() {
        int n;
        int n2 = this.cfr_renamed_3.length;
        int[] nArray = new int[n2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            if (this.cfr_renamed_3[n] == -1) {
                nArray[n3++] = n;
            }
            n4 = ++n;
        }
        return sproze.cfr_renamed_541(nArray, n3);
    }
}

