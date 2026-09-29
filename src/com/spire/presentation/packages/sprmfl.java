/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprpcka;
import com.spire.presentation.packages.sprpfl;
import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;

public class sprmfl {
    private sprdul cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmfl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    public sprmfl() {
        sprmfl sprmfl2 = this;
        sprmfl2.cfr_renamed_3 = new sprdul(new sprjrl());
    }

    /*
     * WARNING - void declaration
     */
    public sprmfl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_10733(sprddm arg0) throws sprlyl {
        if (arg0.cfr_renamed_284() == null) {
            return null;
        }
        try {
            AlgorithmParameters algorithmParameters = this.cfr_renamed_3.cfr_renamed_10719(arg0.cfr_renamed_593());
            sproul.cfr_renamed_7434(algorithmParameters, arg0.cfr_renamed_284());
            return algorithmParameters;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprlyl(sproyh.cfr_renamed_9("\u0019w\u00141\u000e6\u001c\u007f\u0014rZf\u001bd\u001b{\u001fb\u001fd\t6\u001cy\b6\u001bz\u001dy\b\u007f\u000e~\u0017"), noSuchAlgorithmException);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new sprlyl(sprpcka.cfr_renamed_9("B\\O\u001aU\u001dGTOY\u0001MSRWTEXS\u001dGRS\u001d@QFRSTUUL"), noSuchProviderException);
        }
    }
}

