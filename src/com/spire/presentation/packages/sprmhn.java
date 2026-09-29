/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import java.util.Iterator;

@sprtea
public class sprmhn
extends sprsmn {
    private sprwvn cfr_renamed_4;

    public sprmhn() {
        sprmhn sprmhn2 = this;
        sprmhn2.cfr_renamed_4 = new sprwvn();
    }

    private static /* synthetic */ void cfr_renamed_13529(sprxln arg0, float arg1) {
        Cloneable cloneable;
        sprxln sprxln2;
        sprkmn sprkmn2;
        sprxln sprxln3 = arg0;
        sprkmn sprkmn3 = sprxln3.cfr_renamed_8155();
        int n = sprkmn3.cfr_renamed_13530(arg0);
        sprkmn3.cfr_renamed_12148(n);
        sprmrn sprmrn2 = new sprmrn();
        sprkmn3.cfr_renamed_13531(n, sprmrn2);
        sprxln sprxln4 = arg0;
        sprmrn2.cfr_renamed_12511(sprxln4.cfr_renamed_13094());
        sprxln4.cfr_renamed_12511(null);
        sprpip sprpip2 = (sprpip)sprxln3.cfr_renamed_12551();
        sprxln sprxln5 = arg0;
        sprxln5.cfr_renamed_12550(null);
        Cloneable cloneable2 = sprmrn2;
        if (sprxln5.cfr_renamed_12571() != null && !arg0.cfr_renamed_12571().cfr_renamed_12551().cfr_renamed_29()) {
            ((sprkmn)cloneable2).cfr_renamed_12507(arg0);
            sprkmn sprkmn4 = sprkmn2 = new sprmrn();
            ((sprkmn)cloneable2).cfr_renamed_13531(0, sprkmn4);
            cloneable2 = sprkmn4;
        }
        sprxln sprxln6 = arg0;
        sprkmn2 = sprxln6.cfr_renamed_12590();
        sprxln sprxln7 = sprxln2 = sprxln6.cfr_renamed_13532();
        sprxln7.cfr_renamed_12545(null);
        ((sprmrn)cloneable2).cfr_renamed_12545(sprxln7);
        if (sprkmn2 != null) {
            Cloneable cloneable3 = cloneable = new sprmrn();
            ((sprmrn)cloneable3).cfr_renamed_12545((sprxln)sprkmn2);
            ((sprkmn)cloneable2).cfr_renamed_12507((sprvjn)cloneable3);
            cloneable2 = cloneable;
        }
        sprpip sprpip3 = sprpip2;
        cloneable = sprsto.cfr_renamed_13321(sprpip3.cfr_renamed_12510());
        sprtqo sprtqo2 = sprpip3.cfr_renamed_13533().cfr_renamed_29() ? new sprtqo(0.0, 0.0, 0.0, 0.0) : new sprtqo(sprpip2.cfr_renamed_13533().cfr_renamed_13430() / (float)((sprczo)cloneable).cfr_renamed_1942(), ((float)((sprczo)cloneable).cfr_renamed_1942() - sprpip2.cfr_renamed_13533().cfr_renamed_13341()) / (float)((sprczo)cloneable).cfr_renamed_1942(), sprpip2.cfr_renamed_13533().cfr_renamed_13342() / (float)((sprczo)cloneable).cfr_renamed_1452(), ((float)((sprczo)cloneable).cfr_renamed_1452() - sprpip2.cfr_renamed_13533().cfr_renamed_13429()) / (float)((sprczo)cloneable).cfr_renamed_1452());
        sprson sprson2 = new sprson(sprsuja.cfr_renamed_13377(), new sprphja(((sprczo)cloneable).cfr_renamed_1942(), ((sprczo)cloneable).cfr_renamed_1452()), sprpip2.cfr_renamed_12510(), sprtqo2);
        sprmrn sprmrn3 = new sprmrn();
        sprmrn3.cfr_renamed_12511(sprpip2.cfr_renamed_12672() != null ? sprpip2.cfr_renamed_12672() : new sprqgp());
        sprmrn sprmrn4 = sprmrn3;
        float f = arg1;
        sprmrn4.cfr_renamed_13094().cfr_renamed_13534(f, f);
        ((sprkmn)cloneable2).cfr_renamed_12507(sprmrn4);
        cloneable2 = sprmrn3;
        ((sprkmn)cloneable2).cfr_renamed_12507(sprson2);
    }

    public static void cfr_renamed_13535(sprkmn arg0, float arg1) {
        Iterator iterator;
        sprmhn sprmhn2;
        sprmhn sprmhn3 = sprmhn2 = new sprmhn();
        arg0.cfr_renamed_13121(sprmhn3);
        sprwvn sprwvn2 = sprmhn3.cfr_renamed_4;
        if (sprwvn2.size() == 0) {
            return;
        }
        Iterator iterator2 = iterator = sprwvn2.iterator();
        while (iterator2.hasNext()) {
            sprmhn.cfr_renamed_13529((sprxln)iterator.next(), arg1);
            iterator2 = iterator;
        }
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        if (arg0.cfr_renamed_12551() == null || arg0.cfr_renamed_12551().cfr_renamed_13338() != 2) {
            return;
        }
        sprpip sprpip2 = (sprpip)arg0.cfr_renamed_12551();
        if (sprpip2.cfr_renamed_13337() != 4) {
            return;
        }
        if (sprpip2.cfr_renamed_13509() > 0.0f && sprpip2.cfr_renamed_13509() < 1.0f) {
            return;
        }
        if (!sprsto.cfr_renamed_13536(sprpip2.cfr_renamed_12510())) {
            return;
        }
        sprovja.cfr_renamed_11658(this.cfr_renamed_4, arg0);
    }
}

