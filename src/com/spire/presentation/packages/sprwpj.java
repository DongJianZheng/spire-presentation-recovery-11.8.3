/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprfnj;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprnoj;
import com.spire.presentation.packages.sproah;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvs;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;

public class sprwpj
implements sprvs {
    public transient spryye cfr_renamed_3;
    public static final long cfr_renamed_4 = 1L;

    @Override
    public String getAlgorithm() {
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.emulate.oracle")) {
            return sprfke.cfr_renamed_9("\u0013~\u0003");
        }
        if (this.cfr_renamed_3 instanceof sprlnk) {
            return "X448";
        }
        return "X25519";
    }

    public String toString() {
        return sprfnj.cfr_renamed_9414(sproah.cfr_renamed_9("\f\u0010>\t5\u0006|.9\u001c"), this.getAlgorithm(), this.cfr_renamed_3);
    }

    public spryye cfr_renamed_9389() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprwpj(byte[] byArray, byte[] byArray2) throws InvalidKeySpecException {
        void arg1;
        void arg0;
        int n = byArray.length;
        if (sprfnj.cfr_renamed_9416((byte[])arg0, (byte[])arg1)) {
            if (((void)arg1).length - n == 56) {
                sprwpj sprwpj2 = this;
                sprwpj2.cfr_renamed_3 = new sprlnk((byte[])arg1, n);
                return;
            }
            if (((void)arg1).length - n == 32) {
                this.cfr_renamed_3 = new sprwgk((byte[])arg1, n);
                return;
            }
            throw new InvalidKeySpecException(sprfke.cfr_renamed_9("9[<\u001a _2\u001a/[?[kT$NkH.Y$]%S8_/"));
        }
        throw new InvalidKeySpecException(sproah.cfr_renamed_9("\u0017=\u0012|\u000e9\u001c|\u0001=\u0011=E2\n(E.\u0000?\n;\u000b5\u00169\u0001"));
    }

    @Override
    public BigInteger cfr_renamed_9430() {
        byte[] byArray = this.cfr_renamed_9424();
        sproze.cfr_renamed_5249(byArray);
        return new BigInteger(1, byArray);
    }

    public sprwpj(spryye spryye2) {
        this.cfr_renamed_3 = spryye2;
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_3 instanceof sprlnk) {
            byte[] byArray = new byte[sprnoj.cfr_renamed_119.length + 56];
            System.arraycopy(sprnoj.cfr_renamed_119, 0, byArray, 0, sprnoj.cfr_renamed_119.length);
            ((sprlnk)this.cfr_renamed_3).cfr_renamed_8007(byArray, sprnoj.cfr_renamed_119.length);
            return byArray;
        }
        byte[] byArray = new byte[sprnoj.cfr_renamed_93.length + 32];
        System.arraycopy(sprnoj.cfr_renamed_93, 0, byArray, 0, sprnoj.cfr_renamed_93.length);
        ((sprwgk)this.cfr_renamed_3).cfr_renamed_8007(byArray, sprnoj.cfr_renamed_93.length);
        return byArray;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9152(sprvhm.cfr_renamed_23(byArray));
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
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
    public byte[] cfr_renamed_9424() {
        if (this.cfr_renamed_3 instanceof sprlnk) {
            return ((sprlnk)this.cfr_renamed_3).cfr_renamed_91();
        }
        return ((sprwgk)this.cfr_renamed_3).cfr_renamed_91();
    }

    private /* synthetic */ void cfr_renamed_9152(sprvhm arg0) {
        byte[] byArray = arg0.cfr_renamed_2314().cfr_renamed_186();
        if (sprtu.cfr_renamed_4.cfr_renamed_5078(arg0.cfr_renamed_593().cfr_renamed_593())) {
            sprwpj sprwpj2 = this;
            sprwpj2.cfr_renamed_3 = new sprlnk(byArray);
            return;
        }
        this.cfr_renamed_3 = new sprwgk(byArray);
    }

    public sprwpj(sprvhm sprvhm2) {
        sprwpj sprwpj2 = this;
        sprwpj2.cfr_renamed_9152(sprvhm2);
    }

    @Override
    public String getFormat() {
        return sprfke.cfr_renamed_9("\u0013\u0014~\nr");
    }
}

