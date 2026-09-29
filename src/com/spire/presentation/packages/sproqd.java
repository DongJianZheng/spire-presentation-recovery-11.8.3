/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawha;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdge;
import com.spire.presentation.packages.sprexd;
import com.spire.presentation.packages.sprga;
import com.spire.presentation.packages.sprgsd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprlod;
import com.spire.presentation.packages.sprmsd;
import com.spire.presentation.packages.sprnfe;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprqmn;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruee;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxde;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sproqd {
    private sprszd cfr_renamed_2;
    private sprnfe cfr_renamed_3;
    private static sprxde[] cfr_renamed_4 = new sprxde[0];

    public List cfr_renamed_583() {
        return sprlod.cfr_renamed_582(this.cfr_renamed_2);
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public sprxde[] cfr_renamed_82() {
        int n;
        sprbne sprbne2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_82();
        sprxde[] sprxdeArray = new sprxde[sprbne2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprbne2.cfr_renamed_84()) {
            int n3 = n++;
            sprxdeArray[n3] = sprxde.cfr_renamed_23(sprbne2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprxdeArray;
    }

    public boolean cfr_renamed_631(Date arg0) {
        sprdge sprdge2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_108();
        return !arg0.before(sprlod.cfr_renamed_4237(sprdge2.cfr_renamed_111())) && !arg0.after(sprlod.cfr_renamed_4237(sprdge2.cfr_renamed_109()));
    }

    public sprszd cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sproqd)) {
            return false;
        }
        sproqd sproqd2 = (sproqd)arg0;
        return this.cfr_renamed_3.equals(sproqd2.cfr_renamed_3);
    }

    public Date cfr_renamed_86() {
        return sprlod.cfr_renamed_4237(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_108().cfr_renamed_109());
    }

    public Date cfr_renamed_0() {
        return sprlod.cfr_renamed_4237(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_108().cfr_renamed_111());
    }

    public sprtie cfr_renamed_100(sprtzd arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_100(arg0);
        }
        return null;
    }

    public Set cfr_renamed_665() {
        return sprlod.cfr_renamed_4234(this.cfr_renamed_2);
    }

    public sprije cfr_renamed_89() {
        return this.cfr_renamed_3.cfr_renamed_89();
    }

    /*
     * WARNING - void declaration
     */
    public sproqd(sprnfe sprnfe2) {
        void arg0;
        sproqd sproqd2 = this;
        sproqd2.cfr_renamed_3 = arg0;
        sproqd2.cfr_renamed_2 = sprnfe2.cfr_renamed_83().cfr_renamed_98();
    }

    public sproqd(byte[] arg0) throws IOException {
        this(sproqd.cfr_renamed_1443(arg0));
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprmsd cfr_renamed_102() {
        return new sprmsd(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_102());
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_3().cfr_renamed_97().intValue() + 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_1488(sprja arg0) throws sprexd {
        spruee spruee2 = this.cfr_renamed_3.cfr_renamed_83();
        if (!sprlod.cfr_renamed_2157(spruee2.cfr_renamed_79(), this.cfr_renamed_3.cfr_renamed_89())) {
            throw new sprexd(sprawha.cfr_renamed_9("AjUmSwGqW#[mDb^jV#\u001f#SoUl@jFk_#[gWmFjTjWq\u0012n[p_bF`Z"));
        }
        try {
            sprga sprga2 = arg0.cfr_renamed_578(spruee2.cfr_renamed_79());
            OutputStream outputStream = sprga2.cfr_renamed_470();
            new sprpve(outputStream).cfr_renamed_2149(spruee2);
            outputStream.close();
            return sprga2.cfr_renamed_1435(this.cfr_renamed_3.cfr_renamed_80().cfr_renamed_81());
        }
        catch (Exception exception) {
            throw new sprexd(new StringBuilder().insert(0, sprqmn.cfr_renamed_9("17%;(<d-+y4++:!*7y70#7%-1+!cd")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprxde[] cfr_renamed_1487(sprtzd arg0) {
        int n;
        sprbne sprbne2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_82();
        ArrayList<sprxde> arrayList = new ArrayList<sprxde>();
        int n2 = n = 0;
        while (n2 != sprbne2.cfr_renamed_84()) {
            sprxde sprxde2 = sprxde.cfr_renamed_23(sprbne2.cfr_renamed_85(n));
            if (sprxde2.cfr_renamed_204().equals(arg0)) {
                arrayList.add(sprxde2);
            }
            n2 = ++n;
        }
        if (arrayList.size() == 0) {
            return cfr_renamed_4;
        }
        ArrayList<sprxde> arrayList2 = arrayList;
        return arrayList2.toArray(new sprxde[arrayList2.size()]);
    }

    public Set cfr_renamed_662() {
        return sprlod.cfr_renamed_4236(this.cfr_renamed_2);
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_80().cfr_renamed_81();
    }

    public sprgsd cfr_renamed_93() {
        return new sprgsd((sprbne)this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_93().cfr_renamed_119());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprnfe cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprnfe.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprawha.cfr_renamed_9("nSoTl@nWg\u0012gSwS9\u0012")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprqmn.cfr_renamed_9("4%5\"664!=d=%-%cd")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public boolean[] cfr_renamed_105() {
        return sprlod.cfr_renamed_4238(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_105());
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_114().cfr_renamed_97();
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    public sprnfe cfr_renamed_568() {
        return this.cfr_renamed_3;
    }
}

