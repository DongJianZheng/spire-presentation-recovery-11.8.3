/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranm;
import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprcum;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprhsl;
import com.spire.presentation.packages.spriom;
import com.spire.presentation.packages.sprjmm;
import com.spire.presentation.packages.sprjz;
import com.spire.presentation.packages.sprkum;
import com.spire.presentation.packages.sprlq;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprlz;
import com.spire.presentation.packages.sprmhl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprnlm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsap;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruz;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvim;
import com.spire.presentation.packages.spryil;
import java.io.IOException;
import java.util.List;

public class sprgtl
extends sprctl {
    private sproug cfr_renamed_3;
    private sprnlm cfr_renamed_4;

    public byte[] cfr_renamed_4032() {
        sproug sproug2 = this.cfr_renamed_4.cfr_renamed_4032();
        if (sproug2 != null) {
            return sproze.cfr_renamed_158(sproug2.cfr_renamed_186());
        }
        return null;
    }

    private /* synthetic */ sprvhm cfr_renamed_10680(sprddm arg0, sprkum arg1) throws sprlyl, IOException {
        sprgtl sprgtl2;
        sprhsl sprhsl2;
        spriom spriom2 = arg1.cfr_renamed_4022();
        if (spriom2 != null) {
            return this.cfr_renamed_10681(arg0, spriom2);
        }
        sprdsm sprdsm2 = arg1.cfr_renamed_4024();
        if (sprdsm2 != null) {
            sprhsl2 = new sprhsl(sprdsm2.cfr_renamed_313(), sprdsm2.cfr_renamed_114().cfr_renamed_97());
            sprgtl2 = this;
        } else {
            sprvim sprvim2 = arg1.cfr_renamed_3955();
            sprhsl2 = new sprhsl(sprvim2.cfr_renamed_327());
            sprgtl2 = this;
        }
        return sprgtl2.cfr_renamed_10682(sprhsl2);
    }

    private /* synthetic */ sprvhm cfr_renamed_10682(sprhsl arg0) throws sprlyl {
        throw new sprlyl(sprsap.cfr_renamed_9("gS\tO\\LYS[H\tZFN\t\u001bFN@[@RHHFN\u000e\u001cHO\tuZO\\Y[}GXzY[UHPgID^LN\tS[\u001czIKVL_]wLE`XLR]UOULN"));
    }

    public sprkum cfr_renamed_4031() {
        return this.cfr_renamed_4.cfr_renamed_4031();
    }

    @Override
    public sprmtl cfr_renamed_10666(sprlz arg0) throws sprlyl, IOException {
        sprddm sprddm2 = ((spruz)arg0).cfr_renamed_3241();
        sprgtl sprgtl2 = this;
        sprgtl sprgtl3 = this;
        return ((spruz)arg0).cfr_renamed_10683(sprgtl2.cfr_renamed_2, sprgtl2.cfr_renamed_119, sprgtl3.cfr_renamed_10680(sprddm2, sprgtl3.cfr_renamed_4.cfr_renamed_4031()), this.cfr_renamed_4.cfr_renamed_4032(), this.cfr_renamed_3.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprgtl(sprnlm sprnlm2, spryil spryil2, sproug sproug2, sprddm sprddm2, sprjz sprjz2, sprlq sprlq2) {
        void arg1;
        void arg5;
        void arg4;
        void arg3;
        void arg0;
        sprgtl sprgtl2 = this;
        super(arg0.cfr_renamed_4000(), (sprddm)arg3, (sprjz)arg4, (sprlq)arg5);
        this.cfr_renamed_4 = arg0;
        sprgtl2.cfr_renamed_4 = arg1;
        sprgtl2.cfr_renamed_3 = sproug2;
    }

    public static void cfr_renamed_10684(List arg0, sprnlm arg1, sprddm arg2, sprjz arg3, sprlq arg4) {
        int n;
        sprszm sprszm2 = arg1.cfr_renamed_4027();
        int n2 = n = 0;
        while (n2 < sprszm2.cfr_renamed_84()) {
            List list;
            sprmhl sprmhl2;
            sprjmm sprjmm2 = sprjmm.cfr_renamed_23(sprszm2.cfr_renamed_85(n));
            spranm spranm2 = sprjmm2.cfr_renamed_4028();
            sprdsm sprdsm2 = spranm2.cfr_renamed_4024();
            if (sprdsm2 != null) {
                sprmhl2 = new sprmhl(sprdsm2.cfr_renamed_313(), sprdsm2.cfr_renamed_114().cfr_renamed_97());
                list = arg0;
            } else {
                sprcum sprcum2 = spranm2.cfr_renamed_4029();
                sprmhl2 = new sprmhl(sprcum2.cfr_renamed_3955().cfr_renamed_186());
                list = arg0;
            }
            list.add(new sprgtl(arg1, sprmhl2, sprjmm2.cfr_renamed_4010(), arg2, arg3, arg4));
            n2 = ++n;
        }
    }

    private /* synthetic */ sprvhm cfr_renamed_10681(sprddm arg0, spriom arg1) {
        return new sprvhm(arg0, arg1.cfr_renamed_1157().cfr_renamed_81());
    }
}

