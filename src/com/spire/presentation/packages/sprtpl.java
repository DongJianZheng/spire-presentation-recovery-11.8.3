/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprccm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmqba;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnfm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprunl;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzxl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprtpl
implements sprjn,
Serializable {
    private static final long cfr_renamed_2 = 20170722001L;
    private transient sprndm cfr_renamed_3;
    private transient sprhgm cfr_renamed_4;

    public sprtpl(byte[] arg0) throws IOException {
        this(sprtpl.cfr_renamed_1443(arg0));
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprtpl)) {
            return false;
        }
        sprtpl sprtpl2 = (sprtpl)arg0;
        return this.cfr_renamed_3.equals(sprtpl2.cfr_renamed_3);
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_4 != null;
    }

    public sprnbm cfr_renamed_1485() {
        return sprnbm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_1485());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10881(sprndm sprndm2) {
        void arg0;
        sprtpl sprtpl2 = this;
        sprtpl2.cfr_renamed_3 = arg0;
        sprtpl2.cfr_renamed_4 = sprndm2.cfr_renamed_2151().cfr_renamed_98();
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_3.cfr_renamed_89();
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_5024(arg0);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_10877(sprhk arg0) throws sprunl {
        sprdzl sprdzl2 = this.cfr_renamed_3.cfr_renamed_2151();
        sprccm sprccm2 = sprccm.cfr_renamed_5322(sprdzl2.cfr_renamed_98());
        sprnfm sprnfm2 = sprnfm.cfr_renamed_5322(sprdzl2.cfr_renamed_98());
        try {
            int n;
            sprge sprge2 = arg0.cfr_renamed_5279(sprddm.cfr_renamed_23(sprccm2.cfr_renamed_119()));
            OutputStream outputStream = sprge2.cfr_renamed_470();
            sprszm sprszm2 = sprszm.cfr_renamed_23(sprdzl2.cfr_renamed_119());
            sprrvm sprrvm2 = new sprrvm();
            int n2 = n = 0;
            while (true) {
                if (n2 == sprszm2.cfr_renamed_84() - 1) {
                    sprrvm2.cfr_renamed_5004(sprzxl.cfr_renamed_10878(3, sprdzl2.cfr_renamed_98()));
                    new sprcen(sprrvm2).cfr_renamed_8489(outputStream, "DER");
                    outputStream.close();
                    return sprge2.cfr_renamed_1435(sprnfm2.cfr_renamed_79().cfr_renamed_186());
                }
                if (n != 2) {
                    sprrvm2.cfr_renamed_5004(sprszm2.cfr_renamed_85(n));
                }
                n2 = ++n;
            }
        }
        catch (Exception exception) {
            throw new sprunl(new StringBuilder().insert(0, sprmqba.cfr_renamed_9("@XTTYS\u0015BZ\u0016EDZUPEF\u0016F_RXTB@DP\f\u0015")).append(exception.getMessage()).toString(), exception);
        }
    }

    public Date cfr_renamed_86() {
        return this.cfr_renamed_3.cfr_renamed_2146().cfr_renamed_110();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_114().cfr_renamed_97();
    }

    public Set cfr_renamed_665() {
        return sprzxl.cfr_renamed_10879(this.cfr_renamed_4);
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_569();
    }

    public List cfr_renamed_583() {
        return sprzxl.cfr_renamed_5274(this.cfr_renamed_4);
    }

    public sprnbm cfr_renamed_102() {
        return sprnbm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_102());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7374(sprhk arg0) throws sprunl {
        sprdzl sprdzl2 = this.cfr_renamed_3.cfr_renamed_2151();
        if (!sprzxl.cfr_renamed_9062(sprdzl2.cfr_renamed_79(), this.cfr_renamed_3.cfr_renamed_89())) {
            throw new sprunl(DataColumn.cfr_renamed_9("\u0001\u0018\u0015\u001f\u0013\u0005\u0007\u0003\u0017Q\u001b\u001f\u0004\u0010\u001e\u0018\u0016Q_Q\u0013\u001d\u0015\u001e\u0000\u0018\u0006\u0019\u001fQ\u001b\u0015\u0017\u001f\u0006\u0018\u0014\u0018\u0017\u0003R\u001c\u001b\u0002\u001f\u0010\u0006\u0012\u001a"));
        }
        try {
            OutputStream outputStream;
            sprge sprge2 = arg0.cfr_renamed_5279(sprdzl2.cfr_renamed_79());
            OutputStream outputStream2 = outputStream = sprge2.cfr_renamed_470();
            sprdzl2.cfr_renamed_8489(outputStream2, "DER");
            outputStream2.close();
            return sprge2.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprunl(new StringBuilder().insert(0, sprmqba.cfr_renamed_9("@XTTYS\u0015BZ\u0016EDZUPEF\u0016F_RXTB@DP\f\u0015")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        void arg0;
        void v0 = arg0;
        v0.defaultReadObject();
        this.cfr_renamed_10881(sprndm.cfr_renamed_23(v0.readObject()));
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public int cfr_renamed_569() {
        return this.cfr_renamed_3.cfr_renamed_569();
    }

    public sprtpl(sprndm sprndm2) {
        sprtpl sprtpl2 = this;
        sprtpl2.cfr_renamed_10881(sprndm2);
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

    public sprndm cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public Date cfr_renamed_0() {
        return this.cfr_renamed_3.cfr_renamed_2148().cfr_renamed_110();
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_79().cfr_renamed_186();
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprndm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprndm.cfr_renamed_23(sprzxl.cfr_renamed_10882(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, DataColumn.cfr_renamed_9("\u001c\u0013\u001d\u0014\u001e\u0000\u001c\u0017\u0015R\u0015\u0013\u0005\u0013KR")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprmqba.cfr_renamed_9("[TZSYG[PR\u0015RTBT\f\u0015")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public boolean cfr_renamed_631(Date arg0) {
        return !arg0.before(this.cfr_renamed_3.cfr_renamed_2148().cfr_renamed_110()) && !arg0.after(this.cfr_renamed_3.cfr_renamed_2146().cfr_renamed_110());
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_3.cfr_renamed_1489();
    }

    public Set cfr_renamed_662() {
        return sprzxl.cfr_renamed_10880(this.cfr_renamed_4);
    }
}

