/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcqm;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprhsm;
import com.spire.presentation.packages.sprjlm;
import com.spire.presentation.packages.sprkom;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqpja;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqum;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwiea;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Enumeration;

public class sprzkm
extends sprqqe {
    private static int cfr_renamed_0;
    private int cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private static int cfr_renamed_3;
    private sprkom cfr_renamed_4;

    public int cfr_renamed_4717() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4715().cfr_renamed_4716();
    }

    public sprzkm(sprrzm sprrzm2) throws IOException {
        sprzkm sprzkm2 = this;
        sprzkm2.cfr_renamed_11240(sprrzm2);
    }

    public sprrnm cfr_renamed_4718() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4719();
    }

    static {
        cfr_renamed_3 = 1;
        cfr_renamed_0 = 2;
    }

    public byte[] cfr_renamed_79() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public sprzkm(sprkom arg0, byte[] arg1) throws IOException {
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = sproze.cfr_renamed_158(arg1);
        this.cfr_renamed_1 |= cfr_renamed_3;
        this.cfr_renamed_1 |= cfr_renamed_0;
    }

    public int cfr_renamed_4714() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4715().cfr_renamed_4716() & 0xC0;
    }

    public sprhsm cfr_renamed_4724() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4725();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(sprjlm.cfr_renamed_11235(55, this.cfr_renamed_2));
        return sprjlm.cfr_renamed_11236(33, new sprcen(sprrvm2));
    }

    public sprqum cfr_renamed_4722() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4723();
    }

    public sprkom cfr_renamed_2573() {
        return this.cfr_renamed_4;
    }

    public sprlem cfr_renamed_4720() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4715().cfr_renamed_4721();
    }

    public sprrnm cfr_renamed_4710() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_4711();
    }

    public int cfr_renamed_4727() {
        return this.cfr_renamed_4.cfr_renamed_4727();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_11241(sprnvm sprnvm2) throws IOException {
        void arg0;
        this.cfr_renamed_1 = 0;
        if (sprnvm2.cfr_renamed_11239(64, 33)) {
            Enumeration enumeration = sprszm.cfr_renamed_23(arg0.cfr_renamed_10766(false, 16)).cfr_renamed_329();
            block4: while (enumeration.hasMoreElements()) {
                Object e = enumeration.nextElement();
                if (e instanceof sprnvm) {
                    sprnvm sprnvm3 = sprnvm.cfr_renamed_6501(e, 64);
                    switch (sprnvm3.cfr_renamed_312()) {
                        case 78: {
                            this.cfr_renamed_4 = sprkom.cfr_renamed_23(sprnvm3);
                            this.cfr_renamed_1 |= cfr_renamed_3;
                            continue block4;
                        }
                        case 55: {
                            while (false) {
                            }
                            this.cfr_renamed_2 = sproug.cfr_renamed_23(sprnvm3.cfr_renamed_10766(false, 4)).cfr_renamed_186();
                            this.cfr_renamed_1 |= cfr_renamed_0;
                            continue block4;
                        }
                    }
                    throw new IOException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9("2 \r/\u0017'\u001fn\u000f/\u001cb[ \u0014:[/\u0015n2=\u0014yC\u007fM\r\u001e<\u000f'\u001d'\u0018/\u000f+(:\t;\u0018:\u000e<\u001enA")).append(sprnvm3.cfr_renamed_312()).toString());
                }
                throw new IOException(sprqpja.cfr_renamed_9("o\u0019P\u0016J\u001eBWi\u0015L\u0012E\u0003\nWH\u0018RWG\u0019\u0006>U\u0018\u0011O\u0017Ae\u0012T\u0003O\u0011O\u0014G\u0003C$R\u0005S\u0014R\u0002T\u0012"));
            }
        } else {
            throw new IOException(new StringBuilder().insert(0, sprwiea.cfr_renamed_9(" \u0014:[/[\r:\u001c?\u00064\u0002?\u000b)\u00118\u000b)\u001a2\b2\r:\u001a>nA")).append(arg0.cfr_renamed_312()).toString());
        }
        if (this.cfr_renamed_1 != (cfr_renamed_0 | cfr_renamed_3)) {
            throw new IOException(new StringBuilder().insert(0, sprqpja.cfr_renamed_9("O\u0019P\u0016J\u001eBWe6t3n8j3c%y4c%r>`>e6r2\u0006M")).append(arg0.cfr_renamed_312()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprzkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprzkm) {
            return (sprzkm)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return new sprzkm(sprnvm.cfr_renamed_6501(arg0, 64));
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprwiea.cfr_renamed_9(";\u0015/\u0019\"\u001en\u000f![>\u001a<\b+[*\u001a:\u001at[")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprcqm cfr_renamed_4726() throws IOException {
        return new sprcqm(this.cfr_renamed_4.cfr_renamed_4715().cfr_renamed_4716() & 0x1F);
    }

    private /* synthetic */ void cfr_renamed_11240(sprrzm arg0) throws IOException {
        sprxgf sprxgf2;
        sprrzm sprrzm2 = arg0;
        while ((sprxgf2 = sprrzm2.cfr_renamed_24()) != null) {
            if (sprxgf2 instanceof sprnvm) {
                this.cfr_renamed_11241((sprnvm)sprxgf2);
                sprrzm2 = arg0;
                continue;
            }
            throw new IOException(sprqpja.cfr_renamed_9("o\u0019P\u0016J\u001eBWo\u0019V\u0002RWu\u0003T\u0012G\u001a\u0006\u0011I\u0005\u0006\u0014T\u0012G\u0003O\u0019AWG\u0019\u0006>U\u0018\u0011O\u0017Ae\u0012T\u0003O\u0011O\u0014G\u0003C$R\u0005S\u0014R\u0002T\u0012"));
        }
    }

    private /* synthetic */ sprzkm(sprnvm sprnvm2) throws IOException {
        sprzkm sprzkm2 = this;
        sprzkm2.cfr_renamed_11241(sprnvm2);
    }
}

