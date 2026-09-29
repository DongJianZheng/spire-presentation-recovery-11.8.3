/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcod;
import com.spire.presentation.packages.sprcwd;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdi;
import com.spire.presentation.packages.sprfzd;
import com.spire.presentation.packages.sprhzo;
import com.spire.presentation.packages.sprige;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprsce;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.spryyd;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class sprpvd {
    private List cfr_renamed_2;
    private spryyd cfr_renamed_3;
    private sprszd cfr_renamed_4;

    public sprpvd cfr_renamed_4307(sprfzd arg0, sprdi arg1, Date arg2, Date arg3, sprszd arg4) {
        sprpvd sprpvd2 = this;
        sprpvd2.cfr_renamed_2.add(new sprcod(this, arg0, arg1, arg2, arg3, arg4));
        return sprpvd2;
    }

    public sprpvd cfr_renamed_4308(sprfzd arg0, sprdi arg1) {
        sprpvd sprpvd2 = this;
        sprpvd2.cfr_renamed_2.add(new sprcod(this, arg0, arg1, new Date(), null, null));
        return sprpvd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprcwd cfr_renamed_4309(sprqa arg0, sprcyd[] arg1, Date arg2) throws sprbud {
        sprmra sprmra2;
        Object object;
        Iterator iterator = this.cfr_renamed_2.iterator();
        sprlre sprlre2 = new sprlre();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            try {
                sprlre2.cfr_renamed_49(((sprcod)iterator.next()).cfr_renamed_4310());
                iterator2 = iterator;
            }
            catch (Exception exception) {
                throw new sprbud(sprhzo.cfr_renamed_9(".\u000e(\u0013;\u0002\"\u0019%V(\u0004.\u0017?\u001f%\u0011k$.\u0007>\u00138\u0002"), exception);
            }
        }
        sprige sprige2 = new sprige(this.cfr_renamed_3.cfr_renamed_94(), new sprrpe(arg2), (sprbne)new sprpse(sprlre2), this.cfr_renamed_4);
        try {
            object = arg0.cfr_renamed_470();
            ((OutputStream)object).write(sprige2.cfr_renamed_104("DER"));
            ((OutputStream)object).close();
            sprmra2 = new sprmra(arg0.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprkrl.cfr_renamed_9("781%\"4;/<`\"2=#73!)<'r\u0014\u0010\u0013\u0000%#573&zr")).append(exception.getMessage()).toString(), exception);
        }
        object = arg0.cfr_renamed_615();
        sprpse sprpse2 = null;
        if (arg1 != null && arg1.length > 0) {
            int n;
            sprlre sprlre3 = new sprlre();
            int n2 = n = 0;
            while (n2 != arg1.length) {
                sprlre3.cfr_renamed_49(arg1[n++].cfr_renamed_568());
                n2 = n;
            }
            sprpse2 = new sprpse(sprlre3);
        }
        return new sprcwd(new sprsce(sprige2, (sprije)object, sprmra2, sprpse2));
    }

    public sprpvd(spryyd spryyd2) {
        sprpvd sprpvd2 = this;
        sprpvd sprpvd3 = this;
        sprpvd3.cfr_renamed_2 = new ArrayList();
        sprpvd2.cfr_renamed_4 = null;
        sprpvd2.cfr_renamed_3 = spryyd2;
    }

    public sprpvd cfr_renamed_4311(sprfzd arg0, sprdi arg1, Date arg2, sprszd arg3) {
        sprpvd sprpvd2 = this;
        sprpvd2.cfr_renamed_2.add(new sprcod(this, arg0, arg1, new Date(), arg2, arg3));
        return sprpvd2;
    }

    public sprpvd cfr_renamed_4312(sprfzd arg0, sprdi arg1, sprszd arg2) {
        sprpvd sprpvd2 = this;
        sprpvd2.cfr_renamed_2.add(new sprcod(this, arg0, arg1, new Date(), null, arg2));
        return sprpvd2;
    }

    public sprpvd cfr_renamed_4313(sprszd arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprpvd(sprdce sprdce2, sprpa sprpa2) throws sprbud {
        void arg1;
        void arg0;
        sprpvd sprpvd2 = this;
        sprpvd sprpvd3 = this;
        sprpvd2.cfr_renamed_2 = new ArrayList();
        sprpvd2.cfr_renamed_4 = null;
        sprpvd2.cfr_renamed_3 = new spryyd((sprdce)arg0, (sprpa)arg1);
    }
}

