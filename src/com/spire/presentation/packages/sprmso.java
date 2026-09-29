/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprero;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprgmja;
import com.spire.presentation.packages.sprjtja;
import com.spire.presentation.packages.sprmmia;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprqso;
import com.spire.presentation.packages.sprrgja;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvco;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprznja;

@sprtea
public class sprmso
extends sprqso {
    private spreen cfr_renamed_3;
    private static boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmso(String string, sprpeja sprpeja2) {
        void arg1;
        this.cfr_renamed_3 = null;
        this.cfr_renamed_17672(sprmso.cfr_renamed_17673(string, (sprpeja)arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprmso(spreen spreen2, sprpeja sprpeja2) {
        void arg1;
        this.cfr_renamed_3 = null;
        this.cfr_renamed_17672(sprmso.cfr_renamed_17674(spreen2, (sprpeja)arg1));
    }

    public sprmso() {
        this.cfr_renamed_3 = null;
        throw new sprmmia(sprvco.cfr_renamed_9("\u0000\n<&5\u001f1\r9\u00075K9\u0018p\np)%\r6\u000e\"\u000e4\"=\n7\u000ep\u0004>K\u001a\n&\n~K\u0003\u0004p\u001e#\u000ep;1\u0007\u001d\u000e$\n6\u0002<\u000e~\b$\u0004\"C'\u00024\u001f8Gp\u00035\u00027\u0003$Bp\u0002>\u0018$\u000e1\u000f~"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvyo cfr_renamed_17675() {
        sprznja sprznja2;
        if (this.cfr_renamed_3 != null && this.cfr_renamed_3.cfr_renamed_806() > 0L) {
            sprpdja sprpdja2 = new sprpdja();
            try {
                sprmso sprmso2 = this;
                sprmso2.cfr_renamed_3.cfr_renamed_11548(0L);
                sprmvo.cfr_renamed_12186(sprmso2.cfr_renamed_3, sprpdja2);
                byte[] byArray = sprero.cfr_renamed_16233(sprpdja2, new sprphja((float)this.cfr_renamed_4.cfr_renamed_14217(), (float)this.cfr_renamed_4.cfr_renamed_14218()), true);
                sprvyo sprvyo2 = new sprvyo(byArray);
                return sprvyo2;
            }
            finally {
                if (sprpdja2 != null) {
                    sprpdja2.cfr_renamed_2637();
                }
            }
        }
        if (this.cfr_renamed_1 == null) return null;
        if (!(this.cfr_renamed_1 instanceof sprznja)) return null;
        sprznja sprznja3 = sprznja2 = spresca.cfr_renamed_11777(this.cfr_renamed_1, sprznja.class);
        byte[] byArray = sprero.cfr_renamed_17676(sprznja3, new sprphja(sprznja3.cfr_renamed_14217(), sprznja2.cfr_renamed_14218()), true);
        return new sprvyo(byArray);
    }

    public static sprznja cfr_renamed_17674(spreen arg0, sprpeja arg1) {
        return null;
    }

    public static boolean cfr_renamed_17677() {
        return cfr_renamed_4;
    }

    public static sprznja cfr_renamed_17673(String arg0, sprpeja arg1) {
        return null;
    }

    public sprmso(int arg0, int arg1) {
        this();
    }

    @Override
    public void cfr_renamed_12641(spreen arg0, int arg1) {
        boolean bl = sprsto.cfr_renamed_14748(arg1);
        if (bl && this.cfr_renamed_3 != null && this.cfr_renamed_3.cfr_renamed_806() > 0L) {
            sprmso sprmso2 = this;
            sprmso2.cfr_renamed_3.cfr_renamed_11548(0L);
            sprmvo.cfr_renamed_12186(sprmso2.cfr_renamed_3, arg0);
            return;
        }
        if (bl && this.cfr_renamed_1 != null && this.cfr_renamed_1 instanceof sprznja) {
            byte[] byArray = sprero.cfr_renamed_17678(spresca.cfr_renamed_11777(this.cfr_renamed_1, sprznja.class));
            sprmvo.cfr_renamed_12186(new sprpdja(byArray), arg0);
            return;
        }
        sprvyo sprvyo2 = this.cfr_renamed_17675();
        if (sprvyo2 != null) {
            sprvyo2.cfr_renamed_12641(arg0, arg1);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_17679(String arg0, int arg1) {
        block3: {
            sprgfja sprgfja2 = sprbhja.cfr_renamed_14624(arg0);
            try {
                this.cfr_renamed_12641(sprgfja2, arg1);
                if (sprgfja2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprgfja2 != null) {
                    sprgfja2.cfr_renamed_2637();
                }
                throw throwable;
            }
            sprgfja2.cfr_renamed_2637();
            return;
        }
    }

    public sprmso(spreen arg0, int arg1, boolean arg2) {
        sprgmja sprgmja2;
        sprmso sprmso2 = this;
        this.cfr_renamed_3 = null;
        sprmso2.cfr_renamed_3 = arg0;
        sprdfo sprdfo2 = new sprdfo(arg0);
        this.cfr_renamed_3.cfr_renamed_11548(0L);
        sprgmja sprgmja3 = sprgmja2 = sprgmja.cfr_renamed_4930(sprmso2.cfr_renamed_3);
        sprczo sprczo2 = sprczo.cfr_renamed_14228(sprgmja2.cfr_renamed_1942(), sprgmja3.cfr_renamed_1452(), sprdfo2.cfr_renamed_14217(), sprdfo2.cfr_renamed_14218());
        sprmso2.cfr_renamed_17680(sprgmja3, arg1, sprczo2);
        sprmso2.cfr_renamed_17681(sprczo2, arg1);
    }

    public sprmso(spreen spreen2, sprrgja sprrgja2, int n) {
        this.cfr_renamed_3 = null;
    }

    public static void cfr_renamed_17682(boolean arg0) {
        cfr_renamed_4 = arg0;
    }

    @sprtea
    public sprjtja cfr_renamed_17683() {
        return spresca.cfr_renamed_11777(this.cfr_renamed_17684(), sprznja.class).cfr_renamed_17683();
    }
}

