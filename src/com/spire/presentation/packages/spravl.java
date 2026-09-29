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
import com.spire.presentation.packages.spruem;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class spravl
implements sprak {
    private final Hashtable cfr_renamed_4;

    public Hashtable cfr_renamed_4094(Map arg0) {
        Object object;
        Object object2;
        Hashtable hashtable = new Hashtable();
        Object object3 = object2 = this.cfr_renamed_4.keys();
        while (object3.hasMoreElements()) {
            Enumeration enumeration = object2;
            object3 = enumeration;
            object = enumeration.nextElement();
            Object k = object;
            hashtable.put(k, this.cfr_renamed_4.get(k));
        }
        if (!hashtable.containsKey(sprqy.cfr_renamed_91)) {
            object2 = sprlem.cfr_renamed_23(arg0.get("contentType"));
            object = new spruem(sprqy.cfr_renamed_91, new sprocn((sprco)object2));
            hashtable.put(((spruem)object).cfr_renamed_204(), object);
        }
        if (!hashtable.containsKey(sprqy.cfr_renamed_0)) {
            object2 = (byte[])arg0.get("digest");
            object = new spruem(sprqy.cfr_renamed_0, new sprocn(new sprfvg((byte[])object2)));
            hashtable.put(((spruem)object).cfr_renamed_204(), object);
        }
        if (!hashtable.contains(sprqy.cfr_renamed_1)) {
            object2 = new spruem(sprqy.cfr_renamed_1, new sprocn(new sprmmm((sprddm)arg0.get("digestAlgID"), 2, (sprddm)arg0.get("macAlgID"))));
            hashtable.put(((spruem)object2).cfr_renamed_204(), object2);
        }
        return hashtable;
    }

    @Override
    public sprjpm cfr_renamed_134(Map arg0) {
        return new sprjpm(this.cfr_renamed_4094(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public spravl(sprjpm sprjpm2) {
        if (sprjpm2 != null) {
            void arg0;
            this.cfr_renamed_4 = arg0.cfr_renamed_4095();
            return;
        }
        this.cfr_renamed_4 = new Hashtable();
    }

    public spravl() {
        spravl spravl2 = this;
        spravl2.cfr_renamed_4 = new Hashtable();
    }
}

