/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceo;
import com.spire.presentation.packages.sprdrja;
import com.spire.presentation.packages.spreho;
import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprlho;
import com.spire.presentation.packages.sprlko;
import com.spire.presentation.packages.sprmio;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprrfo;
import com.spire.presentation.packages.sprsro;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;

@sprtea
public class sprkmo {
    private spreho cfr_renamed_0;
    private sprrfo cfr_renamed_1;
    private sprlko cfr_renamed_2;
    private sprmio cfr_renamed_3;
    private sprggo cfr_renamed_4;

    public void cfr_renamed_12527() {
        this.cfr_renamed_1.cfr_renamed_41();
    }

    public void cfr_renamed_16627(int arg0, int arg1) {
        sprhbja sprhbja2 = (sprhbja)this.cfr_renamed_4.cfr_renamed_16558().cfr_renamed_576(arg0);
        if (sprhbja2 == null) {
            return;
        }
        this.cfr_renamed_16360(sprhbja2, arg1);
    }

    public sprmio cfr_renamed_16408() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprlho cfr_renamed_16720(int arg0) {
        return new sprlho(this.cfr_renamed_1.cfr_renamed_16317(), this.cfr_renamed_2.cfr_renamed_16317(), arg0);
    }

    public void cfr_renamed_16634(sprphja arg0) {
        sprkmo sprkmo2 = this;
        sprsuja sprsuja2 = sprkmo2.cfr_renamed_16573().cfr_renamed_16312().cfr_renamed_13791(new sprsuja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452()));
        sprkmo2.cfr_renamed_1.cfr_renamed_16721(new sprphja(sprsuja2.cfr_renamed_1980(), sprsuja2.spr\u3181()));
    }

    public sprkmo(sprggo arg0) {
        sprkmo sprkmo2 = this;
        sprkmo sprkmo3 = this;
        sprkmo sprkmo4 = this;
        sprkmo3.cfr_renamed_0 = new spreho();
        sprkmo2.cfr_renamed_4 = arg0;
        sprkmo3.cfr_renamed_2 = new sprlko(arg0);
        sprkmo2.cfr_renamed_1 = new sprrfo(sprgeja.cfr_renamed_16235(arg0.cfr_renamed_16190().cfr_renamed_16236()));
        sprkmo sprkmo5 = this;
        sprkmo2.cfr_renamed_3 = new sprmio(sprgeja.cfr_renamed_16235(arg0.cfr_renamed_16190().cfr_renamed_16236()), sprkmo5.cfr_renamed_1, sprkmo5.cfr_renamed_2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16626(int arg0) {
        sprlho sprlho2 = this.cfr_renamed_0.cfr_renamed_16275(arg0);
        if (sprlho2 == null) return;
        try {
            this.cfr_renamed_16722(sprlho2);
            if (sprlho2 == null) return;
            sprlho2.cfr_renamed_11665();
            return;
        }
        catch (Throwable throwable) {
            if (sprlho2 == null) throw throwable;
            sprlho2.cfr_renamed_11665();
            throw throwable;
        }
    }

    public void cfr_renamed_16570(int arg0) {
        sprkmo sprkmo2 = this;
        sprlho sprlho2 = sprkmo2.cfr_renamed_16720(arg0);
        sprkmo2.cfr_renamed_0.cfr_renamed_16718(sprlho2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_16360(sprhbja arg0, int arg1) {
        sprkmo sprkmo2;
        block4: {
            block3: {
                sprfqja sprfqja2 = sprsro.cfr_renamed_16358(this.cfr_renamed_16573().cfr_renamed_16312());
                try {
                    arg0.cfr_renamed_16359(sprfqja2);
                    if (sprfqja2 == null) break block3;
                    sprkmo2 = this;
                    sprfqja2.dispose();
                    break block4;
                }
                catch (Throwable throwable) {
                    if (sprfqja2 != null) {
                        sprfqja2.dispose();
                    }
                    throw throwable;
                }
            }
            sprkmo2 = this;
        }
        sprkmo2.cfr_renamed_1.cfr_renamed_16360(arg0, arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16592(sprgeja arg0, int arg1) {
        block3: {
            sprhbja sprhbja2 = new sprhbja(arg0);
            try {
                this.cfr_renamed_16360(sprhbja2, arg1);
                if (sprhbja2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprhbja2 != null) {
                    sprhbja2.dispose();
                }
                throw throwable;
            }
            sprhbja2.dispose();
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_16722(sprlho arg0) {
        sprkmo sprkmo2 = this;
        sprkmo2.cfr_renamed_1.cfr_renamed_16723(arg0.cfr_renamed_16353());
        sprkmo2.cfr_renamed_2.cfr_renamed_16717(arg0.cfr_renamed_16345());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16575(int arg0) {
        sprlho sprlho2 = this.cfr_renamed_0.cfr_renamed_16275(arg0);
        try {
            this.cfr_renamed_16722(sprlho2);
            if (sprlho2 == null) return;
            sprlho2.cfr_renamed_11665();
            return;
        }
        catch (Throwable throwable) {
            if (sprlho2 == null) throw throwable;
            sprlho2.cfr_renamed_11665();
            throw throwable;
        }
    }

    public sprlko cfr_renamed_16573() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16624(int arg0, int arg1) {
        sprdrja sprdrja2;
        sprdrja sprdrja3;
        block9: {
            sprceo sprceo2;
            sprxln sprxln2 = (sprxln)this.cfr_renamed_4.cfr_renamed_16558().cfr_renamed_576(arg0);
            if (sprxln2 == null) {
                return;
            }
            sprceo sprceo3 = sprceo2 = new sprceo();
            sprxln2.cfr_renamed_13121(sprceo3);
            sprdrja3 = sprceo3.cfr_renamed_15204();
            try {
                block8: {
                    sprhbja sprhbja2 = new sprhbja(sprdrja3);
                    try {
                        this.cfr_renamed_16360(sprhbja2, arg1);
                        if (sprhbja2 == null) break block8;
                        sprdrja2 = sprdrja3;
                    }
                    catch (Throwable throwable) {
                        if (sprhbja2 != null) {
                            sprhbja2.dispose();
                        }
                        throw throwable;
                    }
                    sprhbja2.dispose();
                    break block9;
                }
                sprdrja2 = sprdrja3;
            }
            catch (Throwable throwable) {
                if (sprdrja3 != null) {
                    sprdrja3.dispose();
                }
                throw throwable;
            }
        }
        if (sprdrja2 != null) {
            sprdrja3.dispose();
            return;
        }
    }

    public void cfr_renamed_16628(int arg0) {
        sprkmo sprkmo2 = this;
        sprlho sprlho2 = sprkmo2.cfr_renamed_16720(arg0);
        sprkmo2.cfr_renamed_0.cfr_renamed_16718(sprlho2);
    }

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_1.cfr_renamed_11665();
        }
        this.cfr_renamed_1 = null;
    }
}

