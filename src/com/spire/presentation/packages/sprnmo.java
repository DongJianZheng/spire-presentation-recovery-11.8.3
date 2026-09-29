/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprhlp;
import com.spire.presentation.packages.sprkko;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprqqo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrt;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprnmo
implements sprrt {
    private int[] cfr_renamed_112;
    private int cfr_renamed_119;
    private float cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private sprwbp cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_16245(sprtbp arg0, int arg1, int[] arg2) {
        switch (arg1) {
            case 0: {
                arg0.cfr_renamed_16246(0);
                return;
            }
            case 1: {
                arg0.cfr_renamed_16246(1);
                return;
            }
            case 2: {
                arg0.cfr_renamed_16246(2);
                return;
            }
            case 3: {
                arg0.cfr_renamed_16246(3);
                return;
            }
            case 4: {
                arg0.cfr_renamed_16246(4);
                return;
            }
            case 7: {
                sprtbp sprtbp2 = arg0;
                sprtbp2.cfr_renamed_16246(5);
                arg0.cfr_renamed_12584(sprnmo.cfr_renamed_16247(arg2, sprtbp2.cfr_renamed_1942()));
                return;
            }
        }
    }

    @Override
    public int cfr_renamed_12977() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public void cfr_renamed_12554(sprwbp arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public sprnmo() {
        sprnmo sprnmo2 = this;
        sprnmo sprnmo3 = this;
        sprnmo3.cfr_renamed_4 = 0;
        sprnmo3.cfr_renamed_91 = 1.0f;
        sprnmo3.cfr_renamed_2 = sprwbp.cfr_renamed_1513;
        sprnmo2.cfr_renamed_119 = 0;
        sprnmo2.cfr_renamed_1 = 1;
    }

    private static /* synthetic */ float[] cfr_renamed_16247(int[] arg0, float arg1) {
        int n;
        if (arg0 == null || arg0.length == 0) {
            return new float[0];
        }
        float[] fArray = new float[arg0.length];
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n++;
            fArray[n3] = (float)arg0[n3] / arg1;
            n2 = n;
        }
        return fArray;
    }

    @Override
    public int cfr_renamed_324() {
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public sprtbp cfr_renamed_16248(sprwbp arg0) {
        sprtbp sprtbp2;
        sprtbp sprtbp3;
        switch (this.cfr_renamed_1) {
            case 0: {
                return null;
            }
            case 2: {
                sprnmo sprnmo2 = this;
                sprhlp sprhlp2 = new sprhlp(sprnmo2.cfr_renamed_119, sprnmo2.cfr_renamed_2, arg0);
                sprtbp2 = sprtbp3 = new sprtbp(sprhlp2, this.cfr_renamed_91);
                break;
            }
            case 3: {
                sprpip sprpip2 = new sprpip(this.cfr_renamed_3, 0);
                sprtbp2 = sprtbp3 = new sprtbp(sprpip2, this.cfr_renamed_91);
                break;
            }
            default: {
                sprnmo sprnmo3 = this;
                sprtbp2 = sprtbp3 = new sprtbp(sprnmo3.cfr_renamed_2, sprnmo3.cfr_renamed_91);
            }
        }
        sprnmo.cfr_renamed_16245(sprtbp2, this.cfr_renamed_4 & 0xF, this.cfr_renamed_112);
        sprtbp sprtbp4 = sprtbp3;
        sprnmo.cfr_renamed_16249(sprtbp4, this.cfr_renamed_4 & 0xF00);
        sprnmo.cfr_renamed_16250(sprtbp4, this.cfr_renamed_4 & 0xF000);
        return sprtbp4;
    }

    @Override
    public void cfr_renamed_16244(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    private /* synthetic */ void cfr_renamed_16251() {
        if ((this.cfr_renamed_4 & 0xF) == 5) {
            this.cfr_renamed_1 = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_16250(sprtbp arg0, int arg1) {
        switch (arg1) {
            case 0: {
                arg0.cfr_renamed_12575(2);
                return;
            }
            case 4096: {
                arg0.cfr_renamed_12575(1);
                return;
            }
            case 8192: {
                arg0.cfr_renamed_12575(0);
                return;
            }
        }
        throw new IllegalStateException(spruuc.cfr_renamed_9("<\u001f\u0002\u001f\u0006\u0006\u0007Q\u0019\u0014\u0007Q\u0003\u001e\u0000\u001fI\u0002\u001d\b\u0005\u0014G"));
    }

    @sprtea
    public void cfr_renamed_16252(sprhio arg0) {
        sprnmo sprnmo2;
        sprhio sprhio2 = arg0;
        this.cfr_renamed_0 = sprhio2.cfr_renamed_12261();
        sprhio2.cfr_renamed_12261();
        sprhio sprhio3 = arg0;
        int n = sprhio3.cfr_renamed_12261();
        sprhio3.cfr_renamed_12261();
        int n2 = arg0.cfr_renamed_12261();
        sprhio sprhio4 = arg0;
        this.cfr_renamed_4 = (int)(arg0.cfr_renamed_13220() & 0xFFFFFFFFL);
        this.cfr_renamed_91 = sprrgga.cfr_renamed_2548(sprhio4.cfr_renamed_12261(), 1);
        int n3 = (int)(sprhio4.cfr_renamed_13220() & 0xFFFFFFFFL);
        if (n3 == 0 || n3 == 2) {
            sprnmo2 = this;
            this.cfr_renamed_2 = arg0.cfr_renamed_16078();
        } else {
            arg0.cfr_renamed_12261();
            sprnmo2 = this;
        }
        sprnmo2.cfr_renamed_119 = arg0.cfr_renamed_12261();
        if ((n3 & 2) == 2) {
            this.cfr_renamed_1 = 2;
        }
        this.cfr_renamed_112 = arg0.cfr_renamed_16084();
        if (n3 == 6) {
            this.cfr_renamed_1 = 3;
            arg0.cfr_renamed_12261();
            this.cfr_renamed_3 = sprsto.cfr_renamed_16253(arg0, n, n2);
        }
        this.cfr_renamed_16251();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_16249(sprtbp arg0, int arg1) {
        sprtbp sprtbp2;
        int n;
        switch (arg1) {
            case 0: {
                n = 2;
                sprtbp2 = arg0;
                break;
            }
            case 256: {
                n = 1;
                sprtbp2 = arg0;
                break;
            }
            case 512: {
                n = 0;
                sprtbp2 = arg0;
                break;
            }
            default: {
                throw new IllegalStateException(sprqqo.cfr_renamed_9("\u0013_-_)F(\u00116T(\u0011#_\"\u0011%P6\u00115E?]#\u001f"));
            }
        }
        sprtbp2.cfr_renamed_12581(n);
        arg0.cfr_renamed_12579(n);
    }

    @sprtea
    public void cfr_renamed_16242(sprhio arg0) {
        sprhio sprhio2 = arg0;
        sprnmo sprnmo2 = this;
        sprnmo2.cfr_renamed_0 = arg0.cfr_renamed_12261();
        sprnmo2.cfr_renamed_4 = arg0.cfr_renamed_12261();
        this.cfr_renamed_91 = sprrgga.cfr_renamed_2548(sprhio2.cfr_renamed_12261(), 1);
        sprhio2.cfr_renamed_12261();
        this.cfr_renamed_2 = arg0.cfr_renamed_16078();
        this.cfr_renamed_16251();
    }

    @sprtea
    public void cfr_renamed_16200(sprkko arg0) {
        sprkko sprkko2 = arg0;
        this.cfr_renamed_4 = arg0.cfr_renamed_12254();
        this.cfr_renamed_91 = sprrgga.cfr_renamed_13324(sprkko2.cfr_renamed_12254(), (short)1);
        sprkko2.cfr_renamed_12254();
        this.cfr_renamed_2 = arg0.cfr_renamed_16078();
        this.cfr_renamed_16251();
    }

    @sprtea
    public void cfr_renamed_16254(int arg0) {
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_16251();
    }
}

