/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprfpm;
import com.spire.presentation.packages.sprfxia;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgdn;
import com.spire.presentation.packages.sprgpl;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprien;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprssl;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;
import java.io.OutputStream;

public class sprnol
extends sprgpl {
    private sprsf cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public void cfr_renamed_4165(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public OutputStream cfr_renamed_10828(sprlem arg0, OutputStream arg1, sprsf arg2) throws sprlyl {
        return this.cfr_renamed_10829(arg0, arg1, arg2, null);
    }

    public OutputStream cfr_renamed_10829(sprlem arg0, OutputStream arg1, sprsf arg2, sprjj arg3) throws sprlyl {
        this.cfr_renamed_2 = arg2;
        try {
            sprmve sprmve2;
            sprmve sprmve3;
            sprsf sprsf2;
            Object object;
            Object object2;
            sprrvm sprrvm2 = new sprrvm();
            Object object3 = object2 = this.cfr_renamed_102.iterator();
            while (object3.hasNext()) {
                object = (sprfz)object2.next();
                object3 = object2;
                sprrvm2.cfr_renamed_5004(object.cfr_renamed_10668(arg2.cfr_renamed_1521()));
            }
            object2 = new sprien(arg1);
            ((sprien)object2).cfr_renamed_10775(sprgz.cfr_renamed_114);
            object = new sprien(((sprgdn)object2).cfr_renamed_4134(), 0, true);
            ((sprien)object).cfr_renamed_10775(new sprktm(sprfpm.cfr_renamed_10830((sprpnm)this.cfr_renamed_4)));
            if (this.cfr_renamed_4 != null) {
                ((sprien)object).cfr_renamed_10775(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_4));
            }
            if (this.cfr_renamed_4) {
                sprsf2 = arg2;
                ((sprgdn)object).cfr_renamed_4134().write(new sprufn(sprrvm2).cfr_renamed_91());
            } else {
                ((sprgdn)object).cfr_renamed_4134().write(new sprocn(sprrvm2).cfr_renamed_91());
                sprsf2 = arg2;
            }
            sprddm sprddm2 = sprsf2.cfr_renamed_615();
            ((sprgdn)object).cfr_renamed_4134().write(sprddm2.cfr_renamed_91());
            if (arg3 != null) {
                ((sprien)object).cfr_renamed_10775(new sprycn(false, 1, (sprco)arg3.cfr_renamed_615()));
            }
            sprien sprien2 = new sprien(((sprgdn)object).cfr_renamed_4134());
            sprien2.cfr_renamed_10775(arg0);
            OutputStream outputStream = spreul.cfr_renamed_4108(sprien2.cfr_renamed_4134(), 0, true, this.cfr_renamed_3);
            if (arg3 != null) {
                sprmve3 = new sprmve(outputStream, arg3.cfr_renamed_470());
                sprmve2 = sprmve3;
            } else {
                sprmve3 = new sprmve(outputStream, arg2.cfr_renamed_470());
                sprmve2 = sprmve3;
            }
            return new sprssl(this, arg2, arg3, arg0, sprmve2, (sprien)object2, (sprien)object, sprien2);
        }
        catch (IOException iOException) {
            throw new sprlyl(sprfxia.cfr_renamed_9("\b<\u000e!\u001d0\u0004+\u0003d\t!\u000e+\t-\u0003#M%\u0001#\u00026\u00040\u0005)M4\f6\f)\b0\b6\u001ej"), iOException);
        }
    }

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public OutputStream cfr_renamed_10831(OutputStream arg0, sprsf arg1, sprjj arg2) throws sprlyl {
        return this.cfr_renamed_10829(sprgz.cfr_renamed_3, arg0, arg1, arg2);
    }

    public OutputStream cfr_renamed_10832(OutputStream arg0, sprsf arg1) throws sprlyl {
        return this.cfr_renamed_10828(sprgz.cfr_renamed_3, arg0, arg1);
    }
}

