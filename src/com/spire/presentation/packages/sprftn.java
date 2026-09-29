/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgqn;
import com.spire.presentation.packages.sprlco;
import com.spire.presentation.packages.sprmho;
import com.spire.presentation.packages.sprpqn;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtyn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwln;
import com.spire.presentation.packages.sprzvn;
import java.util.Iterator;

@sprtea
public class sprftn {
    private sprtyn cfr_renamed_2;
    private sprgdo cfr_renamed_3;
    private sprpqn cfr_renamed_4;

    @sprtea
    public void cfr_renamed_14451(sprgqn arg0, sprzvn arg1) {
        sprwbp sprwbp2 = sprwbp.cfr_renamed_13267(this.cfr_renamed_14499().cfr_renamed_13268(), sprwbp.cfr_renamed_1447) ? this.cfr_renamed_14499().cfr_renamed_13268() : arg0.cfr_renamed_12553();
        int n = this.cfr_renamed_14499().cfr_renamed_14500() != 0 ? this.cfr_renamed_14499().cfr_renamed_14500() : arg0.cfr_renamed_13661();
        sprlco sprlco2 = new sprlco(arg0.cfr_renamed_13189(), n, sprwbp2, arg1);
        this.cfr_renamed_4.cfr_renamed_13883(arg0, sprlco2);
    }

    @sprtea
    public void cfr_renamed_14501() {
        sprftn sprftn2 = this;
        sprftn2.cfr_renamed_2 = sprftn2.cfr_renamed_14502(sprftn2.cfr_renamed_4.cfr_renamed_1411(), true);
    }

    private /* synthetic */ sprrgo cfr_renamed_14499() {
        return this.cfr_renamed_3.cfr_renamed_13097().cfr_renamed_14499();
    }

    @sprtea
    public void cfr_renamed_14291(sprfy arg0) {
        this.cfr_renamed_2.cfr_renamed_14291(arg0);
    }

    @sprtea
    public void cfr_renamed_14489(sprwln arg0, sprzvn arg1) {
        sprlco sprlco2;
        sprftn sprftn2 = this;
        sprwbp sprwbp2 = sprftn2.cfr_renamed_14499().cfr_renamed_13268();
        int n = sprftn2.cfr_renamed_14499().cfr_renamed_14500();
        String string = sprwln.cfr_renamed_13788(arg0.cfr_renamed_313());
        if (sprftn2.cfr_renamed_14499().cfr_renamed_14503().cfr_renamed_12143(string)) {
            sprlco2 = (sprlco)this.cfr_renamed_14499().cfr_renamed_14503().cfr_renamed_12347(string);
            sprwbp2 = sprlco2.cfr_renamed_12553();
            n = sprlco2.cfr_renamed_14495();
        }
        sprlco2 = new sprlco(arg0.cfr_renamed_12909(), n, sprwbp2, arg1);
        this.cfr_renamed_4.cfr_renamed_13884(arg0, sprlco2);
    }

    @sprtea
    public void cfr_renamed_14473(sprgqn arg0, sprzvn arg1, boolean arg2) {
        sprwbp sprwbp2 = sprwbp.cfr_renamed_13267(this.cfr_renamed_14499().cfr_renamed_13268(), sprwbp.cfr_renamed_1447) ? this.cfr_renamed_14499().cfr_renamed_13268() : arg0.cfr_renamed_12553();
        int n = this.cfr_renamed_14499().cfr_renamed_14500() != 0 ? this.cfr_renamed_14499().cfr_renamed_14500() : arg0.cfr_renamed_13661();
        sprlco sprlco2 = new sprlco(arg0.cfr_renamed_13189(), n, sprwbp2, arg1);
        this.cfr_renamed_4.cfr_renamed_13872(arg0, sprlco2, arg2);
    }

    @sprtea
    public boolean cfr_renamed_29() {
        return this.cfr_renamed_4.cfr_renamed_1411().cfr_renamed_14504().size() == 0;
    }

    private /* synthetic */ sprtyn cfr_renamed_14502(sprmho arg0, boolean arg1) {
        Iterator iterator;
        sprtyn sprtyn2 = new sprtyn(this.cfr_renamed_3, (sprlco)arg0.cfr_renamed_14505(), arg0.cfr_renamed_14506(), arg1);
        Iterator iterator2 = iterator = arg0.cfr_renamed_14504().iterator();
        while (iterator2.hasNext()) {
            sprmho sprmho2 = (sprmho)iterator.next();
            iterator2 = iterator;
            sprtyn2.cfr_renamed_14497(this.cfr_renamed_14502(sprmho2, false));
        }
        return sprtyn2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprftn(sprgdo sprgdo2) {
        void arg0;
        this.cfr_renamed_3 = sprgdo2;
        sprftn sprftn2 = this;
        this.cfr_renamed_4 = new sprpqn(arg0.cfr_renamed_13097().cfr_renamed_14499());
    }

    @sprtea
    public String cfr_renamed_14507() {
        return this.cfr_renamed_2.cfr_renamed_4570();
    }
}

