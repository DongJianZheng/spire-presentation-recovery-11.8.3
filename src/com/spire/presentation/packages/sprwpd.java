/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprble;
import com.spire.presentation.packages.sprcre;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprfoe;
import com.spire.presentation.packages.sprgud;
import com.spire.presentation.packages.sprjre;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sproyd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqoe;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprre;
import com.spire.presentation.packages.sprrre;
import com.spire.presentation.packages.sprsre;
import com.spire.presentation.packages.sprsxd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprupe;
import com.spire.presentation.packages.spruwd;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvne;
import com.spire.presentation.packages.sprwyd;
import com.spire.presentation.packages.spryae;
import com.spire.presentation.packages.spryhs;
import com.spire.presentation.packages.sprzod;
import com.spire.presentation.packages.sprzpe;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sprwpd {
    private spryae cfr_renamed_86;
    private sprsxd cfr_renamed_152;
    private List cfr_renamed_112;
    private sprjre cfr_renamed_119;
    private sprcre cfr_renamed_91;
    private sprmee cfr_renamed_0;
    private sprsre cfr_renamed_1;
    private final BigInteger cfr_renamed_2;
    private sprqa cfr_renamed_3;
    private char[] cfr_renamed_4;

    public sprwpd cfr_renamed_4347(sprmee arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sproyd cfr_renamed_1451() throws sprzod {
        Object object;
        Object object2;
        Object object3;
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_2));
        if (!this.cfr_renamed_86.cfr_renamed_29()) {
            sprwpd sprwpd2 = this;
            sprwpd2.cfr_renamed_119.cfr_renamed_2603(sprwpd2.cfr_renamed_86.cfr_renamed_31());
        }
        sprlre2.cfr_renamed_49(this.cfr_renamed_119.cfr_renamed_1451());
        if (!this.cfr_renamed_112.isEmpty()) {
            object3 = new sprlre();
            Object object4 = object2 = this.cfr_renamed_112.iterator();
            while (object4.hasNext()) {
                object = (sprre)object2.next();
                object4 = object2;
                ((sprlre)object3).cfr_renamed_49(new sprfoe(object.cfr_renamed_324(), object.cfr_renamed_97()));
            }
            sprlre2.cfr_renamed_49(new sprpse((sprlre)object3));
        }
        object3 = sprrre.cfr_renamed_23(new sprpse(sprlre2));
        sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49((spra)object3);
        if (this.cfr_renamed_3 != null) {
            object2 = ((sprrre)object3).cfr_renamed_4351();
            if (((sprupe)object2).cfr_renamed_1485() == null || ((sprupe)object2).cfr_renamed_1157() == null) {
                sprlre sprlre3;
                object = ((sprrre)object3).cfr_renamed_4351().cfr_renamed_1157();
                sprgud sprgud2 = new sprgud((sprdce)object);
                if (this.cfr_renamed_0 != null) {
                    sprlre3 = sprlre2;
                    sprgud2.cfr_renamed_4330(this.cfr_renamed_0);
                } else {
                    spruwd spruwd2 = new spruwd(this.cfr_renamed_152);
                    sprlre3 = sprlre2;
                    sprgud2.cfr_renamed_4327(spruwd2, this.cfr_renamed_4);
                }
                sprlre3.cfr_renamed_49(new sprzpe(sprgud2.cfr_renamed_1484(this.cfr_renamed_3)));
            } else {
                object = new sprgud((sprrre)object3);
                sprlre2.cfr_renamed_49(new sprzpe(((sprgud)object).cfr_renamed_1484(this.cfr_renamed_3)));
            }
        } else if (this.cfr_renamed_1 != null) {
            sprlre2.cfr_renamed_49(new sprzpe(2, this.cfr_renamed_1));
        } else if (this.cfr_renamed_91 != null) {
            sprlre2.cfr_renamed_49(new sprzpe());
        }
        return new sproyd(sprqoe.cfr_renamed_23(new sprpse(sprlre2)));
    }

    public sprwpd cfr_renamed_4367(Date arg0, Date arg1) {
        sprwpd sprwpd2 = this;
        sprwpd2.cfr_renamed_119.cfr_renamed_4368(new sprvne(this.cfr_renamed_4369(arg0), this.cfr_renamed_4369(arg1)));
        return sprwpd2;
    }

    public sprwpd cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws sprqwd {
        sprwpd sprwpd2 = this;
        sprwyd.cfr_renamed_571(sprwpd2.cfr_renamed_86, arg0, arg1, arg2);
        return sprwpd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwpd cfr_renamed_4370(spruhe spruhe2) {
        void arg0;
        return this.cfr_renamed_4347(new sprmee((spruhe)arg0));
    }

    public sprwpd cfr_renamed_10(BigInteger arg0) {
        if (arg0 != null) {
            this.cfr_renamed_119.cfr_renamed_11(new sprooe(arg0));
        }
        return this;
    }

    public sprwpd cfr_renamed_4371() {
        if (this.cfr_renamed_3 != null || this.cfr_renamed_1 != null) {
            throw new IllegalStateException(spryhs.cfr_renamed_9("`AcV/@aJ/_}@`I/@i\u000f\u007f@|\\j\\|F`A/NcC`XjK"));
        }
        this.cfr_renamed_91 = sprume.cfr_renamed_3;
        return this;
    }

    public sprwpd cfr_renamed_4216(spruhe arg0) {
        if (arg0 != null) {
            this.cfr_renamed_119.cfr_renamed_4216(arg0);
        }
        return this;
    }

    public sprwpd cfr_renamed_4372(sprqa arg0) {
        if (this.cfr_renamed_1 != null || this.cfr_renamed_91 != null) {
            throw new IllegalStateException(sprdgb.cfr_renamed_9("SbPu\u001ccRi\u001c|NcSj\u001ccZ,LcO\u007fY\u007fOeSb\u001cmP`S{Yh"));
        }
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprwpd cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) {
        sprwpd sprwpd2 = this;
        sprwpd2.cfr_renamed_86.cfr_renamed_18(arg0, arg1, arg2);
        return sprwpd2;
    }

    public sprwpd cfr_renamed_4373(sprre arg0) {
        sprwpd sprwpd2 = this;
        sprwpd2.cfr_renamed_112.add(arg0);
        return sprwpd2;
    }

    public sprwpd cfr_renamed_4374(sprble arg0) {
        if (this.cfr_renamed_3 != null || this.cfr_renamed_91 != null) {
            throw new IllegalStateException(spryhs.cfr_renamed_9("`AcV/@aJ/_}@`I/@i\u000f\u007f@|\\j\\|F`A/NcC`XjK"));
        }
        this.cfr_renamed_1 = new sprsre(arg0);
        return this;
    }

    public sprwpd(BigInteger arg0) {
        sprwpd sprwpd2 = this;
        this.cfr_renamed_2 = arg0;
        sprwpd sprwpd3 = this;
        sprwpd2.cfr_renamed_86 = new spryae();
        sprwpd3.cfr_renamed_119 = new sprjre();
        sprwpd2.cfr_renamed_112 = new ArrayList();
    }

    private /* synthetic */ spruzd cfr_renamed_4369(Date arg0) {
        if (arg0 != null) {
            return new spruzd(arg0);
        }
        return null;
    }

    public sprwpd cfr_renamed_4350(sprdce arg0) {
        if (arg0 != null) {
            this.cfr_renamed_119.cfr_renamed_4350(arg0);
        }
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprwpd cfr_renamed_4375(sprsxd sprsxd2, char[] cArray) {
        void arg0;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_4 = cArray;
        return this;
    }

    public sprwpd cfr_renamed_4217(spruhe arg0) {
        if (arg0 != null) {
            this.cfr_renamed_119.cfr_renamed_4217(arg0);
        }
        return this;
    }
}

