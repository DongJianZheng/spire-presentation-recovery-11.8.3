/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprien;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlwz;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.spruol;
import com.spire.presentation.packages.sprvxl;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public class sprfwl
extends spruol {
    private boolean cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public OutputStream cfr_renamed_10805(sprlem arg0, OutputStream arg1, sprmh arg2) throws sprlyl, IOException {
        return this.cfr_renamed_10806(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public OutputStream cfr_renamed_8518(OutputStream outputStream, sprmh sprmh2) throws sprlyl, IOException {
        void arg1;
        void arg0;
        return this.cfr_renamed_10806(new sprlem(sprgz.cfr_renamed_3.cfr_renamed_19()), (OutputStream)arg0, (sprmh)arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OutputStream cfr_renamed_10807(OutputStream arg0, sprrvm arg1, sprmh arg2) throws sprlyl {
        try {
            sprien sprien2;
            sprien sprien3;
            spridn spridn2;
            sprien sprien4 = new sprien(arg0);
            sprien4.cfr_renamed_10775(sprgz.cfr_renamed_86);
            sprien sprien5 = new sprien(sprien4.cfr_renamed_4134(), 0, true);
            if (this.cfr_renamed_3) {
                spridn2 = new sprufn(arg1);
                sprien3 = sprien5;
            } else {
                spridn2 = new sprocn(arg1);
                sprien3 = sprien5;
            }
            sprien3.cfr_renamed_10775(this.cfr_renamed_10808(arg1));
            if (this.cfr_renamed_4 != null) {
                sprien5.cfr_renamed_10775(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
            }
            sprien5.cfr_renamed_4134().write(spridn2.cfr_renamed_91());
            sprien sprien6 = sprien2 = new sprien(sprien5.cfr_renamed_4134());
            sprien6.cfr_renamed_10775(sprgz.cfr_renamed_3);
            sprddm sprddm2 = arg2.cfr_renamed_615();
            sprien6.cfr_renamed_4134().write(sprddm2.cfr_renamed_91());
            OutputStream outputStream = spreul.cfr_renamed_4108(sprien6.cfr_renamed_4134(), 0, false, this.cfr_renamed_4);
            return new sprvxl(this, arg2, outputStream, sprien4, sprien5, sprien2);
        }
        catch (IOException iOException) {
            throw new sprlyl(sprlwz.cfr_renamed_9("\"t$i7x.c),#i$c#e)kgm+k(~.x/ag|&~&a\"x\"~4\""), iOException);
        }
    }

    private /* synthetic */ OutputStream cfr_renamed_10806(sprlem arg0, OutputStream arg1, sprmh arg2) throws IOException, sprlyl {
        Iterator iterator;
        sprrvm sprrvm2 = new sprrvm();
        sprnfg sprnfg2 = arg2.cfr_renamed_1521();
        Iterator iterator2 = iterator = this.cfr_renamed_102.iterator();
        while (iterator2.hasNext()) {
            sprfz sprfz2 = (sprfz)iterator.next();
            iterator2 = iterator;
            sprrvm2.cfr_renamed_5004(sprfz2.cfr_renamed_10668(sprnfg2));
        }
        return this.cfr_renamed_10809(arg0, arg1, sprrvm2, arg2);
    }

    public OutputStream cfr_renamed_10809(sprlem arg0, OutputStream arg1, sprrvm arg2, sprmh arg3) throws IOException {
        sprien sprien2;
        sprien sprien3 = new sprien(arg1);
        sprien3.cfr_renamed_10775(sprgz.cfr_renamed_86);
        sprien sprien4 = new sprien(sprien3.cfr_renamed_4134(), 0, true);
        sprfwl sprfwl2 = this;
        sprien4.cfr_renamed_10775(sprfwl2.cfr_renamed_10808(arg2));
        if (sprfwl2.cfr_renamed_4 != null) {
            sprien4.cfr_renamed_10775(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3) {
            sprien4.cfr_renamed_4134().write(new sprufn(arg2).cfr_renamed_91());
        } else {
            sprien4.cfr_renamed_4134().write(new sprocn(arg2).cfr_renamed_91());
        }
        sprien sprien5 = sprien2 = new sprien(sprien4.cfr_renamed_4134());
        sprien5.cfr_renamed_10775(arg0);
        sprddm sprddm2 = arg3.cfr_renamed_615();
        sprien5.cfr_renamed_4134().write(sprddm2.cfr_renamed_91());
        OutputStream outputStream = spreul.cfr_renamed_4108(sprien5.cfr_renamed_4134(), 0, false, this.cfr_renamed_4);
        return new sprvxl(this, arg3, outputStream, sprien3, sprien4, sprien2);
    }

    public void cfr_renamed_4165(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ sprktm cfr_renamed_10808(sprrvm arg0) {
        if (this.cfr_renamed_93 != null) {
            return new sprktm(sprjtm.cfr_renamed_8093((sprpnm)this.cfr_renamed_4, new sprsgn(arg0), new sprsgn()));
        }
        return new sprktm(sprjtm.cfr_renamed_8093((sprpnm)this.cfr_renamed_4, new sprsgn(arg0), null));
    }
}

