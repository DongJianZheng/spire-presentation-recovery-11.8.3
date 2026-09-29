/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprhwl;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlob;
import com.spire.presentation.packages.sprlpl;
import com.spire.presentation.packages.sprmfm;
import com.spire.presentation.packages.sprqzz;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrjm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprujm;
import com.spire.presentation.packages.sprunl;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzxl;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class sprypl
implements sprjn,
Serializable {
    private static sprujm[] cfr_renamed_1 = new sprujm[0];
    private transient sprhgm cfr_renamed_2;
    private transient sprkim cfr_renamed_3;
    private static final long cfr_renamed_4 = 20170722001L;

    public Date cfr_renamed_0() {
        return sprzxl.cfr_renamed_10883(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_108().cfr_renamed_111());
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_3.cfr_renamed_89();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public Set cfr_renamed_662() {
        return sprzxl.cfr_renamed_10880(this.cfr_renamed_2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprkim cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprkim.cfr_renamed_23(sprzxl.cfr_renamed_10882(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, sprqzz.cfr_renamed_9("4\u000e5\t6\u001d4\n=O=\u000e-\u000ecO")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprlob.cfr_renamed_9("RjSmPyRn[+[jKj\u0005+")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprujm[] cfr_renamed_82() {
        int n;
        sprszm sprszm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_82();
        sprujm[] sprujmArray = new sprujm[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprszm2.cfr_renamed_84()) {
            int n3 = n++;
            sprujmArray[n3] = sprujm.cfr_renamed_23(sprszm2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprujmArray;
    }

    public boolean[] cfr_renamed_105() {
        return sprzxl.cfr_renamed_10884(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_105());
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public sprkim cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public sprujm[] cfr_renamed_5109(sprlem arg0) {
        int n;
        sprszm sprszm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_82();
        ArrayList<sprujm> arrayList = new ArrayList<sprujm>();
        int n2 = n = 0;
        while (n2 != sprszm2.cfr_renamed_84()) {
            sprujm sprujm2 = sprujm.cfr_renamed_23(sprszm2.cfr_renamed_85(n));
            if (sprujm2.cfr_renamed_204().cfr_renamed_5078(arg0)) {
                arrayList.add(sprujm2);
            }
            n2 = ++n;
        }
        if (arrayList.size() == 0) {
            return cfr_renamed_1;
        }
        ArrayList<sprujm> arrayList2 = arrayList;
        return arrayList2.toArray(new sprujm[arrayList2.size()]);
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_80().cfr_renamed_186();
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

    public Date cfr_renamed_86() {
        return sprzxl.cfr_renamed_10883(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_108().cfr_renamed_109());
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprypl)) {
            return false;
        }
        sprypl sprypl2 = (sprypl)arg0;
        return this.cfr_renamed_3.equals(sprypl2.cfr_renamed_3);
    }

    public Set cfr_renamed_665() {
        return sprzxl.cfr_renamed_10879(this.cfr_renamed_2);
    }

    public sprypl(sprkim sprkim2) {
        sprypl sprypl2 = this;
        sprypl2.cfr_renamed_10885(sprkim2);
    }

    public sprlpl cfr_renamed_93() {
        return new sprlpl((sprszm)this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_93().cfr_renamed_119());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7374(sprhk arg0) throws sprunl {
        sprmfm sprmfm2 = this.cfr_renamed_3.cfr_renamed_83();
        if (!sprzxl.cfr_renamed_9062(sprmfm2.cfr_renamed_79(), this.cfr_renamed_3.cfr_renamed_89())) {
            throw new sprunl(sprqzz.cfr_renamed_9("\u001c0\b7\u000e-\u001a+\ny\u00067\u00198\u00030\u000byBy\u000e5\b6\u001d0\u001b1\u0002y\u0006=\n7\u001b0\t0\n+O4\u0006*\u00028\u001b:\u0007"));
        }
        try {
            OutputStream outputStream;
            sprge sprge2 = arg0.cfr_renamed_5279(sprmfm2.cfr_renamed_79());
            OutputStream outputStream2 = outputStream = sprge2.cfr_renamed_470();
            sprmfm2.cfr_renamed_8489(outputStream2, "DER");
            outputStream2.close();
            return sprge2.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprunl(new StringBuilder().insert(0, sprlob.cfr_renamed_9("~Qj]gZ+Kd\u001f{Md\\nLx\u001fxVlQjK~Mn\u0005+")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        void arg0;
        void v0 = arg0;
        v0.defaultReadObject();
        this.cfr_renamed_10885(sprkim.cfr_renamed_23(v0.readObject()));
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_10885(sprkim sprkim2) {
        void arg0;
        sprypl sprypl2 = this;
        sprypl2.cfr_renamed_3 = arg0;
        sprypl2.cfr_renamed_2 = sprkim2.cfr_renamed_83().cfr_renamed_98();
    }

    public BigInteger cfr_renamed_114() {
        return this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_114().cfr_renamed_97();
    }

    public List cfr_renamed_583() {
        return sprzxl.cfr_renamed_5274(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_631(Date arg0) {
        sprrjm sprrjm2 = this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_108();
        return !arg0.before(sprzxl.cfr_renamed_10883(sprrjm2.cfr_renamed_111())) && !arg0.after(sprzxl.cfr_renamed_10883(sprrjm2.cfr_renamed_109()));
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public sprhwl cfr_renamed_102() {
        return new sprhwl(this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_102());
    }

    public sprypl(byte[] arg0) throws IOException {
        this(sprypl.cfr_renamed_1443(arg0));
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_83().cfr_renamed_3().cfr_renamed_5023() + 1;
    }
}

