/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprjzh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprtlg;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprxx;
import com.spire.presentation.packages.spryhg;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

public abstract class sprufl
implements sprxx {
    public sprdul cfr_renamed_112;
    private PrivateKey cfr_renamed_119;
    public sprdul cfr_renamed_91;
    public boolean cfr_renamed_0;
    public Map cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private static final byte[] cfr_renamed_3 = sprfqe.cfr_renamed_488(sprjzh.cfr_renamed_9("zT{\u0003~\u0006|R|Q|R}\u000e|S|Q}\u0002}\u0004x\u0007\u007f\u0004|\u0002|R|\u0003|\u0002}\u0005x\u0007x\u0007x\u0007x\u0007"));
    public boolean cfr_renamed_4;

    public static byte[] cfr_renamed_10705(sprdjl arg0) throws IOException {
        if (arg0.cfr_renamed_114() != null) {
            return new sprdsm(arg0.cfr_renamed_102(), arg0.cfr_renamed_114()).cfr_renamed_104("DER");
        }
        return new sprfvg(arg0.cfr_renamed_3955()).cfr_renamed_91();
    }

    public sprufl cfr_renamed_4051(Provider arg0) {
        this.cfr_renamed_91 = sproul.cfr_renamed_4052(arg0);
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprufl(PrivateKey privateKey, byte[] byArray) {
        void arg0;
        sprufl sprufl2 = this;
        sprufl sprufl3 = this;
        this.cfr_renamed_112 = new sprdul(new sprjrl());
        sprufl3.cfr_renamed_91 = this.cfr_renamed_112;
        sprufl3.cfr_renamed_1 = new HashMap();
        sprufl3.cfr_renamed_4 = false;
        sprufl2.cfr_renamed_119 = sproul.cfr_renamed_10695((PrivateKey)arg0);
        sprufl2.cfr_renamed_2 = byArray;
    }

    public sprufl cfr_renamed_4045(String arg0) {
        this.cfr_renamed_91 = sproul.cfr_renamed_4046(arg0);
        return this;
    }

    public sprufl cfr_renamed_1499(String arg0) {
        this.cfr_renamed_112 = new sprdul(new sprpfl(arg0));
        this.cfr_renamed_91 = this.cfr_renamed_112;
        return this;
    }

    public sprufl cfr_renamed_4050(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprufl cfr_renamed_7451(sprlem arg0, String arg1) {
        sprufl sprufl2 = this;
        sprufl2.cfr_renamed_1.put(arg0, arg1);
        return sprufl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_10706(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprtlg sprtlg2 = this.cfr_renamed_112.cfr_renamed_10697(arg0, this.cfr_renamed_119, cfr_renamed_3, this.cfr_renamed_2);
        try {
            sprufl sprufl2 = this;
            Key key = sprufl2.cfr_renamed_112.cfr_renamed_10707(arg1.cfr_renamed_593(), sprtlg2.cfr_renamed_7425(arg1, arg2));
            if (sprufl2.cfr_renamed_4) {
                this.cfr_renamed_112.cfr_renamed_10708(arg1, key);
            }
            return key;
        }
        catch (spryhg spryhg2) {
            throw new sprlyl(new StringBuilder().insert(0, spruuc.cfr_renamed_9("\u0014\u0011\u0012\f\u0001\u001d\u0018\u0006\u001fI\u0004\u0007\u0006\u001b\u0010\u0019\u0001\u0000\u001f\u000eQ\u0002\u0014\u0010KI")).append(spryhg2.getMessage()).toString(), spryhg2);
        }
    }

    public sprufl cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_112 = new sprdul(new sprdhl(arg0));
        this.cfr_renamed_91 = this.cfr_renamed_112;
        return this;
    }
}

