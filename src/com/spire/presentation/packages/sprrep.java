/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdkp;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryqo;
import com.spire.presentation.packages.spryyo;
import com.spire.presentation.packages.sprzto;

@sprtea
public class sprrep {
    private sprzto cfr_renamed_0;
    private static final int cfr_renamed_1 = 65536;
    private sprdkp cfr_renamed_2;
    private sprrpp cfr_renamed_3;
    private sprdkp[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_19152(int arg0) {
        Object object;
        sprdkp sprdkp2 = (sprdkp)this.cfr_renamed_3.cfr_renamed_576(arg0);
        int n = 0;
        int n2 = 1;
        int n3 = 0;
        Object object2 = sprdkp2;
        while (object2 != this.cfr_renamed_2) {
            object = sprdkp2.cfr_renamed_91;
            boolean bl = ((sprdkp)object).cfr_renamed_1 == sprdkp2;
            n = sproup.cfr_renamed_17438(n, n2, bl);
            ++n3;
            n2 <<= 1;
            object2 = object;
        }
        object = (spryqo)this.cfr_renamed_0;
        ((spryqo)object).cfr_renamed_17435(n, n3);
    }

    private /* synthetic */ void cfr_renamed_19153(int arg0, int arg1) {
        sprdkp sprdkp2;
        sprrep sprrep2 = this;
        sprdkp sprdkp3 = sprrep2.cfr_renamed_4[arg0];
        sprrep2.cfr_renamed_4[arg0] = sprdkp2 = sprrep2.cfr_renamed_4[arg1];
        sprrep2.cfr_renamed_4[arg1] = sprdkp3;
        sprrep2.cfr_renamed_4[arg0].cfr_renamed_4 = arg0;
        sprrep2.cfr_renamed_4[arg1].cfr_renamed_4 = arg1;
        sprrep.cfr_renamed_19154(sprdkp3, sprdkp2);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprrep(int n, sprzto sprzto2) {
        sprdkp sprdkp2;
        int n2;
        void arg0;
        void arg1;
        sprrep sprrep2 = this;
        sprrep sprrep3 = this;
        sprrep3.cfr_renamed_3 = new sprrpp();
        sprrep2.cfr_renamed_0 = arg1;
        int n3 = 2 * arg0;
        sprrep2.cfr_renamed_4 = new sprdkp[n3];
        int n4 = n2 = 1;
        while (n4 < n3) {
            sprdkp2 = new sprdkp();
            sprdkp2.cfr_renamed_4 = n2;
            this.cfr_renamed_4[n2++] = sprdkp2;
            n4 = n2;
        }
        int n5 = n2 = 1;
        while (n5 < n3) {
            sprdkp2 = this.cfr_renamed_4[n2];
            if (n2 > 1) {
                sprdkp2.cfr_renamed_91 = this.cfr_renamed_4[n2 / 2];
            }
            if (n2 < arg0) {
                sprdkp sprdkp3 = sprdkp2;
                sprdkp3.cfr_renamed_0 = this.cfr_renamed_4[2 * n2];
                sprdkp3.cfr_renamed_1 = this.cfr_renamed_4[2 * n2 + 1];
            }
            if (n2 >= arg0) {
                sprdkp sprdkp4 = sprdkp2;
                sprdkp4.cfr_renamed_2 = n2 - arg0;
                sprdkp4.cfr_renamed_3 = 1L;
                this.cfr_renamed_3.cfr_renamed_13414(sprdkp2.cfr_renamed_2, sprdkp2);
            }
            n5 = ++n2;
        }
        sprrep sprrep4 = this;
        sprrep4.cfr_renamed_2 = sprrep4.cfr_renamed_4[1];
        sprrep4.cfr_renamed_2.cfr_renamed_19149();
    }

    private /* synthetic */ int cfr_renamed_13371() {
        sprrep sprrep2 = this;
        sprdkp sprdkp2 = sprrep2.cfr_renamed_2;
        spryyo spryyo2 = (spryyo)sprrep2.cfr_renamed_0;
        sprdkp sprdkp3 = sprdkp2;
        while (!sprdkp3.cfr_renamed_19148()) {
            sprdkp3 = sprdkp2 = spryyo2.cfr_renamed_17445() ? sprdkp2.cfr_renamed_1 : sprdkp2.cfr_renamed_0;
        }
        return sprdkp2.cfr_renamed_2;
    }

    private static /* synthetic */ void cfr_renamed_19154(sprdkp arg0, sprdkp arg1) {
        sprdkp sprdkp2;
        sprdkp sprdkp3 = arg0.cfr_renamed_91;
        sprdkp sprdkp4 = arg1.cfr_renamed_91;
        if (sprdkp3.cfr_renamed_0 == arg0) {
            sprdkp2 = sprdkp4;
            sprdkp3.cfr_renamed_19150(arg1);
        } else {
            sprdkp3.cfr_renamed_19151(arg1);
            sprdkp2 = sprdkp4;
        }
        if (sprdkp2.cfr_renamed_0 == arg1) {
            sprdkp4.cfr_renamed_19150(arg0);
            return;
        }
        sprdkp4.cfr_renamed_19151(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_19124(int n) {
        void arg0;
        sprrep sprrep2 = this;
        sprrep2.cfr_renamed_19152((int)arg0);
        sprrep2.cfr_renamed_19134(n);
    }

    @sprtea
    public int cfr_renamed_19142() {
        sprrep sprrep2 = this;
        int n = sprrep2.cfr_renamed_13371();
        sprrep2.cfr_renamed_19134(n);
        return n;
    }

    @sprtea
    public int cfr_renamed_19113(int arg0) {
        sprdkp sprdkp2 = (sprdkp)this.cfr_renamed_3.cfr_renamed_576(arg0);
        int n = 0;
        sprdkp sprdkp3 = sprdkp2;
        while (sprdkp3 != this.cfr_renamed_2) {
            sprdkp3 = sprdkp2.cfr_renamed_91;
            ++n;
        }
        return n * 65536;
    }

    @sprtea
    public void cfr_renamed_19134(int arg0) {
        sprdkp sprdkp2;
        sprdkp sprdkp3 = sprdkp2 = (sprdkp)this.cfr_renamed_3.cfr_renamed_576(arg0);
        while (true) {
            sprdkp sprdkp4;
            block5: {
                ++sprdkp3.cfr_renamed_3;
                if (sprdkp2 == this.cfr_renamed_2) {
                    return;
                }
                if (this.cfr_renamed_4[sprdkp2.cfr_renamed_4 - 1].cfr_renamed_3 == sprdkp2.cfr_renamed_3 - 1L) {
                    sprrep sprrep2 = this;
                    int n = sprdkp2.cfr_renamed_4 - 1;
                    while (true) {
                        if (sprrep2.cfr_renamed_4[n - 1].cfr_renamed_3 >= sprdkp2.cfr_renamed_3) {
                            sprdkp sprdkp5 = sprdkp2;
                            sprdkp4 = sprdkp5;
                            this.cfr_renamed_19153(sprdkp5.cfr_renamed_4, n);
                            break block5;
                        }
                        --n;
                        sprrep2 = this;
                    }
                }
                sprdkp4 = sprdkp2;
            }
            sprdkp3 = sprdkp4.cfr_renamed_91;
        }
    }
}

