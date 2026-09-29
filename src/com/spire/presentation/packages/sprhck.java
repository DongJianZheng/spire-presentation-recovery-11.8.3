/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyk;
import com.spire.presentation.packages.sprdpo;
import com.spire.presentation.packages.sprfsj;
import com.spire.presentation.packages.sprgbk;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprrsk;
import com.spire.presentation.packages.sprsbk;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprusk;
import com.spire.presentation.packages.spruvk;
import com.spire.presentation.packages.sprvzk;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprytk;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;

public class sprhck
extends KeyPairGenerator {
    public SecureRandom cfr_renamed_119;
    public sprcyk cfr_renamed_91;
    public sprvzk cfr_renamed_0;
    private static Hashtable cfr_renamed_1 = new Hashtable();
    public boolean cfr_renamed_2;
    public int cfr_renamed_3;
    private static Object cfr_renamed_4 = new Object();

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        if (arg0 < 512 || arg0 > 4096 || arg0 < 1024 && arg0 % 64 != 0 || arg0 >= 1024 && arg0 % 1024 != 0) {
            throw new InvalidParameterException(sprdpo.cfr_renamed_9("UiTxHzRu\u0006pSnR=Dx\u0006{TrK=\u0013,\u0014=\u000b=\u0012-\u001f+\u0006|Hy\u0006|\u0006pSqRtVqC=I{\u0006,\u0016/\u0012=G\u007fIkC=\u0017-\u0014)"));
        }
        DSAParameterSpec dSAParameterSpec = sprsci.cfr_renamed_105.cfr_renamed_9164(arg0);
        if (dSAParameterSpec != null) {
            sprhck sprhck2 = this;
            this.cfr_renamed_91 = new sprcyk(arg1, new sprmqk(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
            this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_91);
            this.cfr_renamed_2 = true;
            return;
        }
        sprhck sprhck3 = this;
        sprhck3.cfr_renamed_3 = arg0;
        sprhck3.cfr_renamed_119 = arg1;
        this.cfr_renamed_2 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof DSAParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprjpm.cfr_renamed_9("i:k:t>m>k{v9s>z/95v/9:9\u001fJ\u001aI:k:t>m>k\bi>z"));
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec)arg0;
        sprhck sprhck2 = this;
        this.cfr_renamed_91 = new sprcyk(arg1, new sprmqk(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_91);
        this.cfr_renamed_2 = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public KeyPair generateKeyPair() {
        Object object;
        Object object2;
        Object object3;
        if (!this.cfr_renamed_2) {
            sprhck sprhck2;
            object3 = spruaf.cfr_renamed_279(this.cfr_renamed_3);
            if (cfr_renamed_1.containsKey(object3)) {
                this.cfr_renamed_91 = (sprcyk)cfr_renamed_1.get(object3);
                sprhck2 = this;
            } else {
                Object object4;
                object2 = cfr_renamed_4;
                // MONITORENTER : object2
                if (cfr_renamed_1.containsKey(object3)) {
                    this.cfr_renamed_91 = (sprcyk)cfr_renamed_1.get(object3);
                    object4 = object2;
                } else {
                    sprhck sprhck3;
                    sprhck sprhck4 = this;
                    int n = sprfsj.cfr_renamed_9372(sprhck4.cfr_renamed_3);
                    if (sprhck4.cfr_renamed_3 == 1024) {
                        object = new spruvk();
                        if (sprjcf.cfr_renamed_5159(sprdpo.cfr_renamed_9("~Ip\bnVtTx\bmUpIyCq\bnC~SoOi_3BnG3`TvN\u0017%\u00100\u0014{Io\u0017-\u0014)DtRn"))) {
                            sprhck sprhck5 = this;
                            sprhck3 = sprhck5;
                            ((spruvk)object).cfr_renamed_2492(sprhck5.cfr_renamed_3, n, this.cfr_renamed_119);
                        } else {
                            sprrsk sprrsk2 = new sprrsk(1024, 160, n, this.cfr_renamed_119);
                            sprhck3 = this;
                            ((spruvk)object).cfr_renamed_9448(sprrsk2);
                        }
                    } else if (this.cfr_renamed_3 > 1024) {
                        sprrsk sprrsk3 = new sprrsk(this.cfr_renamed_3, 256, n, this.cfr_renamed_119);
                        object = new spruvk(sprohl.cfr_renamed_7529());
                        sprhck3 = this;
                        ((spruvk)object).cfr_renamed_9448(sprrsk3);
                    } else {
                        object = new spruvk();
                        sprhck sprhck6 = this;
                        sprhck3 = sprhck6;
                        ((spruvk)object).cfr_renamed_2492(sprhck6.cfr_renamed_3, n, this.cfr_renamed_119);
                    }
                    sprhck3.cfr_renamed_91 = new sprcyk(this.cfr_renamed_119, ((spruvk)object).cfr_renamed_2493());
                    cfr_renamed_1.put(object3, this.cfr_renamed_91);
                    object4 = object2;
                }
                // MONITOREXIT : object4
                sprhck2 = this;
            }
            sprhck2.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_91);
            this.cfr_renamed_2 = true;
        }
        object3 = this.cfr_renamed_0.cfr_renamed_1223();
        object2 = (sprytk)((sprsil)object3).cfr_renamed_1224();
        object = (sprusk)((sprsil)object3).cfr_renamed_1225();
        return new KeyPair(new sprgbk((sprytk)object2), new sprsbk((sprusk)object));
    }

    public sprhck() {
        sprhck sprhck2 = this;
        super("DSA");
        sprhck sprhck3 = this;
        sprhck3.cfr_renamed_0 = new sprvzk();
        sprhck2.cfr_renamed_3 = 2048;
        sprhck2.cfr_renamed_119 = sprybl.cfr_renamed_2794();
        sprhck2.cfr_renamed_2 = false;
    }
}

