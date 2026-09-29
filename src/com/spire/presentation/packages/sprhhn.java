/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraws;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprohn;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwkh;
import com.spire.presentation.packages.sprylp;
import com.spire.presentation.packages.sprzyo;

@sprtea
public class sprhhn {
    private sprylp cfr_renamed_2;
    private sprvyo cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void cfr_renamed_13985(int arg0, int arg1, int arg2) {
        this.cfr_renamed_13981();
        sprpeja sprpeja2 = new sprpeja(0, 0, this.cfr_renamed_3.cfr_renamed_1942(), this.cfr_renamed_3.cfr_renamed_1452());
        sprvyo sprvyo2 = new sprvyo(this.cfr_renamed_3.cfr_renamed_1942(), this.cfr_renamed_3.cfr_renamed_1452());
        int n = arg2 == 1 ? this.cfr_renamed_3.cfr_renamed_1452() : this.cfr_renamed_3.cfr_renamed_1942();
        int n2 = arg0 - arg1;
        int n3 = sprrgga.cfr_renamed_12461(sprrgga.cfr_renamed_6433(n2), n);
        float f = (float)n2 / (float)n3;
        int n4 = (int)sprrgga.cfr_renamed_12793((double)n / (double)n3);
        try {
            int n5;
            int n6 = 0;
            int n7 = n5 = 0;
            while (n7 < n3) {
                sprpeja sprpeja3 = arg2 == 1 ? new sprpeja(0, n6, this.cfr_renamed_3.cfr_renamed_1942(), n4) : new sprpeja(n6, 0, n4, this.cfr_renamed_3.cfr_renamed_1452());
                n6 += n4;
                int n8 = (int)(f * (float)n5);
                this.cfr_renamed_13986(sprpeja3, sprpeja2, arg1 + n8, sprvyo2);
                n7 = ++n5;
            }
            if (arg2 == 1 && n6 < this.cfr_renamed_3.cfr_renamed_1452() || arg2 == 0 && n6 < this.cfr_renamed_3.cfr_renamed_1942()) {
                sprpeja sprpeja4;
                if (arg2 == 1) {
                    int n9 = n6;
                    sprpeja4 = new sprpeja(0, n9, this.cfr_renamed_3.cfr_renamed_1942(), this.cfr_renamed_3.cfr_renamed_1452() - n9);
                } else {
                    int n10 = n6;
                    sprpeja4 = new sprpeja(n10, 0, this.cfr_renamed_3.cfr_renamed_1942() - n10, this.cfr_renamed_3.cfr_renamed_1452());
                }
                sprpeja sprpeja5 = sprpeja4;
                this.cfr_renamed_13986(sprpeja5, sprpeja2, arg1 + (int)(f * (float)n3), sprvyo2);
            }
        }
        finally {
            this.cfr_renamed_3.cfr_renamed_2637();
        }
        this.cfr_renamed_3 = sprvyo2;
        this.cfr_renamed_4 = true;
    }

