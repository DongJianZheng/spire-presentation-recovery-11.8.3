/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajn;
import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprann;
import com.spire.presentation.packages.sprdmn;
import com.spire.presentation.packages.sprenn;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgdp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgqn;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpin;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwln;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.sprzmn;

@sprtea
public class sprzon
extends sprsmn {
    private boolean cfr_renamed_0;
    private spralq cfr_renamed_1;
    private float cfr_renamed_2;
    private float cfr_renamed_3;
    private float cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_13570(sprhhp arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        if (this.cfr_renamed_0) {
            arg0.cfr_renamed_13572(this.cfr_renamed_13538());
        }
    }

    public boolean cfr_renamed_13573() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_13574(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    private /* synthetic */ boolean cfr_renamed_13571(Object arg0) {
        if (this.cfr_renamed_1.containsKey(arg0)) {
            return true;
        }
        this.cfr_renamed_1.cfr_renamed_12160(arg0, null);
        return false;
    }

    public void cfr_renamed_13575(float arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_13507(sprvjn arg0, double arg1) {
        double d = arg1;
        this.cfr_renamed_13576((float)d);
        if (d == 1.0) {
            return;
        }
        this.cfr_renamed_13577();
        arg0.cfr_renamed_13121(this);
    }

    @Override
    public void cfr_renamed_13115(sprwln arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13109(this.cfr_renamed_13578(arg0.cfr_renamed_13110()));
    }

    @Override
    public void cfr_renamed_13559(sprpin arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13579(this.cfr_renamed_13580(arg0.cfr_renamed_13550()));
    }

    public float cfr_renamed_13581() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_13582(sprvjn arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.cfr_renamed_13576(1.0f);
            return;
        }
        this.cfr_renamed_13507(arg0, (double)arg2 / (double)arg1);
    }

    private /* synthetic */ void cfr_renamed_13577() {
        this.cfr_renamed_1.clear();
    }

    @Override
    public void cfr_renamed_13117(sprgqn arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13109(this.cfr_renamed_13578(arg0.cfr_renamed_13110()));
    }

    public float cfr_renamed_13583() {
        return this.cfr_renamed_2;
    }

    private /* synthetic */ sprenn cfr_renamed_13584(sprenn arg0) {
        if (arg0 == null) {
            return null;
        }
        sprenn sprenn2 = arg0.cfr_renamed_12099();
        sprenn2.cfr_renamed_13585(this.cfr_renamed_13580(arg0.cfr_renamed_13543()));
        return sprenn2;
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13586(this.cfr_renamed_13578(arg0.cfr_renamed_13167()), this.cfr_renamed_13578(arg0.cfr_renamed_13169()), this.cfr_renamed_13578(arg0.cfr_renamed_13170()), this.cfr_renamed_13578(arg0.cfr_renamed_13171()));
    }

    private /* synthetic */ sprqgp cfr_renamed_13587(sprqgp arg0) {
        sprqgp sprqgp2;
        if (arg0 == null) {
            return null;
        }
        sprqgp sprqgp3 = sprqgp2 = arg0.cfr_renamed_12099();
        sprqgp3.cfr_renamed_13255(this.cfr_renamed_13538(), this.cfr_renamed_13538(), 1);
        sprqgp3.cfr_renamed_13255((float)(1.0 / (double)this.cfr_renamed_13538()), (float)(1.0 / (double)this.cfr_renamed_13538()), 0);
        return sprqgp3;
    }

    public sprgeja cfr_renamed_13580(sprgeja arg0) {
        return new sprgeja(arg0.cfr_renamed_1980() * this.cfr_renamed_13538(), arg0.spr\u3181() * this.cfr_renamed_13538(), arg0.cfr_renamed_1942() * this.cfr_renamed_13538(), arg0.cfr_renamed_1452() * this.cfr_renamed_13538());
    }

    public void cfr_renamed_13588(sprvjn arg0, double arg1, double arg2) {
        if (arg1 == 1.0 && arg2 == 1.0) {
            return;
        }
        sprzon sprzon2 = this;
        sprzon2.cfr_renamed_13577();
        sprzon2.cfr_renamed_13589((float)arg1);
        this.cfr_renamed_13575((float)arg2);
        arg0.cfr_renamed_13121(this);
    }

    public sprzon() {
        sprzon sprzon2 = this;
        sprzon2.cfr_renamed_1 = new spralq();
    }

    public void cfr_renamed_13576(float arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ sprphja cfr_renamed_13590(sprphja arg0) {
        return new sprphja(arg0.cfr_renamed_1942() * this.cfr_renamed_13538(), arg0.cfr_renamed_1452() * this.cfr_renamed_13538());
    }

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        sprmrn sprmrn2 = arg0;
        sprmrn2.cfr_renamed_12511(this.cfr_renamed_13587(arg0.cfr_renamed_13094()));
        sprmrn2.cfr_renamed_13591(this.cfr_renamed_13584(sprmrn2.cfr_renamed_13245()));
        if (arg0.cfr_renamed_12590() != null) {
            arg0.cfr_renamed_12590().cfr_renamed_13121(this);
        }
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        sprxln sprxln2 = arg0;
        sprxln2.cfr_renamed_12511(this.cfr_renamed_13587(sprxln2.cfr_renamed_13094()));
        if (arg0.cfr_renamed_12571() != null) {
            this.cfr_renamed_13592(arg0.cfr_renamed_12571());
        }
        if (arg0.cfr_renamed_12551() != null) {
            this.cfr_renamed_13593(arg0.cfr_renamed_12551());
        }
        if (arg0.cfr_renamed_12590() != null) {
            arg0.cfr_renamed_12590().cfr_renamed_13121(this);
        }
    }

    public static sprqgp cfr_renamed_13594(sprqgp arg0, int arg1, int arg2) {
        sprzon sprzon2;
        if (arg1 == arg2) {
            return arg0;
        }
        sprzon sprzon3 = sprzon2 = new sprzon();
        sprzon3.cfr_renamed_13576((float)((double)arg2 / (double)arg1));
        return sprzon3.cfr_renamed_13587(arg0);
    }

    private /* synthetic */ void cfr_renamed_13593(sprpln arg0) {
        sprajn sprajn2;
        if (arg0 == null || !(arg0 instanceof sprajn)) {
            return;
        }
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        sprajn sprajn3 = sprajn2 = (sprajn)arg0;
        sprajn3.cfr_renamed_12643(this.cfr_renamed_13587(sprajn3.cfr_renamed_12672()));
        switch (arg0.cfr_renamed_13338()) {
            case 3: {
                sprgdp sprgdp2;
                while (false) {
                }
                sprgdp sprgdp3 = sprgdp2 = (sprgdp)arg0;
                sprgdp3.cfr_renamed_13595(this.cfr_renamed_13580(sprgdp3.cfr_renamed_12644()));
                return;
            }
            case 4: {
                sprlrn sprlrn2;
                sprlrn sprlrn3 = sprlrn2 = (sprlrn)arg0;
                sprlrn3.cfr_renamed_13596(this.cfr_renamed_13578(sprlrn3.cfr_renamed_13552()));
                sprlrn3.cfr_renamed_6493().cfr_renamed_13121(this);
                return;
            }
        }
    }

    private /* synthetic */ sprsuja cfr_renamed_13578(sprsuja arg0) {
        return new sprsuja(arg0.cfr_renamed_1980() * this.cfr_renamed_13538(), arg0.spr\u3181() * this.cfr_renamed_13538());
    }

    @Override
    public void cfr_renamed_13560(sprann arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13579(this.cfr_renamed_13580(arg0.cfr_renamed_13550()));
    }

    public void cfr_renamed_13589(float arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            int n3 = n++;
            arg0.cfr_renamed_13187().cfr_renamed_13597(n3, this.cfr_renamed_13578(arg0.cfr_renamed_13187().cfr_renamed_576(n3)));
            n2 = n;
        }
    }

    @Override
    public void cfr_renamed_13553(sprzmn arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13579(this.cfr_renamed_13580(arg0.cfr_renamed_13550()));
    }

    public float cfr_renamed_13538() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        sprson sprson2 = arg0;
        sprzon sprzon2 = this;
        sprson2.cfr_renamed_13109(sprzon2.cfr_renamed_13578(arg0.cfr_renamed_13110()));
        sprson2.cfr_renamed_13598(sprzon2.cfr_renamed_13590(sprson2.cfr_renamed_2773()));
    }

    private /* synthetic */ void cfr_renamed_13592(sprtbp arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        sprtbp sprtbp2 = arg0;
        sprtbp2.cfr_renamed_12572(sprtbp2.cfr_renamed_1942() * this.cfr_renamed_13538());
        this.cfr_renamed_13593(arg0.cfr_renamed_12551());
    }

    @Override
    public void cfr_renamed_13549(sprdmn arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        arg0.cfr_renamed_13579(this.cfr_renamed_13580(arg0.cfr_renamed_13550()));
    }

    @Override
    public void cfr_renamed_13108(sprthn arg0) {
        if (this.cfr_renamed_13571(arg0)) {
            return;
        }
        if (arg0.cfr_renamed_12590() != null) {
            arg0.cfr_renamed_12590().cfr_renamed_13121(this);
        }
        sprthn sprthn2 = arg0;
        sprthn2.cfr_renamed_12511(this.cfr_renamed_13587(sprthn2.cfr_renamed_13094()));
        if (arg0.cfr_renamed_13257() != null) {
            this.cfr_renamed_13570(arg0.cfr_renamed_13257());
        }
        sprthn sprthn3 = arg0;
        sprzon sprzon2 = this;
        sprthn3.cfr_renamed_13109(sprzon2.cfr_renamed_13578(arg0.cfr_renamed_13110()));
        sprthn3.cfr_renamed_13598(sprzon2.cfr_renamed_13590(sprthn3.cfr_renamed_2773()));
    }
}

