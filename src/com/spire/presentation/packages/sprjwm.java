/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spray;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprjxm;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvyo;

@sprtea
public class sprjwm
extends sprjxm {
    private sprson cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjwm(sprson sprson2) {
        void arg0;
        if (sprson2 == null) {
            throw new NullPointerException("image");
        }
        this.cfr_renamed_4 = arg0;
    }

    public sprjwm(sprvyo arg0) {
        this(arg0, null, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprjwm(spreen spreen2) throws Exception {
        sprson sprson2;
        void arg0;
        if (spreen2 == null) {
            throw new NullPointerException("stream");
        }
        void v0 = arg0;
        sprvyo sprvyo2 = sprjwm.cfr_renamed_12640((spreen)v0);
        void v1 = arg0;
        sprvyo2.cfr_renamed_12641((spreen)v1, 7);
        byte[] byArray = new byte[(int)(v1.cfr_renamed_806() & 0xFFFFFFFFL)];
        v0.cfr_renamed_11556(byArray, 0, byArray.length);
        this.cfr_renamed_4 = sprson2 = new sprson(new sprsuja(0.0f, 0.0f), new sprphja(sprvyo2.cfr_renamed_1942(), sprvyo2.cfr_renamed_1452()), byArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprjwm(sprvyo sprvyo2, spray spray2, boolean bl) {
        super((sprvyo)arg0, (spray)arg1, (boolean)arg2);
        byte[] byArray;
        Object object;
        void arg2;
        void arg1;
        void arg0;
        if (bl || arg0.cfr_renamed_12642() == 6) {
            object = new sprpdja();
            try {
                arg0.cfr_renamed_12641((spreen)object, 6);
                byArray = ((sprpdja)object).cfr_renamed_4529();
            }
            finally {
                if (object != null) {
                    ((spreen)object).cfr_renamed_2637();
                }
            }
        }
        if (arg0.cfr_renamed_12642() == 5) {
            object = new sprpdja();
            try {
                arg0.cfr_renamed_12641((spreen)object, 5);
                byArray = ((sprpdja)object).cfr_renamed_4529();
            }
            finally {
                if (object != null) {
                    ((spreen)object).cfr_renamed_2637();
                }
            }
        }
        object = new sprpdja();
        try {
            arg0.cfr_renamed_12641((spreen)object, 6);
            byArray = ((sprpdja)object).cfr_renamed_4529();
        }
        finally {
            if (object != null) {
                ((spreen)object).cfr_renamed_2637();
            }
        }
        this.cfr_renamed_4 = object = new sprson(new sprsuja(0.0f, 0.0f), new sprphja(this.cfr_renamed_1942(), this.cfr_renamed_1452()), byArray);
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_4;
    }

    public static sprvyo cfr_renamed_12640(spreen arg0) throws Exception {
        return new sprvyo(sprmvo.cfr_renamed_12452(arg0));
    }
}

