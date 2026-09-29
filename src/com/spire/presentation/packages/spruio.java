/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboo;
import com.spire.presentation.packages.sprbqy;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprktp;
import com.spire.presentation.packages.sprmko;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprpeo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;

@sprtea
public class spruio
extends sprmko {
    private float cfr_renamed_1;
    private float cfr_renamed_2;
    private float cfr_renamed_3;
    private float cfr_renamed_4;

    @Override
    @sprtea
    public void cfr_renamed_16085(sprpeo arg0, sprtbp arg1, sprpln arg2) {
        this.cfr_renamed_16086(arg0.cfr_renamed_8505());
    }

    private /* synthetic */ void cfr_renamed_16087(sprsuja arg0, float arg1) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_4 = sprrgga.cfr_renamed_13820(spruio2.cfr_renamed_4, arg0.cfr_renamed_1980() - arg1);
        spruio2.cfr_renamed_2 = sprrgga.cfr_renamed_13820(spruio2.cfr_renamed_2, arg0.spr\u3181() - arg1);
        spruio2.cfr_renamed_3 = sprrgga.cfr_renamed_13566(spruio2.cfr_renamed_3, arg0.cfr_renamed_1980() + arg1);
        spruio2.cfr_renamed_1 = sprrgga.cfr_renamed_13566(spruio2.cfr_renamed_1, arg0.spr\u3181() + arg1);
    }

    @Override
    @sprtea
    public void cfr_renamed_16088(sprgeja arg0) {
        this.cfr_renamed_16086(arg0);
    }

    @Override
    @sprtea
    public void cfr_renamed_16089(sprsuja[] sprsujaArray) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_16090(sprsujaArray, spruio2.cfr_renamed_16091());
    }

    @Override
    @sprtea
    public void cfr_renamed_16092(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        this.cfr_renamed_16093(arg0, arg1, arg2);
    }

    @Override
    @sprtea
    public void cfr_renamed_16094(sprsuja[] sprsujaArray) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_16090(sprsujaArray, spruio2.cfr_renamed_16091());
    }

    private static /* synthetic */ void cfr_renamed_16095() {
        throw new IllegalStateException(sprboo.cfr_renamed_9("\u0015\u000b,\u000f>\u00074\u000bx\u001d1\u0014=N+\r9\u00006\u00076\tx\u0007+N=\u0016(\u000b;\u001a=\nx\u001a7N:\u000bx\u001b+\u000b<N>\u0001*N\u000f#\u001eN7\u00004\u0017v"));
    }

    @Override
    @sprtea
    public void cfr_renamed_16096(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        this.cfr_renamed_16093(arg0, arg1, arg2);
    }

    @Override
    @sprtea
    public void cfr_renamed_16097(sprgeja arg0, sprgeja arg1, byte[] arg2) {
        this.cfr_renamed_16086(arg1);
    }

    @Override
    @sprtea
    public void cfr_renamed_16098(sprgeja arg0) {
        this.cfr_renamed_16086(arg0);
    }

    @Override
    @sprtea
    public void cfr_renamed_16099(sprgeja arg0, sprphja arg1) {
        this.cfr_renamed_16086(arg0);
    }

    private /* synthetic */ void cfr_renamed_16086(sprgeja arg0) {
        spruio spruio2 = this;
        float f = spruio2.cfr_renamed_16091();
        sprsuja[] sprsujaArray = new sprsuja[2];
        sprsujaArray[0] = new sprsuja(arg0.cfr_renamed_1980(), arg0.spr\u3181());
        sprsujaArray[1] = new sprsuja(arg0.cfr_renamed_1980() + arg0.cfr_renamed_1942(), arg0.spr\u3181() + arg0.cfr_renamed_1452());
        spruio2.cfr_renamed_16090(sprsujaArray, f);
    }

    private /* synthetic */ float cfr_renamed_16091() {
        sprtbp sprtbp2 = this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_12571();
        if (sprtbp2 != null) {
            return sprtbp2.cfr_renamed_1942() / 2.0f;
        }
        return 0.0f;
    }

    private static /* synthetic */ int cfr_renamed_16101(sprsuja arg0) {
        if (arg0.cfr_renamed_1980() > 0.0f && arg0.spr\u3181() >= 0.0f) {
            return 1;
        }
        if (arg0.cfr_renamed_1980() <= 0.0f && arg0.spr\u3181() > 0.0f) {
            return 2;
        }
        if (arg0.cfr_renamed_1980() < 0.0f && arg0.spr\u3181() <= 0.0f) {
            return 3;
        }
        return 4;
    }

    @sprtea
    public sprgeja cfr_renamed_8505() {
        spruio spruio2 = this;
        spruio spruio3 = this;
        return sprgeja.cfr_renamed_14827(spruio2.cfr_renamed_4, spruio2.cfr_renamed_2, spruio3.cfr_renamed_3, spruio3.cfr_renamed_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_16093(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        spruio spruio2 = this;
        float f = spruio2.cfr_renamed_16091();
        sprsuja[] sprsujaArray = new sprsuja[2];
        sprsujaArray[0] = arg1;
        sprsujaArray[1] = arg2;
        spruio2.cfr_renamed_16090(sprsujaArray, f);
        sprsuja sprsuja2 = new sprsuja(arg0.cfr_renamed_1980(), arg0.spr\u3181());
        sprsuja sprsuja3 = new sprsuja(arg0.cfr_renamed_1980() + arg0.cfr_renamed_1942(), arg0.spr\u3181() + arg0.cfr_renamed_1452());
        sprsuja sprsuja4 = new sprsuja((sprsuja2.cfr_renamed_1980() + sprsuja3.cfr_renamed_1980()) / 2.0f, (sprsuja2.spr\u3181() + sprsuja3.spr\u3181()) / 2.0f);
        arg1 = new sprsuja(arg1.cfr_renamed_1980() - sprsuja4.cfr_renamed_1980(), arg1.spr\u3181() - sprsuja4.spr\u3181());
        arg2 = new sprsuja(arg2.cfr_renamed_1980() - sprsuja4.cfr_renamed_1980(), arg2.spr\u3181() - sprsuja4.spr\u3181());
        int n = spruio.cfr_renamed_16101(arg1);
        int n2 = spruio.cfr_renamed_16101(arg2);
        switch (n) {
            case 1: {
                switch (n2) {
                    case 1: {
                        if (arg2.cfr_renamed_1980() < arg1.cfr_renamed_1980() && arg2.spr\u3181() < arg1.spr\u3181()) {
                            return;
                        }
                        spruio spruio3 = this;
                        spruio3.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio3.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        this.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio3.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        return;
                    }
                    case 4: {
                        spruio spruio4 = this;
                        spruio4.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        spruio4.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio4.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        return;
                    }
                    case 3: {
                        spruio spruio5 = this;
                        spruio5.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio5.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        return;
                    }
                    case 2: {
                        this.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        return;
                    }
                }
                throw new IllegalStateException(sprbqy.cfr_renamed_9("\u0006(8(<1=f\"324'#!h"));
            }
            case 2: {
                switch (n2) {
                    case 2: {
                        if (arg2.cfr_renamed_1980() < arg1.cfr_renamed_1980() && arg2.spr\u3181() > arg1.spr\u3181()) {
                            return;
                        }
                        spruio spruio6 = this;
                        spruio6.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        spruio6.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio6.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        spruio6.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                    case 1: {
                        spruio spruio7 = this;
                        spruio7.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio7.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        spruio7.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                    case 4: {
                        spruio spruio8 = this;
                        spruio8.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        spruio8.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                    case 3: {
                        this.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                }
                throw new IllegalStateException(sprboo.cfr_renamed_9(";6\u00056\u0001/\u0000x\u001f-\u000f*\u001a=\u001cv"));
            }
            case 3: {
                switch (n2) {
                    case 3: {
                        if (arg2.cfr_renamed_1980() > arg1.cfr_renamed_1980() && arg2.spr\u3181() > arg1.spr\u3181()) {
                            return;
                        }
                        spruio spruio9 = this;
                        spruio9.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio9.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        spruio9.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio9.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        return;
                    }
                    case 2: {
                        spruio spruio10 = this;
                        spruio10.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        spruio10.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio10.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        return;
                    }
                    case 1: {
                        spruio spruio11 = this;
                        spruio11.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio11.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        return;
                    }
                    case 4: {
                        this.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        return;
                    }
                }
                throw new IllegalStateException(sprbqy.cfr_renamed_9("\u0006(8(<1=f\"324'#!h"));
            }
            case 4: {
                switch (n2) {
                    case 4: {
                        if (arg2.cfr_renamed_1980() > arg1.cfr_renamed_1980() && arg2.spr\u3181() < arg1.spr\u3181()) {
                            return;
                        }
                        spruio spruio12 = this;
                        spruio12.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja3.spr\u3181()), f);
                        spruio12.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio12.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        spruio12.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                    case 3: {
                        spruio spruio13 = this;
                        spruio13.cfr_renamed_16102(new sprsuja(sprsuja2.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        spruio13.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        spruio13.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                    case 2: {
                        spruio spruio14 = this;
                        spruio14.cfr_renamed_16102(new sprsuja(sprsuja4.cfr_renamed_1980(), sprsuja2.spr\u3181()), f);
                        spruio14.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                    case 1: {
                        this.cfr_renamed_16102(new sprsuja(sprsuja3.cfr_renamed_1980(), sprsuja4.spr\u3181()), f);
                        return;
                    }
                }
                throw new IllegalStateException(sprboo.cfr_renamed_9(";6\u00056\u0001/\u0000x\u001f-\u000f*\u001a=\u001cv"));
            }
        }
        throw new IllegalStateException(sprbqy.cfr_renamed_9("\u0006(8(<1=f\"324'#!h"));
    }

    @Override
    @sprtea
    public void cfr_renamed_16103() {
        spruio.cfr_renamed_16095();
    }

    @Override
    @sprtea
    public void cfr_renamed_16104(sprgeja arg0, sprsuja arg1, sprsuja arg2) {
        this.cfr_renamed_16093(arg0, arg1, arg2);
    }

    @Override
    @sprtea
    public void cfr_renamed_16105(sprgeja arg0) {
        this.cfr_renamed_16086(arg0);
    }

    @Override
    @sprtea
    public void cfr_renamed_16106(sprsuja[][] sprsujaArray) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_16107(sprsujaArray, spruio2.cfr_renamed_16091());
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public spruio(sprdfo sprdfo2, boolean bl, spriy spriy2) {
        void arg2;
        void arg1;
        void arg0;
        spruio spruio2 = this;
        spruio spruio3 = this;
        super((sprdfo)arg0, (boolean)arg1, (spriy)arg2);
        spruio3.cfr_renamed_4 = Float.MAX_VALUE;
        spruio3.cfr_renamed_2 = Float.MAX_VALUE;
        spruio2.cfr_renamed_3 = -3.4028235E38f;
        spruio2.cfr_renamed_1 = -3.4028235E38f;
    }

    @Override
    @sprtea
    public void cfr_renamed_16108(sprgeja arg0, sprgeja arg1, byte[] arg2, int arg3) {
        this.cfr_renamed_16086(arg1);
    }

    @Override
    @sprtea
    public void cfr_renamed_16109(sprmrn arg0) {
        spruio.cfr_renamed_16095();
    }

    @Override
    @sprtea
    public void cfr_renamed_16110() {
        spruio.cfr_renamed_16095();
    }

    @Override
    @sprtea
    public void cfr_renamed_16111(sprsuja[] sprsujaArray) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_16090(sprsujaArray, spruio2.cfr_renamed_16091());
    }

    @sprtea
    public void cfr_renamed_16102(sprsuja arg0, float arg1) {
        sprsuja[] sprsujaArray = new sprsuja[]{arg0};
        this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16112().cfr_renamed_13184(sprsujaArray);
        arg0 = sprsujaArray[0];
        this.cfr_renamed_16087(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_16090(sprsuja[] sprsujaArray, float f) {
        int n;
        void arg0;
        this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16112().cfr_renamed_13184((sprsuja[])arg0);
        int n2 = n = 0;
        while (n2 < ((void)arg0).length) {
            void arg1;
            this.cfr_renamed_16087((sprsuja)arg0[n++], (float)arg1);
            n2 = n;
        }
    }

    @Override
    @sprtea
    public void cfr_renamed_16113(sprsuja[][] sprsujaArray) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_16107(sprsujaArray, spruio2.cfr_renamed_16091());
    }

    @Override
    @sprtea
    public void cfr_renamed_16114(sprsuja sprsuja2, sprwbp sprwbp2) {
        spruio spruio2 = this;
        spruio2.cfr_renamed_16102(sprsuja2, spruio2.cfr_renamed_16091());
    }

    @sprtea
    public void cfr_renamed_16107(sprsuja[][] arg0, float arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            this.cfr_renamed_16090(arg0[n++], arg1);
            n2 = n;
        }
    }

    @Override
    @sprtea
    public void cfr_renamed_13168(sprsuja arg0) {
        spruio spruio2 = this;
        float f = spruio2.cfr_renamed_16091();
        sprsuja[] sprsujaArray = new sprsuja[2];
        sprsujaArray[0] = this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16115();
        sprsujaArray[1] = arg0;
        spruio2.cfr_renamed_16090(sprsujaArray, f);
    }

    @Override
    @sprtea
    public void cfr_renamed_16116(sprgeja arg0, sprgeja arg1, sprqgp arg2, byte[] arg3) {
        spruio.cfr_renamed_16095();
    }

    private /* synthetic */ sprphja cfr_renamed_16117(sprktp arg0) {
        int n;
        float f = 0.0f;
        float f2 = 0.0f;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_11861()) {
            sprsuja sprsuja2 = arg0.cfr_renamed_576(n);
            f += sprsuja2.cfr_renamed_1980();
            f2 += sprsuja2.spr\u3181();
            n2 = ++n;
        }
        return new sprphja(f, f2 + this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_13257().cfr_renamed_15164());
    }

    @Override
    @sprtea
    public void cfr_renamed_16118(sprsuja arg0, String arg1, sprktp arg2, int arg3, float arg4, float arg5, sprxln arg6) {
        sprsuja[] sprsujaArray;
        sprphja sprphja2 = arg2 == null ? this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16119(arg1) : this.cfr_renamed_16117(arg2);
        sprqgp sprqgp2 = this.cfr_renamed_2820().cfr_renamed_16100().cfr_renamed_16120(arg0, sprphja2, arg3, arg4, arg5);
        sprsuja[] sprsujaArray2 = sprsujaArray = new sprsuja[4];
        sprsujaArray[0] = new sprsuja(0.0f, 0.0f);
        sprsujaArray[1] = new sprsuja(sprphja2.cfr_renamed_1942(), 0.0f);
        sprsujaArray[2] = new sprsuja(0.0f, sprphja2.cfr_renamed_1452());
        sprsujaArray2[3] = new sprsuja(sprphja2.cfr_renamed_1942(), sprphja2.cfr_renamed_1452());
        sprqgp2.cfr_renamed_13184(sprsujaArray);
        this.cfr_renamed_16121(sprsujaArray2, 0.0f);
    }

    @Override
    @sprtea
    public void cfr_renamed_16122() {
        spruio.cfr_renamed_16095();
    }

    @sprtea
    public void cfr_renamed_16121(sprsuja[] arg0, float arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            this.cfr_renamed_16087(arg0[n++], arg1);
            n2 = n;
        }
    }

    @Override
    @sprtea
    public void cfr_renamed_16123(sprgeja arg0) {
        this.cfr_renamed_16086(arg0);
    }

    @Override
    @sprtea
    public void cfr_renamed_16124(int arg0) {
        spruio.cfr_renamed_16095();
    }
}

