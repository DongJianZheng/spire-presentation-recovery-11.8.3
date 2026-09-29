/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbro;
import com.spire.presentation.packages.sprey;
import com.spire.presentation.packages.sprjgp;
import com.spire.presentation.packages.sprlfp;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprqro;
import com.spire.presentation.packages.sprshp;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprfhp
implements sprey {
    private static final int cfr_renamed_0 = 20;
    private static final int cfr_renamed_1 = 30;
    private static final int cfr_renamed_2 = 1;
    private static final int cfr_renamed_3 = 2;
    private static final int cfr_renamed_4 = 100;

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ int cfr_renamed_18995(sprshp sprshp2, sprshp sprshp3) {
        int n;
        sprshp arg0;
        byte by = arg0.cfr_renamed_205()[0];
        byte by2 = sprshp3.cfr_renamed_205()[0];
        if (by == 1 || by2 == 1) {
            return 30;
        }
        if (by == 0 || by2 == 0) {
            return 20;
        }
        if (by != by2) {
            return 30;
        }
        int n2 = 0;
        int n3 = n = 1;
        while (n3 < 10) {
            void arg1;
            byte by3 = arg0.cfr_renamed_205()[n];
            byte by4 = arg1.cfr_renamed_205()[n];
            n2 += sprfhp.cfr_renamed_18996(by3, by4);
            n3 = ++n;
        }
        return n2;
    }

    private /* synthetic */ sprqro cfr_renamed_18997(sprjgp arg0) {
        if (arg0.cfr_renamed_15541() < 0 || arg0.cfr_renamed_15541() > 255) {
            return arg0.cfr_renamed_18493();
        }
        return arg0.cfr_renamed_18493().cfr_renamed_18614((byte)arg0.cfr_renamed_15541());
    }

    @Override
    public String cfr_renamed_18950(sprjgp arg0, sprlfp[] arg1) {
        sprlfp sprlfp2;
        sprlfp sprlfp3;
        block4: {
            int n;
            sprfhp sprfhp2 = this;
            sprshp sprshp2 = sprfhp2.cfr_renamed_18998(arg0);
            sprqro sprqro2 = sprfhp2.cfr_renamed_18997(arg0);
            sprlfp3 = null;
            int n2 = Integer.MAX_VALUE;
            sprlfp[] sprlfpArray = arg1;
            int n3 = arg1.length;
            int n4 = n = 0;
            while (n4 < n3) {
                sprlfp sprlfp4 = sprlfpArray[n];
                int n5 = sprfhp.cfr_renamed_18999(sprshp2, arg0.cfr_renamed_18514(), sprqro2, sprlfp4);
                if (n5 < n2) {
                    sprlfp3 = sprlfp4;
                    n2 = n5;
                    if (n5 == 0) {
                        sprlfp2 = sprlfp3;
                        break block4;
                    }
                }
                n4 = ++n;
            }
            sprlfp2 = sprlfp3;
        }
        if (sprlfp2 != null) {
            return sprlfp3.cfr_renamed_19000();
        }
        return null;
    }

    private static /* synthetic */ int cfr_renamed_18999(sprshp arg0, sprbro arg1, sprqro arg2, sprlfp arg3) {
        return sprfhp.cfr_renamed_19001(arg1, arg2, arg3) * 100 + sprfhp.cfr_renamed_18995(arg0, arg3.cfr_renamed_18523());
    }

    private static /* synthetic */ int cfr_renamed_19001(sprbro arg0, sprqro arg1, sprlfp arg2) {
        sprlfp sprlfp2 = arg2;
        sprbro sprbro2 = sprlfp2.cfr_renamed_18514();
        sprqro sprqro2 = sprlfp2.cfr_renamed_18493();
        return sprfhp.cfr_renamed_19002(arg0.cfr_renamed_18470(), sprbro2.cfr_renamed_18470()) + sprfhp.cfr_renamed_19002(arg0.cfr_renamed_18471(), sprbro2.cfr_renamed_18471()) + sprfhp.cfr_renamed_19002(arg0.cfr_renamed_18472(), sprbro2.cfr_renamed_18472()) + sprfhp.cfr_renamed_19002(arg0.cfr_renamed_18473(), sprbro2.cfr_renamed_18473()) + sprfhp.cfr_renamed_19002(arg1.cfr_renamed_18470(), sprqro2.cfr_renamed_18470()) + sprfhp.cfr_renamed_19002(arg1.cfr_renamed_18471(), sprqro2.cfr_renamed_18471());
    }

    private /* synthetic */ sprshp cfr_renamed_18998(sprjgp arg0) {
        if (arg0.cfr_renamed_18523().cfr_renamed_205()[0] != 0) {
            return arg0.cfr_renamed_18523();
        }
        switch (arg0.cfr_renamed_16910()) {
            case 2: 
            case 3: {
                if (arg0.cfr_renamed_18991() == 1) {
                    byte[] byArray = new byte[10];
                    byArray[0] = 2;
                    byArray[1] = 11;
                    byArray[2] = 6;
                    byArray[3] = 9;
                    byArray[4] = 7;
                    byArray[5] = 2;
                    byArray[6] = 5;
                    byArray[7] = 8;
                    byArray[8] = 2;
                    byArray[9] = 4;
                    return new sprshp(byArray);
                }
                byte[] byArray = new byte[10];
                byArray[0] = 2;
                byArray[1] = 11;
                byArray[2] = 6;
                byArray[3] = 4;
                byArray[4] = 2;
                byArray[5] = 2;
                byArray[6] = 2;
                byArray[7] = 2;
                byArray[8] = 2;
                byArray[9] = 4;
                return new sprshp(byArray);
            }
            case 0: 
            case 1: {
                while (false) {
                }
                if (arg0.cfr_renamed_18991() == 1) {
                    byte[] byArray = new byte[10];
                    byArray[0] = 2;
                    byArray[1] = 2;
                    byArray[2] = 6;
                    byArray[3] = 9;
                    byArray[4] = 4;
                    byArray[5] = 2;
                    byArray[6] = 5;
                    byArray[7] = 8;
                    byArray[8] = 3;
                    byArray[9] = 4;
                    return new sprshp(byArray);
                }
                byte[] byArray = new byte[10];
                byArray[0] = 2;
                byArray[1] = 2;
                byArray[2] = 6;
                byArray[3] = 3;
                byArray[4] = 5;
                byArray[5] = 4;
                byArray[6] = 5;
                byArray[7] = 2;
                byArray[8] = 3;
                byArray[9] = 4;
                return new sprshp(byArray);
            }
            case 5: {
                byte[] byArray = new byte[10];
                byArray[0] = 4;
                byArray[1] = 4;
                byArray[2] = 6;
                byArray[3] = 5;
                byArray[4] = 5;
                byArray[5] = 16;
                byArray[6] = 2;
                byArray[7] = 2;
                byArray[8] = 13;
                byArray[9] = 2;
                return new sprshp(byArray);
            }
            case 4: {
                byte[] byArray = new byte[10];
                byArray[0] = 3;
                byArray[1] = 7;
                byArray[2] = 4;
                byArray[3] = 2;
                byArray[4] = 5;
                byArray[5] = 3;
                byArray[6] = 2;
                byArray[7] = 3;
                byArray[8] = 2;
                byArray[9] = 3;
                return new sprshp(byArray);
            }
        }
        return arg0.cfr_renamed_18523();
    }

    private static /* synthetic */ int cfr_renamed_19002(long arg0, long arg1) {
        return sproup.cfr_renamed_19003((int)(arg0 & 0xFFFFFFFFL & (arg1 & 0xFFFFFFFFL ^ 0xFFFFFFFFFFFFFFFFL)));
    }

    private static /* synthetic */ int cfr_renamed_18996(byte arg0, byte arg1) {
        if (arg0 == 1 || arg1 == 1) {
            return 2;
        }
        if (arg0 == 0 || arg1 == 0) {
            return 1;
        }
        if (arg0 == arg1) {
            return 0;
        }
        return 2;
    }
}

