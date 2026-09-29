/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapk;
import com.spire.presentation.packages.sprbxp;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqsfa;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprybl;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.SecureRandom;

public class sprfok
implements sprjn,
Serializable {
    private transient sprddm cfr_renamed_3;
    private transient sprapk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        void arg0;
        void v0 = arg0;
        v0.defaultReadObject();
        this.cfr_renamed_9882((byte[])v0.readObject(), sprybl.cfr_renamed_2794());
    }

    public sprddm cfr_renamed_615() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_9882(byte[] arg0, SecureRandom arg1) {
        sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
        this.cfr_renamed_3 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        sprfok sprfok2 = this;
        sprfok2.cfr_renamed_4 = new sprapk(sproug.cfr_renamed_23(sprszm2.cfr_renamed_85(1)).cfr_renamed_186(), arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfok cfr_renamed_9883(InputStream arg0, SecureRandom arg1) throws IOException, ClassNotFoundException {
        if (arg0 == null) {
            throw new NullPointerException(sprbxp.cfr_renamed_9("m[lJ\u007fB>Iq]>CqNzFpH>Fm\u000fpZrC>Fp\u000fT@k]pNrJznrHq]w[vB"));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(arg0);
        try {
            sprfok sprfok2 = new sprfok(sprkqe.cfr_renamed_471(bufferedInputStream), arg1);
            return sprfok2;
        }
        finally {
            ((InputStream)bufferedInputStream).close();
        }
    }

    public void cfr_renamed_9884(OutputStream arg0) throws IOException {
        if (arg0 == null) {
            throw new NullPointerException(sprqsfa.cfr_renamed_9("j)q,p(%/q.`=h|c3w|v(j.d;`|l/%2p0i|l2%\u0016j)w2d0`8D0b3w5q4h"));
        }
        arg0.write(this.cfr_renamed_91());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfok cfr_renamed_9885(File arg0, SecureRandom arg1) throws IOException, ClassNotFoundException {
        if (arg0 == null) {
            throw new NullPointerException(sprbxp.cfr_renamed_9("XFrJ>Iq]>CqNzFpH>Fm\u000fpZrC>Fp\u000fT@k]pNrJznrHq]w[vB"));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(arg0));
        try {
            sprfok sprfok2 = new sprfok(sprkqe.cfr_renamed_471(bufferedInputStream), arg1);
            return sprfok2;
        }
        finally {
            ((InputStream)bufferedInputStream).close();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_9886(File arg0) throws IOException {
        if (arg0 == null) {
            throw new NullPointerException(sprqsfa.cfr_renamed_9(":l0`|c3w|v(j.d;`|l/%2p0i|l2%\u0016j)w2d0`8D0b3w5q4h"));
        }
        FileOutputStream fileOutputStream = new FileOutputStream(arg0);
        try {
            this.cfr_renamed_9884(fileOutputStream);
            return;
        }
        finally {
            fileOutputStream.close();
        }
    }

    public sprfok(byte[] arg0) {
        this(arg0, sprybl.cfr_renamed_2794());
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4.cfr_renamed_9881()));
        return new sprcen(sprrvm2).cfr_renamed_91();
    }

    public sprapk cfr_renamed_9887() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.cfr_renamed_91());
    }

    /*
     * WARNING - void declaration
     */
    public sprfok(sprddm sprddm2, sprapk sprapk2) {
        void arg0;
        void arg1;
        if (sprddm2 == null) {
            throw new NullPointerException(sprbxp.cfr_renamed_9("_Cy@lFjGsfzJp[wIwJl\u000fnNm\\{K>[q\u000fT@k]pNrJznrHq]w[vB>Fm\u000fpZrC"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprqsfa.cfr_renamed_9("O3p.k=i5k;V9f)w9W=k8j1%,d/v9a|q3%\u0016j)w2d0`8D0b3w5q4h|l/%2p0i"));
        }
        this.cfr_renamed_4 = arg1;
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprfok(byte[] byArray, SecureRandom secureRandom) {
        void arg0;
        void arg1;
        if (byArray == null) {
            throw new NullPointerException(sprbxp.cfr_renamed_9("JpLqKwAy\u000fnNm\\{K>[q\u000fT@k]pNrJznrHq]w[vB>Fm\u000fpZrC"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprqsfa.cfr_renamed_9("w=k8j1%,d/v9a|q3%\u0016j)w2d0`8D0b3w5q4h|l/%2p0i"));
        }
        this.cfr_renamed_9882((byte[])arg0, (SecureRandom)arg1);
    }
}

