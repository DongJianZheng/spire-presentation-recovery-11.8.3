/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajn;
import com.spire.presentation.packages.sprcho;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprkkn;
import com.spire.presentation.packages.sprkmn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqso;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsqn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.spruvn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzlp;
import com.spire.presentation.packages.sprzyo;

@sprtea
public class sprwdo
extends sprsmn {
    private sprjeka cfr_renamed_91;
    private boolean cfr_renamed_0;
    @sprtea
    public float cfr_renamed_1;
    private sprkkn cfr_renamed_2;
    private spruvn cfr_renamed_3;
    private sprjeka cfr_renamed_4;

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        if (this.cfr_renamed_13093() && arg0.cfr_renamed_13094() != null && arg0.cfr_renamed_11861() == 1 && arg0.cfr_renamed_576(0) instanceof sprson) {
            sprson sprson2 = spresca.cfr_renamed_11777(arg0.cfr_renamed_576(0), sprson.class);
            sprmrn sprmrn2 = arg0;
            sprmrn2.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f / sprson2.cfr_renamed_2773().cfr_renamed_1942(), 0.0f, 0.0f, -1.0f / sprson2.cfr_renamed_2773().cfr_renamed_1452(), 0.0f, 1.0f), 0);
            sprmrn2.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_1), 1);
        }
        this.cfr_renamed_13762(arg0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_15022(sprvjn arg0, sprgeja arg1, sprxln arg2) {
        byte[] byArray;
        Object object;
        Cloneable cloneable;
        block15: {
            try {
                Cloneable cloneable2;
                cloneable = new sprvyo(sprnmp.cfr_renamed_13494(arg1.cfr_renamed_1942()), sprnmp.cfr_renamed_13494(arg1.cfr_renamed_1452()));
                try {
                    block14: {
                        Object object2;
                        ((sprqso)cloneable).cfr_renamed_15023(sprwbp.cfr_renamed_955);
                        object = new sprzyo((sprqso)cloneable);
                        try {
                            ((sprzyo)object).cfr_renamed_15024();
                            object2 = new sprcho(null);
                            ((sprcho)object2).cfr_renamed_15025(arg0, ((sprzyo)object).cfr_renamed_15026());
                        }
                        finally {
                            if (object != null) {
                                ((sprzyo)object).cfr_renamed_11665();
                            }
                        }
                        object2 = new sprpdja();
                        try {
                            ((sprvyo)cloneable).cfr_renamed_14200((spreen)object2, 100);
                            byArray = ((sprpdja)object2).cfr_renamed_4529();
                            if (object2 == null) break block14;
                            cloneable2 = cloneable;
                        }
                        catch (Throwable throwable) {
                            if (object2 == null) throw throwable;
                            ((spreen)object2).cfr_renamed_2637();
                            throw throwable;
                        }
                        ((spreen)object2).cfr_renamed_2637();
                        break block15;
                    }
                    cloneable2 = cloneable;
                }
                finally {
                    if (cloneable2 != null) {
                        ((sprqso)cloneable).cfr_renamed_11665();
                    }
                }
            }
            catch (Exception exception) {
                return;
            }
        }
        if (byArray == null) {
            return;
        }
        cloneable = new sprson(arg1.cfr_renamed_9494(), arg1.cfr_renamed_2773(), byArray);
        Object object3 = object = new sprmrn();
        ((sprmrn)object3).cfr_renamed_12545(arg2);
        ((sprkmn)object3).cfr_renamed_12507((sprvjn)cloneable);
        this.cfr_renamed_13668().cfr_renamed_12507((sprvjn)object);
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
    }

    private /* synthetic */ void cfr_renamed_15027(sprson arg0, boolean arg1) {
        sprson sprson2;
        sprphja sprphja2;
        sprgeja sprgeja2 = this.cfr_renamed_13761().cfr_renamed_13764(arg0.cfr_renamed_8505());
        sprsuja sprsuja2 = sprgeja2.cfr_renamed_9494();
        if (arg1) {
            sprphja2 = sprgeja2.cfr_renamed_2773();
            sprson2 = arg0;
        } else {
            sprphja2 = arg0.cfr_renamed_8505().cfr_renamed_2773();
            sprson2 = arg0;
        }
        sprson sprson3 = new sprson(sprsuja2, sprphja2, sprson2.cfr_renamed_12510(), arg0.cfr_renamed_13240());
        this.cfr_renamed_13668().cfr_renamed_12507(sprson3);
    }

    private /* synthetic */ void cfr_renamed_15028() {
    }

    private /* synthetic */ void cfr_renamed_13763(sprqgp arg0) {
        sprqgp sprqgp2 = this.cfr_renamed_13761().cfr_renamed_12099();
        if (arg0 != null) {
            sprqgp2.cfr_renamed_12634(arg0, 0);
        }
        this.cfr_renamed_4.cfr_renamed_12516(sprqgp2);
    }

    private /* synthetic */ sprxln cfr_renamed_13760(sprxln arg0) {
        if (arg0 == null) {
            return null;
        }
        sprxln sprxln2 = arg0.cfr_renamed_13655(true);
        sprxln2.cfr_renamed_12624(this.cfr_renamed_13761());
        return sprxln2;
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        this.cfr_renamed_13765();
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
    }

    private /* synthetic */ void cfr_renamed_15029(sprvjn arg0, sprgeja arg1, sprxln arg2, boolean arg3) {
        sprmrn sprmrn2 = new sprmrn();
        sprmrn2.cfr_renamed_12511(arg3 ? this.cfr_renamed_13761().cfr_renamed_12099() : new sprqgp());
        sprmrn sprmrn3 = sprmrn2;
        sprmrn3.cfr_renamed_13094().cfr_renamed_13466(-arg1.cfr_renamed_1980(), -arg1.spr\u3181(), 1);
        sprmrn3.cfr_renamed_12507(arg0);
        this.cfr_renamed_15022(sprmrn2, arg1, arg2);
    }

    private /* synthetic */ sprqgp cfr_renamed_13761() {
        return (sprqgp)this.cfr_renamed_4.cfr_renamed_12398();
    }

    public boolean cfr_renamed_13093() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_15030(sprson arg0) {
        sprwdo sprwdo2 = this;
        sprsuja[] sprsujaArray = sprwdo2.cfr_renamed_13761().cfr_renamed_14235(arg0.cfr_renamed_8505());
        sprxln sprxln2 = sprxln.cfr_renamed_13644(sprsujaArray, false, true);
        sprwdo2.cfr_renamed_15029(arg0, sprzlp.cfr_renamed_14736(sprsujaArray), sprxln2, true);
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        sprxln sprxln2;
        if (this.cfr_renamed_13093()) {
            if (arg0.cfr_renamed_13094() == null) {
                arg0.cfr_renamed_12511(new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
            }
            arg0.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_1), 1);
        }
        sprxln sprxln3 = arg0;
        this.cfr_renamed_13763(sprxln3.cfr_renamed_13094());
        sprxln sprxln4 = sprxln2 = sprxln3.cfr_renamed_13655(true);
        sprxln sprxln5 = sprxln2;
        sprwdo sprwdo2 = this;
        sprxln sprxln6 = sprxln2;
        sprxln6.cfr_renamed_12511(null);
        sprxln5.cfr_renamed_12545(sprwdo2.cfr_renamed_13760(sprxln6.cfr_renamed_12590()));
        sprxln4.cfr_renamed_12505(sprwdo2.cfr_renamed_15031(sprxln5.cfr_renamed_12571()));
        sprxln4.cfr_renamed_12624(this.cfr_renamed_13761());
        if (this.cfr_renamed_15032(sprxln4)) {
            return;
        }
        this.cfr_renamed_13668().cfr_renamed_12507(sprxln2);
    }

    private /* synthetic */ sprtbp cfr_renamed_15031(sprtbp arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        sprtbp sprtbp2 = arg0.cfr_renamed_12099();
        int n2 = n = 0;
        while (n2 < sprtbp2.cfr_renamed_13157().length) {
            int n3 = n++;
            sprtbp2.cfr_renamed_13157()[n3] = Math.abs(this.cfr_renamed_13761().cfr_renamed_12595() * sprtbp2.cfr_renamed_13157()[n3] * arg0.cfr_renamed_1942());
            n2 = n;
        }
        sprwdo sprwdo2 = this;
        sprtbp sprtbp3 = sprtbp2;
        sprtbp3.cfr_renamed_12583(Math.abs(sprwdo2.cfr_renamed_13761().cfr_renamed_12595() * sprtbp3.cfr_renamed_13154() * arg0.cfr_renamed_1942()));
        sprtbp sprtbp4 = sprtbp2;
        sprtbp4.cfr_renamed_12572(Math.abs(sprwdo2.cfr_renamed_13761().cfr_renamed_12598() * sprtbp4.cfr_renamed_1942()));
        return sprtbp2;
    }

    private /* synthetic */ sprkmn cfr_renamed_13668() {
        return (sprkmn)this.cfr_renamed_91.cfr_renamed_12398();
    }

    private /* synthetic */ void cfr_renamed_13674() {
        this.cfr_renamed_91.cfr_renamed_12514();
        this.cfr_renamed_4.cfr_renamed_12514();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_13762(sprmrn sprmrn2) {
        void arg0;
        this.cfr_renamed_13763(sprmrn2.cfr_renamed_13094());
        sprmrn sprmrn3 = new sprmrn();
        sprwdo sprwdo2 = this;
        sprmrn3.cfr_renamed_12545(sprwdo2.cfr_renamed_13760(arg0.cfr_renamed_12590()));
        sprwdo2.cfr_renamed_13668().cfr_renamed_12507(sprmrn3);
        this.cfr_renamed_91.cfr_renamed_12516(sprmrn3);
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        boolean bl;
        sprwdo sprwdo2 = this;
        if (arg0.cfr_renamed_13123(sprwdo2, sprwdo2.cfr_renamed_2) == null) {
            return;
        }
        boolean bl2 = bl = spryxp.cfr_renamed_13464(this.cfr_renamed_13761().cfr_renamed_12596()) && spryxp.cfr_renamed_13464(this.cfr_renamed_13761().cfr_renamed_12597()) && spryxp.cfr_renamed_15033(this.cfr_renamed_13761().cfr_renamed_12595()) && spryxp.cfr_renamed_15033(this.cfr_renamed_13761().cfr_renamed_12598());
        if (bl || !this.cfr_renamed_3.cfr_renamed_15034()) {
            if (!bl) {
                this.cfr_renamed_15028();
            }
            this.cfr_renamed_15027(arg0, bl);
            return;
        }
        this.cfr_renamed_15030(arg0);
    }

    @sprtea
    public static sprvjn cfr_renamed_15009(sprvjn arg0, spruvn arg1, boolean arg2) {
        sprwdo sprwdo2;
        sprwdo sprwdo3 = sprwdo2 = new sprwdo(arg1);
        sprwdo3.cfr_renamed_13125(arg2);
        arg0.cfr_renamed_13121(sprwdo3);
        return sprwdo3.cfr_renamed_13668();
    }

    private /* synthetic */ sprwdo(spruvn arg0) {
        sprwdo sprwdo2 = this;
        sprwdo2.cfr_renamed_91 = new sprjeka();
        this.cfr_renamed_4 = new sprjeka();
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4.cfr_renamed_12516(new sprqgp(this.cfr_renamed_3.cfr_renamed_15012(), 0.0f, 0.0f, this.cfr_renamed_3.cfr_renamed_15012(), 0.0f, 0.0f));
        this.cfr_renamed_91.cfr_renamed_12516(new sprmrn());
        this.cfr_renamed_2 = new sprkkn(this.cfr_renamed_3.cfr_renamed_13104());
    }

    private /* synthetic */ boolean cfr_renamed_15032(sprxln arg0) {
        sprajn sprajn2 = spresca.cfr_renamed_11777(arg0.cfr_renamed_12551(), sprajn.class);
        if (sprajn2 == null || sprajn2.cfr_renamed_12672() == null || sprajn2.cfr_renamed_12672().cfr_renamed_13656()) {
            return false;
        }
        if (this.cfr_renamed_3.cfr_renamed_15034()) {
            if (this.cfr_renamed_13093()) {
                if (sprajn2.cfr_renamed_12672() == null) {
                    sprajn2.cfr_renamed_12643(new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
                }
                sprajn2.cfr_renamed_12672().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_1), 1);
            }
            sprajn2.cfr_renamed_12672().cfr_renamed_12634(new sprqgp(this.cfr_renamed_3.cfr_renamed_15012(), 0.0f, 0.0f, this.cfr_renamed_3.cfr_renamed_15012(), 0.0f, 0.0f), 1);
            sprepn sprepn2 = new sprepn();
            sprxln sprxln2 = arg0;
            this.cfr_renamed_15029(sprxln2, sprepn2.cfr_renamed_13544(arg0), sprxln2.cfr_renamed_13532(), false);
            return true;
        }
        this.cfr_renamed_15028();
        return false;
    }

    private /* synthetic */ void cfr_renamed_13765() {
        this.cfr_renamed_4.cfr_renamed_12514();
    }

    public void cfr_renamed_13125(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        this.cfr_renamed_13674();
    }

    @Override
    public void cfr_renamed_13112(sprsqn arg0) {
        sprwdo sprwdo2 = this;
        sprwdo2.cfr_renamed_1 = arg0.cfr_renamed_1452();
        sprsqn sprsqn2 = new sprsqn(arg0.cfr_renamed_2773(), arg0.cfr_renamed_13660(), arg0.cfr_renamed_13659());
        sprwdo2.cfr_renamed_91.cfr_renamed_722();
        sprwdo2.cfr_renamed_91.cfr_renamed_12516(sprsqn2);
    }

    @Override
    public void cfr_renamed_13108(sprthn arg0) {
        if (this.cfr_renamed_13093()) {
            if (arg0.cfr_renamed_13094() == null) {
                arg0.cfr_renamed_12511(new sprqgp(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
            }
            sprthn sprthn2 = arg0;
            sprthn2.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f), 0);
            sprthn2.cfr_renamed_13094().cfr_renamed_12634(new sprqgp(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, this.cfr_renamed_1), 1);
        }
        this.cfr_renamed_13763(arg0.cfr_renamed_13094());
        sprthn sprthn3 = (sprthn)arg0.cfr_renamed_13616();
        sprwdo sprwdo2 = this;
        sprthn3.cfr_renamed_12511(sprwdo2.cfr_renamed_13761().cfr_renamed_12099());
        sprwdo2.cfr_renamed_13668().cfr_renamed_12507(sprthn3);
        this.cfr_renamed_13765();
    }
}

