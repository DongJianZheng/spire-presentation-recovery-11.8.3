/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprefd;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sproci;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpsn;
import com.spire.presentation.packages.sprpwn;
import com.spire.presentation.packages.sprpzn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrdo;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruao;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.spryun;

@sprtea
public class sprcrn
extends sprbln {
    private sprpdja cfr_renamed_2;
    private sprpwn cfr_renamed_3;
    private spryjn cfr_renamed_4;

    public sprcrn(sprgdo arg0) {
        sprcrn sprcrn2 = this;
        super(arg0);
        sprcrn2.cfr_renamed_10056();
    }

    @sprtea
    public void cfr_renamed_14403(String arg0, String arg1, String arg2) {
        sprcrn sprcrn2 = this;
        sprcrn2.cfr_renamed_4.cfr_renamed_14319(arg0, arg1, arg2);
        sprcrn2.cfr_renamed_4.cfr_renamed_14055();
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        this.cfr_renamed_3.cfr_renamed_14291(arg0);
    }

    @sprtea
    public void cfr_renamed_11594(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_11594(arg0);
    }

    @sprtea
    public void cfr_renamed_9011(int arg0) {
        this.cfr_renamed_4.cfr_renamed_9011(arg0);
    }

    @sprtea
    public void cfr_renamed_14404(spryjn arg0) {
    }

    @sprtea
    public void cfr_renamed_14405(String arg0, String arg1) {
        sprcrn sprcrn2 = this;
        sprcrn2.cfr_renamed_4.cfr_renamed_14305(arg0, arg1);
        sprcrn2.cfr_renamed_4.cfr_renamed_14055();
    }

    @sprtea
    public void cfr_renamed_14093(float[] arg0) {
        this.cfr_renamed_4.cfr_renamed_14093(arg0);
    }

    @sprtea
    public void cfr_renamed_11835(String arg0) {
        this.cfr_renamed_4.cfr_renamed_11835(arg0);
    }

    @sprtea
    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_4924(arg0, arg1, arg2);
    }

    public sprpwn cfr_renamed_14406() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public spryjn cfr_renamed_13380() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_14401(sprqgp arg0, String arg1) {
        sprcrn sprcrn2 = this;
        sprcrn2.cfr_renamed_4.cfr_renamed_14066(arg0);
        sprcrn2.cfr_renamed_4.cfr_renamed_14055();
        sprcrn2.cfr_renamed_4.cfr_renamed_11835(arg1);
        sprcrn2.cfr_renamed_4.cfr_renamed_14055();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_14285(spryjn arg0) {
        try {
            spryjn spryjn2 = arg0;
            this.cfr_renamed_14407();
            arg0.cfr_renamed_14086();
            sprcrn sprcrn2 = this;
            this.cfr_renamed_3 = new sprpwn(this.cfr_renamed_2820());
            this.cfr_renamed_14404(spryjn2);
            spryjn2.cfr_renamed_14057(sproci.cfr_renamed_9("MC\u0007a\u0005{\n"), this.cfr_renamed_3.cfr_renamed_4570());
            spruao spruao2 = this.cfr_renamed_14114();
            if (spruao2 != null) {
                spruao2.cfr_renamed_14404(arg0);
            }
            spryjn spryjn3 = arg0;
            spryjn3.cfr_renamed_14061();
            spryjn3.cfr_renamed_11735("stream");
            spreen spreen2 = arg0.cfr_renamed_14060();
            sprpsn sprpsn2 = this.cfr_renamed_14408();
            if (sprpsn2 != null) {
                spreen2 = sprpsn2.cfr_renamed_14409(spreen2);
            }
            if (spruao2 != null) {
                spreen2 = spruao2.cfr_renamed_14115(spreen2);
            }
            long l = spreen2.cfr_renamed_806();
            spreen2.cfr_renamed_4924(this.cfr_renamed_2.cfr_renamed_3461(), 0, (int)this.cfr_renamed_2.cfr_renamed_806());
            spryjn spryjn4 = arg0;
            this.cfr_renamed_3.cfr_renamed_13011((int)(spreen2.cfr_renamed_806() - l));
            spryjn4.cfr_renamed_14076();
            spryjn4.cfr_renamed_11835(sprefd.cfr_renamed_9("oHnU~ToGg"));
            return;
        }
        finally {
            this.cfr_renamed_10056();
        }
    }

    @sprtea
    public void cfr_renamed_14085(String arg0, String arg1) {
        this.cfr_renamed_4.cfr_renamed_14085(arg0, arg1);
    }

    @sprtea
    public void cfr_renamed_14058(String arg0) {
        this.cfr_renamed_4.cfr_renamed_14058(arg0);
    }

    @sprtea
    public void cfr_renamed_14410(sprsuja arg0) {
        sprcrn sprcrn2 = this;
        sprcrn2.cfr_renamed_4.cfr_renamed_14067(arg0.cfr_renamed_1980());
        sprcrn2.cfr_renamed_4.cfr_renamed_14055();
        sprcrn2.cfr_renamed_4.cfr_renamed_14067(arg0.spr\u3181());
    }

    @sprtea
    public void cfr_renamed_4923(byte[] arg0) {
        this.cfr_renamed_4924(arg0, 0, arg0.length);
    }

    public void cfr_renamed_11735(String arg0) {
        this.cfr_renamed_4.cfr_renamed_11735(arg0);
    }

    public void cfr_renamed_10056() {
        sprcrn sprcrn2 = this;
        sprcrn2.cfr_renamed_2 = new sprpdja();
        sprcrn2.cfr_renamed_4 = new spryjn(this.cfr_renamed_2);
    }

    @sprtea
    public spreen cfr_renamed_14060() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_14070(int arg0) {
        this.cfr_renamed_4.cfr_renamed_14070(arg0);
    }

    @sprtea
    public spruao cfr_renamed_14114() {
        int n = 200;
        if (this.cfr_renamed_2.cfr_renamed_806() < (long)n) {
            return null;
        }
        switch (this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14411()) {
            case 3: {
                return new spryun();
            }
            case 2: {
                return new sprrdo();
            }
            case 0: {
                while (false) {
                }
                return null;
            }
            case 1: {
                return new sprpzn();
            }
        }
        throw new IllegalStateException(sproci.cfr_renamed_9("7a\ta\rx\f/\u0016j\u001a{Bl\rb\u0012}\u0007|\u0011f\raBi\u000bc\u0016j\u0010/\u0016v\u0012jL"));
    }

    public void cfr_renamed_14407() {
    }

    @sprtea
    public void cfr_renamed_14059(String arg0, String arg1, String arg2) {
        this.cfr_renamed_4.cfr_renamed_14059(arg0, arg1, arg2);
    }
}

