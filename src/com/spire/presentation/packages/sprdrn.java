/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprckn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.spriln;
import com.spire.presentation.packages.sprion;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprjjn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgda;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import java.util.Iterator;

@sprtea
public class sprdrn
extends sprsmn {
    private sprsuja cfr_renamed_0;
    private boolean cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprqgp cfr_renamed_3;
    private StringBuilder cfr_renamed_4;

    @Override
    public void cfr_renamed_13164(sprion arg0) {
        int n;
        spriln[] sprilnArray = arg0.cfr_renamed_13165();
        spriln spriln2 = sprilnArray[0];
        if (sprilnArray.length <= 0) {
            return;
        }
        if (this.cfr_renamed_1) {
            this.cfr_renamed_13166(spriln2.cfr_renamed_13167());
            this.cfr_renamed_1 = false;
        } else {
            this.cfr_renamed_13168(spriln2.cfr_renamed_13167());
        }
        sprsuja[] sprsujaArray = new sprsuja[3];
        int n2 = n = 0;
        while (n2 < sprilnArray.length) {
            spriln2 = sprilnArray[n];
            sprsujaArray[0] = spriln2.cfr_renamed_13169();
            sprsujaArray[1] = spriln2.cfr_renamed_13170();
            sprsujaArray[2] = spriln2.cfr_renamed_13171();
            this.cfr_renamed_13172(sprsujaArray);
            this.cfr_renamed_0 = spriln2.cfr_renamed_13171();
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (arg0.cfr_renamed_13174()) {
            sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprizc.cfr_renamed_9("F>"));
        }
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        sprsuja[] sprsujaArray;
        if (this.cfr_renamed_1) {
            this.cfr_renamed_1 = false;
            sprsujaArray = new StringBuilder();
            Object[] objectArray = new Object[1];
            objectArray[0] = sprckn.cfr_renamed_13176(arg0.cfr_renamed_13167());
            sprghha.cfr_renamed_12289((StringBuilder)sprsujaArray, sprrgda.cfr_renamed_9("\bpuve"), objectArray);
            if (!this.cfr_renamed_4.toString().equals(sprsujaArray.toString())) {
                sprdrn sprdrn2 = this;
                sprghha.cfr_renamed_13177(this.cfr_renamed_4, sprdrn2.cfr_renamed_4.toString(), sprsujaArray.toString());
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = sprckn.cfr_renamed_13176(arg0.cfr_renamed_13167());
                sprghha.cfr_renamed_12289(sprdrn2.cfr_renamed_4, sprizc.cfr_renamed_9("Sg.a>"), objectArray2);
            }
        } else {
            this.cfr_renamed_13168(arg0.cfr_renamed_13167());
        }
        sprsujaArray = new sprsuja[]{arg0.cfr_renamed_13169(), arg0.cfr_renamed_13170(), arg0.cfr_renamed_13171()};
        this.cfr_renamed_13172(sprsujaArray);
        this.cfr_renamed_0 = arg0.cfr_renamed_13171();
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprvjn sprvjn2 = arg0.cfr_renamed_576(n);
            if (sprvjn2 instanceof sprion) {
                sprion sprion2;
                sprion sprion3 = sprion2 = spresca.cfr_renamed_11777(sprvjn2, sprion.class);
                sprion sprion4 = sprion2;
                sprion3.cfr_renamed_13179(360.0f - sprion4.cfr_renamed_13180());
                sprion3.cfr_renamed_13181(-sprion4.cfr_renamed_13182());
                arg0.cfr_renamed_13183(sprion3.cfr_renamed_13167());
            }
            n2 = ++n;
        }
        this.cfr_renamed_13166(arg0.cfr_renamed_13167());
        this.cfr_renamed_0 = arg0.cfr_renamed_13167();
        this.cfr_renamed_1 = true;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public String cfr_renamed_13145(sprxln sprxln2, boolean bl) {
        void arg0;
        void arg1;
        sprdrn sprdrn2 = this;
        sprdrn sprdrn3 = this;
        sprdrn2.cfr_renamed_4 = new StringBuilder();
        sprdrn2.cfr_renamed_2 = arg1;
        if (sprxln2.cfr_renamed_13094() != null) {
            this.cfr_renamed_3 = new sprqgp(arg0.cfr_renamed_13094().cfr_renamed_12595(), arg0.cfr_renamed_13094().cfr_renamed_12596(), arg0.cfr_renamed_13094().cfr_renamed_12597(), arg0.cfr_renamed_13094().cfr_renamed_12598(), arg0.cfr_renamed_13094().cfr_renamed_12599(), arg0.cfr_renamed_13094().cfr_renamed_12600());
        }
        arg0.cfr_renamed_13121(this);
        return this.cfr_renamed_4.toString();
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        if (this.cfr_renamed_3 != null && this.cfr_renamed_2) {
            sprsuja[] sprsujaArray = new sprsuja[1];
            sprsujaArray[0] = new sprsuja(arg0.cfr_renamed_1980(), arg0.spr\u3181());
            sprsuja[] sprsujaArray2 = sprsujaArray;
            sprdrn sprdrn2 = this;
            sprdrn2.cfr_renamed_3.cfr_renamed_13184(sprsujaArray2);
            Object[] objectArray = new Object[1];
            objectArray[0] = sprckn.cfr_renamed_13176(sprsujaArray2[0]);
            sprghha.cfr_renamed_12289(sprdrn2.cfr_renamed_4, sprrgda.cfr_renamed_9("\bpuve"), objectArray);
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = sprckn.cfr_renamed_13176(arg0);
        sprghha.cfr_renamed_12289(this.cfr_renamed_4, sprizc.cfr_renamed_9("Sg.a>"), objectArray);
    }

    private /* synthetic */ void cfr_renamed_13168(sprsuja arg0) {
        if (this.cfr_renamed_3 != null && this.cfr_renamed_2) {
            sprsuja[] sprsujaArray = new sprsuja[1];
            sprsujaArray[0] = new sprsuja(arg0.cfr_renamed_1980(), arg0.spr\u3181());
            sprsuja[] sprsujaArray2 = sprsujaArray;
            sprdrn sprdrn2 = this;
            sprdrn2.cfr_renamed_3.cfr_renamed_13184(sprsujaArray2);
            Object[] objectArray = new Object[1];
            objectArray[0] = sprckn.cfr_renamed_13176(sprsujaArray2[0]);
            sprghha.cfr_renamed_12289(sprdrn2.cfr_renamed_4, sprrgda.cfr_renamed_9("\tpuve"), objectArray);
            return;
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = sprckn.cfr_renamed_13176(arg0);
        sprghha.cfr_renamed_12289(this.cfr_renamed_4, sprizc.cfr_renamed_9("Rg.a>"), objectArray);
    }

    public sprdrn() {
        sprdrn sprdrn2 = this;
        sprdrn2.cfr_renamed_3 = null;
        sprdrn2.cfr_renamed_2 = false;
    }

    private /* synthetic */ void cfr_renamed_13172(sprsuja[] arg0) {
        sprdrn sprdrn2 = this;
        sprghha.cfr_renamed_12279(sprdrn2.cfr_renamed_4, sprrgda.cfr_renamed_9("\u0006"));
        if (sprdrn2.cfr_renamed_3 != null && this.cfr_renamed_2) {
            int n;
            sprsuja[] sprsujaArray = new sprsuja[arg0.length];
            int n2 = n = 0;
            while (n2 < sprsujaArray.length) {
                int n3 = n;
                sprsuja sprsuja2 = new sprsuja(arg0[n].cfr_renamed_1980(), arg0[n].spr\u3181());
                sprsujaArray[n3] = sprsuja2;
                n2 = ++n;
            }
            this.cfr_renamed_3.cfr_renamed_13184(sprsujaArray);
            int n4 = n = 0;
            while (n4 < arg0.length) {
                sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprckn.cfr_renamed_13176(sprsujaArray[n]));
                sprghha.cfr_renamed_12279(this.cfr_renamed_4, " ");
                n4 = ++n;
            }
        } else {
            int n;
            int n5 = n = 0;
            while (n5 < arg0.length) {
                sprghha.cfr_renamed_12279(this.cfr_renamed_4, sprckn.cfr_renamed_13176(arg0[n]));
                sprghha.cfr_renamed_12279(this.cfr_renamed_4, " ");
                n5 = ++n;
            }
        }
    }

    @Override
    public void cfr_renamed_13185(sprjjn arg0) {
        Iterator iterator;
        sprjjn sprjjn2;
        spriln spriln2 = (spriln)arg0.cfr_renamed_1769().get(0);
        if (this.cfr_renamed_1) {
            sprjjn2 = arg0;
            this.cfr_renamed_1 = false;
        } else {
            this.cfr_renamed_13168(spriln2.cfr_renamed_13167());
            sprjjn2 = arg0;
        }
        Iterator iterator2 = iterator = sprjjn2.cfr_renamed_1769().iterator();
        while (iterator2.hasNext()) {
            spriln spriln3 = (spriln)iterator.next();
            sprsuja[] sprsujaArray = new sprsuja[3];
            iterator2 = iterator;
            sprsujaArray[0] = spriln3.cfr_renamed_13169();
            sprsujaArray[1] = spriln3.cfr_renamed_13170();
            sprsujaArray[2] = spriln3.cfr_renamed_13171();
            this.cfr_renamed_13172(sprsujaArray);
            this.cfr_renamed_0 = spriln3.cfr_renamed_13171();
        }
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        sprsuja sprsuja2;
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() <= 0) {
            return;
        }
        if (this.cfr_renamed_1) {
            this.cfr_renamed_1 = false;
        }
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() == 2) {
            sprfqn sprfqn2 = arg0;
            sprsuja sprsuja3 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(0);
            sprsuja2 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(1);
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            sprsuja2 = arg0.cfr_renamed_13187().cfr_renamed_576(n);
            if (sprsuja2.cfr_renamed_1980() != this.cfr_renamed_0.cfr_renamed_1980() || sprsuja2.spr\u3181() != this.cfr_renamed_0.spr\u3181()) {
                this.cfr_renamed_13168(sprsuja2);
                this.cfr_renamed_0 = this.cfr_renamed_0;
            }
            n2 = ++n;
        }
    }
}

