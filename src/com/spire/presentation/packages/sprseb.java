/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprazy;
import com.spire.presentation.packages.sprc;
import com.spire.presentation.packages.sprfbb;
import com.spire.presentation.packages.sprgeb;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmpa;
import com.spire.presentation.packages.sprqra;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprsma;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruhb;
import com.spire.presentation.packages.sprxta;
import java.security.SecureRandom;

public class sprseb
implements sprc {
    private SecureRandom cfr_renamed_112;
    public static final String cfr_renamed_119 = "1.3.6.1.4.1.8301.3.1.3.4.1";
    public sprfbb cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_136(byte[] byArray) {
        sprsma sprsma2 = this.cfr_renamed_1358(byArray);
        sprseb sprseb2 = this;
        sprseb sprseb3 = this;
        sprsma sprsma3 = new sprsma(sprseb2.cfr_renamed_2, sprseb3.cfr_renamed_3, sprseb3.cfr_renamed_112);
        return ((sprsma)((sprgeb)sprseb2.cfr_renamed_91).cfr_renamed_1145().cfr_renamed_881(sprsma2).cfr_renamed_804(sprsma3)).cfr_renamed_91();
    }

    private /* synthetic */ byte[] cfr_renamed_1359(sprsma arg0) throws Exception {
        int n;
        byte[] byArray = arg0.cfr_renamed_91();
        int n2 = n = byArray.length - 1;
        while (n2 >= 0 && byArray[n] == 0) {
            n2 = --n;
        }
        if (byArray[n] != 1) {
            throw new Exception(sprqvn.cfr_renamed_9("Woq.Eoqj|`r45g{xtb|j5m|~}kgzpva"));
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        return byArray2;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprseb sprseb2 = this;
                sprseb2.cfr_renamed_112 = spraed2.cfr_renamed_1295();
                sprseb2.cfr_renamed_91 = (sprgeb)spraed2.cfr_renamed_284();
                sprseb sprseb3 = this;
                sprseb3.cfr_renamed_1360((sprgeb)sprseb3.cfr_renamed_91);
                return;
            }
            this.cfr_renamed_112 = new SecureRandom();
            this.cfr_renamed_91 = (sprgeb)arg1;
            sprseb sprseb4 = this;
            sprseb4.cfr_renamed_1360((sprgeb)sprseb4.cfr_renamed_91);
            return;
        }
        this.cfr_renamed_91 = (spruhb)arg1;
        sprseb sprseb5 = this;
        sprseb5.cfr_renamed_1361((spruhb)sprseb5.cfr_renamed_91);
    }

    public void cfr_renamed_1360(sprgeb arg0) {
        this.cfr_renamed_112 = this.cfr_renamed_112 != null ? this.cfr_renamed_112 : new SecureRandom();
        sprgeb sprgeb2 = arg0;
        this.cfr_renamed_2 = sprgeb2.cfr_renamed_1146();
        this.cfr_renamed_4 = sprgeb2.cfr_renamed_1150();
        this.cfr_renamed_3 = arg0.cfr_renamed_1144();
        this.cfr_renamed_0 = this.cfr_renamed_2 >> 3;
        this.cfr_renamed_1 = this.cfr_renamed_4 >> 3;
    }

    public void cfr_renamed_1361(spruhb arg0) {
        this.cfr_renamed_2 = arg0.cfr_renamed_1146();
        this.cfr_renamed_4 = arg0.cfr_renamed_1150();
        this.cfr_renamed_1 = this.cfr_renamed_4 >> 3;
        this.cfr_renamed_0 = this.cfr_renamed_2 >> 3;
    }

    private /* synthetic */ sprsma cfr_renamed_1358(byte[] arg0) {
        sprseb sprseb2 = this;
        byte[] byArray = new byte[sprseb2.cfr_renamed_1 + ((sprseb2.cfr_renamed_4 & 7) != 0 ? 1 : 0)];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        byArray[arg0.length] = 1;
        return sprsma.cfr_renamed_963(this.cfr_renamed_4, byArray);
    }

    public int cfr_renamed_1233(sprfbb arg0) {
        if (arg0 instanceof sprgeb) {
            return ((sprgeb)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof spruhb) {
            return ((spruhb)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprazy.cfr_renamed_9("i6o-l(s*h=xxh!l="));
    }

    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws Exception {
        sprseb sprseb2 = this;
        sprsma sprsma2 = sprsma.cfr_renamed_963(sprseb2.cfr_renamed_2, arg0);
        spruhb spruhb2 = (spruhb)sprseb2.cfr_renamed_91;
        sprmpa sprmpa2 = spruhb2.cfr_renamed_845();
        sprxta sprxta2 = spruhb2.cfr_renamed_1147();
        sprjta sprjta2 = spruhb2.cfr_renamed_1149();
        sprkqa sprkqa2 = spruhb2.cfr_renamed_1152();
        sprkqa sprkqa3 = spruhb2.cfr_renamed_1151();
        sprjta sprjta3 = spruhb2.cfr_renamed_1153();
        sprxta[] sprxtaArray = spruhb2.cfr_renamed_1148();
        sprkqa sprkqa4 = sprkqa2.cfr_renamed_879(sprkqa3);
        sprkqa sprkqa5 = sprkqa4.cfr_renamed_875();
        sprsma sprsma3 = (sprsma)sprsma2.cfr_renamed_807(sprkqa5);
        sprsma sprsma4 = sprqra.cfr_renamed_947((sprsma)sprjta3.cfr_renamed_880(sprsma3), sprmpa2, sprxta2, sprxtaArray);
        sprsma sprsma5 = (sprsma)sprsma3.cfr_renamed_804(sprsma4);
        sprsma5 = (sprsma)sprsma5.cfr_renamed_807(sprkqa2);
        sprsma4 = (sprsma)sprsma4.cfr_renamed_807(sprkqa4);
        sprsma sprsma6 = sprsma5.cfr_renamed_962(this.cfr_renamed_4);
        sprsma sprsma7 = (sprsma)sprjta2.cfr_renamed_881(sprsma6);
        return this.cfr_renamed_1359(sprsma7);
    }
}

