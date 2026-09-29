/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcq;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdrc;
import com.spire.presentation.packages.sprfnj;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprnjk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsfk;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprvs;
import com.spire.presentation.packages.sprvy;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.sprwpj;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprrnj
implements sprvy {
    public transient int cfr_renamed_91;
    public transient spryye cfr_renamed_0;
    public transient spryye cfr_renamed_1;
    private final boolean cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    public static final long cfr_renamed_4 = 1L;

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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprcom sprcom2 = this.cfr_renamed_1598();
            if (sprcom2 != null) return sprcom2.cfr_renamed_91();
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_9431(sprcom arg0) throws IOException {
        sprrnj sprrnj2;
        byte[] byArray = arg0.cfr_renamed_1369().cfr_renamed_186();
        if (byArray.length != 32 && byArray.length != 56) {
            byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
        }
        if (sprtu.cfr_renamed_4.cfr_renamed_5078(arg0.cfr_renamed_1254().cfr_renamed_593())) {
            sprrnj sprrnj3 = this;
            sprrnj3.cfr_renamed_1 = new sprsfk(byArray);
            sprrnj3.cfr_renamed_0 = ((sprsfk)this.cfr_renamed_1).cfr_renamed_9432();
            sprrnj2 = this;
        } else {
            this.cfr_renamed_1 = new spruek(byArray);
            this.cfr_renamed_0 = ((spruek)this.cfr_renamed_1).cfr_renamed_9432();
            sprrnj2 = this;
        }
        sprrnj2.cfr_renamed_91 = this.cfr_renamed_2154();
    }

    public boolean equals(Object arg0) {
        sprcom sprcom2;
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof PrivateKey)) {
            return false;
        }
        PrivateKey privateKey = (PrivateKey)arg0;
        sprcom sprcom3 = this.cfr_renamed_1598();
        PrivateKey privateKey2 = privateKey;
        sprcom sprcom4 = sprcom2 = privateKey instanceof sprrnj ? ((sprrnj)privateKey2).cfr_renamed_1598() : sprcom.cfr_renamed_23(privateKey2.getEncoded());
        if (sprcom3 == null || sprcom2 == null) {
            return false;
        }
        try {
            sprcom sprcom5 = sprcom3;
            boolean bl = sproze.cfr_renamed_559(sprcom5.cfr_renamed_1254().cfr_renamed_91(), sprcom2.cfr_renamed_1254().cfr_renamed_91());
            boolean bl2 = sproze.cfr_renamed_559(sprcom5.cfr_renamed_1369().cfr_renamed_91(), sprcom2.cfr_renamed_1369().cfr_renamed_91());
            return bl & bl2;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public spryye cfr_renamed_9389() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprvs cfr_renamed_1157() {
        return new sprwpj(this.cfr_renamed_0);
    }

    @Override
    public String getAlgorithm() {
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.emulate.oracle")) {
            return sprdrc.cfr_renamed_9("=\u0016-");
        }
        if (this.cfr_renamed_1 instanceof sprsfk) {
            return "X448";
        }
        return "X25519";
    }

    public String toString() {
        return sprfnj.cfr_renamed_9414(sprbcq.cfr_renamed_9("'\"\u001e&\u0016$\u0012p<5\u000e"), this.getAlgorithm(), this.cfr_renamed_0);
    }

    public sprrnj(spryye spryye2) {
        sprrnj sprrnj2;
        this.cfr_renamed_2 = true;
        this.cfr_renamed_3 = null;
        this.cfr_renamed_1 = spryye2;
        if (this.cfr_renamed_1 instanceof sprsfk) {
            this.cfr_renamed_0 = ((sprsfk)this.cfr_renamed_1).cfr_renamed_9432();
            sprrnj2 = this;
        } else {
            this.cfr_renamed_0 = ((spruek)this.cfr_renamed_1).cfr_renamed_9432();
            sprrnj2 = this;
        }
        sprrnj2.cfr_renamed_91 = this.cfr_renamed_2154();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9431(sprcom.cfr_renamed_23(byArray));
    }

    private /* synthetic */ int cfr_renamed_2154() {
        sprrnj sprrnj2;
        byte[] byArray;
        if (this.cfr_renamed_0 instanceof sprlnk) {
            byArray = ((sprlnk)this.cfr_renamed_0).cfr_renamed_91();
            sprrnj2 = this;
        } else {
            byArray = ((sprwgk)this.cfr_renamed_0).cfr_renamed_91();
            sprrnj2 = this;
        }
        int n = sprrnj2.getAlgorithm().hashCode();
        n = 31 * n + sproze.cfr_renamed_95(byArray);
        return n;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprcom cfr_renamed_1598() {
        try {
            sprrnj sprrnj2 = this;
            spridn spridn2 = spridn.cfr_renamed_23(sprrnj2.cfr_renamed_3);
            sprcom sprcom2 = sprnjk.cfr_renamed_5661(sprrnj2.cfr_renamed_1, spridn2);
            if (!sprrnj2.cfr_renamed_2 || sprjcf.cfr_renamed_5159(sprdrc.cfr_renamed_9("\u0006=\b|\u0016\"\f \u0000|\u0015!\b=\u00017\t|\u00167\u0006'\u0017;\u0011+K\"\u000e1\u0016jK$T\r\f<\u0003=:=\u000b>\u001c"))) return new sprcom(sprcom2.cfr_renamed_1254(), sprcom2.cfr_renamed_1229(), spridn2);
            return sprcom2;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprrnj(sprcom sprcom2) throws IOException {
        void arg0;
        sprrnj sprrnj2 = this;
        sprrnj2.cfr_renamed_2 = arg0.cfr_renamed_9433();
        sprrnj2.cfr_renamed_3 = sprcom2.cfr_renamed_82() != null ? arg0.cfr_renamed_82().cfr_renamed_91() : null;
        this.cfr_renamed_9431((sprcom)arg0);
    }

    @Override
    public String getFormat() {
        return sprbcq.cfr_renamed_9("\u0000<\u0013$sO");
    }

    public int hashCode() {
        return this.cfr_renamed_91;
    }
}

