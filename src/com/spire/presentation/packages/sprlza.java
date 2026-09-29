/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprade;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprmxn;
import com.spire.presentation.packages.sprpcb;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwjb;
import com.spire.presentation.packages.spryge;
import com.spire.presentation.packages.spryny;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class sprlza {
    private static sprade[] cfr_renamed_3 = new sprade[0];
    private sprwjb cfr_renamed_4;

    public spruhe cfr_renamed_1485() {
        return spruhe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_1486().cfr_renamed_1485());
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_4.cfr_renamed_89();
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_81();
    }

    public sprlza(byte[] arg0) throws IOException {
        this(sprlza.cfr_renamed_1443(arg0));
    }

    public sprade[] cfr_renamed_82() {
        int n;
        sprere sprere2 = this.cfr_renamed_4.cfr_renamed_1486().cfr_renamed_82();
        if (sprere2 == null) {
            return cfr_renamed_3;
        }
        sprade[] spradeArray = new sprade[sprere2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprere2.cfr_renamed_84()) {
            int n3 = n++;
            spradeArray[n3] = sprade.cfr_renamed_23(sprere2.cfr_renamed_85(n3));
            n2 = n;
        }
        return spradeArray;
    }

    public sprwjb cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprade[] cfr_renamed_1487(sprtzd arg0) {
        int n;
        sprere sprere2 = this.cfr_renamed_4.cfr_renamed_1486().cfr_renamed_82();
        if (sprere2 == null) {
            return cfr_renamed_3;
        }
        ArrayList<sprade> arrayList = new ArrayList<sprade>();
        int n2 = n = 0;
        while (n2 != sprere2.cfr_renamed_84()) {
            sprade sprade2 = sprade.cfr_renamed_23(sprere2.cfr_renamed_85(n));
            if (sprade2.cfr_renamed_204().equals(arg0)) {
                arrayList.add(sprade2);
            }
            n2 = ++n;
        }
        if (arrayList.size() == 0) {
            return cfr_renamed_3;
        }
        ArrayList<sprade> arrayList2 = arrayList;
        return arrayList2.toArray(new sprade[arrayList2.size()]);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprlza)) {
            return false;
        }
        sprlza sprlza2 = (sprlza)arg0;
        return this.cfr_renamed_568().equals(sprlza2.cfr_renamed_568());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1488(sprja arg0) throws sprfxa {
        spryge spryge2 = this.cfr_renamed_4.cfr_renamed_1486();
        try {
            sprga sprga2 = arg0.cfr_renamed_578(this.cfr_renamed_4.cfr_renamed_89());
            OutputStream outputStream = sprga2.cfr_renamed_470();
            outputStream.write(spryge2.cfr_renamed_104("DER"));
            outputStream.close();
            return sprga2.cfr_renamed_1435(this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new sprfxa(new StringBuilder().insert(0, sprmxn.cfr_renamed_9("\f|\u0018p\u0015wYf\u00162\t`\u0016q\u001ca\n2\n{\u001e|\u0018f\f`\u001c(Y")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprdce cfr_renamed_1489() {
        return this.cfr_renamed_4.cfr_renamed_1486().cfr_renamed_1489();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprwjb cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprwjb.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprpcb(new StringBuilder().insert(0, spryny.cfr_renamed_9("WHVOU[WL^\t^HNH\u0000\t")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprpcb(new StringBuilder().insert(0, sprmxn.cfr_renamed_9("\u007f\u0018~\u001f}\u000b\u007f\u001cvYv\u0018f\u0018(Y")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public int hashCode() {
        return this.cfr_renamed_568().hashCode();
    }

    public sprlza(sprwjb sprwjb2) {
        this.cfr_renamed_4 = sprwjb2;
    }
}

