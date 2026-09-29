/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdyd;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprgzd;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprhoe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlle;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmfaa;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpue;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruva;
import com.spire.presentation.packages.sprvn;
import java.io.IOException;
import java.io.OutputStream;

public class sprnud
extends sprgzd {
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprha cfr_renamed_4;

    public OutputStream cfr_renamed_4194(sprtzd arg0, OutputStream arg1, sprha arg2, sprpa arg3) throws sprlqd {
        this.cfr_renamed_4 = arg2;
        try {
            spruva spruva2;
            spruva spruva3;
            sprha sprha2;
            Object object;
            Object object2;
            sprlre sprlre2 = new sprlre();
            Object object3 = object2 = this.cfr_renamed_272.iterator();
            while (object3.hasNext()) {
                object = (sprvn)object2.next();
                object3 = object2;
                sprlre2.cfr_renamed_49(object.cfr_renamed_3242(arg2.cfr_renamed_1521()));
            }
            object2 = new sprhoe(arg1);
            ((sprhoe)object2).cfr_renamed_4133(sprgl.cfr_renamed_119);
            object = new sprhoe(((sprpue)object2).cfr_renamed_4134(), 0, true);
            ((sprhoe)object).cfr_renamed_4133(new sprooe(sprlle.cfr_renamed_4195(this.cfr_renamed_31)));
            if (this.cfr_renamed_31 != null) {
                ((sprhoe)object).cfr_renamed_4133(new sprhse(0 != 0, 0, this.cfr_renamed_31));
            }
            if (this.cfr_renamed_3) {
                sprha2 = arg2;
                ((sprpue)object).cfr_renamed_4134().write(new sprgve(sprlre2).cfr_renamed_91());
            } else {
                ((sprpue)object).cfr_renamed_4134().write(new sprcwe(sprlre2).cfr_renamed_91());
                sprha2 = arg2;
            }
            sprije sprije2 = sprha2.cfr_renamed_615();
            ((sprpue)object).cfr_renamed_4134().write(sprije2.cfr_renamed_91());
            if (arg3 != null) {
                ((sprhoe)object).cfr_renamed_4133(new sprhse(false, 1, arg3.cfr_renamed_615()));
            }
            sprhoe sprhoe2 = new sprhoe(((sprpue)object).cfr_renamed_4134());
            sprhoe2.cfr_renamed_4133(arg0);
            OutputStream outputStream = sprerd.cfr_renamed_4108(sprhoe2.cfr_renamed_4134(), 0, false, this.cfr_renamed_2);
            if (arg3 != null) {
                spruva3 = new spruva(outputStream, arg3.cfr_renamed_470());
                spruva2 = spruva3;
            } else {
                spruva3 = new spruva(outputStream, arg2.cfr_renamed_470());
                spruva2 = spruva3;
            }
            return new sprdyd(this, arg2, arg3, arg0, spruva2, (sprhoe)object2, (sprhoe)object, sprhoe2);
        }
        catch (IOException iOException) {
            throw new sprlqd(sprmfaa.cfr_renamed_9("uist`ey~~1tts~tx~v0p|v\u007fcyex|0aqcq|ueucc?"), iOException);
        }
    }

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public OutputStream cfr_renamed_4196(sprtzd arg0, OutputStream arg1, sprha arg2) throws sprlqd {
        return this.cfr_renamed_4194(arg0, arg1, arg2, null);
    }

    public void cfr_renamed_4165(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public OutputStream cfr_renamed_4197(OutputStream arg0, sprha arg1) throws sprlqd {
        return this.cfr_renamed_4196(sprgl.cfr_renamed_152, arg0, arg1);
    }

    public OutputStream cfr_renamed_4198(OutputStream arg0, sprha arg1, sprpa arg2) throws sprlqd {
        return this.cfr_renamed_4194(sprgl.cfr_renamed_152, arg0, arg1, arg2);
    }
}

