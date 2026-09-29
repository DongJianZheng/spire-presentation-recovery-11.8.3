/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclja;
import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprdcz;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.spremy;
import com.spire.presentation.packages.sprfrja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgfja;
import com.spire.presentation.packages.sprgmja;
import com.spire.presentation.packages.sprkq;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprmso;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtnca;
import com.spire.presentation.packages.sprvkja;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprqso
implements sprkq,
Cloneable {
    private int cfr_renamed_0;
    public sprgmja cfr_renamed_1;
    private boolean cfr_renamed_2;
    private static final int cfr_renamed_3 = 8207;
    public sprczo cfr_renamed_4;

    public void cfr_renamed_2637() {
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_1.dispose();
            this.cfr_renamed_1 = null;
        }
    }

    public sprqso() {
    }

    public void cfr_renamed_17672(sprgmja arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_2637();
    }

    public void cfr_renamed_17691() {
        if (this.cfr_renamed_2) {
            sprvkja sprvkja2 = new sprvkja(this.cfr_renamed_1);
            sprvkja2.cfr_renamed_17665(96.0f, 96.0f);
            this.cfr_renamed_1.dispose();
            this.cfr_renamed_1 = sprvkja2;
            this.cfr_renamed_2 = false;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_17692(sprgmja sprgmja2, int n, sprczo sprczo2) {
        void arg1;
        void arg0;
        sprqso sprqso2 = this;
        this.cfr_renamed_1 = arg0;
        sprqso2.cfr_renamed_0 = arg1;
        sprqso2.cfr_renamed_4 = sprczo2;
    }

    public boolean cfr_renamed_14226() {
        int n = this.cfr_renamed_17684().cfr_renamed_4690();
        if ((n & 0x20) == 32 || (n & 0x100) == 256) {
            return true;
        }
        return this.cfr_renamed_17684().cfr_renamed_17654() == 8207;
    }

    @sprtea
    public sprgmja cfr_renamed_17684() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_17693(sprgmja arg0) {
        sprqso sprqso2 = this;
        sprqso2.cfr_renamed_17672(arg0);
        if (sprqso2.cfr_renamed_14226()) {
            this.cfr_renamed_17694();
        }
        sprqso sprqso3 = this;
        sprqso3.cfr_renamed_17695(sprqso.cfr_renamed_17696(sprqso3.cfr_renamed_17684().cfr_renamed_17697()));
    }

    public static sprqso cfr_renamed_4930(spreen arg0) {
        int n = sprsto.cfr_renamed_17698(arg0);
        if (sprsto.cfr_renamed_14748(n)) {
            return new sprmso(arg0, n, true);
        }
        sprgmja sprgmja2 = sprgmja.cfr_renamed_4930(arg0);
        return new sprvyo(sprgmja2);
    }

    public void cfr_renamed_17680(sprgmja arg0, int arg1, sprczo arg2) {
        this.cfr_renamed_17692(arg0, arg1, arg2);
    }

    public int cfr_renamed_17654() {
        return this.cfr_renamed_17684().cfr_renamed_17654();
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_1.cfr_renamed_1452();
    }

    public float cfr_renamed_14218() {
        if (this.cfr_renamed_2) {
            return 96.0f;
        }
        if (this.cfr_renamed_4 != null) {
            return (float)this.cfr_renamed_4.cfr_renamed_14218();
        }
        return this.cfr_renamed_1.cfr_renamed_14218();
    }

    public float cfr_renamed_14217() {
        if (this.cfr_renamed_2) {
            return 96.0f;
        }
        if (this.cfr_renamed_4 != null) {
            return (float)this.cfr_renamed_4.cfr_renamed_14217();
        }
        return this.cfr_renamed_1.cfr_renamed_14217();
    }

    public void cfr_renamed_12641(spreen arg0, int arg1) {
        throw new UnsupportedOperationException(spremy.cfr_renamed_9("\"d'`"));
    }

    public void cfr_renamed_17694() {
    }

    public sprlfja cfr_renamed_2773() {
        return new sprlfja(this.cfr_renamed_1942(), this.cfr_renamed_1452());
    }

    public sprgeja cfr_renamed_17699(int arg0) {
        int n = arg0;
        return this.cfr_renamed_1.cfr_renamed_16935(new sprtnca<Integer>(n));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprqso cfr_renamed_13024(String arg0) {
        sprgfja sprgfja2 = new sprgfja(arg0, 3, 1);
        try {
            sprqso sprqso2 = sprqso.cfr_renamed_4930(sprgfja2);
            return sprqso2;
        }
        finally {
            if (sprgfja2 != null) {
                sprgfja2.cfr_renamed_2637();
            }
        }
    }

    @sprtea
    public sprqso(sprgmja sprgmja2) {
        this.cfr_renamed_1 = sprgmja2;
    }

    public void cfr_renamed_17679(String arg0, int arg1) {
        throw new UnsupportedOperationException(sprdcz.cfr_renamed_9("X\u0010]\u0014"));
    }

    public sprclja cfr_renamed_17697() {
        return this.cfr_renamed_17684().cfr_renamed_17697();
    }

    public void cfr_renamed_17700(byte[] arg0) {
        this.cfr_renamed_2 = sprsto.cfr_renamed_13536(arg0) || sprsto.cfr_renamed_13321(arg0).cfr_renamed_17701();
    }

    @sprtea
    public static int cfr_renamed_17696(sprclja arg0) {
        if (arg0.equals(sprclja.cfr_renamed_17702())) {
            return 5;
        }
        if (arg0.equals(sprclja.cfr_renamed_17703())) {
            return 6;
        }
        if (arg0.equals(sprclja.cfr_renamed_17704())) {
            return 2;
        }
        if (arg0.equals(sprclja.cfr_renamed_17705())) {
            return 3;
        }
        if (arg0.equals(sprclja.cfr_renamed_17706())) {
            return 7;
        }
        if (arg0.equals(sprclja.cfr_renamed_17707())) {
            return 9;
        }
        if (arg0.equals(sprclja.cfr_renamed_17663())) {
            return 8;
        }
        return 0;
    }

    public int cfr_renamed_12642() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_17695(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public int cfr_renamed_1942() {
        return this.cfr_renamed_1.cfr_renamed_1942();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_15023(sprwbp arg0) {
        sprqso sprqso2;
        sprvkja sprvkja2;
        block4: {
            block3: {
                sprvkja2 = new sprvkja(this.cfr_renamed_1.cfr_renamed_1942(), this.cfr_renamed_1.cfr_renamed_1452());
                sprvkja2.cfr_renamed_17665(this.cfr_renamed_1.cfr_renamed_14217(), this.cfr_renamed_1.cfr_renamed_14218());
                sprfrja sprfrja2 = sprfrja.cfr_renamed_17708(sprvkja2);
                try {
                    sprfrja2.cfr_renamed_17709(arg0.cfr_renamed_12795());
                    sprfrja2.cfr_renamed_17710(this.cfr_renamed_1, 0, 0);
                    if (sprfrja2 == null) break block3;
                    sprqso2 = this;
                    sprfrja2.dispose();
                    break block4;
                }
                catch (Throwable throwable) {
                    if (sprfrja2 != null) {
                        sprfrja2.dispose();
                    }
                    throw throwable;
                }
            }
            sprqso2 = this;
        }
        sprqso2.cfr_renamed_1.dispose();
        this.cfr_renamed_1 = sprvkja2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_12099() {
        sprqso sprqso2;
        sprqso sprqso3 = null;
        try {
            sprqso2 = sprqso3 = (sprqso)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            sprqso2 = sprqso3;
            cloneNotSupportedException.printStackTrace();
        }
        sprqso2.cfr_renamed_2 = this.cfr_renamed_2;
        sprqso sprqso4 = this;
        sprqso3.cfr_renamed_0 = sprqso4.cfr_renamed_0;
        if (sprqso4.cfr_renamed_4 != null) {
            sprqso3.cfr_renamed_4 = (sprczo)this.cfr_renamed_4.cfr_renamed_12099();
        }
        if (this.cfr_renamed_1 != null) {
            sprqso3.cfr_renamed_1 = (sprgmja)this.cfr_renamed_1.cfr_renamed_12099();
        }
        return sprqso3;
    }

    public void cfr_renamed_17681(sprczo arg0, int arg1) {
        this.cfr_renamed_2 = sprsto.cfr_renamed_14748(arg1) || arg0.cfr_renamed_17701();
    }
}

