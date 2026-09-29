/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprceg;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprodg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqrda;
import com.spire.presentation.packages.sprsg;
import com.spire.presentation.packages.sprtco;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprcrf
implements PrivateKey,
sprsg {
    private transient spridn cfr_renamed_2;
    private static final long cfr_renamed_3 = 8568701712864512338L;
    private transient sprodg cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprcrf)) {
            return false;
        }
        sprcrf sprcrf2 = (sprcrf)arg0;
        try {
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprcrf2.cfr_renamed_4.cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprtco.cfr_renamed_9("z\u0015n\u0019c\u001e/\u000f`[\u007f\u001e}\u001d`\tb[j\nz\u001ac\b"));
        }
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_5713() {
        if (this.cfr_renamed_4 instanceof spriyf) {
            return 1;
        }
        return ((sprceg)this.cfr_renamed_4).cfr_renamed_2331();
    }

    @Override
    public sprsg cfr_renamed_3249(int arg0) {
        if (this.cfr_renamed_4 instanceof spriyf) {
            return new sprcrf(((spriyf)this.cfr_renamed_4).cfr_renamed_3249(arg0));
        }
        return new sprcrf(((sprceg)this.cfr_renamed_4).cfr_renamed_3249(arg0));
    }

    @Override
    public long cfr_renamed_5649() {
        if (this.cfr_renamed_4 instanceof spriyf) {
            return ((spriyf)this.cfr_renamed_4).cfr_renamed_5649();
        }
        return ((sprceg)this.cfr_renamed_4).cfr_renamed_5649();
    }

    @Override
    public long cfr_renamed_320() {
        if (this.cfr_renamed_5649() == 0L) {
            throw new IllegalStateException(sprqrda.cfr_renamed_9("5v'3;k6r+`*v:"));
        }
        if (this.cfr_renamed_4 instanceof spriyf) {
            return ((spriyf)this.cfr_renamed_4).cfr_renamed_320();
        }
        return ((sprceg)this.cfr_renamed_4).cfr_renamed_320();
    }

    @Override
    public String getAlgorithm() {
        return sprtco.cfr_renamed_9("7B(");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprcrf sprcrf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprcrf2.cfr_renamed_4, sprcrf2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int hashCode() {
        try {
            return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprqrda.cfr_renamed_9("f0r<\u007f;3*|~p?\u007f=f2r*v~{?`6P1w;"));
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprcrf sprcrf2 = this;
        sprcrf2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprcrf2.cfr_renamed_4 = (sprodg)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public sprcrf(sprcom sprcom2) throws IOException {
        sprcrf sprcrf2 = this;
        sprcrf2.cfr_renamed_5662(sprcom2);
    }

    public sprcrf(sprodg sprodg2) {
        this.cfr_renamed_4 = sprodg2;
    }

    @Override
    public String getFormat() {
        return sprtco.cfr_renamed_9("_0L(,C");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }
}

