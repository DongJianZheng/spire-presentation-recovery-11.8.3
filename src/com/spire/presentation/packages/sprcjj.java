/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyk;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprev;
import com.spire.presentation.packages.sprfnj;
import com.spire.presentation.packages.sprhzk;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprnjk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpsh;
import com.spire.presentation.packages.sprpxk;
import com.spire.presentation.packages.sprqx;
import com.spire.presentation.packages.sprtu;
import com.spire.presentation.packages.sprucq;
import com.spire.presentation.packages.sprxkj;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprcjj
implements sprev {
    public transient spryye cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final boolean cfr_renamed_1;
    public transient int cfr_renamed_2;
    public transient spryye cfr_renamed_3;
    public static final long cfr_renamed_4 = 1L;

    @Override
    public sprqx cfr_renamed_1157() {
        return new sprxkj(this.cfr_renamed_91);
    }

    public String toString() {
        return sprfnj.cfr_renamed_9414(sprucq.cfr_renamed_9("i.P*X(\\|r9@"), this.getAlgorithm(), this.cfr_renamed_91);
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

    public spryye cfr_renamed_9389() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprcom cfr_renamed_1598() {
        try {
            sprcjj sprcjj2 = this;
            spridn spridn2 = spridn.cfr_renamed_23(sprcjj2.cfr_renamed_0);
            sprcom sprcom2 = sprnjk.cfr_renamed_5661(sprcjj2.cfr_renamed_3, spridn2);
            if (!sprcjj2.cfr_renamed_1 || sprjcf.cfr_renamed_5159(sprpsh.cfr_renamed_9("\u0015d\u001b%\u0005{\u001fy\u0013%\u0006x\u001bd\u0012n\u001a%\u0005n\u0015~\u0004b\u0002rX{\u001dh\u00053X}GT\u001fe\u0010d)d\u0018g\u000f"))) return new sprcom(sprcom2.cfr_renamed_1254(), sprcom2.cfr_renamed_1229(), spridn2);
            return sprcom2;
        }
        catch (IOException iOException) {
            return null;
        }
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
        sprcom sprcom4 = sprcom2 = privateKey instanceof sprcjj ? ((sprcjj)privateKey2).cfr_renamed_1598() : sprcom.cfr_renamed_23(privateKey2.getEncoded());
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

    private /* synthetic */ void cfr_renamed_9431(sprcom arg0) throws IOException {
        sprcjj sprcjj2;
        byte[] byArray = sproug.cfr_renamed_23(arg0.cfr_renamed_1229()).cfr_renamed_186();
        if (sprtu.cfr_renamed_2.cfr_renamed_5078(arg0.cfr_renamed_1254().cfr_renamed_593())) {
            sprcjj sprcjj3 = this;
            sprcjj3.cfr_renamed_3 = new sprhzk(byArray);
            sprcjj3.cfr_renamed_91 = ((sprhzk)this.cfr_renamed_3).cfr_renamed_9432();
            sprcjj2 = this;
        } else {
            this.cfr_renamed_3 = new sprbyk(byArray);
            this.cfr_renamed_91 = ((sprbyk)this.cfr_renamed_3).cfr_renamed_9432();
            sprcjj2 = this;
        }
        sprcjj2.cfr_renamed_2 = this.cfr_renamed_2154();
    }

    private /* synthetic */ int cfr_renamed_2154() {
        sprcjj sprcjj2;
        byte[] byArray;
        if (this.cfr_renamed_91 instanceof sprpxk) {
            byArray = ((sprpxk)this.cfr_renamed_91).cfr_renamed_91();
            sprcjj2 = this;
        } else {
            byArray = ((sprnuk)this.cfr_renamed_91).cfr_renamed_91();
            sprcjj2 = this;
        }
        int n = sprcjj2.getAlgorithm().hashCode();
        n = 31 * n + sproze.cfr_renamed_95(byArray);
        return n;
    }

    @Override
    public String getFormat() {
        return sprucq.cfr_renamed_9("\fr\u001fj\u007f\u0001");
    }

    @Override
    public String getAlgorithm() {
        if (sprjcf.cfr_renamed_5159("com.spire.psmodel.security.emulate.oracle")) {
            return sprpsh.cfr_renamed_9("3o2X7");
        }
        if (this.cfr_renamed_3 instanceof sprhzk) {
            return "Ed448";
        }
        return "Ed25519";
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

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_9431(sprcom.cfr_renamed_23(byArray));
    }

    public sprcjj(spryye spryye2) {
        sprcjj sprcjj2;
        this.cfr_renamed_1 = true;
        this.cfr_renamed_0 = null;
        this.cfr_renamed_3 = spryye2;
        if (this.cfr_renamed_3 instanceof sprhzk) {
            this.cfr_renamed_91 = ((sprhzk)this.cfr_renamed_3).cfr_renamed_9432();
            sprcjj2 = this;
        } else {
            this.cfr_renamed_91 = ((sprbyk)this.cfr_renamed_3).cfr_renamed_9432();
            sprcjj2 = this;
        }
        sprcjj2.cfr_renamed_2 = this.cfr_renamed_2154();
    }

    /*
     * WARNING - void declaration
     */
    public sprcjj(sprcom sprcom2) throws IOException {
        void arg0;
        sprcjj sprcjj2 = this;
        sprcjj2.cfr_renamed_1 = arg0.cfr_renamed_9433();
        sprcjj2.cfr_renamed_0 = sprcom2.cfr_renamed_82() != null ? arg0.cfr_renamed_82().cfr_renamed_91() : null;
        this.cfr_renamed_9431((sprcom)arg0);
    }
}

