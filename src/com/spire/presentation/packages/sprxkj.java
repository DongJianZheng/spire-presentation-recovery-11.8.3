/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfnj;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprnoj;
import com.spire.presentation.packages.sprnuia;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprqx;
import com.spire.presentation.packages.sprsod;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

public class sprxkj
implements sprqx {
    public static final long cfr_renamed_3 = 1L;
    public transient spryye cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        byte[] byArray = arg0.cfr_renamed_2314().cfr_renamed_186();
        if (sprtu.cfr_renamed_2.cfr_renamed_5078(arg0.cfr_renamed_593().cfr_renamed_593())) {
            sprxkj sprxkj2 = this;
            sprxkj2.cfr_renamed_4 = new sprpxk(byArray);
            return;
        }
        this.cfr_renamed_4 = new sprnuk(byArray);
    }

    public String toString() {
        return sprfnj.cfr_renamed_9414(sprsod.cfr_renamed_9("R/`6k9\"\u0011g#"), this.getAlgorithm(), this.cfr_renamed_4);
    }

    @Override
    public String getAlgorithm() {
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.emulate.oracle")) {
            return sprnuia.cfr_renamed_9("rssDv");
        }
        if (this.cfr_renamed_4 instanceof sprpxk) {
            return "Ed448";
        }
        return "Ed25519";
    }

    public sprxkj(sprvhm sprvhm2) {
        sprxkj sprxkj2 = this;
        sprxkj2.cfr_renamed_9152(sprvhm2);
    }

    public sprxkj(spryye spryye2) {
        this.cfr_renamed_4 = spryye2;
    }

    @Override
    public byte[] cfr_renamed_9425() {
        if (this.cfr_renamed_4 instanceof sprpxk) {
            return ((sprpxk)this.cfr_renamed_4).cfr_renamed_91();
        }
        return ((sprnuk)this.cfr_renamed_4).cfr_renamed_91();
    }

    public spryye cfr_renamed_9389() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof PublicKey)) {
            return false;
        }
        return sproze.cfr_renamed_92(((PublicKey)arg0).getEncoded(), this.getEncoded());
    }

    @Override
    public String getFormat() {
        return sprsod.cfr_renamed_9("\u0002,o2c");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 instanceof sprpxk) {
            byte[] byArray = new byte[sprnoj.cfr_renamed_91.length + 57];
            System.arraycopy(sprnoj.cfr_renamed_91, 0, byArray, 0, sprnoj.cfr_renamed_91.length);
            ((sprpxk)this.cfr_renamed_4).cfr_renamed_8007(byArray, sprnoj.cfr_renamed_91.length);
            return byArray;
        }
        byte[] byArray = new byte[sprnoj.cfr_renamed_112.length + 32];
        System.arraycopy(sprnoj.cfr_renamed_112, 0, byArray, 0, sprnoj.cfr_renamed_112.length);
        ((sprnuk)this.cfr_renamed_4).cfr_renamed_8007(byArray, sprnoj.cfr_renamed_112.length);
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(byArray));
    }

    /*
     * WARNING - void declaration
     */
    public sprxkj(byte[] byArray, byte[] byArray2) throws InvalidKeySpecException {
        void arg1;
        void arg0;
        int n = byArray.length;
        if (sprfnj.cfr_renamed_9416((byte[])arg0, (byte[])arg1)) {
            if (((void)arg1).length - n == 57) {
                sprxkj sprxkj2 = this;
                sprxkj2.cfr_renamed_4 = new sprpxk((byte[])arg1, n);
                return;
            }
            if (((void)arg1).length - n == 32) {
                this.cfr_renamed_4 = new sprnuk((byte[])arg1, n);
                return;
            }
            throw new InvalidKeySpecException(sprnuia.cfr_renamed_9("Ev@7\\rN7SvCv\u0017yXc\u0017eRtXpY~DrS"));
        }
        throw new InvalidKeySpecException(sprsod.cfr_renamed_9("(c-\"1g#\">c.czl5vzp?a5e4k)g>"));
    }
}

