/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprazia;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprjin;
import com.spire.presentation.packages.sprkln;
import com.spire.presentation.packages.sprnzm;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprron;
import com.spire.presentation.packages.sprrup;
import com.spire.presentation.packages.sprsyia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.spruo;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprwin;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprznp;
import com.spire.presentation.packages.sprzvm;
import java.util.ArrayList;
import java.util.Iterator;

@sprtea
public abstract class sprcjn {
    private spruo cfr_renamed_152;
    public sprqt cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private sprron cfr_renamed_0;
    private sprjin cfr_renamed_1;
    private spravp cfr_renamed_2;
    private sprcjn cfr_renamed_3;
    private sprwin cfr_renamed_4;

    public abstract sprjin cfr_renamed_13433();

    @sprtea
    public abstract void cfr_renamed_13434();

    @sprtea
    public void cfr_renamed_13269(int arg0, String arg1) {
        this.cfr_renamed_112.cfr_renamed_12477(arg0, this.cfr_renamed_91, arg1);
    }

    @sprtea
    public spruo cfr_renamed_12480() {
        return this.cfr_renamed_152;
    }

    public sprvqo[] cfr_renamed_13280() {
        Iterator iterator;
        sprwvn sprwvn2 = new sprwvn(this.cfr_renamed_2.size());
        Iterator iterator2 = iterator = this.cfr_renamed_2.cfr_renamed_13435().iterator();
        while (iterator2.hasNext()) {
            sprkln sprkln2 = (sprkln)iterator.next();
            iterator2 = iterator;
            sprovja.cfr_renamed_11658(sprwvn2, sprkln2.cfr_renamed_13411());
        }
        return (sprvqo[])sprovja.cfr_renamed_13436((ArrayList)sprwvn.cfr_renamed_13437(sprwvn2), sprvqo.class);
    }

