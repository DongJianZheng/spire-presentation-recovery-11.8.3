/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapm;
import com.spire.presentation.packages.spravl;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfpm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgpl;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmsl;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprppba;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsf;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprvtl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

public class spryvl
extends sprgpl {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvtl cfr_renamed_10834(sprsv arg0, sprsf arg1, sprjj arg2) throws sprlyl {
        Object object;
        Object object2;
        sprrvm sprrvm2 = new sprrvm();
        Object object3 = object2 = this.cfr_renamed_102.iterator();
        while (object3.hasNext()) {
            object = (sprfz)object2.next();
            object3 = object2;
            sprrvm2.cfr_renamed_5004(object.cfr_renamed_10668(arg1.cfr_renamed_1521()));
        }
        if (arg2 != null) {
            sprfvg sprfvg2;
            Object object4;
            sprfwm sprfwm2;
            Object object5;
            try {
                object = new ByteArrayOutputStream();
                object5 = new sprmve(arg2.cfr_renamed_470(), (OutputStream)object);
                sprmve sprmve2 = object5;
                arg0.cfr_renamed_624(sprmve2);
                ((OutputStream)sprmve2).close();
                sprfwm2 = new sprfwm(((ByteArrayOutputStream)object).toByteArray());
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprapm.cfr_renamed_9("@\u0018T\u0014Y\u0013\u0015\u0002ZVE\u0013G\u0010Z\u0004XVQ\u001fR\u0013F\u0002\u0015\u0015T\u001aV\u0003Y\u0017A\u001fZ\u0018\u000fV")).append(iOException.getMessage()).toString(), iOException);
            }
            object = Collections.unmodifiableMap(this.cfr_renamed_10657(arg0.cfr_renamed_696(), arg2.cfr_renamed_615(), arg1.cfr_renamed_615(), arg2.cfr_renamed_580()));
            if (this.cfr_renamed_3 == null) {
                spryvl spryvl2 = this;
                spryvl2.cfr_renamed_3 = new spravl();
            }
            object5 = new sprocn(this.cfr_renamed_3.cfr_renamed_134((Map)object).cfr_renamed_3968());
            try {
                object4 = arg1.cfr_renamed_470();
                ((OutputStream)object4).write(((sprqqe)object5).cfr_renamed_104("DER"));
                ((OutputStream)object4).close();
                sprfvg2 = new sprfvg(arg1.cfr_renamed_1472());
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprppba.cfr_renamed_9("a.u\"x%44{`d%f&{2y`Y\u0001W`w!x#a,u4}/zz4")).append(iOException.getMessage()).toString(), iOException);
            }
            object4 = this.cfr_renamed_4 != null ? new sprufn(this.cfr_renamed_4.cfr_renamed_134((Map)object).cfr_renamed_3968()) : null;
            sprlvm sprlvm2 = new sprlvm(arg0.cfr_renamed_696(), sprfwm2);
            object2 = new sprfpm(this.cfr_renamed_4, new sprocn(sprrvm2), arg1.cfr_renamed_615(), arg2.cfr_renamed_615(), sprlvm2, (spridn)object5, sprfvg2, (spridn)object4);
        } else {
            sprfvg sprfvg3;
            sprfwm sprfwm3;
            Object object6;
            try {
                object = new ByteArrayOutputStream();
                object6 = new sprmve((OutputStream)object, arg1.cfr_renamed_470());
                sprmve sprmve3 = object6;
                arg0.cfr_renamed_624(sprmve3);
                ((OutputStream)sprmve3).close();
                sprfwm3 = new sprfwm(((ByteArrayOutputStream)object).toByteArray());
                sprfvg3 = new sprfvg(arg1.cfr_renamed_1472());
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprapm.cfr_renamed_9("\u0003[\u0017W\u001aPVA\u0019\u0015\u0006P\u0004S\u0019G\u001b\u0015;t5\u0015\u0015T\u001aV\u0003Y\u0017A\u001fZ\u0018\u000fV")).append(iOException.getMessage()).toString(), iOException);
            }
            object = this.cfr_renamed_4 != null ? new sprufn(this.cfr_renamed_4.cfr_renamed_134(Collections.EMPTY_MAP).cfr_renamed_3968()) : null;
            object6 = new sprlvm(arg0.cfr_renamed_696(), sprfwm3);
            object2 = new sprfpm(this.cfr_renamed_4, new sprocn(sprrvm2), arg1.cfr_renamed_615(), (sprddm)((Object)null), (sprlvm)object6, null, sprfvg3, (spridn)object);
        }
        object = new sprlvm(sprgz.cfr_renamed_114, (sprco)object2);
        return new sprvtl((sprlvm)object, (sprlj)new sprmsl(this, arg2));
    }

    public sprvtl cfr_renamed_10835(sprsv arg0, sprsf arg1) throws sprlyl {
        return this.cfr_renamed_10834(arg0, arg1, null);
    }
}

