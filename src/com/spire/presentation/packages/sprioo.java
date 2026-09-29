/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceo;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprdrja;
import com.spire.presentation.packages.sprfqja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgjo;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprhoo;
import com.spire.presentation.packages.sprieo;
import com.spire.presentation.packages.spriy;
import com.spire.presentation.packages.sprkbb;
import com.spire.presentation.packages.sprleo;
import com.spire.presentation.packages.sprnmo;
import com.spire.presentation.packages.sprpgo;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrt;
import com.spire.presentation.packages.sprsro;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtjo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxoo;
import com.spire.presentation.packages.sprylo;

@sprtea
public class sprioo {
    private int cfr_renamed_272;
    private spriy cfr_renamed_145;
    private boolean cfr_renamed_114;
    private int cfr_renamed_96;
    private sprsuja cfr_renamed_105;
    private sprxoo cfr_renamed_137;
    private sprylo cfr_renamed_79;
    private sprnmo cfr_renamed_107;
    private sprwbp cfr_renamed_132;
    private int cfr_renamed_102;
    private sprwbp cfr_renamed_93;
    private sprgjo cfr_renamed_86;
    private sprtjo cfr_renamed_152;
    private sprieo cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private sprdfo cfr_renamed_0;
    private sprhhp cfr_renamed_1;
    private sprhoo cfr_renamed_2;
    private int cfr_renamed_3;
    private sprtbp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprqgp cfr_renamed_16120(sprsuja sprsuja2, sprphja sprphja2, int n, float f, float f2) {
        void arg2;
        void arg0;
        sprphja sprphja3 = this.cfr_renamed_16355(sprphja2);
        sprqgp sprqgp2 = new sprqgp();
        sprioo sprioo2 = this;
        sprqgp sprqgp3 = sprqgp2;
        sprqgp3.cfr_renamed_13466(sprphja3.cfr_renamed_1942(), sprphja3.cfr_renamed_1452(), 1);
        sprqgp3.cfr_renamed_13466(arg0.cfr_renamed_1980(), arg0.spr\u3181(), 1);
        sprqgp2.cfr_renamed_12634(sprioo2.cfr_renamed_16112().cfr_renamed_16312(), 1);
        sprsuja sprsuja3 = sprioo2.cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_13791((sprsuja)arg0);
        sprqgp sprqgp4 = sprqgp2;
        sprqgp4.cfr_renamed_13466(-sprsuja3.cfr_renamed_1980(), -sprsuja3.spr\u3181(), 1);
        sprqgp4.cfr_renamed_13952(-this.cfr_renamed_2.cfr_renamed_16271(), 1);
        if (arg2 == true) {
            void arg4;
            void arg3;
            this.cfr_renamed_16356(sprqgp2, (float)arg3, (float)arg4);
        }
        sprqgp sprqgp5 = sprqgp2;
        sprqgp5.cfr_renamed_13466(sprsuja3.cfr_renamed_1980(), sprsuja3.spr\u3181(), 1);
        return sprqgp5;
    }

