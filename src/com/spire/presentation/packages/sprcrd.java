/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraa;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprgeh;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprgzd;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlle;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprrud;
import com.spire.presentation.packages.sprupd;
import com.spire.presentation.packages.spruva;
import com.spire.presentation.packages.sprvn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;

public class sprcrd
extends sprgzd {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmpd cfr_renamed_4205(sprql arg0, sprha arg1, sprpa arg2) throws sprlqd {
        Object object;
        Object object2;
        sprlre sprlre2 = new sprlre();
        Object object3 = object2 = this.cfr_renamed_272.iterator();
        while (object3.hasNext()) {
            object = (sprvn)object2.next();
            object3 = object2;
            sprlre2.cfr_renamed_49(object.cfr_renamed_3242(arg1.cfr_renamed_1521()));
        }
        if (arg2 != null) {
            sprlqe sprlqe2;
            Object object4;
            sprnle sprnle2;
            Object object5;
            try {
                object = new ByteArrayOutputStream();
                object5 = new spruva(arg2.cfr_renamed_470(), (OutputStream)object);
                spruva spruva2 = object5;
                arg0.cfr_renamed_624(spruva2);
                ((OutputStream)spruva2).close();
                sprnle2 = new sprnle(((ByteArrayOutputStream)object).toByteArray());
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sprgeh.cfr_renamed_9("jU~Ys^?Op\u001bo^m]pIr\u001b{Rx^lO?X~W|NsZkRpU%\u001b")).append(iOException.getMessage()).toString(), iOException);
            }
            object = this.cfr_renamed_3989(arg0.cfr_renamed_696(), arg2.cfr_renamed_615(), arg2.cfr_renamed_580());
            if (this.cfr_renamed_4 == null) {
                sprcrd sprcrd2 = this;
                sprcrd2.cfr_renamed_4 = new sprrud();
            }
            object5 = new sprcwe(this.cfr_renamed_4.cfr_renamed_134(Collections.unmodifiableMap(object)).cfr_renamed_3968());
            try {
                object4 = arg1.cfr_renamed_470();
                ((OutputStream)object4).write(((sprkra)object5).cfr_renamed_104("DER"));
                ((OutputStream)object4).close();
                sprlqe2 = new sprlqe(arg1.cfr_renamed_1472());
            }
            catch (IOException iOException) {
                throw new sprlqd(sprkgs.cfr_renamed_9("omipzaczd5npizn|dr*tfregcabx*ekgkxoaogy;"), iOException);
            }
            object4 = this.cfr_renamed_3 != null ? new sprgve(this.cfr_renamed_3.cfr_renamed_134(Collections.unmodifiableMap(object)).cfr_renamed_3968()) : null;
            sprnte sprnte2 = new sprnte(sprgl.cfr_renamed_152, sprnle2);
            object2 = new sprlle(this.cfr_renamed_31, new sprcwe(sprlre2), arg1.cfr_renamed_615(), arg2.cfr_renamed_615(), sprnte2, (sprere)object5, sprlqe2, (sprere)object4);
        } else {
            sprlqe sprlqe3;
            sprnle sprnle3;
            Object object6;
            try {
                object = new ByteArrayOutputStream();
                object6 = new spruva((OutputStream)object, arg1.cfr_renamed_470());
                spruva spruva3 = object6;
                arg0.cfr_renamed_624(spruva3);
                ((OutputStream)spruva3).close();
                sprnle3 = new sprnle(((ByteArrayOutputStream)object).toByteArray());
                sprlqe3 = new sprlqe(arg1.cfr_renamed_1472());
            }
            catch (IOException iOException) {
                throw new sprlqd(sprgeh.cfr_renamed_9("zC|^oOvTq\u001b{^|T{Rq\\?Zs\\pIvOwV?K~I~VzOzIl\u0015"), iOException);
            }
            object = this.cfr_renamed_3 != null ? new sprgve(this.cfr_renamed_3.cfr_renamed_134(new HashMap()).cfr_renamed_3968()) : null;
            object6 = new sprnte(sprgl.cfr_renamed_152, sprnle3);
            object2 = new sprlle(this.cfr_renamed_31, new sprcwe(sprlre2), arg1.cfr_renamed_615(), null, (sprnte)object6, null, sprlqe3, (sprere)object);
        }
        object = new sprnte(sprgl.cfr_renamed_119, (spra)object2);
        return new sprmpd((sprnte)object, (spraa)new sprupd(this, arg2));
    }

    public sprmpd cfr_renamed_4206(sprql arg0, sprha arg1) throws sprlqd {
        return this.cfr_renamed_4205(arg0, arg1, null);
    }
}