    public void cfr_renamed_13987(sprylp arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_2637();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_13986(sprpeja arg0, sprpeja arg1, int arg2, sprvyo arg3) {
        block3: {
            sprvyo sprvyo2 = new sprvyo(this.cfr_renamed_3.cfr_renamed_1942(), this.cfr_renamed_3.cfr_renamed_1452());
            try {
                sprpeja sprpeja2 = arg1;
                this.cfr_renamed_3.cfr_renamed_13988(sprpeja2, sprvyo2, sprpeja2);
                sprylp sprylp2 = new sprylp();
                sprylp2.cfr_renamed_13989(sprokp.cfr_renamed_13990(arg2));
                sprvyo sprvyo3 = sprvyo2;
                sprvyo3.cfr_renamed_13991(sprylp2);
                sprvyo3.cfr_renamed_13988(arg0, arg3, arg0);
                if (sprvyo2 == null) break block3;
            }
            catch (Throwable throwable) {
                if (sprvyo2 != null) {
                    sprvyo2.cfr_renamed_11665();
                }
                throw throwable;
            }
            sprvyo2.cfr_renamed_11665();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhhn(sprpip sprpip2) {
        void arg0;
        sprhhn sprhhn2 = this;
        this(new sprvyo((sprpip)arg0));
        this.cfr_renamed_4 = true;
    }

    public void cfr_renamed_13992(int arg0, boolean arg1, boolean arg2) {
        this.cfr_renamed_13993(arg0, arg1, arg2, new sprwbp(1, 255, 255, 255));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_13993(int arg0, boolean arg1, boolean arg2, sprwbp arg3) {
        block8: {
            if (arg0 <= 1) {
                return;
            }
            v0 = this;
            v0.cfr_renamed_13981();
            var5_5 = v0.cfr_renamed_3.cfr_renamed_1942();
            var6_6 = v0.cfr_renamed_3.cfr_renamed_1452();
            var7_7 = new sprpeja(0, 0, this.cfr_renamed_3.cfr_renamed_1942(), this.cfr_renamed_3.cfr_renamed_1452());
            v1 = arg0;
            var8_8 = new sprpeja(v1, v1, var7_7.cfr_renamed_1942(), var7_7.cfr_renamed_1452());
            var9_9 = new sprvyo(this.cfr_renamed_3.cfr_renamed_1942() + 2 * arg0, this.cfr_renamed_3.cfr_renamed_1452() + 2 * arg0);
            var10_10 = new sprzyo(var9_9);
            try {
                var10_10.cfr_renamed_13994(arg3, 0.0f, 0.0f, var9_9.cfr_renamed_1942(), var9_9.cfr_renamed_1452());
                if (var10_10 == null) break block8;
                v2 = this;
                var10_10.cfr_renamed_11665();
                ** GOTO lbl25
            }
            catch (Throwable var11_11) {
                if (var10_10 != null) {
                    var10_10.cfr_renamed_11665();
                }
                throw var11_11;
            }
        }
        try {
            v2 = this;
lbl25:
            // 2 sources

            v2.cfr_renamed_3.cfr_renamed_13988(var7_7, var9_9, var8_8);
        }
        finally {
            this.cfr_renamed_3.cfr_renamed_2637();
        }
        this.cfr_renamed_3 = var9_9;
        var11_12 = new sprohn(arg0);
        var11_12.cfr_renamed_13995(this.cfr_renamed_3);
        if (arg2) {
            v3 = arg0;
            var12_14 = new sprpeja(v3, v3, var5_5, var6_6);
            v4 = this;
            var13_15 = v4.cfr_renamed_3.cfr_renamed_13996(var12_14);
            v4.cfr_renamed_3.cfr_renamed_11665();
            v4.cfr_renamed_3 = var13_15;
        }
        this.cfr_renamed_4 = true;
    }

    public void cfr_renamed_2637() {
        if (this.cfr_renamed_3 != null && this.cfr_renamed_4) {
            this.cfr_renamed_3.cfr_renamed_11665();
            this.cfr_renamed_3 = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhhn(sprvyo sprvyo2) {
        void arg0;
        if (sprvyo2 == null) {
            throw new NullPointerException("bitmap");
        }
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_13997(sprwbp arg0) {
        sprhhn sprhhn2;
        sprvyo sprvyo2;
        sprpeja sprpeja2;
        block5: {
            block4: {
                if (arg0 == null) {
                    throw new NullPointerException(sprwkh.cfr_renamed_9("L9M3I*A-@<m7B7\\"));
                }
                this.cfr_renamed_13981();
                sprpeja2 = new sprpeja(0, 0, this.cfr_renamed_3.cfr_renamed_1942(), this.cfr_renamed_3.cfr_renamed_1452());
                sprvyo2 = new sprvyo(sprpeja2.cfr_renamed_1942(), sprpeja2.cfr_renamed_1452());
                sprzyo sprzyo2 = new sprzyo(sprvyo2);
                try {
                    sprzyo2.cfr_renamed_13994(arg0, 0.0f, 0.0f, sprpeja2.cfr_renamed_1942(), sprpeja2.cfr_renamed_1452());
                    if (sprzyo2 == null) break block4;
                    sprhhn2 = this;
                    sprzyo2.cfr_renamed_11665();
                    break block5;
                }
                catch (Throwable throwable) {
                    if (sprzyo2 != null) {
                        sprzyo2.cfr_renamed_11665();
                    }
                    throw throwable;
                }
            }
            sprhhn2 = this;
        }
        sprpeja sprpeja3 = sprpeja2;
        sprhhn2.cfr_renamed_3.cfr_renamed_13988(sprpeja3, sprvyo2, sprpeja3);
        sprhhn sprhhn3 = this;
        this.cfr_renamed_3.cfr_renamed_11665();
        sprhhn3.cfr_renamed_3 = sprvyo2;
        sprhhn3.cfr_renamed_4 = true;
    }

    public sprylp cfr_renamed_13998() {
        if (this.cfr_renamed_2 == null) {
            sprhhn sprhhn2 = this;
            sprhhn2.cfr_renamed_2 = new sprylp();
        }
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_12510() {
        sprpdja sprpdja2 = new sprpdja();
        try {
            this.cfr_renamed_3.cfr_renamed_12641(sprpdja2, 6);
            byte[] byArray = sprmvo.cfr_renamed_12452(sprpdja2);
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhhn(byte[] byArray) {
        void arg0;
        sprhhn sprhhn2 = this;
        this(new sprvyo((byte[])arg0));
        this.cfr_renamed_4 = true;
    }

    public void cfr_renamed_13981() {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(spraws.cfr_renamed_9("e R9N:D-\u0001&C#D*Us\u0001\u0000L(F,q;N*D:R&S"));
        }
        if (this.cfr_renamed_2 == null) {
            return;
        }
        sprhhn sprhhn2 = this;
        sprhhn2.cfr_renamed_3.cfr_renamed_13991(sprhhn2.cfr_renamed_2);
        this.cfr_renamed_2 = null;
    }
}

