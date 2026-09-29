/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcez;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sproyd;
import com.spire.presentation.packages.sprqoe;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprsud;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprzod;
import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;

public class sprdpd
extends sproyd {
    private sprsud cfr_renamed_4;

    public PublicKey cfr_renamed_1157() throws sprzod {
        sprdce sprdce2 = this.cfr_renamed_4351().cfr_renamed_1157();
        if (sprdce2 != null) {
            return this.cfr_renamed_4.cfr_renamed_4352(sprdce2);
        }
        return null;
    }

    public sprdpd(sproyd arg0) {
        this(arg0.cfr_renamed_568());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X500Principal cfr_renamed_4353() {
        spruhe spruhe2 = this.cfr_renamed_4351().cfr_renamed_1485();
        if (spruhe2 == null) {
            return null;
        }
        try {
            return new X500Principal(spruhe2.cfr_renamed_104("DER"));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprcez.cfr_renamed_9("\u007f\u001bk\u0017f\u0010*\u0001eUi\u001ad\u0006~\u0007\u007f\u0016~UN0XUo\u001bi\u001an\u001cd\u0012*\u001alUd\u0014g\u00100U")).append(iOException.getMessage()).toString());
        }
    }

    public sprdpd(sprqoe sprqoe2) {
        super(sprqoe2);
        sprdpd sprdpd2 = this;
        sprdpd2.cfr_renamed_4 = new sprsud(new sprkvd());
    }

    /*
     * WARNING - void declaration
     */
    public sprdpd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprsud(new spritd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprdpd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprsud(new sprrwd((String)arg0));
        return this;
    }

    public sprdpd(byte[] arg0) {
        this(sprqoe.cfr_renamed_23(arg0));
    }
}

