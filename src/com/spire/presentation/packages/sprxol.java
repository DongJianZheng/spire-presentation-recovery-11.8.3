/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprkza;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpw;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsgn;
import com.spire.presentation.packages.sprsql;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprtqm;
import com.spire.presentation.packages.sprxpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

public class sprxol
extends sprsql {
    public sprxpl cfr_renamed_10824(sprsv arg0, sprpw arg1) throws sprlyl {
        return this.cfr_renamed_10825(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprxpl cfr_renamed_10825(sprsv arg0, sprpw arg1) throws sprlyl {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        sprrvm sprrvm2 = new sprrvm();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprocn sprocn2 = null;
        try {
            object5 = arg1.cfr_renamed_1442(byteArrayOutputStream);
            arg0.cfr_renamed_624((OutputStream)object5);
            if (this.cfr_renamed_3 != null) {
                object4 = this.cfr_renamed_3.cfr_renamed_134(Collections.EMPTY_MAP);
                sprocn2 = new sprocn(((sprjpm)object4).cfr_renamed_3968());
                arg1.cfr_renamed_7491().write(sprocn2.cfr_renamed_104("DER"));
            }
            ((OutputStream)object5).close();
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprkza.cfr_renamed_9("\r+\u0019'\u0014 X1\u0017e\b7\u0017&\u001d6\u000be\u00190\f-\u001d+\f,\u001b$\f \u001ce\u001b*\u00161\u001d+\f\u007fX")).append(iOException.getMessage()).toString(), iOException);
        }
        object5 = byteArrayOutputStream.toByteArray();
        sprpw sprpw2 = arg1;
        object4 = sprpw2.cfr_renamed_7492();
        sprddm sprddm2 = sprpw2.cfr_renamed_615();
        sprfwm sprfwm2 = new sprfwm((byte[])object5);
        sprnfg sprnfg2 = sprpw2.cfr_renamed_1521();
        Object object6 = object3 = this.cfr_renamed_102.iterator();
        while (object6.hasNext()) {
            object2 = (sprfz)object3.next();
            object6 = object3;
            sprrvm2.cfr_renamed_5004(object2.cfr_renamed_10668(sprnfg2));
        }
        object3 = new sprnum(arg0.cfr_renamed_696(), sprddm2, sprfwm2);
        object2 = null;
        if (this.cfr_renamed_4 != null) {
            object = this.cfr_renamed_4.cfr_renamed_134(Collections.EMPTY_MAP);
            object2 = new sprsgn(((sprjpm)object).cfr_renamed_3968());
        }
        object = new sprlvm(sprgz.cfr_renamed_1, new sprtqm(this.cfr_renamed_4, new sprocn(sprrvm2), (sprnum)object3, sprocn2, new sprfvg((byte[])object4), (spridn)object2));
        return new sprxpl((sprlvm)object);
    }
}

