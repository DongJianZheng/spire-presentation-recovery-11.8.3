/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdhe;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprnhe;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprqee;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.sprzra;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class sprgsd
implements sprb {
    public final sprdhe cfr_renamed_3;
    private static spraa cfr_renamed_4;

    public spruhe[] cfr_renamed_102() {
        if (this.cfr_renamed_3.cfr_renamed_404() != null) {
            sprgsd sprgsd2 = this;
            return sprgsd2.cfr_renamed_4432(sprgsd2.cfr_renamed_3.cfr_renamed_404().cfr_renamed_102().cfr_renamed_289());
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgsd(int n, sprtzd sprtzd2, sprtzd sprtzd3, byte[] byArray) {
        void arg3;
        void arg1;
        void arg2;
        void arg0;
        sprgsd sprgsd2 = this;
        sprgsd2.cfr_renamed_3 = new sprdhe(new sprqee((int)arg0, (sprtzd)arg2, new sprije((sprtzd)arg1), sprzra.cfr_renamed_158((byte[])arg3)));
    }

    private /* synthetic */ spryee cfr_renamed_4433(spruhe arg0) {
        return new spryee(new sprmee(arg0));
    }

    public sprije cfr_renamed_410() {
        if (this.cfr_renamed_3.cfr_renamed_409() != null) {
            return this.cfr_renamed_3.cfr_renamed_409().cfr_renamed_410();
        }
        return null;
    }

    private /* synthetic */ spruhe[] cfr_renamed_4432(sprmee[] arg0) {
        int n;
        ArrayList<spruhe> arrayList = new ArrayList<spruhe>(arg0.length);
        int n2 = n = 0;
        while (n2 != arg0.length) {
            if (arg0[n].cfr_renamed_312() == 4) {
                arrayList.add(spruhe.cfr_renamed_23(arg0[n].cfr_renamed_313()));
            }
            n2 = ++n;
        }
        ArrayList<spruhe> arrayList2 = arrayList;
        return arrayList2.toArray(new spruhe[arrayList2.size()]);
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public int cfr_renamed_411() {
        if (this.cfr_renamed_3.cfr_renamed_409() != null) {
            return this.cfr_renamed_3.cfr_renamed_409().cfr_renamed_411().cfr_renamed_97().intValue();
        }
        return -1;
    }

    public byte[] cfr_renamed_412() {
        if (this.cfr_renamed_3.cfr_renamed_409() != null) {
            return this.cfr_renamed_3.cfr_renamed_409().cfr_renamed_412().cfr_renamed_81();
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprgsd(spruhe spruhe2, BigInteger bigInteger) {
        void arg1;
        void arg0;
        sprgsd sprgsd2 = this;
        sprgsd2.cfr_renamed_3 = new sprdhe(new sprnhe(new spryee(new sprmee((spruhe)arg0)), new sprooe((BigInteger)arg1)));
    }

    private /* synthetic */ boolean cfr_renamed_4431(spruhe arg0, spryee arg1) {
        int n;
        sprmee[] sprmeeArray = arg1.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            sprmee sprmee2 = sprmeeArray[n];
            if (sprmee2.cfr_renamed_312() == 4 && spruhe.cfr_renamed_23(sprmee2.cfr_renamed_313()).equals(arg0)) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprgsd(sprcyd sprcyd2) {
        void arg0;
        sprgsd sprgsd2 = this;
        sprgsd2.cfr_renamed_3 = new sprdhe(new sprnhe(this.cfr_renamed_4433(arg0.cfr_renamed_102()), new sprooe(arg0.cfr_renamed_114())));
    }

    public BigInteger cfr_renamed_114() {
        if (this.cfr_renamed_3.cfr_renamed_404() != null) {
            return this.cfr_renamed_3.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97();
        }
        return null;
    }

    public sprgsd(sprbne sprbne2) {
        this.cfr_renamed_3 = sprdhe.cfr_renamed_23(sprbne2);
    }

    public static void cfr_renamed_4434(spraa arg0) {
        cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprgsd(spruhe spruhe2) {
        void arg0;
        sprgsd sprgsd2 = this;
        this.cfr_renamed_3 = new sprdhe(this.cfr_renamed_4433((spruhe)arg0));
    }

    @Override
    public boolean cfr_renamed_132(Object arg0) {
        if (!(arg0 instanceof sprcyd)) {
            return false;
        }
        sprcyd sprcyd2 = (sprcyd)arg0;
        if (this.cfr_renamed_3.cfr_renamed_404() != null) {
            if (this.cfr_renamed_3.cfr_renamed_404().cfr_renamed_405().cfr_renamed_97().equals(sprcyd2.cfr_renamed_114())) {
                sprgsd sprgsd2 = this;
                if (sprgsd2.cfr_renamed_4431(sprcyd2.cfr_renamed_102(), sprgsd2.cfr_renamed_3.cfr_renamed_404().cfr_renamed_102())) {
                    return true;
                }
            }
            return false;
        }
        if (this.cfr_renamed_3.cfr_renamed_407() != null) {
            sprgsd sprgsd3 = this;
            if (sprgsd3.cfr_renamed_4431(sprcyd2.cfr_renamed_1485(), sprgsd3.cfr_renamed_3.cfr_renamed_407())) {
                return true;
            }
        }
        if (this.cfr_renamed_3.cfr_renamed_409() != null) {
            try {
                OutputStream outputStream;
                sprpa sprpa2 = cfr_renamed_4.cfr_renamed_578(this.cfr_renamed_3.cfr_renamed_409().cfr_renamed_410());
                OutputStream outputStream2 = sprpa2.cfr_renamed_470();
                switch (this.cfr_renamed_411()) {
                    case 0: {
                        OutputStream outputStream3 = outputStream2;
                        while (false) {
                        }
                        outputStream = outputStream3;
                        outputStream3.write(sprcyd2.cfr_renamed_1489().cfr_renamed_91());
                        break;
                    }
                    case 1: {
                        outputStream2.write(sprcyd2.cfr_renamed_91());
                    }
                    default: {
                        outputStream = outputStream2;
                    }
                }
                outputStream.close();
                if (!sprzra.cfr_renamed_92(sprpa2.cfr_renamed_580(), this.cfr_renamed_412())) {
                    return false;
                }
            }
            catch (Exception exception) {
                return false;
            }
        }
        return false;
    }

    public sprtzd cfr_renamed_415() {
        if (this.cfr_renamed_3.cfr_renamed_409() != null) {
            new sprtzd(this.cfr_renamed_3.cfr_renamed_409().cfr_renamed_415().cfr_renamed_19());
        }
        return null;
    }

    @Override
    public Object clone() {
        return new sprgsd((sprbne)this.cfr_renamed_3.cfr_renamed_119());
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprgsd)) {
            return false;
        }
        sprgsd sprgsd2 = (sprgsd)arg0;
        return this.cfr_renamed_3.equals(sprgsd2.cfr_renamed_3);
    }

    public spruhe[] cfr_renamed_238() {
        if (this.cfr_renamed_3.cfr_renamed_407() != null) {
            sprgsd sprgsd2 = this;
            return sprgsd2.cfr_renamed_4432(sprgsd2.cfr_renamed_3.cfr_renamed_407().cfr_renamed_289());
        }
        return null;
    }
}

