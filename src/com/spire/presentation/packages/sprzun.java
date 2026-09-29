/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravn;
import com.spire.presentation.packages.sprdfj;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfln;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgs;
import com.spire.presentation.packages.sprico;
import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprmxn;
import com.spire.presentation.packages.sprmzn;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprotn;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprsqn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprthn;
import com.spire.presentation.packages.spruvn;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwdo;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;
import com.spire.presentation.packages.sprzye;
import com.spire.presentation.packages.sprzyn;

@sprtea
public class sprzun
extends sprsmn {
    private sprzyn cfr_renamed_119;
    private spreen cfr_renamed_91;
    private static final int cfr_renamed_0 = 600;
    private sprico cfr_renamed_1;
    private spruvn cfr_renamed_2;
    private sprkzn cfr_renamed_3;
    private sprmxn cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_15001() {
        this.cfr_renamed_119.cfr_renamed_14973((byte)97);
    }

    private /* synthetic */ void cfr_renamed_15002(spreen arg0, spruvn arg1) {
        if (arg0 == null) {
            throw new NullPointerException("stream");
        }
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_91 = arg0;
        sprzun sprzun3 = this;
        sprzun2.cfr_renamed_119 = new sprzyn(new sprpdja());
        sprzun3.cfr_renamed_3 = new sprkzn(this.cfr_renamed_119, arg1);
        sprzun2.cfr_renamed_1 = new sprico(this.cfr_renamed_3);
        new sprmzn(this.cfr_renamed_3.cfr_renamed_13380());
        this.cfr_renamed_4 = new sprmxn(this.cfr_renamed_3);
    }

    private /* synthetic */ void cfr_renamed_15003(sprqgp arg0) {
        if (arg0 == null || arg0.cfr_renamed_13656() || spryxp.cfr_renamed_15004(arg0.cfr_renamed_15005())) {
            return;
        }
        float[] fArray = spryxp.cfr_renamed_15006(arg0);
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_119.cfr_renamed_15007(fArray[0], fArray[1]);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)-92);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)101);
        sprzun2.cfr_renamed_119.cfr_renamed_15007(fArray[2], 0.0f);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)-91);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)102);
        sprzun2.cfr_renamed_119.cfr_renamed_14972(-fArray[3]);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)-95);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)100);
    }

    @Override
    public void cfr_renamed_13107(sprxln sprxln2) {
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)-122);
        sprzun2.cfr_renamed_15008(sprxln2, true);
    }

    @Override
    public void cfr_renamed_13128(sprvjn arg0) {
        sprwdo.cfr_renamed_15009(arg0, this.cfr_renamed_2, this.cfr_renamed_13093()).cfr_renamed_13121(this);
    }

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        this.cfr_renamed_15010(arg0, false);
    }

    private /* synthetic */ void cfr_renamed_15011() {
        this.cfr_renamed_119.cfr_renamed_14973((byte)96);
    }

    public void cfr_renamed_13125(boolean arg0) {
        this.cfr_renamed_2.cfr_renamed_13125(arg0);
    }

    @Override
    public void cfr_renamed_13126(sprsqn arg0) {
        this.cfr_renamed_13127();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13108(sprthn sprthn2) {
        void arg0;
        sprzun sprzun2 = this;
        sprzun sprzun3 = this;
        sprzun3.cfr_renamed_15010((sprgs)arg0, false);
        sprzun3.cfr_renamed_15003(arg0.cfr_renamed_13094());
        sprzun2.cfr_renamed_4.cfr_renamed_14974((sprthn)arg0);
        sprzun2.cfr_renamed_15008(sprthn2, false);
    }

    private /* synthetic */ void cfr_renamed_13127() {
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_119.cfr_renamed_14971(1);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)49);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)68);
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        this.cfr_renamed_1.cfr_renamed_13175(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprzun(spreen spreen2, spruvn spruvn2) {
        void arg1;
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_2 = new spruvn(null);
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_15002(spreen2, (spruvn)arg1);
    }

    private /* synthetic */ float cfr_renamed_1851() {
        return (float)(600.0 / (72.0 * (double)this.cfr_renamed_2.cfr_renamed_15012()));
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        this.cfr_renamed_1.cfr_renamed_13186(arg0);
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        this.cfr_renamed_1.cfr_renamed_13173(arg0);
    }

    private /* synthetic */ void cfr_renamed_15010(sprgs arg0, boolean arg1) {
        if (!arg1 && !sprfln.cfr_renamed_13714(arg0)) {
            return;
        }
        this.cfr_renamed_119.cfr_renamed_14973((byte)97);
        if (sprfln.cfr_renamed_13248(arg0)) {
            this.cfr_renamed_14095(arg0.cfr_renamed_12590());
        }
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        sprzun sprzun2 = this;
        sprzun sprzun3 = this;
        sprzun3.cfr_renamed_15001();
        sprzun3.cfr_renamed_13166(arg0.cfr_renamed_13110());
        spravn spravn2 = sprzun2.cfr_renamed_3.cfr_renamed_2524().cfr_renamed_14989(arg0);
        sprzun sprzun4 = this;
        spravn2.cfr_renamed_15013(sprzun4.cfr_renamed_119);
        sprzun4.cfr_renamed_119.cfr_renamed_15007(arg0.cfr_renamed_2773().cfr_renamed_1942() / spravn2.cfr_renamed_2773().cfr_renamed_1942(), arg0.cfr_renamed_2773().cfr_renamed_1452() / spravn2.cfr_renamed_2773().cfr_renamed_1452());
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)43);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)119);
        spravn2.cfr_renamed_15014(this.cfr_renamed_119);
        sprzun2.cfr_renamed_15011();
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        this.cfr_renamed_15008(arg0, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_12453() {
        sprzyn sprzyn2;
        sprzyn sprzyn3;
        block6: {
            block5: {
                sprzun sprzun2;
                sprzyn sprzyn4 = sprzyn3 = new sprzyn(this.cfr_renamed_91);
                sprzyn sprzyn5 = sprzyn3;
                sprzyn sprzyn6 = sprzyn3;
                sprzyn sprzyn7 = sprzyn3;
                sprzyn sprzyn8 = sprzyn3;
                sprzyn sprzyn9 = sprzyn3;
                sprzyn sprzyn10 = sprzyn3;
                sprzyn sprzyn11 = sprzyn3;
                sprzyn3.cfr_renamed_11594((byte)27);
                sprzyn11.cfr_renamed_11835(sprdfj.cfr_renamed_9("?~+a)g/\u000b"));
                sprzyn11.cfr_renamed_11835(sprzye.cfr_renamed_9("\bc\u0002\u007fhv\u0006g\rah\u007f\t}\u000ff\tt\r\u0013u\u0013\u0018p\u0004k\u0004"));
                sprzyn10.cfr_renamed_11594((byte)13);
                sprzyn10.cfr_renamed_11594((byte)10);
                sprzyn10.cfr_renamed_15015();
                sprzyn9.cfr_renamed_15016((byte)0);
                sprzyn9.cfr_renamed_14970((byte)-122);
                sprzyn8.cfr_renamed_15017(600, 600);
                sprzyn8.cfr_renamed_14970((byte)-119);
                sprzyn7.cfr_renamed_15016((byte)2);
                sprzyn7.cfr_renamed_14970((byte)-113);
                sprzyn6.cfr_renamed_14973((byte)65);
                sprzyn6.cfr_renamed_15016((byte)0);
                sprzyn5.cfr_renamed_14970((byte)-120);
                sprzyn5.cfr_renamed_15016((byte)1);
                sprzyn4.cfr_renamed_14970((byte)-126);
                sprzyn4.cfr_renamed_14973((byte)72);
                try {
                    this.cfr_renamed_3.cfr_renamed_2524().cfr_renamed_14999(sprzyn3);
                    sprzun2 = this;
                }
                catch (Exception exception) {
                    sprzun2 = this;
                    exception.printStackTrace();
                }
                spreen spreen2 = sprzun2.cfr_renamed_119.cfr_renamed_13232();
                try {
                    spreen2.cfr_renamed_11548(0L);
                    sprmvo.cfr_renamed_12186(spreen2, sprzyn3.cfr_renamed_13232());
                    if (spreen2 == null) break block5;
                    sprzyn2 = sprzyn3;
                    spreen2.cfr_renamed_2637();
                    break block6;
                }
                catch (Throwable throwable) {
                    if (spreen2 != null) {
                        spreen2.cfr_renamed_2637();
                    }
                    throw throwable;
                }
            }
            sprzyn2 = sprzyn3;
        }
        sprzyn2.cfr_renamed_14973((byte)73);
        sprzyn sprzyn12 = sprzyn3;
        sprzyn3.cfr_renamed_14973((byte)66);
        sprzyn12.cfr_renamed_11594((byte)27);
        sprzyn12.cfr_renamed_11835(sprdfj.cfr_renamed_9("?~+a)g/\u000b"));
    }

    private /* synthetic */ void cfr_renamed_15008(sprgs arg0, boolean arg1) {
        if (!arg1 && !sprfln.cfr_renamed_13714(arg0)) {
            return;
        }
        this.cfr_renamed_119.cfr_renamed_14973((byte)96);
    }

    private /* synthetic */ void cfr_renamed_14095(sprxln arg0) {
        sprzun sprzun2 = this;
        sprzun sprzun3 = this;
        this.cfr_renamed_119.cfr_renamed_14973((byte)-123);
        arg0.cfr_renamed_13121(sprzun3.cfr_renamed_1);
        sprzun2.cfr_renamed_119.cfr_renamed_15016((byte)0);
        sprzun3.cfr_renamed_119.cfr_renamed_14970((byte)83);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)103);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)-123);
    }

    private /* synthetic */ void cfr_renamed_15018(sprsqn arg0) {
        int n = sprotn.cfr_renamed_14955(sprnmp.cfr_renamed_13480(arg0.cfr_renamed_2773().cfr_renamed_1942()), sprnmp.cfr_renamed_13480(arg0.cfr_renamed_2773().cfr_renamed_1452()), arg0.cfr_renamed_13659());
        if (n == 19) {
            sprzun sprzun2 = this;
            sprzun2.cfr_renamed_119.cfr_renamed_15007((float)sprnmp.cfr_renamed_15019(arg0.cfr_renamed_2773().cfr_renamed_1942()), (float)sprnmp.cfr_renamed_15019(arg0.cfr_renamed_2773().cfr_renamed_1452()));
            sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)47);
            sprzun2.cfr_renamed_119.cfr_renamed_15016((byte)1);
            sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)48);
            return;
        }
        sprzun sprzun3 = this;
        sprzun3.cfr_renamed_119.cfr_renamed_15016((byte)n);
        sprzun3.cfr_renamed_119.cfr_renamed_14970((byte)37);
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        this.cfr_renamed_1.cfr_renamed_13178(arg0);
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_119.cfr_renamed_14410(arg0);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)76);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)107);
    }

    private /* synthetic */ void cfr_renamed_15020(sprsqn arg0) {
        this.cfr_renamed_119.cfr_renamed_15016(arg0.cfr_renamed_13659() ? (byte)1 : 0);
        sprzun sprzun2 = this;
        sprzun sprzun3 = this;
        sprzun3.cfr_renamed_119.cfr_renamed_14970((byte)40);
        sprzun2.cfr_renamed_15018(arg0);
        sprzun3.cfr_renamed_119.cfr_renamed_15016((byte)0);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)52);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)67);
        sprzun2.cfr_renamed_119.cfr_renamed_15017(0, 0);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)42);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)117);
        sprzun2.cfr_renamed_119.cfr_renamed_15007(this.cfr_renamed_1851(), this.cfr_renamed_1851());
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)43);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)119);
    }

    public boolean cfr_renamed_13093() {
        return this.cfr_renamed_2.cfr_renamed_13093();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13098(sprxln sprxln2) {
        void arg0;
        sprzun sprzun2 = this;
        sprzun2.cfr_renamed_15010((sprgs)arg0, true);
        sprzun2.cfr_renamed_119.cfr_renamed_15016((byte)2);
        sprzun2.cfr_renamed_119.cfr_renamed_14970((byte)3);
        sprzun2.cfr_renamed_119.cfr_renamed_14973((byte)106);
        if (sprfln.cfr_renamed_13248(sprxln2)) {
            this.cfr_renamed_14095(arg0.cfr_renamed_12590());
        }
        this.cfr_renamed_3.cfr_renamed_14984().cfr_renamed_15021((sprxln)arg0);
    }

    @Override
    public void cfr_renamed_13112(sprsqn arg0) {
        this.cfr_renamed_15020(arg0);
    }
}

