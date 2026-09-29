/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprefm;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprjhm;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spryjm;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class sprlpl
implements sprhd {
    private static sprlj cfr_renamed_3;
    public final spryjm cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprddm cfr_renamed_410() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_410();
        }
        return null;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprlpl)) {
            return false;
        }
        sprlpl sprlpl2 = (sprlpl)arg0;
        return this.cfr_renamed_4.equals(sprlpl2.cfr_renamed_4);
    }

    public BigInteger cfr_renamed_114() {
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            return this.cfr_renamed_4.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprlpl(sprnbm sprnbm2, BigInteger bigInteger) {
        void arg1;
        void arg0;
        sprlpl sprlpl2 = this;
        sprlpl2.cfr_renamed_4 = new spryjm(new sprjhm(this.cfr_renamed_11035((sprnbm)arg0), new sprktm((BigInteger)arg1)));
    }

    private /* synthetic */ sprnbm[] cfr_renamed_11036(sprigm[] arg0) {
        int n;
        ArrayList<sprnbm> arrayList = new ArrayList<sprnbm>(arg0.length);
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n].cfr_renamed_312() == 4) {
                arrayList.add(sprnbm.cfr_renamed_23(arg0[n].cfr_renamed_313()));
            }
            n2 = ++n;
        }
        ArrayList<sprnbm> arrayList2 = arrayList;
        return arrayList2.toArray(new sprnbm[arrayList2.size()]);
    }

    public byte[] cfr_renamed_412() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_412().cfr_renamed_81();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprlpl(int n, sprlem sprlem2, sprlem sprlem3, byte[] byArray) {
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        sprlpl sprlpl2 = this;
        sprlpl2.cfr_renamed_4 = new spryjm(new sprefm((int)arg0, (sprlem)arg2, new sprddm((sprlem)arg1), sproze.cfr_renamed_158((byte[])arg3)));
    }

    /*
     * WARNING - void declaration
     */
    public sprlpl(sprtpl sprtpl2) {
        void arg0;
        sprlpl sprlpl2 = this;
        sprlpl2.cfr_renamed_4 = new spryjm(new sprjhm(this.cfr_renamed_11035(arg0.cfr_renamed_102()), new sprktm(arg0.cfr_renamed_114())));
    }

    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof sprtpl)) {
            return false;
        }
        sprtpl sprtpl2 = (sprtpl)arg0;
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            if (this.cfr_renamed_4.cfr_renamed_404().cfr_renamed_405().cfr_renamed_5103(sprtpl2.cfr_renamed_114())) {
                sprlpl sprlpl2 = this;
                if (sprlpl2.cfr_renamed_11034(sprtpl2.cfr_renamed_102(), sprlpl2.cfr_renamed_4.cfr_renamed_404().cfr_renamed_102())) {
                    return true;
                }
            }
            return false;
        }
        if (this.cfr_renamed_4.cfr_renamed_407() != null) {
            sprlpl sprlpl3 = this;
            if (sprlpl3.cfr_renamed_11034(sprtpl2.cfr_renamed_1485(), sprlpl3.cfr_renamed_4.cfr_renamed_407())) {
                return true;
            }
        }
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            try {
                OutputStream outputStream;
                sprjj sprjj2 = cfr_renamed_3.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_410());
                OutputStream outputStream2 = sprjj2.cfr_renamed_470();
                switch (this.cfr_renamed_411()) {
                    case 0: {
                        OutputStream outputStream3 = outputStream2;
                        while (false) {
                        }
                        outputStream = outputStream3;
                        outputStream3.write(sprtpl2.cfr_renamed_1489().cfr_renamed_91());
                        break;
                    }
                    case 1: {
                        outputStream2.write(sprtpl2.cfr_renamed_91());
                    }
                    default: {
                        outputStream = outputStream2;
                    }
                }
                outputStream.close();
                if (!sproze.cfr_renamed_92(sprjj2.cfr_renamed_580(), this.cfr_renamed_412())) {
                    return false;
                }
            }
            catch (Exception exception) {
                return false;
            }
        }
        return false;
    }

    public sprnbm[] cfr_renamed_102() {
        if (this.cfr_renamed_4.cfr_renamed_404() != null) {
            sprlpl sprlpl2 = this;
            return sprlpl2.cfr_renamed_11036(sprlpl2.cfr_renamed_4.cfr_renamed_404().cfr_renamed_102().cfr_renamed_289());
        }
        return null;
    }

    public sprlpl(sprszm sprszm2) {
        this.cfr_renamed_4 = spryjm.cfr_renamed_23(sprszm2);
    }

    public int cfr_renamed_411() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            return this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_411().cfr_renamed_5023();
        }
        return -1;
    }

    @Override
    public Object clone() {
        return new sprlpl((sprszm)this.cfr_renamed_4.cfr_renamed_119());
    }

    private /* synthetic */ boolean cfr_renamed_11034(sprnbm arg0, spraem arg1) {
        int n;
        sprigm[] sprigmArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprigmArray.length) {
            sprigm sprigm2 = sprigmArray[n];
            if (sprigm2.cfr_renamed_312() == 4 && sprnbm.cfr_renamed_23(sprigm2.cfr_renamed_313()).equals(arg0)) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprlpl(sprnbm sprnbm2) {
        void arg0;
        sprlpl sprlpl2 = this;
        this.cfr_renamed_4 = new spryjm(this.cfr_renamed_11035((sprnbm)arg0));
    }

    private /* synthetic */ spraem cfr_renamed_11035(sprnbm arg0) {
        return new spraem(new sprigm(arg0));
    }

    public static void cfr_renamed_11037(sprlj arg0) {
        cfr_renamed_3 = arg0;
    }

    public sprnbm[] cfr_renamed_238() {
        if (this.cfr_renamed_4.cfr_renamed_407() != null) {
            sprlpl sprlpl2 = this;
            return sprlpl2.cfr_renamed_11036(sprlpl2.cfr_renamed_4.cfr_renamed_407().cfr_renamed_289());
        }
        return null;
    }

    public sprlem cfr_renamed_415() {
        if (this.cfr_renamed_4.cfr_renamed_409() != null) {
            new sprlem(this.cfr_renamed_4.cfr_renamed_409().cfr_renamed_415().cfr_renamed_19());
        }
        return null;
    }
}

