/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprjlm;
import com.spire.presentation.packages.sprkom;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqzx;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Enumeration;

public class sprhqm
extends sprqqe {
    private static final int cfr_renamed_91 = 2;
    private static final int cfr_renamed_0 = 1;
    private byte[] cfr_renamed_1;
    private sprkom cfr_renamed_2;
    private final sprnvm cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_4709() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprhqm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhqm) {
            return (sprhqm)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return new sprhqm(sprnvm.cfr_renamed_6501(arg0, 64));
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprmze.cfr_renamed_9(".*:&7!{04d+%)7>d?%/%ad")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprfnm cfr_renamed_1157() {
        return this.cfr_renamed_2.cfr_renamed_1157();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3;
        }
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_2);
        sprrvm3.cfr_renamed_5004(sprjlm.cfr_renamed_11235(55, this.cfr_renamed_1));
        return sprjlm.cfr_renamed_11236(33, new sprcen(sprrvm2));
    }

    public sprkom cfr_renamed_2570() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_2571() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public boolean cfr_renamed_4708() {
        return this.cfr_renamed_4 != null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_11238(sprnvm arg0) throws IOException {
        if (!arg0.cfr_renamed_11239(64, 33)) {
            throw new IOException(new StringBuilder().insert(0, sprqzx.cfr_renamed_9("\u0002\u001a\u0018U\rU/4>1$: 1)'36)'8<*</480L\u001c\u0002U\u001e\u0010\u001d\u0000\t\u0006\u0018O")).append(arg0.cfr_renamed_312()).toString());
        }
        int n = 0;
        Enumeration enumeration = sprszm.cfr_renamed_23(arg0.cfr_renamed_10766(false, 16)).cfr_renamed_329();
        block4: while (enumeration.hasMoreElements()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(enumeration.nextElement(), 64);
            switch (sprnvm2.cfr_renamed_312()) {
                case 78: {
                    this.cfr_renamed_2 = sprkom.cfr_renamed_23(sprnvm2);
                    n |= 1;
                    continue block4;
                }
                case 55: {
                    this.cfr_renamed_1 = sproug.cfr_renamed_23(sprnvm2.cfr_renamed_10766(false, 4)).cfr_renamed_186();
                    n |= 2;
                    continue block4;
                }
            }
            throw new IOException(new StringBuilder().insert(0, sprqzx.cfr_renamed_9("<\u0002\u0003\r\u0019\u0005\u0011L\u0001\r\u0012@U\u0002\u001a\u0018U\r\u001bL6:U/\u0010\u001e\u0001\u0005\u0013\u0005\u0016\r\u0001\tU>\u0010\u001d\u0000\t\u0006\u0018U\t\u0019\t\u0018\t\u001b\u0018O")).append(sprnvm2.cfr_renamed_312()).toString());
        }
        if ((n & 3) == 0) {
            throw new IOException(new StringBuilder().insert(0, sprmze.cfr_renamed_9("\u0012*-%7-?d\u0018\u0005\t\u0000\u0013\u000b\u0017\u0000\u001e\u0016\u0004\u0007\u001e\u0016\u000f\r\u001d\r\u0018\u0005\u000f\u0001{-5d)!*1>7/~")).append(arg0.cfr_renamed_312()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhqm(sprnvm sprnvm2) throws IOException {
        void arg0;
        sprhqm sprhqm2 = this;
        sprhqm2.cfr_renamed_1 = null;
        sprhqm2.cfr_renamed_4 = null;
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3.cfr_renamed_11239(64, 7)) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_10766(false, 16));
            this.cfr_renamed_11238(sprnvm.cfr_renamed_6501(sprszm2.cfr_renamed_85(0), 64));
            this.cfr_renamed_4 = sproug.cfr_renamed_23(sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(sprszm2.cfr_renamed_84() - 1)).cfr_renamed_10766(false, 4)).cfr_renamed_186();
            return;
        }
        this.cfr_renamed_11238((sprnvm)arg0);
    }
}

