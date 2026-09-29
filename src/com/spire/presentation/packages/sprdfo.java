/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasp;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprdno;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprepo;
import com.spire.presentation.packages.sprflo;
import com.spire.presentation.packages.sprgjo;
import com.spire.presentation.packages.sprgvja;
import com.spire.presentation.packages.sprkno;
import com.spire.presentation.packages.sprlfja;
import com.spire.presentation.packages.sprllo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprneo;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprxlo;

@sprtea
public class sprdfo {
    public static final float cfr_renamed_86 = 96.0f;
    private spreen cfr_renamed_152;
    private sprkno cfr_renamed_112;
    private sprxlo cfr_renamed_119;
    private sprlfja cfr_renamed_91;
    private sprpeja cfr_renamed_0;
    private int cfr_renamed_1;
    public static sprlfja cfr_renamed_2 = new sprlfja(1280, 1024);
    private int cfr_renamed_3;
    private sprneo cfr_renamed_4;

    public sprlfja cfr_renamed_16701() {
        return this.cfr_renamed_16236().cfr_renamed_2773();
    }

    public sprphja cfr_renamed_13265() {
        return new sprphja((float)sprnmp.cfr_renamed_16525(this.cfr_renamed_16701().cfr_renamed_1942(), this.cfr_renamed_14217()), (float)sprnmp.cfr_renamed_16525(this.cfr_renamed_16701().cfr_renamed_1452(), this.cfr_renamed_14218()));
    }

    public sprdfo(spreen arg0) {
        this(arg0, cfr_renamed_2);
    }

    public sprpeja cfr_renamed_16236() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public float cfr_renamed_16364() {
        return this.cfr_renamed_14218() / 96.0f;
    }

