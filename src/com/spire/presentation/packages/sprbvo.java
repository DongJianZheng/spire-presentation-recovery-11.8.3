/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlhk;
import com.spire.presentation.packages.sprpap;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprsuo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxro;
import com.spire.presentation.packages.sprypo;
import com.spire.presentation.packages.sprzgia;

@sprtea
public class sprbvo {
    private static final byte cfr_renamed_152 = -1;
    private sprsuo cfr_renamed_112;
    private static final byte cfr_renamed_119 = 3;
    private static final int cfr_renamed_91 = 16;
    private static final byte cfr_renamed_0 = 31;
    private static final byte cfr_renamed_1 = 15;
    private byte[] cfr_renamed_2;
    private static final byte cfr_renamed_3 = 1;
    private sprpap cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ byte[] cfr_renamed_17630() {
        sprpeja sprpeja2 = new sprpeja(0, 0, (int)this.cfr_renamed_112.cfr_renamed_8505().cfr_renamed_1942(), (int)this.cfr_renamed_112.cfr_renamed_8505().cfr_renamed_1452());
        sprvyo sprvyo2 = new sprvyo(sprpeja2.cfr_renamed_1942(), sprpeja2.cfr_renamed_1452());
        try {
            byte[] byArray;
            block10: {
                int n;
                sprxro sprxro2 = sprvyo2.cfr_renamed_17631();
                int n2 = 0;
                int n3 = n = 0;
                while (n3 < sprvyo2.cfr_renamed_1452()) {
                    int n4;
                    int n5 = n4 = 0;
                    while (n5 < sprvyo2.cfr_renamed_1942()) {
                        sprbvo sprbvo2 = this;
                        int n6 = sprtzja.cfr_renamed_12169(sprbvo2.cfr_renamed_2, n2) & 0xFFFF;
                        int n7 = sprbvo2.cfr_renamed_17632(n6 & 0x1F) & 0xFF;
                        int n8 = sprbvo2.cfr_renamed_17632(n6 >> 5 & 0x1F) & 0xFF;
                        int n9 = sprbvo2.cfr_renamed_17632(n6 >> 10 & 0x1F) & 0xFF;
                        n2 += 2;
                        sprxro2.cfr_renamed_17633(n * sprvyo2.cfr_renamed_1942() + n4, 255, n7, n8, n9);
                        n5 = ++n4;
                    }
                    n3 = ++n;
                }
                sprxro2.cfr_renamed_17634();
                sprpdja sprpdja2 = new sprpdja();
                try {
                    sprvyo2.cfr_renamed_12641(sprpdja2, 6);
                    byArray = sprpdja2.cfr_renamed_4529();
                    if (sprpdja2 == null) break block10;
                }
                catch (Throwable throwable) {
                    if (sprpdja2 != null) {
                        sprpdja2.cfr_renamed_2637();
                    }
                    throw throwable;
                }
                sprpdja2.cfr_renamed_2637();
            }
            return byArray;
        }
        finally {
            if (sprvyo2 != null) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprbvo(sprsuo sprsuo2, sprpap sprpap2) {
        void arg0;
        sprbvo sprbvo2 = this;
        sprbvo2.cfr_renamed_112 = arg0;
        sprbvo2.cfr_renamed_4 = sprpap2;
    }

    private /* synthetic */ byte cfr_renamed_17632(int arg0) {
        return (byte)(sprrgga.cfr_renamed_17635((double)arg0 / 31.0) * 255.0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ byte[] cfr_renamed_17636() {
        sprpeja sprpeja2 = new sprpeja(0, 0, (int)this.cfr_renamed_112.cfr_renamed_8505().cfr_renamed_1942(), (int)this.cfr_renamed_112.cfr_renamed_8505().cfr_renamed_1452());
        sprvyo sprvyo2 = new sprvyo(sprpeja2.cfr_renamed_1942(), sprpeja2.cfr_renamed_1452());
        try {
            byte[] byArray;
            block11: {
                int n;
                sprxro sprxro2 = sprvyo2.cfr_renamed_17631();
                int n2 = 0;
                int n3 = n = 0;
                while (n3 < sprvyo2.cfr_renamed_1452()) {
                    int n4;
                    int n5 = n4 = 0;
                    while (n5 < sprvyo2.cfr_renamed_1942()) {
                        sprwbp sprwbp2;
                        sprbvo sprbvo2 = this;
                        int n6 = sprbvo2.cfr_renamed_17637(n2);
                        sprwbp sprwbp3 = sprwbp2 = sprbvo2.cfr_renamed_4.cfr_renamed_17036(n6);
                        int n7 = sprwbp3.cfr_renamed_1997();
                        int n8 = sprwbp3.cfr_renamed_1145();
                        int n9 = sprwbp3.cfr_renamed_3353();
                        int n10 = sprwbp3.cfr_renamed_1778();
                        ++n2;
                        sprxro2.cfr_renamed_17633(n * sprvyo2.cfr_renamed_1942() + n4, n10, n9, n8, n7);
                        n5 = ++n4;
                    }
                    if (n2 % 2 > 0) {
                        ++n2;
                    }
                    n3 = ++n;
                }
                sprxro2.cfr_renamed_17634();
                sprpdja sprpdja2 = new sprpdja();
                try {
                    sprvyo2.cfr_renamed_12641(sprpdja2, 6);
                    byArray = sprpdja2.cfr_renamed_4529();
                    if (sprpdja2 == null) break block11;
                }
                catch (Throwable throwable) {
                    if (sprpdja2 != null) {
                        sprpdja2.cfr_renamed_2637();
                    }
                    throw throwable;
                }
                sprpdja2.cfr_renamed_2637();
            }
            return byArray;
        }
        finally {
            if (sprvyo2 != null) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    @sprtea
    public byte[] cfr_renamed_17541(sprypo arg0) {
        if (this.cfr_renamed_2 == null) {
            return sprsto.cfr_renamed_13709();
        }
        if (this.cfr_renamed_112.cfr_renamed_17624() == 16) {
            return this.cfr_renamed_17638(arg0);
        }
        return this.cfr_renamed_17636();
    }

    private /* synthetic */ int cfr_renamed_17637(int arg0) {
        int n = arg0 * this.cfr_renamed_112.cfr_renamed_17629() / 8;
        int n2 = 8 - (arg0 * this.cfr_renamed_112.cfr_renamed_17629() % 8 + this.cfr_renamed_112.cfr_renamed_17629());
        sprbvo sprbvo2 = this;
        byte by = sprbvo2.cfr_renamed_17639(sprbvo2.cfr_renamed_112.cfr_renamed_17629());
        return (sprbvo2.cfr_renamed_2[n] & 0xFF & (by & 0xFF) << n2) >> n2;
    }

    @sprtea
    public byte[] cfr_renamed_2609() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ byte[] cfr_renamed_17640() {
        sprpeja sprpeja2 = new sprpeja(0, 0, (int)this.cfr_renamed_112.cfr_renamed_8505().cfr_renamed_1942(), (int)this.cfr_renamed_112.cfr_renamed_8505().cfr_renamed_1452());
        sprvyo sprvyo2 = new sprvyo(sprpeja2.cfr_renamed_1942(), sprpeja2.cfr_renamed_1452());
        try {
            byte[] byArray;
            block11: {
                int n;
                sprxro sprxro2 = sprvyo2.cfr_renamed_17631();
                int n2 = 255;
                int n3 = n = 0;
                while (n3 < sprvyo2.cfr_renamed_1452()) {
                    int n4;
                    int n5 = 0;
                    int n6 = n4 = 0;
                    while (n6 < sprvyo2.cfr_renamed_1942()) {
                        int n7 = n * sprvyo2.cfr_renamed_1942() * this.cfr_renamed_112.cfr_renamed_17600() + n5;
                        int n8 = n * sprvyo2.cfr_renamed_1942() * this.cfr_renamed_112.cfr_renamed_17600() + n5 + sprvyo2.cfr_renamed_1942();
                        int n9 = n * sprvyo2.cfr_renamed_1942() * this.cfr_renamed_112.cfr_renamed_17600() + n5 + sprvyo2.cfr_renamed_1942() * 2;
                        if (this.cfr_renamed_112.cfr_renamed_17600() == 4) {
                            int n10 = n * sprvyo2.cfr_renamed_1942() * this.cfr_renamed_112.cfr_renamed_17600() + n5;
                            n2 = this.cfr_renamed_2[n10] & 0xFF;
                            n7 += sprvyo2.cfr_renamed_1942();
                            n8 += sprvyo2.cfr_renamed_1942();
                            n9 += sprvyo2.cfr_renamed_1942();
                        }
                        sprbvo sprbvo2 = this;
                        int n11 = sprbvo2.cfr_renamed_2[n9] & 0xFF;
                        int n12 = sprbvo2.cfr_renamed_2[n8] & 0xFF;
                        int n13 = sprbvo2.cfr_renamed_2[n7] & 0xFF;
                        ++n5;
                        sprxro2.cfr_renamed_17633(n * sprvyo2.cfr_renamed_1942() + n4, n2, n13, n12, n11);
                        n6 = ++n4;
                    }
                    n3 = ++n;
                }
                sprxro2.cfr_renamed_17634();
                sprpdja sprpdja2 = new sprpdja();
                try {
                    sprvyo2.cfr_renamed_12641(sprpdja2, 6);
                    byArray = sprpdja2.cfr_renamed_4529();
                    if (sprpdja2 == null) break block11;
                }
                catch (Throwable throwable) {
                    if (sprpdja2 != null) {
                        sprpdja2.cfr_renamed_2637();
                    }
                    throw throwable;
                }
                sprpdja2.cfr_renamed_2637();
            }
            return byArray;
        }
        finally {
            if (sprvyo2 != null) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ byte cfr_renamed_17639(int arg0) {
        switch (arg0) {
            case 1: {
                return 1;
            }
            case 2: {
                return 3;
            }
            case 4: {
                return 15;
            }
            case 8: {
                return -1;
            }
        }
        throw new IllegalArgumentException(sprzgia.cfr_renamed_9("\u001aN*X?E,T*DoC M?O!E!ToS&Z*\u000eos&Z*\u0000\"U<ToB*\u0000~\fo\u0012c\u0000{\u0000 Ro\u0018a"));
    }

    @sprtea
    public void cfr_renamed_15456(byte[] arg0) {
        this.cfr_renamed_2 = arg0;
    }

    private /* synthetic */ byte[] cfr_renamed_17638(sprypo arg0) {
        if (this.cfr_renamed_112.cfr_renamed_17629() == 5) {
            return this.cfr_renamed_17630();
        }
        if (this.cfr_renamed_112.cfr_renamed_17629() == 8) {
            return this.cfr_renamed_17640();
        }
        arg0.cfr_renamed_13269(0, sprlhk.cfr_renamed_9("ucEuPhCyEi\u0000nO`PbNhNy\u0000~IwE!\u0000dMlGh\u0000zIaL-NbT-Bh\u0000\u007fEcDhRhD#"));
        return sprsto.cfr_renamed_13709();
    }
}