    @sprtea
    public sprtbp cfr_renamed_12571() {
        if (this.cfr_renamed_3 == 11) {
            return null;
        }
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_107.cfr_renamed_16248(this.cfr_renamed_12676());
        }
        return this.cfr_renamed_4;
    }

    @sprtea
    public sprpln cfr_renamed_16199(int arg0) {
        return ((sprieo)this.cfr_renamed_79.cfr_renamed_576(arg0)).cfr_renamed_16280(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public void cfr_renamed_16357(sprxln arg0, int arg1) {
        sprdrja sprdrja2;
        sprdrja sprdrja3;
        block14: {
            sprceo sprceo2;
            sprceo sprceo3 = sprceo2 = new sprceo();
            arg0.cfr_renamed_13121(sprceo3);
            sprdrja3 = sprceo3.cfr_renamed_15204();
            try {
                block13: {
                    sprhbja sprhbja2 = new sprhbja(sprdrja3);
                    try {
                        sprioo sprioo2;
                        block12: {
                            block11: {
                                if (arg0.cfr_renamed_13094() != null) {
                                    sprfqja sprfqja2 = sprsro.cfr_renamed_16358(arg0.cfr_renamed_13094());
                                    try {
                                        sprhbja2.cfr_renamed_16359(sprfqja2);
                                        if (sprfqja2 == null) break block11;
                                        sprioo2 = this;
                                        sprfqja2.dispose();
                                        break block12;
                                    }
                                    catch (Throwable throwable) {
                                        if (sprfqja2 != null) {
                                            sprfqja2.dispose();
                                        }
                                        throw throwable;
                                    }
                                }
                            }
                            sprioo2 = this;
                        }
                        sprioo2.cfr_renamed_152.cfr_renamed_16360(sprhbja2, arg1);
                        if (sprhbja2 == null) break block13;
                        sprdrja2 = sprdrja3;
                    }
                    catch (Throwable throwable) {
                        if (sprhbja2 != null) {
                            sprhbja2.dispose();
                        }
                        throw throwable;
                    }
                    sprhbja2.dispose();
                    break block14;
                }
                sprdrja2 = sprdrja3;
            }
            catch (Throwable throwable) {
                if (sprdrja3 != null) {
                    sprdrja3.dispose();
                }
                throw throwable;
            }
        }
        if (sprdrja2 != null) {
            sprdrja3.dispose();
            return;
        }
    }

    @sprtea
    public void cfr_renamed_16225(sprhbja arg0, int arg1) {
        this.cfr_renamed_152.cfr_renamed_16360(arg0, arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public void cfr_renamed_16177(sprgeja arg0) {
        block8: {
            sprhbja sprhbja2 = new sprhbja(arg0);
            try {
                sprioo sprioo2;
                block7: {
                    block6: {
                        sprfqja sprfqja2 = sprsro.cfr_renamed_16358(this.cfr_renamed_86.cfr_renamed_16312());
                        try {
                            sprhbja2.cfr_renamed_16359(sprfqja2);
                            if (sprfqja2 == null) break block6;
                            sprioo2 = this;
                            sprfqja2.dispose();
                            break block7;
                        }
                        catch (Throwable throwable) {
                            if (sprfqja2 != null) {
                                sprfqja2.dispose();
                            }
                            throw throwable;
                        }
                    }
                    sprioo2 = this;
                }
                sprioo2.cfr_renamed_152.cfr_renamed_16360(sprhbja2, 4);
                if (sprhbja2 == null) break block8;
            }
            catch (Throwable throwable) {
                if (sprhbja2 != null) {
                    sprhbja2.dispose();
                }
                throw throwable;
            }
            sprhbja2.dispose();
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_16356(sprqgp arg0, float arg1, float arg2) {
        if (this.cfr_renamed_16361()) {
            arg0.cfr_renamed_13255(sprrgga.cfr_renamed_13830(arg1), sprrgga.cfr_renamed_13830(arg2), 1);
        }
    }

    private /* synthetic */ boolean cfr_renamed_16361() {
        return this.cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_12595() < 0.0f || this.cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_12598() < 0.0f;
    }

    public sprxoo cfr_renamed_16362() {
        return this.cfr_renamed_137;
    }

    public float cfr_renamed_16231() {
        return sprrgga.cfr_renamed_13830(this.cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_12598());
    }

    @sprtea
    public sprsuja cfr_renamed_16115() {
        return this.cfr_renamed_105;
    }

    @sprtea
    public sprhhp cfr_renamed_13257() {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_2.cfr_renamed_16268();
        }
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public void cfr_renamed_16152(int arg0) {
        sprrt sprrt2 = this.cfr_renamed_79.cfr_renamed_576(arg0);
        if (sprrt2 == null) {
            return;
        }
        switch (sprrt2.cfr_renamed_324()) {
            case 2: {
                this.cfr_renamed_107 = (sprnmo)sprrt2;
                this.cfr_renamed_4 = null;
                return;
            }
            case 1: {
                this.cfr_renamed_112 = (sprieo)sprrt2;
                return;
            }
            case 6: {
                this.cfr_renamed_2 = (sprhoo)sprrt2;
                this.cfr_renamed_1 = null;
                return;
            }
            case 10: {
                return;
            }
            case 4: {
                return;
            }
            case 11: {
                return;
            }
        }
        throw new IllegalStateException(sprkbb.cfr_renamed_9("{\u001cE\u001cA\u0005@Ri6gRA\u0010D\u0017M\u0006\u000e\u0006W\u0002K\\"));
    }

    @sprtea
    public sprqgp cfr_renamed_16286() {
        sprqgp sprqgp2 = this.cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_14487();
        sprqgp2.cfr_renamed_13534(this.cfr_renamed_0.cfr_renamed_16363(), this.cfr_renamed_0.cfr_renamed_16364());
        return sprqgp2;
    }

    @sprtea
    public sprpln cfr_renamed_12551() {
        return this.cfr_renamed_112.cfr_renamed_16280(this);
    }

    @sprtea
    public void cfr_renamed_16155(sprwbp arg0) {
        this.cfr_renamed_132 = arg0;
    }

    @sprtea
    public void cfr_renamed_16156(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @sprtea
    public sprtjo cfr_renamed_12590() {
        return this.cfr_renamed_152;
    }

    @sprtea
    public void cfr_renamed_16157(sprwbp arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public void cfr_renamed_16365(int arg0) {
        this.cfr_renamed_272 = arg0;
    }

    @sprtea
    public sprhoo cfr_renamed_16131() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public void cfr_renamed_16226(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    @sprtea
    public sprqgp cfr_renamed_16366(sprsuja arg0, int arg1, float arg2, float arg3) {
        sprqgp sprqgp2 = new sprqgp();
        sprioo sprioo2 = this;
        sprqgp2.cfr_renamed_13534(sprioo2.cfr_renamed_2.cfr_renamed_16266(sprioo2.cfr_renamed_1), 1.0f);
        if (arg1 == 1) {
            float f;
            float f2;
            float f3 = sprrgga.cfr_renamed_13562(arg3 / arg2);
            if (!this.cfr_renamed_16361()) {
                f2 = sprrgga.cfr_renamed_13830(arg2);
                f = f3;
            } else {
                f2 = 1.0f;
                f = f3;
            }
            sprqgp2.cfr_renamed_13255(f2 * f, !this.cfr_renamed_16361() ? (float)sprrgga.cfr_renamed_13830(arg3) : 1.0f, 1);
        }
        sprqgp sprqgp3 = sprqgp2;
        sprqgp3.cfr_renamed_13466(arg0.cfr_renamed_1980(), arg0.spr\u3181(), 1);
        return sprqgp3;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16367(sprpgo sprpgo2) {
        void arg0;
        sprioo sprioo2 = this;
        void v1 = arg0;
        sprioo sprioo3 = this;
        void v3 = arg0;
        sprioo sprioo4 = this;
        void v5 = arg0;
        sprioo sprioo5 = this;
        void v7 = arg0;
        sprioo sprioo6 = this;
        this.cfr_renamed_152.cfr_renamed_16368(arg0.cfr_renamed_16353());
        sprioo6.cfr_renamed_86.cfr_renamed_16316(arg0.cfr_renamed_16345());
        sprioo6.cfr_renamed_137.cfr_renamed_16331(arg0.cfr_renamed_16351());
        sprioo6.cfr_renamed_132 = arg0.cfr_renamed_12676();
        this.cfr_renamed_105 = v7.cfr_renamed_16115();
        sprioo5.cfr_renamed_119 = v7.cfr_renamed_16287();
        sprioo5.cfr_renamed_3 = arg0.cfr_renamed_16354();
        this.cfr_renamed_91 = v5.cfr_renamed_16348();
        sprioo4.cfr_renamed_102 = v5.cfr_renamed_16343();
        sprioo4.cfr_renamed_93 = arg0.cfr_renamed_16215();
        this.cfr_renamed_96 = v3.cfr_renamed_12609();
        sprioo3.cfr_renamed_112 = v3.cfr_renamed_16346();
        sprioo3.cfr_renamed_2 = arg0.cfr_renamed_16131();
        this.cfr_renamed_1 = v1.cfr_renamed_13257();
        sprioo2.cfr_renamed_107 = v1.cfr_renamed_16344();
        sprioo2.cfr_renamed_4 = sprpgo2.cfr_renamed_12571();
    }

    @sprtea
    public void cfr_renamed_16158(int arg0) {
        this.cfr_renamed_102 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprphja cfr_renamed_16355(sprphja arg0) {
        float f;
        float f2;
        switch (6 & this.cfr_renamed_102) {
            case 2: {
                f2 = -arg0.cfr_renamed_1942();
                break;
            }
            case 6: {
                f2 = -arg0.cfr_renamed_1942() / 2.0f;
                break;
            }
            default: {
                f2 = 0.0f;
            }
        }
        switch (0x18 & this.cfr_renamed_102) {
            case 0: {
                f = this.cfr_renamed_13257().cfr_renamed_13746();
                return new sprphja(f2, f);
            }
            case 8: {
                f = -this.cfr_renamed_13257().cfr_renamed_13744();
                return new sprphja(f2, f);
            }
        }
        f = 0.0f;
        return new sprphja(f2, f);
    }

    private /* synthetic */ void cfr_renamed_16369() {
        sprioo sprioo2 = this;
        sprioo sprioo3 = this;
        sprioo sprioo4 = this;
        sprioo sprioo5 = this;
        sprioo5.cfr_renamed_119 = 2;
        sprioo5.cfr_renamed_132 = sprwbp.cfr_renamed_955;
        sprioo5.cfr_renamed_93 = sprwbp.cfr_renamed_1513;
        sprioo4.cfr_renamed_102 = 0;
        sprioo4.cfr_renamed_91 = 0;
        sprioo3.cfr_renamed_96 = 1;
        sprioo3.cfr_renamed_3 = 13;
        sprioo sprioo6 = this;
        sprioo2.cfr_renamed_2 = new sprhoo(this.cfr_renamed_145);
        sprioo6.cfr_renamed_107 = new sprnmo();
        sprioo2.cfr_renamed_4 = new sprtbp(this.cfr_renamed_93);
        sprioo2.cfr_renamed_4.cfr_renamed_12581(2);
        sprioo2.cfr_renamed_4.cfr_renamed_12579(2);
        sprioo2.cfr_renamed_4.cfr_renamed_12575(2);
        sprioo2.cfr_renamed_112 = new sprleo(sprwbp.cfr_renamed_955);
    }

    public sprgjo cfr_renamed_16112() {
        return this.cfr_renamed_86;
    }

    @sprtea
    public int cfr_renamed_16354() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public int cfr_renamed_12609() {
        return this.cfr_renamed_96;
    }

    public int cfr_renamed_16370() {
        return this.cfr_renamed_272;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int cfr_renamed_16371() {
        if (!this.cfr_renamed_114) {
            return 2;
        }
        switch (this.cfr_renamed_272) {
            case 2: {
                return 0;
            }
        }
        return 1;
    }

    @sprtea
    public void cfr_renamed_16198(sprsuja arg0) {
        this.cfr_renamed_105 = arg0;
    }

    @sprtea
    public void cfr_renamed_16178(sprphja arg0) {
        sprioo sprioo2 = this;
        sprsuja sprsuja2 = sprioo2.cfr_renamed_86.cfr_renamed_16312().cfr_renamed_13791(new sprsuja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452()));
        sprioo2.cfr_renamed_152.cfr_renamed_16372(sprsuja2);
    }

    @sprtea
    public int cfr_renamed_16348() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public void cfr_renamed_16373() {
        this.cfr_renamed_152.cfr_renamed_16373();
    }

    @sprtea
    public void cfr_renamed_16207(int arg0) {
        if (arg0 != this.cfr_renamed_3) {
            sprioo sprioo2 = this;
            sprioo2.cfr_renamed_3 = arg0;
            sprioo2.cfr_renamed_4 = null;
        }
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_152.cfr_renamed_11665();
        this.cfr_renamed_152 = null;
    }

    @sprtea
    public sprwbp cfr_renamed_16215() {
        return this.cfr_renamed_93;
    }

    public sprphja cfr_renamed_16119(String arg0) {
        sprphja sprphja2 = this.cfr_renamed_13257().cfr_renamed_13729(arg0);
        return new sprphja(sprphja2.cfr_renamed_1942() + (float)(sprcop.cfr_renamed_16374(arg0) * this.cfr_renamed_91), sprphja2.cfr_renamed_1452());
    }

    @sprtea
    public void cfr_renamed_12527() {
        this.cfr_renamed_152.cfr_renamed_41();
    }

    @sprtea
    public int cfr_renamed_16343() {
        return this.cfr_renamed_102;
    }

    @sprtea
    public void cfr_renamed_12591(int arg0) {
        this.cfr_renamed_96 = arg0;
    }

    @sprtea
    public sprioo(sprylo arg0, sprdfo arg1, boolean arg2, spriy arg3) {
        sprioo sprioo2 = this;
        sprioo sprioo3 = this;
        sprioo sprioo4 = this;
        this.cfr_renamed_105 = sprsuja.cfr_renamed_13377();
        this.cfr_renamed_272 = 1;
        sprioo4.cfr_renamed_79 = arg0;
        sprioo4.cfr_renamed_0 = arg1;
        sprioo3.cfr_renamed_114 = arg2;
        sprioo3.cfr_renamed_145 = arg3;
        sprioo sprioo5 = this;
        sprioo2.cfr_renamed_152 = new sprtjo(sprgeja.cfr_renamed_16235(arg1.cfr_renamed_16236()));
        this.cfr_renamed_86 = arg1.cfr_renamed_16375();
        sprioo2.cfr_renamed_137 = new sprxoo(this);
        this.cfr_renamed_16369();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public void cfr_renamed_16176(sprgeja arg0) {
        block8: {
            sprhbja sprhbja2 = new sprhbja(arg0);
            try {
                sprioo sprioo2;
                block7: {
                    block6: {
                        sprfqja sprfqja2 = sprsro.cfr_renamed_16358(this.cfr_renamed_86.cfr_renamed_16312());
                        try {
                            sprhbja2.cfr_renamed_16359(sprfqja2);
                            if (sprfqja2 == null) break block6;
                            sprioo2 = this;
                            sprfqja2.dispose();
                            break block7;
                        }
                        catch (Throwable throwable) {
                            if (sprfqja2 != null) {
                                sprfqja2.dispose();
                            }
                            throw throwable;
                        }
                    }
                    sprioo2 = this;
                }
                sprioo2.cfr_renamed_152.cfr_renamed_16360(sprhbja2, 1);
                if (sprhbja2 == null) break block8;
            }
            catch (Throwable throwable) {
                if (sprhbja2 != null) {
                    sprhbja2.dispose();
                }
                throw throwable;
            }
            sprhbja2.dispose();
            return;
        }
    }

    @sprtea
    public int cfr_renamed_16287() {
        return this.cfr_renamed_119;
    }

    public sprpgo cfr_renamed_16317() {
        sprpgo sprpgo2;
        sprpgo sprpgo3 = sprpgo2 = new sprpgo();
        sprioo sprioo2 = this;
        sprpgo sprpgo4 = sprpgo2;
        sprioo sprioo3 = this;
        sprpgo sprpgo5 = sprpgo2;
        sprioo sprioo4 = this;
        sprpgo sprpgo6 = sprpgo2;
        sprioo sprioo5 = this;
        sprpgo sprpgo7 = sprpgo2;
        sprioo sprioo6 = this;
        sprpgo2.cfr_renamed_16350(this.cfr_renamed_152.cfr_renamed_16317());
        sprpgo2.cfr_renamed_16347(sprioo6.cfr_renamed_86.cfr_renamed_16317());
        sprpgo7.cfr_renamed_16352(sprioo6.cfr_renamed_137.cfr_renamed_16317());
        sprpgo7.cfr_renamed_16155(this.cfr_renamed_132);
        sprpgo2.cfr_renamed_16198(sprioo5.cfr_renamed_105);
        sprpgo6.cfr_renamed_16156(sprioo5.cfr_renamed_119);
        sprpgo6.cfr_renamed_16207(this.cfr_renamed_3);
        sprpgo2.cfr_renamed_16226(sprioo4.cfr_renamed_91);
        sprpgo5.cfr_renamed_16158(sprioo4.cfr_renamed_102);
        sprpgo5.cfr_renamed_16157(this.cfr_renamed_93);
        sprpgo2.cfr_renamed_12591(sprioo3.cfr_renamed_96);
        sprpgo4.cfr_renamed_16341(sprioo3.cfr_renamed_112);
        sprpgo4.cfr_renamed_16349(this.cfr_renamed_2);
        sprpgo2.cfr_renamed_13741(sprioo2.cfr_renamed_1);
        sprpgo3.cfr_renamed_16342(sprioo2.cfr_renamed_107);
        sprpgo3.cfr_renamed_12505(this.cfr_renamed_4);
        return sprpgo3;
    }

    public float cfr_renamed_16230() {
        return sprrgga.cfr_renamed_13830(this.cfr_renamed_16112().cfr_renamed_16312().cfr_renamed_12595());
    }

    @sprtea
    public sprwbp cfr_renamed_12676() {
        if (this.cfr_renamed_119 == 1) {
            return new sprwbp(0, this.cfr_renamed_132);
        }
        return this.cfr_renamed_132;
    }
}

