/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.sprotn;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzyn;

@sprtea
public class sprnwn {
    private sprzyn cfr_renamed_91;
    private byte cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private sprphja cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void cfr_renamed_15046(byte[] arg0, sprtqo arg1) {
        block10: {
            sprnwn sprnwn2;
            block8: {
                sprczo sprczo2 = sprsto.cfr_renamed_13321(arg0);
                boolean bl = sprsto.cfr_renamed_13225(arg0) == 5;
                this.cfr_renamed_1 = (byte[])(bl ? arg0 : null);
                boolean bl2 = arg1 != null && arg1.cfr_renamed_14231();
                sprnwn sprnwn3 = this;
                sprnwn3.cfr_renamed_4 = sprczo2.cfr_renamed_1942();
                sprnwn3.cfr_renamed_3 = sprczo2.cfr_renamed_1452();
                if (bl && !bl2) break block8;
                sprvyo sprvyo2 = bl2 ? arg1.cfr_renamed_15047(arg0) : new sprvyo(arg0);
                try {
                    block9: {
                        sprnwn sprnwn4;
                        block7: {
                            sprpdja sprpdja2 = new sprpdja();
                            try {
                                if (sprvyo2.cfr_renamed_14213()) {
                                    sprvyo2.cfr_renamed_15023(sprwbp.cfr_renamed_955);
                                }
                                sprvyo2.cfr_renamed_14200(sprpdja2, 100);
                                this.cfr_renamed_1 = sprpdja2.cfr_renamed_4529();
                                if (sprpdja2 == null) break block7;
                                sprnwn4 = this;
                            }
                            catch (Throwable throwable) {
                                if (sprpdja2 != null) {
                                    sprpdja2.cfr_renamed_2637();
                                }
                                throw throwable;
                            }
                            sprpdja2.cfr_renamed_2637();
                            break block9;
                        }
                        sprnwn4 = this;
                    }
                    sprnwn4.cfr_renamed_4 = sprvyo2.cfr_renamed_1942();
                    this.cfr_renamed_3 = sprvyo2.cfr_renamed_1452();
                    if (sprvyo2 == null) break block8;
                    sprnwn2 = this;
                }
                catch (Throwable throwable) {
                    if (sprvyo2 != null) {
                        sprvyo2.cfr_renamed_11665();
                    }
                    throw throwable;
                }
                sprvyo2.cfr_renamed_11665();
                break block10;
            }
            sprnwn2 = this;
        }
        sprnwn2.cfr_renamed_0 = (byte)2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_15036(byte[] byArray, sprtqo sprtqo2, sprphja sprphja2) {
        void arg1;
        void arg2;
        this.cfr_renamed_2 = arg2;
        this.cfr_renamed_15046(byArray, (sprtqo)arg1);
    }

    @sprtea
    public void cfr_renamed_15040() {
        this.cfr_renamed_13380().cfr_renamed_15048(this.cfr_renamed_1);
    }

    public boolean cfr_renamed_5902() {
        return (this.cfr_renamed_15049() & 0xFFFF) != 0 && (this.cfr_renamed_15050() & 0xFFFF) != 0 && (this.cfr_renamed_15051() & 0xFFFF) != 0 && (this.cfr_renamed_15052() & 0xFFFF) != 0;
    }

    private /* synthetic */ int cfr_renamed_15052() {
        return sprotn.cfr_renamed_14957(this.cfr_renamed_2.cfr_renamed_1452());
    }

    @sprtea
    public void cfr_renamed_15038() {
        sprnwn sprnwn2 = this;
        sprnwn2.cfr_renamed_13380().cfr_renamed_15016((byte)0);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)100);
        sprnwn2.cfr_renamed_13380().cfr_renamed_15016((byte)2);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)98);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14971(this.cfr_renamed_15049());
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)108);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14971(this.cfr_renamed_15050());
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)107);
        sprnwn2.cfr_renamed_13380().cfr_renamed_15017(this.cfr_renamed_15051(), this.cfr_renamed_15052());
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)103);
    }

    private /* synthetic */ int cfr_renamed_15050() {
        return sprotn.cfr_renamed_14957(this.cfr_renamed_3);
    }

    private /* synthetic */ int cfr_renamed_15049() {
        return sprotn.cfr_renamed_14957(this.cfr_renamed_4);
    }

    @sprtea
    public void cfr_renamed_15039() {
        sprnwn sprnwn2 = this;
        sprnwn sprnwn3 = this;
        sprnwn2.cfr_renamed_13380().cfr_renamed_15016(sprnwn3.cfr_renamed_0);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)101);
        sprnwn3.cfr_renamed_13380().cfr_renamed_14971(0);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)109);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14971(this.cfr_renamed_3);
        sprnwn2.cfr_renamed_13380().cfr_renamed_14970((byte)99);
    }

    public sprzyn cfr_renamed_13380() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public sprnwn(sprzyn sprzyn2) {
        this.cfr_renamed_91 = sprzyn2;
    }

    private /* synthetic */ int cfr_renamed_15051() {
        return sprotn.cfr_renamed_14957(this.cfr_renamed_2.cfr_renamed_1942());
    }
}

