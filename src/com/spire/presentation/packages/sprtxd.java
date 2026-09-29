/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprakia;
import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.spraud;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprcue;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfud;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprrl;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvud;
import com.spire.presentation.packages.sprwvd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class sprtxd
extends sprvud {
    private List cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprfud cfr_renamed_611(sprql arg0, boolean arg1) throws sprlqd {
        Object object;
        sprkra sprkra2;
        Object object22;
        Object object3;
        Object object4;
        Object object5;
        if (!this.cfr_renamed_4.isEmpty()) {
            throw new IllegalStateException(sprnxe.cfr_renamed_9("\t\u0011\u0014\n]\u0014\u0018\r\u0015\u0016\u0019Y\u001e\u0018\u0013Y\u0012\u0017\u0011\u0000]\u001b\u0018Y\b\n\u0018\u001d]\u000e\u0014\r\u0015Y.\u0010\u001a\u0017\u0018\u000b4\u0017\u001b\u0016:\u001c\u0013\u001c\u000f\u0018\t\u0016\u000f"));
        }
        sprlre sprlre2 = new sprlre();
        sprlre sprlre3 = new sprlre();
        sprtxd sprtxd2 = this;
        sprtxd2.cfr_renamed_126.clear();
        Object object6 = object5 = sprtxd2.cfr_renamed_185.iterator();
        while (object6.hasNext()) {
            object4 = (sprpod)object5.next();
            object6 = object5;
            sprpod sprpod2 = object4;
            sprlre2.cfr_renamed_49(spraud.cfr_renamed_3.cfr_renamed_4122(sprpod2.cfr_renamed_3960()));
            sprlre3.cfr_renamed_49(sprpod2.cfr_renamed_568());
        }
        sprql sprql2 = arg0;
        object5 = sprql2.cfr_renamed_696();
        object4 = null;
        if (sprql2.cfr_renamed_480() != null) {
            object3 = null;
            if (arg1) {
                object3 = new ByteArrayOutputStream();
            }
            object22 = sprerd.cfr_renamed_4111(this.cfr_renamed_3, object3);
            object22 = sprerd.cfr_renamed_4113((OutputStream)object22);
            try {
                arg0.cfr_renamed_624((OutputStream)object22);
                ((OutputStream)object22).close();
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sprakia.cfr_renamed_9("\rT\u001dTIE\u001bZ\nP\u001aF\u0000[\u000e\u0015\fM\nP\u0019A\u0000Z\u0007\u000fI")).append(iOException.getMessage()).toString(), iOException);
            }
            if (arg1) {
                object4 = new sprnle(((ByteArrayOutputStream)object3).toByteArray());
            }
        }
        for (Object object22 : this.cfr_renamed_3) {
            sprkra2 = ((sprbod)object22).cfr_renamed_3988((sprtzd)object5);
            sprfve sprfve2 = sprkra2;
            sprlre2.cfr_renamed_49(sprfve2.cfr_renamed_410());
            sprlre3.cfr_renamed_49(sprfve2);
            object = ((sprbod)object22).cfr_renamed_3984();
            if (object == null) continue;
            this.cfr_renamed_126.put(((sprfve)sprkra2).cfr_renamed_410().cfr_renamed_593().cfr_renamed_19(), object);
        }
        object3 = null;
        if (this.cfr_renamed_79.size() != 0) {
            object3 = sprerd.cfr_renamed_4116(this.cfr_renamed_79);
        }
        object22 = null;
        if (this.spr\ufe34.size() != 0) {
            object22 = sprerd.cfr_renamed_4116(this.spr\ufe34);
        }
        sprkra2 = new sprnte((sprtzd)object5, (spra)object4);
        object = new sprcue(new sprcwe(sprlre2), (sprnte)sprkra2, (sprere)object3, (sprere)object22, new sprcwe(sprlre3));
        sprnte sprnte2 = new sprnte(sprgl.cfr_renamed_3, (spra)object);
        return new sprfud((sprrl)arg0, sprnte2);
    }

    public sprtxd() {
        sprtxd sprtxd2 = this;
        sprtxd2.cfr_renamed_4 = new ArrayList();
    }

    public sprfud cfr_renamed_4149(sprql arg0) throws sprlqd {
        return this.cfr_renamed_611(arg0, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprwvd cfr_renamed_4150(sprpod sprpod2) throws sprlqd {
        void arg0;
        return this.cfr_renamed_611(new sprard(null, arg0.cfr_renamed_79()), false).cfr_renamed_621();
    }
}