    public byte[] cfr_renamed_16793() {
        if (this.cfr_renamed_16794()) {
            return null;
        }
        return new sprllo(this).cfr_renamed_16795();
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public sprgjo cfr_renamed_16375() {
        switch (this.cfr_renamed_3) {
            case 3: 
            case 4: 
            case 5: {
                return this.cfr_renamed_119.cfr_renamed_16796();
            }
            case 2: {
                return new sprepo(sprlfja.cfr_renamed_15060(this.cfr_renamed_91), sprgvja.cfr_renamed_16797(this.cfr_renamed_16236().cfr_renamed_9494()), sprlfja.cfr_renamed_15060(this.cfr_renamed_16701()), this.cfr_renamed_16363(), this.cfr_renamed_16364());
            }
            case 1: {
                return new sprepo(sprlfja.cfr_renamed_15060(this.cfr_renamed_91), sprsuja.cfr_renamed_13377(), sprlfja.cfr_renamed_15060(this.cfr_renamed_16701()), 1.0f, 1.0f);
            }
        }
        throw new IllegalStateException(sprdgb.cfr_renamed_9("ibWbS{R,QiHmZePi\u001cxE|Y\""));
    }

    @sprtea
    public int cfr_renamed_16450() {
        if (this.cfr_renamed_16794()) {
            return 0;
        }
        return this.cfr_renamed_4.cfr_renamed_16450();
    }

    @sprtea
    public boolean cfr_renamed_16798() {
        return this.cfr_renamed_3 == 3;
    }

    @sprtea
    public boolean cfr_renamed_16799() {
        return this.cfr_renamed_16800() || this.cfr_renamed_16801();
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public float cfr_renamed_14217() {
        switch (this.cfr_renamed_3) {
            case 1: 
            case 2: {
                return this.cfr_renamed_16802();
            }
            case 3: 
            case 4: 
            case 5: {
                return this.cfr_renamed_119.cfr_renamed_14217();
            }
        }
        throw new IllegalStateException(sprasp.cfr_renamed_9(" \u0007\u001e\u0007\u001a\u001e\u001bI\u0018\f\u0001\b\u0013\u0000\u0019\fU\u001d\f\u0019\u0010G"));
    }

    @sprtea
    public boolean cfr_renamed_16800() {
        return this.cfr_renamed_3 == 5;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprpeja cfr_renamed_16803() {
        sprpeja sprpeja2;
        sprpeja sprpeja3;
        block6: {
            sprpeja3 = new sprpeja();
            switch (this.cfr_renamed_3) {
                case 1: {
                    sprpeja3 = this.cfr_renamed_16804();
                    if (!sprpeja3.cfr_renamed_29()) break;
                    sprpeja2 = sprpeja3 = new sprpeja(sprgvja.cfr_renamed_3, this.cfr_renamed_91);
                    break block6;
                }
                case 2: {
                    sprpeja2 = sprpeja3 = this.cfr_renamed_112.cfr_renamed_16805() ? this.cfr_renamed_112.cfr_renamed_8505() : new sprpeja(sprgvja.cfr_renamed_3, this.cfr_renamed_91);
                    break block6;
                }
                case 3: 
                case 4: 
                case 5: {
                    sprpeja2 = sprpeja3 = this.cfr_renamed_119.cfr_renamed_16806();
                    break block6;
                }
                case 0: {
                    throw new IllegalStateException(sprdgb.cfr_renamed_9("ibWbS{R,QiHmZePi\u001cxE|Y\""));
                }
            }
            sprpeja2 = sprpeja3;
        }
        if (!sprpeja2.cfr_renamed_29()) return sprpeja3;
        return new sprpeja(sprpeja3.cfr_renamed_1980(), sprpeja3.spr\u3181(), 1, 1);
    }

    @sprtea
    public int cfr_renamed_16191() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public boolean cfr_renamed_16801() {
        return this.cfr_renamed_3 == 4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public float cfr_renamed_14218() {
        switch (this.cfr_renamed_3) {
            case 1: 
            case 2: {
                return this.cfr_renamed_16802();
            }
            case 3: 
            case 4: 
            case 5: {
                return this.cfr_renamed_119.cfr_renamed_14218();
            }
        }
        throw new IllegalStateException(sprasp.cfr_renamed_9(" \u0007\u001e\u0007\u001a\u001e\u001bI\u0018\f\u0001\b\u0013\u0000\u0019\fU\u001d\f\u0019\u0010G"));
    }

    /*
     * WARNING - void declaration
     */
    public sprdfo(byte[] byArray) {
        this(new sprpdja((byte[])arg0));
        void arg0;
    }

    @sprtea
    public boolean cfr_renamed_13695() {
        return this.cfr_renamed_3 == 2;
    }

    @sprtea
    public boolean cfr_renamed_16794() {
        return this.cfr_renamed_16798() || this.cfr_renamed_16799();
    }

    @sprtea
    public float cfr_renamed_16363() {
        return this.cfr_renamed_14217() / 96.0f;
    }

    private /* synthetic */ void cfr_renamed_16807() {
        sprdfo sprdfo2;
        this.cfr_renamed_152.cfr_renamed_11548(0L);
        sprdfo sprdfo3 = this;
        sprujo sprujo2 = new sprujo(sprdfo3.cfr_renamed_152);
        if (sprdfo3.cfr_renamed_16794()) {
            sprdfo2 = this;
            this.cfr_renamed_119 = new sprxlo();
            this.cfr_renamed_119.cfr_renamed_16808(sprujo2);
        } else {
            if (this.cfr_renamed_13695()) {
                this.cfr_renamed_112 = new sprkno();
                this.cfr_renamed_112.cfr_renamed_16808(sprujo2);
            }
            sprdfo sprdfo4 = this;
            sprdfo2 = sprdfo4;
            sprdfo4.cfr_renamed_4 = new sprneo();
            sprdfo4.cfr_renamed_4.cfr_renamed_16808(sprujo2);
        }
        sprdfo2.cfr_renamed_1 = (int)this.cfr_renamed_152.cfr_renamed_3274();
    }

    @sprtea
    public boolean cfr_renamed_13696() {
        return this.cfr_renamed_3 == 1;
    }

    @sprtea
    public int cfr_renamed_13698() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ sprpeja cfr_renamed_16804() {
        sprdfo sprdfo2 = this;
        sprdfo2.cfr_renamed_0 = new sprpeja(sprgvja.cfr_renamed_3, this.cfr_renamed_91);
        return sprpeja.cfr_renamed_16809(new sprflo(this, new sprlmo(sprdno.cfr_renamed_13694())).cfr_renamed_16201());
    }

    private /* synthetic */ float cfr_renamed_16802() {
        if (this.cfr_renamed_13695()) {
            return this.cfr_renamed_112.cfr_renamed_16810();
        }
        return 96.0f;
    }

    @sprtea
    public spreen cfr_renamed_13232() {
        return this.cfr_renamed_152;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprdfo(spreen spreen2, sprlfja sprlfja2) {
        void arg1;
        void arg0;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_91 = arg1;
        this.cfr_renamed_3 = sprsto.cfr_renamed_16054(spreen2);
        if (this.cfr_renamed_3 == 0) {
            throw new IllegalStateException(sprdgb.cfr_renamed_9("ibWbS{R,QiHmZePi\u001cxE|Y\""));
        }
        sprdfo sprdfo2 = this;
        sprdfo2.cfr_renamed_16807();
        sprdfo2.cfr_renamed_0 = sprdfo2.cfr_renamed_16803();
    }
}

