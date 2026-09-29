/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmmm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprqy;
import com.spire.presentation.packages.sprstm;
import com.spire.presentation.packages.spruem;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class sprjvl
implements sprak {
    private final Hashtable cfr_renamed_4;

    public sprjvl() {
        sprjvl sprjvl2 = this;
        sprjvl2.cfr_renamed_4 = new Hashtable();
    }

    private static /* synthetic */ Hashtable cfr_renamed_4093(Hashtable arg0) {
        Enumeration enumeration;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration2 = enumeration = arg0.keys();
        while (enumeration2.hasMoreElements()) {
            Object k;
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            Object k2 = k = enumeration3.nextElement();
            hashtable.put(k2, arg0.get(k2));
        }
        return hashtable;
    }

    /*
     * WARNING - void declaration
     */
    public sprjvl(sprjpm sprjpm2) {
        if (sprjpm2 != null) {
            void arg0;
            this.cfr_renamed_4 = arg0.cfr_renamed_4095();
            return;
        }
        this.cfr_renamed_4 = new Hashtable();
    }

    public Hashtable cfr_renamed_4094(Map arg0) {
        spruem spruem2;
        Object object;
        Hashtable hashtable = sprjvl.cfr_renamed_4093(this.cfr_renamed_4);
        if (!hashtable.containsKey(sprqy.cfr_renamed_91) && (object = sprlem.cfr_renamed_23(arg0.get("contentType"))) != null) {
            spruem2 = new spruem(sprqy.cfr_renamed_91, new sprocn((sprco)object));
            hashtable.put(spruem2.cfr_renamed_204(), spruem2);
        }
        if (!hashtable.containsKey(sprqy.cfr_renamed_119)) {
            object = new Date();
            spruem2 = new spruem(sprqy.cfr_renamed_119, new sprocn(new sprstm((Date)object)));
            hashtable.put(spruem2.cfr_renamed_204(), spruem2);
        }
        if (!hashtable.containsKey(sprqy.cfr_renamed_0)) {
            object = (byte[])arg0.get("digest");
            spruem2 = new spruem(sprqy.cfr_renamed_0, new sprocn(new sprfvg((byte[])object)));
            hashtable.put(spruem2.cfr_renamed_204(), spruem2);
        }
        if (!hashtable.contains(sprqy.cfr_renamed_1)) {
            object = new spruem(sprqy.cfr_renamed_1, new sprocn(new sprmmm((sprddm)arg0.get("digestAlgID"), 1, (sprddm)arg0.get("signatureAlgID"))));
            hashtable.put(((spruem)object).cfr_renamed_204(), object);
        }
        return hashtable;
    }

    @Override
    public sprjpm cfr_renamed_134(Map arg0) {
        return new sprjpm(this.cfr_renamed_4094(arg0));
    }
}

