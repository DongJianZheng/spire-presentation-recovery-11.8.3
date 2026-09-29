/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprfln;
import com.spire.presentation.packages.sprfpn;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprirn;
import com.spire.presentation.packages.sprjin;
import com.spire.presentation.packages.sprniy;
import com.spire.presentation.packages.sprnon;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.spronn;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.spruqn;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprvrn;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwjn;
import com.spire.presentation.packages.sprwnn;
import com.spire.presentation.packages.sprxln;
import java.util.Iterator;

@sprtea
public class sprdqn
extends sprcjn {
    private sprnon cfr_renamed_91;
    private boolean cfr_renamed_0;
    private sprnon cfr_renamed_1;
    private spronn cfr_renamed_2;
    private spraxo cfr_renamed_3;
    private sprwnn cfr_renamed_4;

    public sprdqn(sprwin sprwin2, spronn spronn2) {
        super(sprwin2, spronn2, 8);
        sprdqn sprdqn2 = this;
        this.cfr_renamed_3 = new spraxo();
        this.cfr_renamed_2 = spronn2;
        this.cfr_renamed_1 = new sprnon(this, sprniy.cfr_renamed_9("<\"\u00149\u0001}\u0007"));
        this.cfr_renamed_91 = new sprnon(this, sprudz.cfr_renamed_9("nKdWv\u0017p"));
    }

    @Override
    @sprtea
    public void cfr_renamed_13434() {
        Object object;
        sprdqn sprdqn2 = this;
        sprdqn2.cfr_renamed_13380().cfr_renamed_12423(sprniy.cfr_renamed_9(")\u001f+\t"));
        if (sprdqn2.cfr_renamed_2.cfr_renamed_13455() == 0 || this.cfr_renamed_2.cfr_renamed_13455() == 2) {
            int n;
            sprvrn sprvrn2 = new sprvrn(this, null);
            object = this.cfr_renamed_13280();
            int n2 = ((sprvqo[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                sprvqo sprvqo2 = object[n];
                this.cfr_renamed_13496(sprvrn2, sprvqo2);
                n3 = ++n;
            }
        }
        sprdqn sprdqn3 = this;
        sprdqn3.cfr_renamed_13497().cfr_renamed_13498();
        if (sprdqn3.cfr_renamed_3.cfr_renamed_11861() > 0) {
            int n;
            int n4 = n = 0;
            while (n4 < this.cfr_renamed_3.cfr_renamed_11861()) {
                spruqn spruqn2 = (spruqn)this.cfr_renamed_3.cfr_renamed_13485(n);
                object = spruqn2;
                spruqn2.cfr_renamed_13477();
                n4 = ++n;
            }
        }
        sprdqn sprdqn4 = this;
        sprdqn4.cfr_renamed_13499();
        sprdqn4.cfr_renamed_13380().cfr_renamed_12439();
    }

    @sprtea
    public String cfr_renamed_13453(sprxln arg0) {
        if (!sprfln.cfr_renamed_13500(arg0)) {
            return null;
        }
        return this.cfr_renamed_91.cfr_renamed_13449(arg0);
    }

    private /* synthetic */ sprwnn cfr_renamed_13497() {
        if (this.cfr_renamed_4 == null) {
            sprdqn sprdqn2 = this;
            this.cfr_renamed_4 = new sprwnn(this, this.cfr_renamed_13380());
        }
        return this.cfr_renamed_4;
    }

    @sprtea
    public spronn cfr_renamed_13454() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprjin cfr_renamed_13433() {
        return new sprirn(this.cfr_renamed_13097().cfr_renamed_13404(), this.cfr_renamed_112, 8);
    }

    @sprtea
    public String cfr_renamed_13463(sprpln arg0) {
        return this.cfr_renamed_13497().cfr_renamed_13463(arg0);
    }

    @Override
    @sprtea
    public String cfr_renamed_13444(sprfzo arg0) {
        return this.cfr_renamed_1.cfr_renamed_13449(arg0);
    }

    @Override
    public String cfr_renamed_13445(byte[] arg0, sprtqo arg1) {
        spruqn spruqn2 = (spruqn)this.cfr_renamed_3.cfr_renamed_13501(arg0, arg1);
        if (spruqn2 == null) {
            byte[] byArray = this.cfr_renamed_13314().cfr_renamed_13320(arg0, arg1);
            Object[] objectArray = new Object[1];
            objectArray[0] = this.cfr_renamed_13448();
            spruqn2 = new spruqn(sprraia.cfr_renamed_11562(sprudz.cfr_renamed_9("N`FjBv\u0017p"), objectArray), byArray, this);
            this.cfr_renamed_3.cfr_renamed_13502(arg0, arg1, spruqn2);
        }
        return spruqn2.cfr_renamed_13479();
    }

    public void cfr_renamed_13503(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    private /* synthetic */ void cfr_renamed_13499() {
        Iterator iterator;
        if (this.cfr_renamed_91.cfr_renamed_11861() <= 0) {
            return;
        }
        sprfpn sprfpn2 = new sprfpn();
        Iterator iterator2 = iterator = this.cfr_renamed_91.iterator();
        while (iterator2.hasNext()) {
            sprnyja sprnyja2 = (sprnyja)iterator.next();
            String string = (String)sprnyja2.getKey();
            sprxln sprxln2 = (sprxln)sprnyja2.getValue();
            sprdqn sprdqn2 = this;
            sprdqn2.cfr_renamed_13380().cfr_renamed_12423(sprniy.cfr_renamed_9(".\u0016$\n\u001d\u001b9\u0012"));
            sprdqn2.cfr_renamed_13380().cfr_renamed_12405("id", string);
            sprdqn2.cfr_renamed_13380().cfr_renamed_12423("path");
            sprdqn2.cfr_renamed_13380().cfr_renamed_12405("d", sprfpn2.cfr_renamed_13146(sprxln2));
            if (sprxln2.cfr_renamed_13094() != null) {
                this.cfr_renamed_13380().cfr_renamed_12405("transform", sprwjn.cfr_renamed_13420(sprxln2.cfr_renamed_13094()));
            }
            sprdqn sprdqn3 = this;
            sprdqn3.cfr_renamed_13380().cfr_renamed_12405(sprudz.cfr_renamed_9("nKdW UxKh"), "evenodd");
            sprdqn3.cfr_renamed_13380().cfr_renamed_12439();
            sprdqn3.cfr_renamed_13380().cfr_renamed_12439();
            iterator2 = iterator;
        }
    }

    public boolean cfr_renamed_13458() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_13496(sprvrn arg0, sprvqo arg1) {
        switch (this.cfr_renamed_2.cfr_renamed_13455()) {
            case 0: {
                arg0.cfr_renamed_13486(arg1);
                return;
            }
            case 2: {
                arg0.cfr_renamed_13493(arg1);
                return;
            }
        }
    }
}

