/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbee;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprexd;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvmz;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwry;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprcyd {
    private sprszd cfr_renamed_3;
    private sprcge cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1488(sprja arg0) throws sprexd {
        sprbee sprbee2 = this.cfr_renamed_4.cfr_renamed_2151();
        if (!sprlod.cfr_renamed_2157(sprbee2.cfr_renamed_79(), this.cfr_renamed_4.cfr_renamed_89())) {
            throw new sprexd(sprwry.cfr_renamed_9("N(Z/\\5H3XaT/K Q(Ya\u0010a\\-Z.O(I)PaT%X/I([(X3\u001d,T2P I\"U"));
        }
        try {
            sprga sprga2 = arg0.cfr_renamed_578(sprbee2.cfr_renamed_79());
            OutputStream outputStream = sprga2.cfr_renamed_470();
            new sprpve(outputStream).cfr_renamed_2149(sprbee2);
            outputStream.close();
            return sprga2.cfr_renamed_1435(this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new sprexd(new StringBuilder().insert(0, sprvmz.cfr_renamed_9("$r0~=yqh><!n>\u007f4o\"<\"u6r0h$n4&q")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprdce cfr_renamed_1489() {
        return this.cfr_renamed_4.cfr_renamed_1489();
    }

    /*
     * WARNING - void declaration
     */
    public sprcyd(sprcge sprcge2) {
        void arg0;
        sprcyd sprcyd2 = this;
        sprcyd2.cfr_renamed_4 = arg0;
        sprcyd2.cfr_renamed_3 = sprcge2.cfr_renamed_2151().cfr_renamed_98();
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_81();
    }

    public List cfr_renamed_583() {
        return sprlod.cfr_renamed_582(this.cfr_renamed_3);
    }

    public Date cfr_renamed_86() {
        return this.cfr_renamed_4.cfr_renamed_2146().cfr_renamed_110();
    }

    public Set cfr_renamed_665() {
        return sprlod.cfr_renamed_4234(this.cfr_renamed_3);
    }

    public int cfr_renamed_569() {
        return this.cfr_renamed_4.cfr_renamed_569();
    }

    public sprcyd(byte[] arg0) throws IOException {
        this(sprcyd.cfr_renamed_1443(arg0));
    }

    public spruhe cfr_renamed_1485() {
        return spruhe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1485());
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public Set cfr_renamed_662() {
        return sprlod.cfr_renamed_4236(this.cfr_renamed_3);
    }

    public spruhe cfr_renamed_102() {
        return spruhe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_102());
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_4.cfr_renamed_89();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprcge cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprcge.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprwry.cfr_renamed_9(",\\-[.O,X%\u001d%\\5\\{\u001d")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprvmz.cfr_renamed_9("q0p7s#q4xqx0h0&q")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprcge cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprcyd)) {
            return false;
        }
        sprcyd sprcyd2 = (sprcyd)arg0;
        return this.cfr_renamed_4.equals(sprcyd2.cfr_renamed_4);
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_3 != null;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public boolean cfr_renamed_631(Date arg0) {
        return !arg0.before(this.cfr_renamed_4.cfr_renamed_2148().cfr_renamed_110()) && !arg0.after(this.cfr_renamed_4.cfr_renamed_2146().cfr_renamed_110());
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_100(arg0);
        }
        return null;
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_4.cfr_renamed_114().cfr_renamed_97();
    }

    public Date cfr_renamed_0() {
        return this.cfr_renamed_4.cfr_renamed_2148().cfr_renamed_110();
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_4.cfr_renamed_569();
    }
}

