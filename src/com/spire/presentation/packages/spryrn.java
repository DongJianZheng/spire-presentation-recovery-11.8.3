/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdto;
import com.spire.presentation.packages.sprfhn;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprmpn;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprojn;
import com.spire.presentation.packages.spromn;
import com.spire.presentation.packages.spropca;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprukaa;
import com.spire.presentation.packages.sprvqo;
import java.util.Iterator;

@sprtea
public class spryrn
extends sprmpn {
    private sprqyo cfr_renamed_2;
    private sprfhn cfr_renamed_3;
    private sprdto cfr_renamed_4;

    @sprtea
    public sprqyo cfr_renamed_13272() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spryrn(sprdto sprdto2, sprqt sprqt2) {
        super(sprukaa.cfr_renamed_9("gA-`'f:p-`"), (sprqt)arg1);
        void arg1;
        this.cfr_renamed_4 = sprdto2;
    }

    @sprtea
    public sprfhn cfr_renamed_13097() {
        return this.cfr_renamed_3;
    }

    @Override
    @sprtea
    public String cfr_renamed_13270(sprfzo arg0) {
        spryrn spryrn2 = this;
        String string = super.cfr_renamed_13270(arg0);
        spryrn2.cfr_renamed_2.cfr_renamed_13276().cfr_renamed_13277("http://schemas.microsoft.com/xps/2005/06/required-resource", string, false);
        return string;
    }

    @Override
    @sprtea
    public void cfr_renamed_13284() {
        Object object;
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_13280().iterator();
        while (iterator2.hasNext()) {
            object = (sprnyja)iterator.next();
            this.cfr_renamed_4.cfr_renamed_13274().cfr_renamed_13275(sprojn.cfr_renamed_13226((sprvqo)((sprnyja)object).getValue(), (String)((sprnyja)object).getKey()));
            iterator2 = iterator;
        }
        iterator = this.cfr_renamed_13313().values().iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            object = (spromn)iterator.next();
            sprqyo sprqyo2 = spryrn.cfr_renamed_13328((spromn)object);
            iterator3 = iterator;
            this.cfr_renamed_4.cfr_renamed_13274().cfr_renamed_13275(sprqyo2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_13329(int arg0) {
        switch (arg0) {
            case 5: {
                return "image/jpeg";
            }
            case 6: {
                return "image/png";
            }
            case 8: {
                return "image/tiff";
            }
        }
        throw new IllegalStateException(spropca.cfr_renamed_9("\u000e\u001f>\t+\u00148\u0005>\u0015{\u00186\u0010<\u0014{\u0005\"\u0001>_"));
    }

    @sprtea
    public sprdto cfr_renamed_13330() {
        return this.cfr_renamed_4;
    }

    @Override
    @sprtea
    public spromn cfr_renamed_13318(byte[] arg0, sprtqo arg1) {
        spryrn spryrn2 = this;
        spromn spromn2 = super.cfr_renamed_13318(arg0, arg1);
        spryrn2.cfr_renamed_2.cfr_renamed_13276().cfr_renamed_13277("http://schemas.microsoft.com/xps/2005/06/required-resource", spromn2.cfr_renamed_4651(), false);
        return spromn2;
    }

    @sprtea
    public void cfr_renamed_13271(int arg0) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        sprqyo sprqyo2 = new sprqyo(sprraia.cfr_renamed_11562(sprukaa.cfr_renamed_9("gW'p=~-}<`g\"gC)t-`ghxnfu8r/v"), objectArray), "application/vnd.ms-package.xps-fixedpage+xml");
        this.cfr_renamed_4.cfr_renamed_13274().cfr_renamed_13275(sprqyo2);
        this.cfr_renamed_2 = sprqyo2;
    }

    @sprtea
    public void cfr_renamed_13292(sprfhn arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private static /* synthetic */ sprqyo cfr_renamed_13328(spromn arg0) {
        int n = sprsto.cfr_renamed_13225(arg0.cfr_renamed_12510());
        sprqyo sprqyo2 = new sprqyo(arg0.cfr_renamed_4651(), spryrn.cfr_renamed_13329(n));
        sprqyo2.cfr_renamed_13232().cfr_renamed_4924(arg0.cfr_renamed_12510(), 0, arg0.cfr_renamed_12510().length);
        return sprqyo2;
    }
}