    @sprtea
    public void cfr_renamed_13438(sprcjn arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public int cfr_renamed_13439() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ void cfr_renamed_13440() {
        String string = sprzvm.cfr_renamed_9("rfSlUqCf\u0000eIoE+S*\u0000`AmNlT#Bf\u0000tRjTwEm\u0000wO#DjSh\u000e#wkEm\u0000pAuImG#TkE#DlCvMfNw\u0000wO#A#SwRfAn\u0000fIwHfR#rfSlUqCfflLgEq\u0000pHlUoD#Bf\u0000pPfCjFjEg\u0000lR#e{PlRwenBfDgEginAdEp\f#e{PlRwenBfDgEgflNwS/\u0000FXsOqTFMaEgDfD@Sp\f#AmD#e{PlRwenBfDgEgsuG#SkOvLg\u0000aE#SfT#Oq\u0000`UpTlM#SwRfAnS#SkOvLg\u0000aE#PqOuIgEg\u0000uIb\u0000QEpOvR`EPAuImG@AoLaA`K-");
        if (!sprznp.cfr_renamed_12328(this.cfr_renamed_13097().cfr_renamed_13406())) {
            throw new IllegalStateException(string);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprcjn(sprwin sprwin2, sprron sprron2, int n) {
        void arg2;
        void arg1;
        void arg0;
        sprcjn sprcjn2 = this;
        sprcjn sprcjn3 = this;
        sprcjn sprcjn4 = this;
        this.cfr_renamed_2 = new spravp();
        this.cfr_renamed_4 = arg0;
        sprcjn3.cfr_renamed_0 = arg1;
        sprcjn3.cfr_renamed_91 = arg2;
        sprcjn2.cfr_renamed_112 = arg1.cfr_renamed_12479();
        sprcjn2.cfr_renamed_152 = sprron2.cfr_renamed_12480();
    }

    @sprtea
    public void cfr_renamed_13441(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public sprron cfr_renamed_13097() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public sprqt cfr_renamed_12479() {
        return this.cfr_renamed_112;
    }

    @sprtea
    public sprwin cfr_renamed_13380() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ String cfr_renamed_13442(String arg0, boolean arg1) {
        if (sprrup.cfr_renamed_13443(arg0)) {
            String string = arg0;
            return string;
        }
        String string = arg1 ? sprazia.cfr_renamed_11887(arg0) : sprrup.cfr_renamed_13327(this.cfr_renamed_13097().cfr_renamed_13397(), arg0);
        return string;
    }

    @sprtea
    public sprkln cfr_renamed_13389(sprfzo arg0) {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_13389(arg0);
        }
        sprcjn sprcjn2 = this;
        String string = sprcjn2.cfr_renamed_13444(arg0);
        sprkln sprkln2 = (sprkln)sprcjn2.cfr_renamed_2.cfr_renamed_12347(string);
        if (sprkln2 == null) {
            sprkln2 = new sprkln(arg0);
            this.cfr_renamed_2.cfr_renamed_13301(string, sprkln2);
        }
        return sprkln2;
    }

    public abstract String cfr_renamed_13445(byte[] var1, sprtqo var2);

    @sprtea
    public String cfr_renamed_13446(byte[] arg0, sprtqo arg1) {
        sprcjn sprcjn2 = this;
        arg0 = sprcjn2.cfr_renamed_13314().cfr_renamed_13297(arg0);
        return sprcjn2.cfr_renamed_13445(arg0, arg1);
    }

    @sprtea
    public sprjin cfr_renamed_13314() {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_13433();
        }
        return this.cfr_renamed_1;
    }

    @sprtea
    public abstract String cfr_renamed_13444(sprfzo var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @sprtea
    public String cfr_renamed_13447(String arg0, byte[] arg1, boolean arg2) {
        sprnzm sprnzm2;
        sprnzm sprnzm3;
        block10: {
            spreen spreen2;
            sprnzm sprnzm4;
            sprcjn sprcjn2 = this;
            String string = sprcjn2.cfr_renamed_13442(arg0, arg2);
            sprnzm3 = new sprnzm(arg0, string);
            sprcjn2.cfr_renamed_12480().cfr_renamed_12478(sprnzm3);
            if (sprnzm3.cfr_renamed_12467()) {
                sprnzm sprnzm5 = sprnzm3;
                sprnzm4 = sprnzm5;
                spreen2 = sprnzm5.cfr_renamed_12470();
            } else {
                sprcjn sprcjn3 = this;
                sprcjn3.cfr_renamed_13440();
                if (!sprsyia.cfr_renamed_11642(sprcjn3.cfr_renamed_13097().cfr_renamed_13406())) {
                    sprsyia.cfr_renamed_11888(this.cfr_renamed_13097().cfr_renamed_13406());
                }
                String string2 = sprazia.cfr_renamed_11679(this.cfr_renamed_13097().cfr_renamed_13406(), sprnzm3.cfr_renamed_12471());
                spreen2 = new sprgfja(string2, 2);
                sprnzm4 = sprnzm3;
            }
            if (sprnzm4.cfr_renamed_12473()) {
                spreen2.cfr_renamed_4924(arg1, 0, arg1.length);
                sprnzm2 = sprnzm3;
            } else {
                block9: {
                    try {
                        spreen2.cfr_renamed_4924(arg1, 0, arg1.length);
                        if (spreen2 == null) break block9;
                        sprnzm2 = sprnzm3;
                        spreen2.cfr_renamed_2637();
                        break block10;
                    }
                    catch (Throwable throwable) {
                        if (spreen2 != null) {
                            spreen2.cfr_renamed_2637();
                        }
                        throw throwable;
                    }
                }
                sprnzm2 = sprnzm3;
            }
        }
        if (sprnzm2.cfr_renamed_12464()) {
            return sprnzm3.cfr_renamed_12465();
        }
        return this.cfr_renamed_13442(sprnzm3.cfr_renamed_12471(), arg2);
    }

    @sprtea
    public int cfr_renamed_13448() {
        return ++this.cfr_renamed_119;
    }
}

