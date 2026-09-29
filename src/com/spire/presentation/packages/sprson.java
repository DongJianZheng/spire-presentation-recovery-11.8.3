/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprago;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprdno;
import com.spire.presentation.packages.sprehn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprflo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprkkn;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtjn;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprvmo;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwgp;
import com.spire.presentation.packages.sprwp;
import com.spire.presentation.packages.sprww;
import com.spire.presentation.packages.sprxho;

@sprtea
public class sprson
extends sprvjn
implements Cloneable {
    private sprehn cfr_renamed_119;
    private sprphja cfr_renamed_91;
    private sprww cfr_renamed_0;
    private sprsuja cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprtqo cfr_renamed_3;
    private sprwgp cfr_renamed_4;

    @sprtea
    public sprmrn cfr_renamed_13693() {
        sprmrn sprmrn2;
        sprdfo sprdfo2 = new sprdfo(this.cfr_renamed_12510());
        sprlmo sprlmo2 = new sprlmo(sprdno.cfr_renamed_13694());
        sprmrn sprmrn3 = null;
        if (sprdfo2.cfr_renamed_13695() || sprdfo2.cfr_renamed_13696()) {
            sprflo sprflo2 = new sprflo(sprdfo2, sprlmo2);
            sprmrn2 = sprmrn3 = sprflo2.cfr_renamed_13697(false);
        } else if (sprdfo2.cfr_renamed_13698() == 3) {
            sprxho sprxho2 = new sprxho(sprdfo2, sprlmo2);
            sprmrn2 = sprmrn3 = sprxho2.cfr_renamed_13697(false);
        } else if (sprdfo2.cfr_renamed_13698() == 4) {
            sprvmo sprvmo2 = new sprvmo(sprdfo2, sprlmo2);
            sprmrn2 = sprmrn3 = sprvmo2.cfr_renamed_13697(false);
        } else {
            sprago sprago2 = new sprago(sprdfo2, sprlmo2);
            sprmrn2 = sprmrn3 = sprago2.cfr_renamed_13697(false);
        }
        if (sprmrn2 != null) {
            sprmrn3.cfr_renamed_13591(this.cfr_renamed_13252());
        }
        return sprmrn3;
    }

    public void cfr_renamed_13699(sprehn arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        arg0.cfr_renamed_13122(this);
    }

    public sprson(sprsuja arg0, sprphja arg1, byte[] arg2) {
        this(arg0, arg1, arg2, null);
    }

    private /* synthetic */ void cfr_renamed_13700(sprkkn arg0, sprsmn arg1) {
        sprlmo sprlmo2 = new sprlmo(arg0.cfr_renamed_13400(), spresca.cfr_renamed_11777(arg1, sprwp.class));
        sprmrn sprmrn2 = arg0.cfr_renamed_13701(this, sprlmo2);
        if (sprmrn2 == null) {
            return;
        }
        sprtjn.cfr_renamed_13702(sprmrn2, this.cfr_renamed_0);
        sprmrn2.cfr_renamed_13121(arg1);
    }

    public sprtqo cfr_renamed_13240() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprson(sprsuja sprsuja2, sprphja sprphja2, byte[] byArray, sprtqo sprtqo2) {
        void arg3;
        void arg1;
        void arg0;
        sprson sprson2 = this;
        sprson sprson3 = this;
        this.cfr_renamed_1 = sprsuja.cfr_renamed_13377();
        this.cfr_renamed_91 = sprphja.cfr_renamed_4;
        sprson3.cfr_renamed_1 = arg0;
        sprson3.cfr_renamed_91 = arg1;
        sprson2.cfr_renamed_3 = arg3;
        sprson2.cfr_renamed_2 = sprvyo.cfr_renamed_13703(byArray);
    }

    public sprww cfr_renamed_13704() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_13598(sprphja arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public sprgeja cfr_renamed_8505() {
        sprson sprson2 = this;
        return new sprgeja(sprson2.cfr_renamed_1, sprson2.cfr_renamed_91);
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public sprson cfr_renamed_13123(sprsmn arg0, sprkkn arg1) {
        switch (this.cfr_renamed_12642()) {
            case 0: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return this;
            }
            case 2: 
            case 3: {
                this.cfr_renamed_13700(arg1, arg0);
                return null;
            }
        }
        return sprson.cfr_renamed_13705(this);
    }

    public sprphja cfr_renamed_2773() {
        return this.cfr_renamed_91;
    }

    public void cfr_renamed_13706(byte[] arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_13707(sprwgp arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public byte[] cfr_renamed_12510() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_13708(sprww arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public sprsuja cfr_renamed_13110() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_12642() {
        return sprsto.cfr_renamed_13225(this.cfr_renamed_2);
    }

    public void cfr_renamed_13109(sprsuja arg0) {
        this.cfr_renamed_1 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    public static sprson cfr_renamed_13705(sprson arg0) {
        sprson sprson2;
        sprson sprson3 = sprson2 = arg0.cfr_renamed_12099();
        sprson3.cfr_renamed_13706(sprsto.cfr_renamed_13709());
        sprson3.cfr_renamed_13710(null);
        return sprson3;
    }

    private /* synthetic */ sprson cfr_renamed_12099() {
        return (sprson)this.cfr_renamed_12100();
    }

    @sprtea
    public sprczo cfr_renamed_13711() {
        return sprsto.cfr_renamed_13321(this.cfr_renamed_2);
    }

    public void cfr_renamed_13710(sprtqo arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprwgp cfr_renamed_13238() {
        return this.cfr_renamed_4;
    }

    public sprehn cfr_renamed_13252() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprson cfr_renamed_13712(sprsuja arg0, sprphja arg1, String arg2) throws Exception {
        sprgfja sprgfja2 = new sprgfja(arg2, 3, 1);
        try {
            byte[] byArray = sprmvo.cfr_renamed_12452(sprgfja2);
            sprson sprson2 = new sprson(arg0, arg1, byArray);
            return sprson2;
        }
        finally {
            sprgfja2.cfr_renamed_2637();
        }
    }
}

