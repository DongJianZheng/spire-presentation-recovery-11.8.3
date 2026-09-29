/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlqm;
import com.spire.presentation.packages.sprlzz;
import com.spire.presentation.packages.sprmzh;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprvhf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;

public class sprmqg {
    private sprmzh cfr_renamed_3;
    private static sprurm[] cfr_renamed_4 = new sprurm[0];

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public sprurm[] cfr_renamed_5109(sprlem arg0) {
        int n;
        spridn spridn2 = this.cfr_renamed_3.cfr_renamed_1486().cfr_renamed_82();
        if (spridn2 == null) {
            return cfr_renamed_4;
        }
        ArrayList<sprurm> arrayList = new ArrayList<sprurm>();
        int n2 = n = 0;
        while (n2 != spridn2.cfr_renamed_84()) {
            sprurm sprurm2 = sprurm.cfr_renamed_23(spridn2.cfr_renamed_85(n));
            if (sprurm2.cfr_renamed_204().cfr_renamed_5078(arg0)) {
                arrayList.add(sprurm2);
            }
            n2 = ++n;
        }
        if (arrayList.size() == 0) {
            return cfr_renamed_4;
        }
        ArrayList<sprurm> arrayList2 = arrayList;
        return arrayList2.toArray(new sprurm[arrayList2.size()]);
    }

    public int hashCode() {
        return this.cfr_renamed_568().hashCode();
    }

    public sprddm cfr_renamed_89() {
        return this.cfr_renamed_3.cfr_renamed_89();
    }

    public sprnbm cfr_renamed_1485() {
        return sprnbm.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_1486().cfr_renamed_1485());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7374(sprhk arg0) throws sprhng {
        sprlqm sprlqm2 = this.cfr_renamed_3.cfr_renamed_1486();
        try {
            sprge sprge2 = arg0.cfr_renamed_5279(this.cfr_renamed_3.cfr_renamed_89());
            OutputStream outputStream = sprge2.cfr_renamed_470();
            outputStream.write(sprlqm2.cfr_renamed_104("DER"));
            outputStream.close();
            return sprge2.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprhng(new StringBuilder().insert(0, sprlzz.cfr_renamed_9("qNeBhE$Tk\u0000tRkCaSw\u0000wIcNeTqRa\u001a$")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprhgm cfr_renamed_7375() {
        int n;
        sprurm[] sprurmArray = this.cfr_renamed_82();
        int n2 = n = 0;
        while (n2 != sprurmArray.length) {
            sprurm sprurm2 = sprurmArray[n];
            if (sprdl.cfr_renamed_1534.cfr_renamed_5078(sprurm2.cfr_renamed_204())) {
                sprgem sprgem2 = new sprgem();
                spridn spridn2 = sprurm2.cfr_renamed_206();
                if (spridn2 == null || spridn2.cfr_renamed_84() == 0) {
                    throw new IllegalStateException(sprajp.cfr_renamed_9("r-a5]\u007f]'v\u0019g>v#l5k)l\u0014g7w#q2\"6p#q#l2\"$w2\".c5\"(mft'n3g"));
                }
                sprszm sprszm2 = sprszm.cfr_renamed_23(spridn2.cfr_renamed_85(0));
                try {
                    Enumeration enumeration = sprszm2.cfr_renamed_329();
                    while (enumeration.hasMoreElements()) {
                        boolean bl;
                        sprszm sprszm3 = sprszm.cfr_renamed_23(enumeration.nextElement());
                        boolean bl2 = bl = sprszm3.cfr_renamed_84() == 3 && sprbxm.cfr_renamed_23(sprszm3.cfr_renamed_85(1)).cfr_renamed_587();
                        if (sprszm3.cfr_renamed_84() == 2) {
                            sprgem2.cfr_renamed_5013(sprlem.cfr_renamed_23(sprszm3.cfr_renamed_85(0)), false, sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(1)).cfr_renamed_186());
                            continue;
                        }
                        if (sprszm3.cfr_renamed_84() == 3) {
                            sprgem2.cfr_renamed_5013(sprlem.cfr_renamed_23(sprszm3.cfr_renamed_85(0)), bl, sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(2)).cfr_renamed_186());
                            continue;
                        }
                        throw new IllegalStateException(new StringBuilder().insert(0, sprlzz.cfr_renamed_9("mNgOvRaCp\u0000wEuUaNgE$SmZa\u0000kF$e|TaNwIkN$GaT$")).append(sprszm3.cfr_renamed_84()).append(sprajp.cfr_renamed_9("fg>r#a2g\"\"t\")pfv.p#g")).toString());
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw sprvhf.cfr_renamed_5211(new StringBuilder().insert(0, sprlzz.cfr_renamed_9("eSj\u0011$PvOgEwSmNc\u0000mSwUa\u001a$")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
                }
                return sprgem2.cfr_renamed_31();
            }
            n2 = ++n;
        }
        return null;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprmqg)) {
            return false;
        }
        sprmqg sprmqg2 = (sprmqg)arg0;
        return this.cfr_renamed_568().equals(sprmqg2.cfr_renamed_568());
    }

    /*
     * WARNING - void declaration
     */
    public sprmqg(sprmzh sprmzh2) {
        void arg0;
        if (sprmzh2 == null) {
            throw new NullPointerException(sprajp.cfr_renamed_9("a#p2k k%c2k)l\u0014g7w#q2\"%c(l)vf`#\"(w*n"));
        }
        this.cfr_renamed_3 = arg0;
    }

    public byte[] cfr_renamed_79() {
        return this.cfr_renamed_3.cfr_renamed_79().cfr_renamed_186();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprmzh cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            sprmzh sprmzh2 = sprmzh.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
            if (sprmzh2 == null) {
                throw new sprdkg(sprlzz.cfr_renamed_9("EiPpY$DeTe\u0000tAwSaD$Tk\u0000gOjSpRqCpOv"));
            }
            return sprmzh2;
        }
        catch (ClassCastException classCastException) {
            throw new sprdkg(new StringBuilder().insert(0, sprajp.cfr_renamed_9("+c*d)p+g\"\"\"c2c|\"")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprdkg(new StringBuilder().insert(0, sprlzz.cfr_renamed_9("MeLbOvMaD$DeTe\u001a$")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprmzh cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    public sprvhm cfr_renamed_1489() {
        return this.cfr_renamed_3.cfr_renamed_1486().cfr_renamed_1489();
    }

    public sprurm[] cfr_renamed_82() {
        int n;
        spridn spridn2 = this.cfr_renamed_3.cfr_renamed_1486().cfr_renamed_82();
        if (spridn2 == null) {
            return cfr_renamed_4;
        }
        sprurm[] sprurmArray = new sprurm[spridn2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != spridn2.cfr_renamed_84()) {
            int n3 = n++;
            sprurmArray[n3] = sprurm.cfr_renamed_23(spridn2.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprurmArray;
    }

    public sprmqg(byte[] arg0) throws IOException {
        this(sprmqg.cfr_renamed_1443(arg0));
    }
}

