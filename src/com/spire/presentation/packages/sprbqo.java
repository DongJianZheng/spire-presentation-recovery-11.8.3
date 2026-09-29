/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprduo;
import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprjeka;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqon;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprbqo
extends sprsmn {
    private sprwvn cfr_renamed_93;
    private sprqgp cfr_renamed_86;
    private sprqgp cfr_renamed_152;
    private sprwvn cfr_renamed_112;
    private sprduo cfr_renamed_119;
    private boolean cfr_renamed_91;
    private sprjeka cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprqgp cfr_renamed_2;
    private sprqgp cfr_renamed_3;
    private sprwvn cfr_renamed_4;

    private /* synthetic */ sprsuja cfr_renamed_17044(sprsuja arg0, int arg1) {
        return new sprsuja(arg0.cfr_renamed_1980() + (float)this.cfr_renamed_119.cfr_renamed_17042(arg1), arg0.spr\u3181() + (float)this.cfr_renamed_119.cfr_renamed_17035(arg1));
    }

    private /* synthetic */ sprqgp cfr_renamed_17045() {
        if (this.cfr_renamed_0.size() == 0) {
            this.cfr_renamed_0.cfr_renamed_12516(new sprqgp());
        }
        return (sprqgp)this.cfr_renamed_0.cfr_renamed_12398();
    }

    public sprbqo(sprduo sprduo2) {
        sprbqo sprbqo2 = this;
        this.cfr_renamed_0 = new sprjeka();
        this.cfr_renamed_119 = sprduo2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13178(sprlsn sprlsn2) {
        sprlsn sprlsn3;
        void arg0;
        this.cfr_renamed_112 = new sprwvn();
        if (!this.cfr_renamed_1 || arg0.cfr_renamed_13174()) {
            sprlsn3 = new sprlsn();
            sprlsn3.cfr_renamed_12625(arg0.cfr_renamed_13174());
            sprovja.cfr_renamed_11658(this.cfr_renamed_112, sprlsn3);
        }
        if (this.cfr_renamed_119.cfr_renamed_17031() == 1 && this.cfr_renamed_112.size() > 0) {
            sprlsn3 = (sprlsn)((sprlsn)this.cfr_renamed_112.get(0)).cfr_renamed_13616();
            sprovja.cfr_renamed_11658(this.cfr_renamed_112, sprlsn3);
        }
        super.cfr_renamed_13178((sprlsn)arg0);
    }

    private /* synthetic */ sprsuja cfr_renamed_13791(sprsuja sprsuja2) {
        sprsuja arg0;
        sprbqo sprbqo2 = this;
        sprsuja2 = sprbqo2.cfr_renamed_17045().cfr_renamed_13791(sprsuja2);
        sprsuja2 = sprbqo2.cfr_renamed_3.cfr_renamed_13791(sprsuja2);
        int n = 10;
        sprbqo sprbqo3 = this;
        float f = (float)((double)((float)10 * sprsuja2.cfr_renamed_1980()) * sprbqo3.cfr_renamed_119.cfr_renamed_17033() + (double)((float)n * arg0.spr\u3181()) * this.cfr_renamed_119.cfr_renamed_17040() + 1.0);
        arg0 = new sprsuja(arg0.cfr_renamed_1980() / f, arg0.spr\u3181() / f);
        arg0 = sprbqo3.cfr_renamed_152.cfr_renamed_13791(arg0);
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13092(sprmrn sprmrn2) {
        void arg0;
        sprbqo sprbqo2 = this;
        void v1 = arg0;
        this.cfr_renamed_13763(v1.cfr_renamed_13094());
        sprbqo2.cfr_renamed_17046((sprmrn)v1);
        super.cfr_renamed_13092(sprmrn2);
    }

    private /* synthetic */ void cfr_renamed_13765() {
        this.cfr_renamed_0.cfr_renamed_12514();
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        int n;
        sprbqo sprbqo2 = this;
        sprbqo2.cfr_renamed_13765();
        if (sprbqo2.cfr_renamed_4.size() == 0) {
            return;
        }
        if (this.cfr_renamed_119.cfr_renamed_17032() && (arg0.cfr_renamed_12551() == null || arg0.cfr_renamed_12551().cfr_renamed_29()) && (arg0.cfr_renamed_12571() == null || arg0.cfr_renamed_12571().cfr_renamed_12551() == null || arg0.cfr_renamed_12571().cfr_renamed_12551().cfr_renamed_29())) {
            return;
        }
        int n2 = n = this.cfr_renamed_4.size() - 1;
        while (n2 >= 0) {
            if (((sprxln)this.cfr_renamed_4.get(n)).cfr_renamed_11861() != 0) {
                sprovja.cfr_renamed_11658(this.cfr_renamed_93, arg0.cfr_renamed_12551() != null && (this.cfr_renamed_91 || !arg0.cfr_renamed_12551().cfr_renamed_29()) ? this.cfr_renamed_17047(n) : this.cfr_renamed_17048(n));
            }
            n2 = --n;
        }
    }

    @Override
    public void cfr_renamed_13101(sprmrn sprmrn2) {
        sprbqo sprbqo2 = this;
        sprbqo2.cfr_renamed_13765();
        super.cfr_renamed_13101(sprmrn2);
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        int n;
        sprbqo sprbqo2 = this;
        sprbqo2.cfr_renamed_17049(null);
        int n2 = sprbqo2.cfr_renamed_119.cfr_renamed_17031() == 1 ? 2 : 1;
        sprson sprson2 = arg0;
        sprgeja sprgeja2 = sprson2.cfr_renamed_8505();
        if (sprson2.cfr_renamed_13240() != null) {
            sprgeja2 = arg0.cfr_renamed_13240().cfr_renamed_13346(sprgeja2);
        }
        sprsuja[] sprsujaArray = new sprsuja[4];
        sprsujaArray[0] = this.cfr_renamed_13791(new sprsuja(sprgeja2.cfr_renamed_13430(), sprgeja2.cfr_renamed_13342()));
        sprsujaArray[1] = this.cfr_renamed_13791(new sprsuja(sprgeja2.cfr_renamed_13341(), sprgeja2.cfr_renamed_13342()));
        sprsujaArray[2] = this.cfr_renamed_13791(new sprsuja(sprgeja2.cfr_renamed_13341(), sprgeja2.cfr_renamed_13429()));
        sprsujaArray[3] = this.cfr_renamed_13791(new sprsuja(sprgeja2.cfr_renamed_13430(), sprgeja2.cfr_renamed_13429()));
        sprsuja[] sprsujaArray2 = sprsujaArray;
        this.cfr_renamed_4 = new sprwvn();
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            sprfqn sprfqn2 = new sprfqn();
            int n5 = n4 = 0;
            while (n5 < sprsujaArray2.length) {
                sprsuja sprsuja2 = sprsujaArray2[n4];
                sprfqn2.cfr_renamed_13187().cfr_renamed_13516(this.cfr_renamed_17044(sprsuja2, n));
                n5 = ++n4;
            }
            sprlsn sprlsn2 = new sprlsn();
            sprlsn2.cfr_renamed_12507(sprfqn2);
            sprlsn2.cfr_renamed_12625(true);
            sprxln sprxln2 = new sprxln();
            sprxln2.cfr_renamed_12507(sprlsn2);
            sprovja.cfr_renamed_11658(this.cfr_renamed_4, sprxln2);
            n3 = ++n;
        }
        int n6 = n = this.cfr_renamed_4.size() - 1;
        while (n6 >= 0) {
            if (((sprxln)this.cfr_renamed_4.get(n)).cfr_renamed_11861() != 0) {
                sprovja.cfr_renamed_11658(this.cfr_renamed_93, this.cfr_renamed_17047(n));
            }
            n6 = --n;
        }
        super.cfr_renamed_13122(arg0);
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        int n;
        if (this.cfr_renamed_112.size() == 0) {
            return;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.size()) {
            ((sprxln)this.cfr_renamed_4.get(n)).cfr_renamed_12507((sprlsn)this.cfr_renamed_112.get(n++));
            n2 = n;
        }
        super.cfr_renamed_13178(arg0);
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        int n;
        if (this.cfr_renamed_112.size() == 0) {
            return;
        }
        sprbqo sprbqo2 = this;
        sprsuja sprsuja2 = sprbqo2.cfr_renamed_13791(arg0.cfr_renamed_13167());
        sprsuja sprsuja3 = sprbqo2.cfr_renamed_13791(arg0.cfr_renamed_13171());
        sprsuja sprsuja4 = sprbqo2.cfr_renamed_13791(arg0.cfr_renamed_13169());
        sprsuja sprsuja5 = sprbqo2.cfr_renamed_13791(arg0.cfr_renamed_13170());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.size()) {
            sprxnn sprxnn2 = new sprxnn(this.cfr_renamed_17044(sprsuja2, n), this.cfr_renamed_17044(sprsuja4, n), this.cfr_renamed_17044(sprsuja5, n), this.cfr_renamed_17044(sprsuja3, n));
            Object object = this.cfr_renamed_112.get(n);
            ((sprlsn)object).cfr_renamed_12507(sprxnn2);
            n2 = ++n;
        }
        super.cfr_renamed_13175(arg0);
    }

    private /* synthetic */ sprxln cfr_renamed_17047(int arg0) {
        sprxln sprxln2 = (sprxln)((sprxln)this.cfr_renamed_4.get(arg0)).cfr_renamed_13616();
        sprxln2.cfr_renamed_12505(null);
        sprxln2.cfr_renamed_12550(new sprghp(this.cfr_renamed_119.cfr_renamed_17036(arg0)));
        return sprxln2;
    }

    private /* synthetic */ sprgeja cfr_renamed_17050(sprxln arg0) {
        sprgeja sprgeja2 = new sprepn().cfr_renamed_13544(arg0);
        return this.cfr_renamed_17045().cfr_renamed_13764(sprgeja2);
    }

    private static /* synthetic */ sprgeja cfr_renamed_17051(sprmrn arg0) {
        sprgeja sprgeja2 = new sprepn().cfr_renamed_13544(arg0);
        sprxln sprxln2 = arg0.cfr_renamed_11861() > 0 ? spresca.cfr_renamed_11777(arg0.cfr_renamed_576(0), sprxln.class) : null;
        float f = sprxln2 == null || sprxln2.cfr_renamed_12571() == null ? 0.0f : sprxln2.cfr_renamed_12571().cfr_renamed_1942();
        return new sprgeja(sprgeja2.cfr_renamed_1980() + f / 2.0f, sprgeja2.spr\u3181() + f / 2.0f, sprgeja2.cfr_renamed_1942() - f, sprgeja2.cfr_renamed_1452() - f);
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        if (this.cfr_renamed_112.size() == 0) {
            return;
        }
        sprfqn[] sprfqnArray = new sprfqn[this.cfr_renamed_112.size()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112.size()) {
            sprfqnArray[n++] = new sprfqn();
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            int n4;
            sprsuja sprsuja2 = this.cfr_renamed_13791(arg0.cfr_renamed_13187().cfr_renamed_576(n));
            int n5 = n4 = 0;
            while (n5 < this.cfr_renamed_112.size()) {
                sprfqnArray[n4].cfr_renamed_13187().cfr_renamed_13516(this.cfr_renamed_17044(sprsuja2, n4++));
                n5 = n4;
            }
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_112.size()) {
            ((sprlsn)this.cfr_renamed_112.get(n)).cfr_renamed_12507(sprfqnArray[n++]);
            n6 = n;
        }
        super.cfr_renamed_13186(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_17046(sprmrn sprmrn2) {
        void arg0;
        int n;
        this.cfr_renamed_1 = false;
        if (sprmrn2.cfr_renamed_11861() <= 1) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprxln sprxln2 = spresca.cfr_renamed_11777(arg0.cfr_renamed_576(n), sprxln.class);
            if (sprxln2 != null && sprxln2.cfr_renamed_12551() != null) {
                this.cfr_renamed_1 = true;
                return;
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_17052(sprmrn arg0) {
        sprgeja sprgeja2 = sprbqo.cfr_renamed_17051(arg0);
        sprbqo sprbqo2 = this;
        sprgeja sprgeja3 = sprgeja2;
        sprbqo sprbqo3 = this;
        sprbqo3.cfr_renamed_3 = new sprqgp();
        float f = sprgeja3.cfr_renamed_1942() * (0.5f + (float)this.cfr_renamed_119.cfr_renamed_17043());
        float f2 = sprgeja3.cfr_renamed_1452() * (0.5f + (float)this.cfr_renamed_119.cfr_renamed_17038());
        sprbqo2.cfr_renamed_3.cfr_renamed_13466(-f - sprgeja2.cfr_renamed_1980(), -f2 - sprgeja2.spr\u3181(), 1);
        this.cfr_renamed_2 = new sprqgp((float)this.cfr_renamed_119.cfr_renamed_17041(), (float)this.cfr_renamed_119.cfr_renamed_17034(), (float)this.cfr_renamed_119.cfr_renamed_17037(), (float)this.cfr_renamed_119.cfr_renamed_17039(), 0.0f, 0.0f);
        sprbqo2.cfr_renamed_2.cfr_renamed_13466(f + sprgeja2.cfr_renamed_1980(), f2 + sprgeja2.spr\u3181(), 1);
    }

    private /* synthetic */ void cfr_renamed_17049(sprxln arg0) {
        float f;
        float f2;
        float f3;
        boolean bl = true;
        if (arg0 == null || arg0.cfr_renamed_12571() == null || arg0.cfr_renamed_12551() == null || arg0.cfr_renamed_12571().cfr_renamed_1942() <= (float)bl) {
            sprbqo sprbqo2 = this;
            sprbqo2.cfr_renamed_152 = sprbqo2.cfr_renamed_2;
            if (sprbqo2.cfr_renamed_86 != null) {
                sprbqo sprbqo3 = this;
                sprbqo3.cfr_renamed_152.cfr_renamed_12634(sprbqo3.cfr_renamed_86, 1);
            }
            return;
        }
        float f4 = arg0.cfr_renamed_12571().cfr_renamed_1942();
        sprgeja sprgeja2 = this.cfr_renamed_17050(arg0);
        sprsuja sprsuja2 = new sprsuja(sprgeja2.cfr_renamed_13430() + sprgeja2.cfr_renamed_1942() / 2.0f, sprgeja2.cfr_renamed_13342() + sprgeja2.cfr_renamed_1452() / 2.0f);
        if (sprgeja2.cfr_renamed_1942() <= f4) {
            f3 = 1.0f;
        } else {
            float f5 = f4;
            f3 = f2 = 1.0f + f5 / (sprgeja2.cfr_renamed_1942() - f5);
        }
        if (sprgeja2.cfr_renamed_1452() <= f4) {
            f = 1.0f;
        } else {
            float f6 = f4;
            f = 1.0f + f6 / (sprgeja2.cfr_renamed_1452() - f6);
        }
        float f7 = f;
        sprbqo sprbqo4 = this;
        sprbqo4.cfr_renamed_152 = new sprqgp();
        this.cfr_renamed_152.cfr_renamed_13466(-sprsuja2.cfr_renamed_1980(), -sprsuja2.spr\u3181(), 1);
        sprbqo4.cfr_renamed_152.cfr_renamed_13255(f2, f7, 1);
        sprbqo4.cfr_renamed_152.cfr_renamed_13466(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181(), 1);
        sprbqo4.cfr_renamed_152.cfr_renamed_12634(this.cfr_renamed_2, 0);
    }

    @Override
    public void cfr_renamed_13098(sprxln arg0) {
        sprbqo sprbqo2 = this;
        sprbqo2.cfr_renamed_13763(arg0.cfr_renamed_13094());
        sprbqo2.cfr_renamed_4 = new sprwvn();
        sprovja.cfr_renamed_11658(this.cfr_renamed_4, new sprxln(arg0.cfr_renamed_12571()));
        if (sprbqo2.cfr_renamed_119.cfr_renamed_17031() == 1) {
            sprovja.cfr_renamed_11658(this.cfr_renamed_4, new sprxln(arg0.cfr_renamed_12571()));
        }
        sprbqo sprbqo3 = this;
        sprxln sprxln2 = arg0;
        sprbqo3.cfr_renamed_17049(sprxln2);
        super.cfr_renamed_13098(sprxln2);
    }

    @Override
    public boolean cfr_renamed_13568(sprqon arg0) {
        if (arg0.cfr_renamed_13214() == 32768) {
            return false;
        }
        return super.cfr_renamed_13568(arg0);
    }

    public sprwvn cfr_renamed_17053(sprmrn arg0, boolean arg1) {
        if (arg0.cfr_renamed_13094() != null) {
            sprbqo sprbqo2 = this;
            sprbqo2.cfr_renamed_86 = new sprqgp(arg0.cfr_renamed_13094().cfr_renamed_12595(), arg0.cfr_renamed_13094().cfr_renamed_12596(), arg0.cfr_renamed_13094().cfr_renamed_12597(), arg0.cfr_renamed_13094().cfr_renamed_12598(), 0.0f, 0.0f);
        }
        sprbqo sprbqo3 = this;
        sprmrn sprmrn2 = arg0;
        sprbqo sprbqo4 = this;
        sprbqo4.cfr_renamed_91 = arg1;
        sprbqo4.cfr_renamed_93 = new sprwvn();
        sprbqo3.cfr_renamed_17052(sprmrn2);
        sprmrn2.cfr_renamed_13121(sprbqo3);
        return sprbqo3.cfr_renamed_93;
    }

    private /* synthetic */ void cfr_renamed_13763(sprqgp arg0) {
        sprqgp sprqgp2 = this.cfr_renamed_17045().cfr_renamed_12099();
        sprqgp2.cfr_renamed_12634(arg0 != null ? arg0 : new sprqgp(), 0);
        this.cfr_renamed_0.cfr_renamed_12516(sprqgp2);
    }

    private /* synthetic */ sprxln cfr_renamed_17048(int arg0) {
        sprxln sprxln2;
        sprxln sprxln3 = (sprxln)this.cfr_renamed_4.get(arg0);
        if (sprxln3.cfr_renamed_12571() == null) {
            return new sprxln();
        }
        sprxln sprxln4 = sprxln2 = (sprxln)sprxln3.cfr_renamed_13616();
        sprxln4.cfr_renamed_12550(null);
        sprxln2.cfr_renamed_12505(sprxln3.cfr_renamed_12571().cfr_renamed_13768());
        sprxln4.cfr_renamed_12571().cfr_renamed_12550(new sprghp(this.cfr_renamed_119.cfr_renamed_17036(arg0)));
        return sprxln2;
    }
}

